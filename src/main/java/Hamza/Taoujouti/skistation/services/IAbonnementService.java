package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Abonnement;
import Hamza.Taoujouti.skistation.entities.enums.TypeAbonnement;

import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    public Abonnement addAbonnement(Abonnement abonnement);
    public void deleteAbonnement(Long abonnementId);
    public Abonnement updateAbonnement(Abonnement abonnement);
    public Abonnement getAbonnement(Long abonnementId);
    public List<Abonnement> getAllAbonnements();
    public Set<Abonnement> getAbonnementByType(TypeAbonnement typeAbonnement);
}
