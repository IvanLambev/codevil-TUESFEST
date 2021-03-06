package com.example.fest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comments")
@NamedQueries({
        @NamedQuery(name = "CommentsDomain.findByAppId", query = "SELECT j FROM CommentDomain j WHERE j.job_application_id = :jobApplicationId")
})
public class CommentDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private Long job_application_id;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private UserDomain userId;
    @Column
    private String text;
}
