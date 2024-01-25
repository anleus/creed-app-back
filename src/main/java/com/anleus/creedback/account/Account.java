package com.anleus.creedback.account;

import com.anleus.creedback.group.Group;
import com.anleus.creedback.post.Post;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CREATED_AT", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creationDate;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @OneToMany(mappedBy = "author")
    private List<Post> posts = new ArrayList<Post>();

    @ManyToMany
    @JoinTable(name = "ACCOUNT_GROUP_X",
        joinColumns = @JoinColumn(name = "ACCOUNT_ID"),
        inverseJoinColumns = @JoinColumn(name = "GROUP_ID"))
    private List<Group> groups = new ArrayList<Group>();

    public Account() {
    }

    public Account(Long id, Timestamp creationDate, String username, String email, List<Post> posts, List<Group> groups) {
        this.id = id;
        this.creationDate = creationDate;
        this.username = username;
        this.email = email;
        this.posts = posts;
        this.groups = groups;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Objects.equals(getId(), account.getId()) && Objects.equals(getCreationDate(), account.getCreationDate()) && Objects.equals(getUsername(), account.getUsername()) && Objects.equals(getEmail(), account.getEmail()) && Objects.equals(getPosts(), account.getPosts()) && Objects.equals(getGroups(), account.getGroups());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreationDate(), getUsername(), getEmail(), getPosts(), getGroups());
    }
}
