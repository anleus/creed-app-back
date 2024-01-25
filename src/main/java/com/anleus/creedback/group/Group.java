package com.anleus.creedback.group;

import com.anleus.creedback.account.Account;
import com.anleus.creedback.post.Post;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PEOPLE_GROUP")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "CREATED_AT", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creationDate;
    @Column(name = "GROUP_NAME")
    private String groupName;
    @Column(name = "GROUP_DESCRIPTION")
    private String groupDescription;
    @ManyToOne
    @JoinColumn(name = "ADMIN_ID")
    private Account admin;

    @OneToMany(mappedBy = "group")
    private List<Post> posts;

    @ManyToMany(mappedBy = "groups")
    private List<Account> accounts;

    public Group() {
    }

    public Group(Long id, Timestamp creationDate, String groupName, String groupDescription, Account admin, List<Post> posts, List<Account> accounts) {
        this.id = id;
        this.creationDate = creationDate;
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.admin = admin;
        this.posts = posts;
        this.accounts = accounts;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public Account getAdmin() {
        return admin;
    }

    public void setAdmin(Account admin) {
        this.admin = admin;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group group)) return false;
        return Objects.equals(getId(), group.getId()) && Objects.equals(getCreationDate(), group.getCreationDate()) && Objects.equals(getGroupName(), group.getGroupName()) && Objects.equals(getGroupDescription(), group.getGroupDescription()) && Objects.equals(getAdmin(), group.getAdmin()) && Objects.equals(getPosts(), group.getPosts()) && Objects.equals(getAccounts(), group.getAccounts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreationDate(), getGroupName(), getGroupDescription(), getAdmin(), getPosts(), getAccounts());
    }
}
