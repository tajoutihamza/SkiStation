package Hamza.Taoujouti.skistation.repositories;

import Hamza.Taoujouti.skistation.entities.Skieur;
import Hamza.Taoujouti.skistation.entities.enums.Couleur;
import Hamza.Taoujouti.skistation.entities.enums.Support;
import Hamza.Taoujouti.skistation.entities.enums.TypeAbonnement;
import Hamza.Taoujouti.skistation.entities.enums.TypeCours;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface ISkieurRepository extends CrudRepository<Skieur,Long> {
    List<Skieur> findSkieurByAbonnementTypeAbonnement(TypeAbonnement abonnement_TypeAbonnement);
    int countByAbonnementTypeAbonnementAndPistesCouleurAndInscriptionsCoursTypeCoursAndInscriptionsCoursSupport(TypeAbonnement abonnement_typeAbonnement, Couleur pistes_couleur, TypeCours inscriptions_cours_typeCours, Support inscriptions_cours_support);
    List<Skieur> findByDateNaissanceBetween(LocalDate dateNaissance, LocalDate dateNaissance2);
}
