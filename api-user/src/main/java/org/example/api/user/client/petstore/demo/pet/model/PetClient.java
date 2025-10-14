package org.example.api.user.client.petstore.demo.pet.model;

import io.restassured.response.Response;
import org.example.api.user.client.petstore.demo.base.BaseApiClient;

public class PetClient extends BaseApiClient {

    public PetClient(String baseURI) {}

    public Response createNewPet(PetPojo petToCreate) {
        return post("/", petToCreate);
    }
}
