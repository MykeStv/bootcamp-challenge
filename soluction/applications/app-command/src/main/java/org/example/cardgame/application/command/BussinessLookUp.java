package org.example.cardgame.application.command;

import org.example.cardgame.generic.DelegateService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.HashMap;
import java.util.Map;

@Component
public class BussinessLookUp {
    private final Map<String, Flux<DelegateService>> business = new HashMap<>();

    public BussinessLookUp(ApplicationContext context) {
        business.put("org.example.cardgame.AccountCreated", Flux.just( input -> {

        }))
    }
}
