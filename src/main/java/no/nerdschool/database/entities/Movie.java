package no.nerdschool.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Integer runtime;

    @Column
    private LocalDate date;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Cast> getCasts() {
        //TODO: Return the casts property
        return Collections.emptyList();
    }

    public Person getDirector() {
        return null;
    }

    public String getHomepage() {
        //TODO: Return the homepage property
        return null;
    }

}
