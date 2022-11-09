package org.example.cardgame.generic;

import reactor.core.publisher.Mono;

public interface DelegateService {
   Mono<Void> doProcessing(DomainEvent input);
}