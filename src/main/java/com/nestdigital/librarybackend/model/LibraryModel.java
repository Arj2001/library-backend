package com.nestdigital.librarybackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class LibraryModel {

    @Id
    @GeneratedValue
    private int id;
    private String book_name;
    private String author;
    private String language;
    private int published;

    public LibraryModel(int id, String book_name, String author, String language, int published) {
        this.id = id;
        this.book_name = book_name;
        this.author = author;
        this.language = language;
        this.published = published;
    }

    public LibraryModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }
}
