package Tests;

import Endpoints.getUser;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest extends BaseTest{
    @Test(dependsOnMethods = "Tests.updateUserTest.update")
    public void getAfterupdate()
    {
        getUser getu=new getUser();
        Response response=getu.getUser(dataStore.userId);

       int statuscode= response.getStatusCode();
        Assert.assertEquals(statuscode,200);
    }
}
