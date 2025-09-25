package Endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class getUser {
    public Response getUser(String id){

        return given()
                .when().
                get("/users/"+id);
    }
}
