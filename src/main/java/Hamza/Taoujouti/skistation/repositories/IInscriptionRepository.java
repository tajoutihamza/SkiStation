package Hamza.Taoujouti.skistation.repositories;

import Hamza.Taoujouti.skistation.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInscriptionRepository extends JpaRepository<Inscription,Long> {
}
