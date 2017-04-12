package sample.DatModel;

import java.time.LocalDate;

/**
 * Created by sanja on 2/28/2017.
 */
public class ToDoItem {

    private String shortDescription;
    private String details;
    private LocalDate localDate;

    public ToDoItem(String shortDescription, String details, LocalDate localDate) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.localDate = localDate;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
