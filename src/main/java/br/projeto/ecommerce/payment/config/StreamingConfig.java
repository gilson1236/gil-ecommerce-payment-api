package br.projeto.ecommerce.payment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.stream.annotation.EnableBinding;

import br.projeto.ecommerce.payment.streaming.CheckoutProcessor;

@Configuration
@EnableBinding(CheckoutProcessor.class)
public class StreamingConfig {
}
