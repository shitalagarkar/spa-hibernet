package com.learncoding.spahibernet.springjdbc;

public class Course {
    private long id;
    private String name;
    private String author;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Course(long id, String courseName, String author) {
        this.id = id;
        name = courseName;
        this.author = author;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", CourseName='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
