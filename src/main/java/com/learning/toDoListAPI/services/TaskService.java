package com.learning.toDoListAPI.services;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.repositories.TaskRepository;
import com.learning.toDoListAPI.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task findById(Long id) {
        Optional<Task> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Task insert(Task obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Task update(Long id, Task obj) {
        Task entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Task entity, Task obj) {
        entity.setTitle(obj.getTitle());
        entity.setStatus(obj.getStatus());
    }
}
