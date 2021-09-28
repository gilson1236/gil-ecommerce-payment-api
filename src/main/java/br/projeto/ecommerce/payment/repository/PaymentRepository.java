package br.projeto.ecommerce.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.projeto.ecommerce.payment.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
