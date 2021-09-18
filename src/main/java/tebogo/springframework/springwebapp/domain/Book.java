package tebogo.springframework.springwebapp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * created by Tebogo on 14/9/2021
 */
@Entity
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private  Long id;
    private String title;
    private String Isbn;
    @ManyToMany
    @JoinTable (name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    public Book() {
    }

    public Book(String title, String isbn) {
        this.title = title;
        Isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
}

