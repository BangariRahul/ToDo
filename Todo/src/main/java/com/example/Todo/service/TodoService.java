package com.example.Todo.service;

import com.example.Todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public static final List<Todo> todo = new ArrayList<Todo>();

    static{
    Todo tdo1 = new Todo(1 , "gym" , false  );
    todo.add(tdo1);

    Todo tdo2 = new Todo(2 , "home work" , true  );
    todo.add(tdo2);

    Todo tdo3 = new Todo(3 , "shopping" , false  );
    todo.add(tdo3);
    }

    public List<Todo> getAll() {
        return todo;
    }

    public Todo getById(String id) {
          Todo TODO = null;
        for(Todo i : todo){
            if(i.getId()==Integer.parseInt(id)){
               TODO = i;
            }
        }
        return TODO;
    }

    public List<Todo> getByStatus(String val) {
        List<Todo> TODO = new ArrayList<>();
        for(Todo i : todo){
            if((i.isStatus() && val.equals("true")) || (!i.isStatus() && val.equals("false")) ){
                TODO.add(i);
           }
        }
     return TODO;
    }

    public void AddTask(Todo td) {
    }

    public void updatetodo(String id, Todo toDo) {

        for(Todo i : todo){
            if(i.getId() == Integer.parseInt(id)){

                i.setWork(toDo.getWork());
                i.setStatus(toDo.isStatus());

                return;
            }
        }
    }

    public void deletetask(String id) {

        for(Todo i : todo ){
            if(i.getId() == Integer.parseInt(id));
            todo.remove(i);
            return;
        }
    }
}
