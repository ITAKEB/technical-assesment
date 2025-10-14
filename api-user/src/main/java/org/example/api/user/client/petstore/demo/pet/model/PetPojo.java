package org.example.api.user.client.petstore.demo.pet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetPojo {

    @JsonProperty("id")
    private Long identifier;

    private String name;

    @JsonProperty("photoUrls")
    private List<String> listOfUrls;

    @JsonProperty("tags")
    private List<PetTagPojo> listOfPetTags;

    private PetStatus status;

}
