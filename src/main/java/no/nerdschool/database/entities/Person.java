package no.nerdschool.database.entities;

import jakarta.persistence.*;
import no.nerdschool.database.utils.WikidataClient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "people")
public class Person {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private LocalDate birthday;

    @OneToMany(mappedBy = "person")
    private List<PersonLink> links = new ArrayList<>();

    @OneToMany(mappedBy = "person")
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getLink(String source) {
        for (PersonLink link : links) {
            if (link.getSource().equals(source)) return link.getKey();
        }
        return null;
    }

    public List<Movie> getMoviesDirected() {
        List<Movie> results = new ArrayList<>();
        for (Cast cast : casts) {
            if(cast.getJob().getName().equals("Director")) {
                results.add(cast.getMovie());
            }
        }
        return results;
    }

    public String getImage() {
        return WikidataClient.getImageUrl(getLink("wikidata"));
    }
}
