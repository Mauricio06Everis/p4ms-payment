package com.example.mspayment.services;

import com.example.mspayment.models.entities.Payment;
import com.example.mspayment.models.entities.Purse;

import reactor.core.publisher.Mono;

public interface IPaymentService extends IBaseService<Payment, String> {
    Mono<Payment> findByAcquisition_Iban(String iban);
    Mono<Void> deleteByAcquisition_Iban(String iban);
}
