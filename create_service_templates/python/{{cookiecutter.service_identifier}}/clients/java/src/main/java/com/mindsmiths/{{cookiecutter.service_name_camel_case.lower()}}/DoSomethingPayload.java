package com.mindsmiths.{{cookiecutter.service_name_camel_case.lower()}};

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoSomethingPayload implements Serializable {
    private String someData;  // TODO: change this
}
