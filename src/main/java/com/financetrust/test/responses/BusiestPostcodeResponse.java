package com.financetrust.test.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Muyinda Rogers
 * @Date 2024-06-27
 * @Email moverr@gmail.com
 */
@Data
@AllArgsConstructor
public class BusiestPostcodeResponse {
    @JsonProperty("postcode")
    private String postcode;

    @JsonProperty("delivery_count")
    private int deliveryCount;
}
