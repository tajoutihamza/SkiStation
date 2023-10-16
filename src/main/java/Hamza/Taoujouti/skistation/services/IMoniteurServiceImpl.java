package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Cours;
import Hamza.Taoujouti.skistation.entities.Moniteur;
import Hamza.Taoujouti.skistation.repositories.ICoursRepository;
import Hamza.Taoujouti.skistation.repositories.IMoniteurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IMoniteurServiceImpl implements IMoniteurService{

    private final IMoniteurRepository moniteurRepo;
    private final ICoursRepository coursRepo;
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

    @Override
    public Moniteur addMoniteurAndAssignToCours(Moniteur moniteur, Long idCourse){
        Cours cours = coursRepo.findById(idCourse).orElse(null);
        Assert.notNull(cours,"Cours must not be null");
        Set<Cours> courses = new HashSet<>();
        courses.add(cours);
        moniteur.setCours(courses);
        moniteurRepo.save(moniteur);
        return moniteur;
    }
}
