package com.jpa.JpaCrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "istructor_details")

public class InstructorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "youtube_channel")
    private String youtubeChannal;
    @Column(name = "hobby")
    private String hobby;

    public InstructorDetails() {
    }

    public InstructorDetails(String youtubeChannal, String hobby) {
        this.youtubeChannal = youtubeChannal;
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYoutubeChannal() {
        return youtubeChannal;
    }

    public void setYoutubeChannal(String youtubeChannal) {
        this.youtubeChannal = youtubeChannal;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InstructorDetails{" +
                "id=" + id +
                ", youtubeChannal='" + youtubeChannal + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
