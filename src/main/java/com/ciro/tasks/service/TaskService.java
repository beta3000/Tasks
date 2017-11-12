package com.ciro.tasks.service;

import com.ciro.tasks.domain.Task;

import java.util.List;

public interface TaskService {

    List<Task> list();
    Task save(Task task);
}
