package com.ciro.tasks.controller;

import com.ciro.tasks.domain.Task;
import com.ciro.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public List<Task> listTasks(){
        return taskService.list();
    }

    @PostMapping(value = "/save")
    public Task saveTask(@RequestBody Task task){
        return taskService.save(task);
    }
}
