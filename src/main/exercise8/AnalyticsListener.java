package com.labs.systemdesign.exercise05events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * TODO: react to the SAME UserCreatedEvent and record a signup metric by
 * calling
 * sink.metricsRecorded.incrementAndGet(). Adding this consumer must not
 * require touching SignupService.
 * React to the SAME UserCreatedEvent and record a signup metric by calling
 * sink.metricsRecorded.incrementAndGet().
 */

@Component
public class AnalyticsListener {

    private final EventSink sink;

    public AnalyticsListener(EventSink sink) {
        this.sink = sink;
    }

    @EventListener
    public void onUserCreated(UserCreatedEvent event) {
        sink.metricsRecorded.incrementAndGet();
    }
}
