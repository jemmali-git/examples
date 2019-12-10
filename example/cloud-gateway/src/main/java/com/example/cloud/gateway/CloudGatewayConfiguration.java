/*
 * Copyright (c) 2019 Componize Software
 */
package com.example.cloud.gateway;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nadhem Jemmali
 */
@Configuration
@EnableConfigurationProperties
public class CloudGatewayConfiguration {

    /*
        @Bean
        public GlobalFilter removeExpectHeaderGatewayFilterFactory()
        {
            return (exchange, chain) -> ReactiveSecurityContextHolder.getContext().filter(Objects::nonNull)
                .map(securityContext -> {
                    final ServerHttpRequest request = exchange.getRequest().mutate().headers(httpHeaders -> {
                        httpHeaders.add("Expect", "100-continue");
                    }).build();
                    return exchange.mutate().request(request).build();
                }).defaultIfEmpty(exchange).flatMap(chain::filter);
        }
    */
}
