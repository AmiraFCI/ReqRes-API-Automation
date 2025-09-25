package Endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateUser {
public Response  create(UserBody body)
{
    return given().
            contentType("application/json").
            body(body).
            when().
            post("/users");
}


}
