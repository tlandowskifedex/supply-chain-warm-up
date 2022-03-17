
# How to run locally

### Resources needed on your local machine
* Java 11 
  * You can install java using [sdkman](https://sdkman.io/) (The Software Development Kit Manager). To do that install sdkman on your machine first and run command: 
  ```
  sdk list java // list all available java versions
  sdk install java {version identifier} // install choosen version of java 
  ```
### Running test and building executable jar

  ```
  ./mvnw clean install  
  ```

### Running application locally using executable jar

  ```
  java -jar target/supply-chain-warm-up-0.0.1-SNAPSHOT.jar
  ```

### Running application locally using maven plugin

  ```
  ./mvnw spring-boot:run 
  ```

### Running application from Intellij
* Create new project from existing sources and select maven as a model
* Find SupplyChainWarmUpApplication class and click play button