package com.baeldung.spring.data.redis.gambi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.spring.data.redis.queue.MessagePublisher;

@Service
public class Gambiarra {

    @Autowired
    MessagePublisher messagePublisher;

    public MessagePublisher getMessagePublisher() {
        return messagePublisher;
    }
}
