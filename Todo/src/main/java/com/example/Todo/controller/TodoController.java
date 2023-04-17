package com.example.Todo.controller;

import com.example.Todo.model.Todo;
import com.example.Todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping(value = "/getAll")
    public List<Todo> getALlTodo() { // this methods get all the task ;

        return todoService.getAll();

    }

    @GetMapping(value = "/getByID/{id}")
    public Todo getByIdTodo(@PathVariable String id) { // this methods get the task with id ;

        return todoService.getById(id);

    }

    @GetMapping(value = "getByStatus/{val}")
    public List<Todo> getByStatusTodo(@PathVariable String val) {
        return todoService.getByStatus(val);
    }

    @PostMapping(value = "/add-task")
    public String addTask(@RequestBody Todo td) {
        todoService.AddTask(td);
        return "New Task Added.....";
    }

    @PutMapping(value = "/done/{ID}")
    public String updateTodo(@PathVariable String ID, @RequestBody Todo todo) {
        todoService.updatetodo(ID, todo);
        return "Todo updated......";
    }


    @DeleteMapping(value = "deleteTask/{ID}")
    public String deleteTask(@PathVariable String ID) {
        todoService.deletetask(ID);
        return "Task deleted.......";
    }

}