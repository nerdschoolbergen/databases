package no.nerdschool.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "people_links")
public class PersonLink {
    @Id
    private Long id;

    @Column
    private String key;

    @Column
    private String source;

    @ManyToOne
    @JoinColumn(name = "person_id")
    Person person;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
