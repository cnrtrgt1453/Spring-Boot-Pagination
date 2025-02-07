package com.canerosman.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoPersonel {

    private Long id;

    private String firstName;

    private String lastName;

    private DtoDepartment dtoDepartment;
}
