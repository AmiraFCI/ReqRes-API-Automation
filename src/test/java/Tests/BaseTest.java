package Tests;

import io.restassured.RestAssured;

public class BaseTest {
public static final String BaseUrl="https://reqres.in/api";
static {
    RestAssured.baseURI=BaseUrl;
}

}
