package me.whiteship.demowebmvc;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Date;

public class Event {
    private int id;
    @NotBlank
    private String name;
    @Min(value = 0)
    private int limit;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate time;

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
