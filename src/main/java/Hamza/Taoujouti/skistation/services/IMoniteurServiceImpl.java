package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Moniteur;
import Hamza.Taoujouti.skistation.repositories.IMoniteurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IMoniteurServiceImpl implements IMoniteurService{

    private final IMoniteurRepository moniteurRepo;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public void deleteMoniteur(Long moniteurId) {
        moniteurRepo.deleteById(moniteurId);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        Assert.notNull(moniteur.getId(),"Montieur Id must not be null");
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur getMoniteur(Long moniteurId) {
        return moniteurRepo.findById(moniteurId).orElse(null);
    }

    @Override
    public List<Moniteur> getAllMoniteurs() {
        return (List<Moniteur>) moniteurRepo.findAll();
    }
}
