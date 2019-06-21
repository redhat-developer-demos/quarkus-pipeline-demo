package com.redhat.developers;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreeterResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/greeter")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}