package com.learning.toDoListAPI.repositories;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    //Finds tasks by status
    List<Task> findByStatus(TaskStatus status);
}
