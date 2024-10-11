# Search breeds

## Prerequisites

Before starting, make sure you have the following tools installed:

### SDKMAN!

SDKMAN! is a tool for managing parallel versions of multiple Software Development Kits on Unix systems. To install SDKMAN!, run the following command:

```bash
curl -s "https://get.sdkman.io" | bash
```

After the installation, restart the terminal or run:

```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

### Java

With SDKMAN! installed, you can install Java 17 using the following command:

```bash
sdk install java 17.0.8-tem
```

## Maven

To install Maven, run:

```bash
sdk install maven
```

## Installing dependencies
```bash
mvn clean install
```

## Running the tests
```bash
mvn clean verify
```
