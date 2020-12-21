package me.whiteship.demowebmvc;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Event {
    private int id;
    @NotBlank
    private String name;
    @Min(value = 0)
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
