package com.tcs.blog;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Blog {
    @Getter @Setter
    @Id
    private long id;
    @Getter @Setter
    @Column
    private String title;
    @Getter @Setter
    @Column
    private String author;
    @Getter @Setter
    @Column
    private String publishDate;
    @Getter @Setter
    @Column
    private String description;


    public Blog(long id, String title, String author, String publishDate, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.description = description;
    }


    public Blog() {
    }

    
}
