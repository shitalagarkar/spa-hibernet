package com.learncoding.spahibernet.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="Course")
public class JPACourse {

   @Id
    private long id;
   @Column(name="name")
    private String courseName;
   @Column (name="author")
   private String authorName;


    public JPACourse(long id, String courseName, String authorName) {
        this.id = id;
        this.courseName = courseName;
        this.authorName = authorName;
    }

    public JPACourse() {
    }

    @Override
    public String toString() {
        return "JPACourse{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
