package com.lazydev.project_manager.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TasksModel {
    
    private String title;
    private Boolean completed;

    public TasksModel(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }
    
}
