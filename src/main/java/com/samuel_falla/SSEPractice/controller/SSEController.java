package com.samuel_falla.SSEPractice.controller;

import com.samuel_falla.SSEPractice.service.SseService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
public class SSEController {

    private final SseService service;

    public SSEController(SseService service) {
        this.service = service;
    }

    @GetMapping(path = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter subscribe() {
        SseEmitter emitter = new SseEmitter(30_000L);
        service.addEmitter(emitter);
        return emitter;
    }
}
