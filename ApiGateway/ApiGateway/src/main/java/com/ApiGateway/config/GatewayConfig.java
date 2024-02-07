package com.ApiGateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;



@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("QUIZ_SERVICE", r -> r.path("/quiz/**")
                        .filters(f -> f.stripPrefix(0))
                        .uri("lb://QUIZ-SERVICE"))
                .route("QUESTION-SERVICE", r -> r.path("/question/**")
                        .filters(f -> f.stripPrefix(0))
                        .uri("lb://QUESTION-SERVICE"))
                .build();
    }

}
