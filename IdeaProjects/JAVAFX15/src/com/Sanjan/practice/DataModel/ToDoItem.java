package com.Sanjan.practice.DataModel;

import java.time.LocalDate;

/**
 * Created by sanja on 2/13/2017.
 */
public class ToDoItem {

    private String shortDetail;
    private String description;

    private LocalDate df;

    public ToDoItem(String shortDetail, String description, LocalDate df) {
        this.shortDetail = shortDetail;
        this.description = description;
        this.df = df;
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

    public LocalDate getDf() {
        return df;
    }

    public void setDf(LocalDate df) {
        this.df = df;
    }

    @Override
    public String toString() {
        return shortDetail;
    }
}
