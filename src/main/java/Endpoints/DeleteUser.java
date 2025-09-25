package Endpoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteUser {

    public Response deleteUser(String id){

        return given()
                .when().
                get("/users/"+id);
    }
}
