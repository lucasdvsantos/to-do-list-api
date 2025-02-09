package com.learning.toDoListAPI.repositories;

import com.learning.toDoListAPI.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
