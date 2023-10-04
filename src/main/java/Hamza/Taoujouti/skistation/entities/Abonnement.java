package Hamza.Taoujouti.skistation.entities;

import Hamza.Taoujouti.skistation.entities.enums.TypeAbonnement;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Abonnement {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    private TypeAbonnement typeAbonnement;


}
