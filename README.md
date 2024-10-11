# Search breeds

## Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

### SDKMAN!

SDKMAN! é uma ferramenta para gerenciar versões paralelas de múltiplos kits de desenvolvimento de software no sistema Unix. Para instalar o SDKMAN!, execute o seguinte comando:

```bash
curl -s "https://get.sdkman.io" | bash
```

Após a instalação, reinicie o terminal ou execute:

```bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

### Java

Com o SDKMAN! instalado, você pode instalar o Java 17 usando o seguinte comando:

```bash
sdk install java 17.0.8-tem
```

## Maven

Para instalar o Maven, execute:

```bash
sdk install maven
```

## Instalação de dependências
```bash
mvn clean install
```

## Execução dos testes
```bash
mvn clean verify
```
