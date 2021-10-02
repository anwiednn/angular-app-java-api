package com.example.javaapi.controllers;

import com.example.javaapi.models.tasks.*;
import com.example.javaapi.services.abstractions.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/tasks")
public class TaskController {
    private final ITaskService _taskService;

    @Autowired
    public TaskController(ITaskService taskService) {
        this._taskService = taskService;
    }

    @PostMapping(path = "create")
    public int createTaskAsync(TaskCreateModel createModel)
    {
        // Verify user exists (active?)

        return 0;
        //return _taskService.CreateTaskAsync(createModel);
    }

    @GetMapping(path = "create/view")
    public TaskCreateViewModel getTaskCreateViewAsync()
    {
        return null;
        //return _taskService.GetTaskCreateViewAsync();
    }

    @GetMapping(path = "{id}/detail")
    public TaskDetailViewModel getTaskDetailViewAsync(@PathVariable("id") int id)
    {
        // Verify task exists

        return null;
        //return _taskService.GetTaskDetailViewAsync(id);
    }

    @GetMapping(path = "index")
    public TaskIndexViewModel GetTaskIndexViewAsync()
    {
        return null;
        //return _taskService.GetTaskIndexViewAsync();
    }

    @PostMapping(path = "index/page")
    public TaskIndexViewModel.PageModel GetTaskIndexViewPageAsync(  TaskIndexViewModel.PredicateModel predicateModel)
    {
        return null;
        //return _taskService.GetTaskIndexViewPageAsync(predicateModel);
    }

    @PutMapping(path = "{id}")
    public int UpdateTaskAsync(@PathVariable("id") int id,  TaskUpdateModel updateModel)
    {
        // Verify task exists
        // Verify user exists (and active?)

        return 0;
        //return _taskService.UpdateTaskAsync(updateModel);
    }
}
