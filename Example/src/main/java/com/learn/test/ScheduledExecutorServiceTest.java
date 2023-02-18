package com.learn.test;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.concurrent.*;

@Slf4j
public class ScheduledExecutorServiceTest {
    private static final ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

    static {
        ses.scheduleAtFixedRate(() ->
                log.info("Current time = {}", LocalDateTime.now()), 0, 10, TimeUnit.SECONDS);
    }
}
