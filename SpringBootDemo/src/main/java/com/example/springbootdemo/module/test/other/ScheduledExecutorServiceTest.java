package com.example.springbootdemo.module.test.other;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class ScheduledExecutorServiceTest {
    private static final ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

    static {
//        ses.scheduleAtFixedRate(() ->
//                log.info("Current time = {}", LocalDateTime.now()), 0, 10, TimeUnit.SECONDS);
    }
}
