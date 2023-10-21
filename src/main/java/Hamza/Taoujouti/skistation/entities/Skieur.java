package Hamza.Taoujouti.skistation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Temporal(TemporalType.DATE)
    private LocalDate dateNaissance;
    private String ville;

    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;
    @JsonIgnore
    @OneToMany(mappedBy = "skieur")
    Set<Inscription> inscriptions;
    @JsonIgnore
    @ManyToMany(mappedBy = "skieurs",fetch = FetchType.EAGER)
    Set<Piste> pistes;
}
