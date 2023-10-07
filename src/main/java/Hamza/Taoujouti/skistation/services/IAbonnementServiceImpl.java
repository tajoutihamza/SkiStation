package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Abonnement;
import Hamza.Taoujouti.skistation.repositories.IAbonnementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IAbonnementServiceImpl implements IAbonnementService{

    private final IAbonnementRepository abonnementRepo;
    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public void deleteAbonnement(Long abonnementId) {
        abonnementRepo.deleteById(abonnementId);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        Assert.notNull(abonnement.getId(),"Abonnement Id must not be null");
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement getAbonnement(Long abonnementId) {
        return abonnementRepo.findById(abonnementId).orElseThrow(() -> new IllegalArgumentException("No cour found with this Id"));
    }

    @Override
    public List<Abonnement> getAllAbonnements() {
        return abonnementRepo.findAll();
    }
}
