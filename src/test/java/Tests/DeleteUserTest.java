package Tests;

import Endpoints.DeleteUser;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUserTest extends BaseTest {
    @Test(dependsOnMethods = "Tests.GetUserTest.getAfterupdate")
    public void delete(){
    DeleteUser delete=new DeleteUser();
    Response response=delete.deleteUser(dataStore.userId);
    int statuscode=response.getStatusCode();
        Assert.assertEquals(statuscode,200);

}}
