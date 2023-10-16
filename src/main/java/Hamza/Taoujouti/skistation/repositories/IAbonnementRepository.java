package Hamza.Taoujouti.skistation.repositories;

import Hamza.Taoujouti.skistation.entities.Abonnement;
import Hamza.Taoujouti.skistation.entities.enums.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IAbonnementRepository extends JpaRepository<Abonnement,Long> {
    Set<Abonnement> findAbonnementByTypeAbonnement(TypeAbonnement typeAbonnement);
}
