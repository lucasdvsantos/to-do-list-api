package com.learning.toDoListAPI.services;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.enums.TaskStatus;
import com.learning.toDoListAPI.repositories.TaskRepository;
import com.learning.toDoListAPI.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public final class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task findById(Long id) {
        Optional<Task> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public List<Task> findByStatus(TaskStatus status) {
        return repository.findByStatus(status);
    }

    public Task insert(Task obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException(id);
        }
    }

    @Transactional
    public Task update(Long id, Task obj) {
        try {
            Task entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(Task entity, Task obj) {
        entity.setTitle(obj.getTitle());
        entity.setStatus(obj.getStatus());
        entity.setDeadline(obj.getDeadline());
    }
}
