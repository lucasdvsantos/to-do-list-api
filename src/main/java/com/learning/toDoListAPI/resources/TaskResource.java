package com.learning.toDoListAPI.resources;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.enums.TaskStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

    @GetMapping
    public ResponseEntity<Task> findAll() {
        Task t = new Task(1L, "Fazer compras", TaskStatus.PENDENTE);
        return ResponseEntity.ok().body(t);
    }
}
