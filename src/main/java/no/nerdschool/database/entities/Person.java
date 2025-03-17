package no.nerdschool.database.entities;

import jakarta.persistence.*;
import no.nerdschool.database.utils.WikidataClient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
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
        //TODO: use the casts collection to find a list of movies directed by this person
        return Collections.emptyList();
    }

    public String getImage() {
        return WikidataClient.getImageUrl(getLink("wikidata"));
    }
}
