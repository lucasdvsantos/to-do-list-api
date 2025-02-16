package com.learning.toDoListAPI.config;

import com.learning.toDoListAPI.entities.Task;
import com.learning.toDoListAPI.enums.TaskStatus;
import com.learning.toDoListAPI.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        Task t1 = new Task(null, "Pagar as contas", TaskStatus.PENDENTE);
        Task t2 = new Task(null, "Arrumar lâmpada", TaskStatus.CONCLUIDA);

        taskRepository.saveAll(Arrays.asList(t1, t2));
    }
}
