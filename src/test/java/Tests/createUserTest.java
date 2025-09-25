package Tests;

import Endpoints.CreateUser;
import Endpoints.UserBody;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

public class createUserTest extends BaseTest {

    @Test
    public void CreateUser()
    {
        CreateUser create=new CreateUser();
        UserBody body=new UserBody("Amira", "QC ");
        Response response=create.create(body);
        dataStore.userId=response.jsonPath().getString("id");
        int statuscode=response.getStatusCode();
        Assert.assertEquals(statuscode,201);


    }
}
