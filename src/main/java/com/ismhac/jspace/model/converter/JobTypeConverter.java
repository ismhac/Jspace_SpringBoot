package com.ismhac.jspace.model.converter;

import com.ismhac.jspace.model.enums.AdminType;
import com.ismhac.jspace.model.enums.ApplyStatus;
import com.ismhac.jspace.model.enums.JobType;
import jakarta.persistence.AttributeConverter;

import java.util.stream.Stream;

public class JobTypeConverter implements AttributeConverter<JobType, String> {

    @Override
    public String convertToDatabaseColumn(JobType jobType) {
        return jobType == null ? null : jobType.getCode();
    }

    @Override
    public JobType convertToEntityAttribute(String code) {
        if(code == null){
            return null;
        }

        return Stream.of(JobType.values())
                .filter(c->c.getCode().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
