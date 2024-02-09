package com.example.ventevoiture.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "annonce")
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_annonce;
    @Column
    Date date_annonce;
    @Column
    Integer id_utilisateur;
    @Column
    Integer id_voiture;
    @Column
    Double prix;
    @Column
    Integer id_status;

    @Transient
    Voiture voiture;
    @Transient
    Employer employer;
    @Transient
    List<Photos_annonce> photos;
}
