package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class GetRestricao {

    static RequestSpecification request;
    static Response response;

    @Dado("que consulte um cpf com retrição")
    public void que_consulte_um_cpf_com_retrição() {
        RestAssured.baseURI = "http://localhost:8080/";
        request = given();
        String path = "api/v1/restricoes/32145665421";
        response = request.get(path).then().extract().response();

    }

    @Então("é retornado o status code {int} e a mensagem {string}")
    public void é_retornado_o_status_code_e_a_mensagem(Integer int1, String string) {
        int code = response.getStatusCode();
        Assert.assertEquals(200,code);
        System.out.println(code);
    }
}
