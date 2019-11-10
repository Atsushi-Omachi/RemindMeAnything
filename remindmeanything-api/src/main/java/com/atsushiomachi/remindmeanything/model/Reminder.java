package com.atsushiomachi.remindmeanything.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
public class Reminder {
    @Id
    private final String id;
    private final String title;
    private final LocalDateTime limit;
    private final String content;
}
