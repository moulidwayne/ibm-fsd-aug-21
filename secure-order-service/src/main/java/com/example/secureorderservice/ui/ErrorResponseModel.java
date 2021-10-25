package com.example.secureorderservice.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ErrorResponseModel {

    private String message;
    private Integer statusCode;
    private Long errorReportingTime;


}
