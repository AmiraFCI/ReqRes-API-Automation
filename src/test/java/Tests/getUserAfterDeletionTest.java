package Tests;

import Endpoints.getUser;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getUserAfterDeletionTest extends BaseTest {
    @Test(dependsOnMethods = "Tests.DeleteUserTest.delete")
    public void getAfterdeleting()
    {
        getUser getu=new getUser();
        Response response=getu.getUser(dataStore.userId);
       int statuscode= response.getStatusCode();
        Assert.assertEquals(statuscode,404);


    }
}
