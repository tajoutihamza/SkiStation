package Hamza.Taoujouti.skistation.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;
    private int numSemaine;

    @ManyToOne
    Cours cours;
    @ManyToOne
    Skieur skieur;
}
