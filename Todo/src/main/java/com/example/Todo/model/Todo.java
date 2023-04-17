package com.example.Todo.model;

public class Todo {

    private int id;
    private String work;
    private boolean status;

    public Todo(int id, String work, boolean status) {
        this.id = id;
        this.work = work;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", work='" + work + '\'' +
                ", status=" + status +
                '}';
    }
}
