package Hamza.Taoujouti.skistation.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;

    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;
    @OneToMany(mappedBy = "skieur")
    Set<Inscription> inscriptions;
    @ManyToMany(mappedBy = "skieurs")
    Set<Piste> pistes;
}
