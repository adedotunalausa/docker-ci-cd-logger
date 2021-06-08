package com.bezkoder.spring.datajpa.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up()
                .withDetail("App", "Bouncing in the Lord in good health :D")
                .withDetail("Error", "Nothing for now and forever!");
    }
}
