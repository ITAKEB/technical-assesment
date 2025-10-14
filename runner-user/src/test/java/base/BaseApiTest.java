package base;

import io.restassured.RestAssured;
import lombok.SneakyThrows;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.annotations.BeforeSuite;

public class BaseApiTest {

    @SneakyThrows
    @BeforeSuite
    public void setUp() {
        PropertiesConfiguration config = new PropertiesConfiguration("src/test/resources/config.properties");

        RestAssured.baseURI = config.getString("baseURI");
        RestAssured.basePath = "";
    }

}
