package com.roytuts.spring.cloud.gateway.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

	@GetMapping("/service1/fallback")
	public Mono<String> getFxSvcMsg() {
		return Mono.just("No response fron Service1 and will be back shortly");
	}

}