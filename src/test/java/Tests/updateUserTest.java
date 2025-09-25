package Tests;

import Endpoints.CreateUser;
import Endpoints.UpdateUser;
import Endpoints.UserBody;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class updateUserTest extends BaseTest {
    @Test(dependsOnMethods ="Tests.createUserTest.CreateUser")
    public void update() {
        UpdateUser update = new UpdateUser();
        UserBody body = new UserBody("Amira", "mid qc");
        Response response = update.update(dataStore.userId, body);
        String updatedJob = response.jsonPath().getString("job");
        Assert.assertEquals(updatedJob, "mid qc");

    }
}