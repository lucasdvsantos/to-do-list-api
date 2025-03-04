package com.learning.toDoListAPI.config;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.enums.TaskStatus;
import com.learning.toDoListAPI.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        Task t1 = new Task(null, "Pagar as contas", Instant.parse("2025-01-08T00:00:00.000Z"), TaskStatus.PENDENTE);
        Task t2 = new Task(null, "Arrumar lâmpada", Instant.parse("2025-01-15T00:00:00.000Z"), TaskStatus.CONCLUIDA);

        taskRepository.saveAll(Arrays.asList(t1, t2));
    }
}
