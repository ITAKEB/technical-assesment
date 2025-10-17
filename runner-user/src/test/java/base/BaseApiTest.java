package base;

import io.restassured.RestAssured;
import lombok.SneakyThrows;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.annotations.BeforeClass;

public class BaseApiTest {

    @SneakyThrows
    @BeforeClass
    public void setUp() {
        PropertiesConfiguration config = new PropertiesConfiguration("src/test/resources/config.properties");

        RestAssured.baseURI = config.getString("baseURI");
        RestAssured.basePath = "";
    }

}
