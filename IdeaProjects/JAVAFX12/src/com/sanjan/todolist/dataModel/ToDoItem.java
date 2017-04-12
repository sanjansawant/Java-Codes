package com.sanjan.todolist.dataModel;

import java.time.LocalDate;

/**
 * Created by sanja on 2/12/2017.
 */
public class ToDoItem {

    private String shortDetail;
    private String description;
    private LocalDate deadline;

    public ToDoItem(String shortDetail, String description, LocalDate deadline) {
        this.shortDetail = shortDetail;
        this.description = description;
        this.deadline = deadline;
    }

    public String getShortDetail() {
        return shortDetail;
    }

    public void setShortDetail(String shortDetail) {
        this.shortDetail = shortDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return shortDetail;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
