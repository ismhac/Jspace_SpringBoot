package com.ismhac.jspace.model.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum JobType {

    FULL_TIME("full_time"),
    PART_TIME("part_time"),
    TEMPORARY("temporary"),
    CONTRACT("contract"),
    INTERNSHIP("internship"),
    COMMISSION("commission"),
    NEW_GRAD("new_grad"),
    PERMANENT("permanent")
    ;

    String code;
}
