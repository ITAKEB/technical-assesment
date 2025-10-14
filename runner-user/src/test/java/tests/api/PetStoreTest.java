package tests.api;

import base.BaseApiTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.api.user.client.petstore.demo.pet.model.PetClient;
import org.example.api.user.client.petstore.demo.pet.model.PetPojo;
import org.example.api.user.client.petstore.demo.pet.model.PetStatus;
import org.example.api.user.client.petstore.demo.pet.model.PetTagPojo;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PetStoreTest extends BaseApiTest {

    @Test
    private void sampleTest() {
        PetClient userClient = new PetClient(RestAssured.baseURI);
        var petToCreate = PetPojo.builder()
                .name("CoolPetName")
                .identifier(77L)
                .status(PetStatus.AVAILABLE)
                .listOfUrls(Arrays.asList("magnaUrl", "ipsum"))
                .listOfPetTags(Arrays.asList(
                        new PetTagPojo(1L, "voluptate"),
                        new PetTagPojo(2L, "ad"),
                        new PetTagPojo(3L, "quis ad")
                ))
                .build();
        Response response = userClient.createNewPet(petToCreate);

        response.then().statusCode(200);
    }
}
