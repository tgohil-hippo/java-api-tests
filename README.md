# java-api-tests

This is the java, gradle, TestNG framework for creating functional tests for api-endpoints.

## Requirements
Latest OpenJDK - 21
Gradle

## Tests

These example tests cover the Read and Update functionality in a test CRUD API located at https://postcodes.io/.

They are example tests on how to write automated tests for an API.

Endpoints under test:
get api.postcodes.io/postcodes/:postcode


post api.postcodes.io/postcodes
{
  "postcodes" : ["OX49 5NU", "M32 0JG", "NE30 1DP"]
}

## How to run tests
There are env files in `/resources/envs`  
These contain environment details. They work by either setting an environment variable called 'env' or if none is set it will use custom.env.

You will need to create the **custom.env** file as this file isn't committed.
 
To run all tests: `./gradlew clean test`

# Test Data

Test data can be added to the body json file in resources.
