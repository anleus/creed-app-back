package com.anleus.creedback.post;

import com.anleus.creedback.account.Account;
import com.anleus.creedback.group.Group;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "POST")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CREATED_AT", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp creationDate;

    @Column(name = "POST_CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private Account author;

    @ManyToOne
    @JoinColumn(name = "GROUP_ID")
    private Group group;

    public Post() {
    }

    public Post(Long id, Timestamp creationDate, String content, Account author, Group group) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
        this.author = author;
        this.group = group;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Account getAuthor() {
        return author;
    }

    public void setAuthor(Account author) {
        this.author = author;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;
        return Objects.equals(getId(), post.getId()) && Objects.equals(getCreationDate(), post.getCreationDate()) && Objects.equals(getContent(), post.getContent()) && Objects.equals(getAuthor(), post.getAuthor()) && Objects.equals(getGroup(), post.getGroup());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreationDate(), getContent(), getAuthor(), getGroup());
    }
}
