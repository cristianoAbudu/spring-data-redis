package com.baeldung.spring.data.redis.gambi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GambiarraRestController {

    @Autowired
    Gambiarra gambiarra;

    @GetMapping
    public String get() {
        gambiarra.messagePublisher.publish("gambeta");
        return "a";
    }
}
