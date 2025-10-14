package org.example.api.user.client.petstore.demo.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponsePojo {

    private Integer code;

    private String type;

    @JsonProperty("message")
    private String msg;
}

