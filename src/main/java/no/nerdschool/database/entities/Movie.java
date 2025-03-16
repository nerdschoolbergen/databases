package no.nerdschool.database.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "movie")
    private List<Cast> casts = new ArrayList<>();

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
        return casts;
    }

    public Person getDirector() {
        for (Cast cast : casts) {
            if (cast.getJob().getName().equals("Director")) {
                return cast.getPerson();
            }
        }
        return null;
    }
}
