package com.learning.toDoListAPI.resources;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.enums.TaskStatus;
import com.learning.toDoListAPI.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

    @Autowired
    private TaskService service;

    @GetMapping
    public ResponseEntity<List<Task>> findAll() {
        List<Task> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> findById(@PathVariable Long id){
        Task obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
