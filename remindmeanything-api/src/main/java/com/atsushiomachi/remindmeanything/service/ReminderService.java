package com.atsushiomachi.remindmeanything.service;

import com.atsushiomachi.remindmeanything.model.Reminder;
import com.atsushiomachi.remindmeanything.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReminderService {
    @Autowired
    private ReminderRepository repository;

    public void create(Reminder reminder) {
        repository.save(reminder);
    }
}
