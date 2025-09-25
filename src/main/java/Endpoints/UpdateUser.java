package Endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UpdateUser {

    public Response update(String id,UserBody body)
    {
        return given().
                contentType("application/json").
                body(body).
                when().
                put("/users/" + id);

    }
}
