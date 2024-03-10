package com.ismhac.jspace.dto.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationResponse <T>{
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;

    private T information;
}
