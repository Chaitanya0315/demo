package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class BaseRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:foo")
            .routeId("Test Route 1").description("Testing for hawtio").log("===DEMO==");
    }
}
