package com.ismhac.jspace.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");
    String code;
}
