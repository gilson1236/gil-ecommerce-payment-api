package br.projeto.ecommerce.payment.service;

import java.util.Optional;

import br.projeto.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.projeto.ecommerce.payment.entity.PaymentEntity;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
