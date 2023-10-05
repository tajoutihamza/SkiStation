package Hamza.Taoujouti.skistation.repositories;

import Hamza.Taoujouti.skistation.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursRepository extends JpaRepository<Cours, Long> {
}
