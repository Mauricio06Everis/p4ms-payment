package com.example.mspayment.models.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurseDTO {
    
    private String phoneTransmitter;

    private String phoneReceiver;

    private Double amount;

}
