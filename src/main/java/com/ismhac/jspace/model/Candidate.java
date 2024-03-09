package com.ismhac.jspace.model;

import com.ismhac.jspace.model.primaryKey.CandidateId;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_candidate")
public class Candidate extends BaseEntity{

    @EmbeddedId
    private CandidateId id;

    @Column(name = "name")
    private String name;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "phone_number")
    private String phoneNumber;
}
