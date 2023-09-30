package Hamza.Taoujouti.skistation.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Cours {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int niveau;
    private TypeCours typeCours;
    private Support support;
    private float prix;
    private int creneau;

    @OneToMany(mappedBy = "cours")
    Set<Inscription> inscriptions;

}
