package com.atsushiomachi.remindmeanything.repository;

import com.atsushiomachi.remindmeanything.model.Reminder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends CrudRepository<Reminder, String> {
}
