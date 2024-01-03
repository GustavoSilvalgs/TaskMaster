package com.rest.task.services;

import com.rest.task.models.TaskList;
import com.rest.task.repositories.TaskListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {

    private final TaskListRepository repository;

    public TaskListService(TaskListRepository repository) {
        this.repository = repository;
    }

    public TaskList create(TaskList taskList) {
        return repository.save(taskList);
    }

    public List<TaskList> findAll() {
        return repository.findAll();
    }

    public TaskList findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public TaskList update(TaskList taskList) {
        return repository.save(taskList);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
