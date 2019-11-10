package com.atsushiomachi.remindmeanything.model;

import lombok.Value;

@Value
public class ReminderRequest {
    private final String id;
    private final String name;
}
