package no.nerdschool.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "casts")
public class Cast {
    @Id
    private Long id;


    @Column
    private String role;

    @Column
    private int position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movie getMovie() {
        //TODO: Return the movie property
        return null;
    }

    public Person getPerson() {
        //TODO: Return the person property
        return null;
    }

    public Job getJob() {
        //TODO: Return the job property
        return null;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}

