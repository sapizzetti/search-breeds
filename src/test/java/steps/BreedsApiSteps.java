package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import static org.hamcrest.Matchers.*;

public class BreedsApiSteps {

    private Response response;
    private String breedName;


    @Given("the Breeds API is available")
    public void theBreedsApiIsAvailable() {
        RestAssured.baseURI = "https://catfact.ninja";
    }

    @When("the user request the list of breeds")
    public void theUserRequestTheListOfBreeds() {
        response = RestAssured
                .given()
                .when()
                .get("/breeds");
    }

    @When("the user request an invalid endpoint")
    public void theUserRequestAnInvalidEndpoint() {
        response = RestAssured
                .given()
                .when()
                .get("/invalid-endpoint");
    }

    @Then("the response should have status {int}")
    public void theResponseShouldHaveStatus(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @And("the breeds data should not be null")
    public void theBreedsDataShouldNotBeNull() {
        response.then()
                .body("current_page", notNullValue())
                .body("data", hasSize(greaterThan(0)))
                .body("data[0].breed", notNullValue())
                .body("data[0].country", notNullValue())
                .body("data[0].origin", notNullValue())
                .body("data[0].coat", notNullValue())
                .body("data[0].pattern", notNullValue());
    }

    @Given("the breed name is {string}")
    public void the_breed_name_is(String name) {
        this.breedName = name;
    }

    @When("the user makes a request to get the breed information")
    public void the_user_makes_a_request_to_get_the_breed_information() {
        response = RestAssured.get("https://catfact.ninja/breeds?limit=100&name=" + breedName);
    }

    @Then("the response should contain the breed name {string}")
    public void the_response_should_contain_the_breed_name(String expectedBreedName) {
        response.then().body("data.breed", hasItem(expectedBreedName));
    }
}
