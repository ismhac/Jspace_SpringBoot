package com.ismhac.jspace.dto.user.admin;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdminCreateRequest {

    @NotBlank
    String username;

    @NotBlank
    String password;
}
