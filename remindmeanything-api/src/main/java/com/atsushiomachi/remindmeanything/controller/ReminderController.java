package com.atsushiomachi.remindmeanything.controller;

import com.atsushiomachi.remindmeanything.model.Reminder;
import com.atsushiomachi.remindmeanything.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reminder")
public class ReminderController {
    @Autowired
    private ReminderService service;

    @PostMapping
    public void create(Reminder request) {
        service.create(request);
    }
}
