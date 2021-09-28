package br.projeto.ecommerce.payment.service;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

import lombok.RequiredArgsConstructor;

import br.projeto.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.projeto.ecommerce.payment.entity.PaymentEntity;
import br.projeto.ecommerce.payment.repository.PaymentRepository;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService{

    private final PaymentRepository paymentRepository;

    @Override
    public Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent){
        final PaymentEntity paymentEntity = PaymentEntity.builder()
                .checkoutCode(checkoutCreatedEvent.getCheckoutCode())
                .code(UUID.randomUUID().toString())
                .build();
        paymentRepository.save(paymentEntity);
        return Optional.of(paymentEntity);
    }
}
