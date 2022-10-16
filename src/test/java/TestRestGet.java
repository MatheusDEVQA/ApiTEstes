import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestRestGet {
    static RequestSpecification request;
    static Response response;

    @Test
    public void testGet(   ){
        RestAssured.baseURI = "http://localhost:8080/";
        request = given();
        String path = "api/v1/restricoes/32145665421";
        response = request.get(path).then().extract().response();
        int code = response.getStatusCode();
        System.out.println(code);
    }






}
