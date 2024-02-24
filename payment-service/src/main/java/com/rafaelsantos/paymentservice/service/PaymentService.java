package com.rafaelsantos.paymentservice.service;

import com.rafaelsantos.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
