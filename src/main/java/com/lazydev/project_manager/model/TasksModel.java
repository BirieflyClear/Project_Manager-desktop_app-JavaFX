package com.lazydev.project_manager.model;

import lombok.*;

public @Data
class TasksModel {
    
    private String title;
    private Boolean completed;

    public TasksModel(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    
}
