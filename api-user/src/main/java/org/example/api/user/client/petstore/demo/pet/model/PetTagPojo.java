package org.example.api.user.client.petstore.demo.pet.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetTagPojo {

    @JsonProperty("id")
    public Long identifier;
    public String name;
}