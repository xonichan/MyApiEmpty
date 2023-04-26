package com.oniFactory.MyApiEmpty.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
public class PostRq {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private OffsetDateTime rq_date_time;

    private String rq_text;
    private int views;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OffsetDateTime getRq_date_time() {
        return rq_date_time;
    }

    public void setRq_date_time(OffsetDateTime rq_date_time) {
        this.rq_date_time = rq_date_time;
    }

    public String getRq_text() {
        return rq_text;
    }

    public void setRq_text(String rq_text) {
        this.rq_text = rq_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public PostRq() {
    }

    public PostRq(String rq_text) {
        this.rq_text = rq_text;
        this.rq_date_time = OffsetDateTime.now();
    }
}
