package in.co.automation.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class ApiTestRunner {
 public  String GET_URL = "https://api.restful-api.dev/objects";

    @Test
    public void testgetAPI(){
        //get
        Response response = given().when().get(GET_URL);
        System.out.println("11111111111111111111");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode() , 200 ,"Check status code Validation");
    }
    @Test
    public void apiPostAPI(){
        String getBodyMessage = """
                {
                "id":"2","name":"SAMSUNG","data":{"color":"Black White","capacity":"250 GB"}
                }
                """;
        System.out.println("2222222222222222222222222222");
        Response response = given().header("content-type" , "application/json")
                .body(getBodyMessage).when().post(GET_URL);
        System.out.println("------------------------------------------------------");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        Assert.assertEquals(response.getStatusCode() , 200 , "negative case");
    }

    @Test
    public void validateAPI(){
          given().baseUri("https://api.zippopotam.us").when()
                .get("/us/90210")
                .then().assertThat().statusCode(200)
                  .and().body("country" ,equalTo("United State"))
                  .time(lessThan(10000L))
                  .log().all();
    }

}
