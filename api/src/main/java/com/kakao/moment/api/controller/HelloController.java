package com.kakao.moment.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello(@RequestParam String name) {
        return Mono.just("hello " + name);
    }

    @GetMapping("/api1/hello")
    public Mono<String> hello1(@RequestParam String name) {
        return Mono.just("hello1 " + name);
    }

    @GetMapping("/api2/hello")
    public Mono<String> hello2(@RequestParam String name) {
        return Mono.just("hello2 " + name);
    }

    @GetMapping("favicon.ico")
    @ResponseBody
    public void returnNoFavicon() {
    }
}
