package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Cours;
import Hamza.Taoujouti.skistation.repositories.ICoursRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ICoursServiceImpl implements ICoursService{

    private final ICoursRepository coursRepo;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public List<Cours> getAll() {
        return coursRepo.findAll();
    }

    @Override
    public Cours getById(long id) {
        return coursRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("No cour found with this Id"));
    }

    @Override
    public Cours updateCours(Cours cours) {
        Assert.notNull(cours.getId(),"Cour Id must not be null");
        return coursRepo.save(cours);
    }

    @Override
    public void DeleteCours(long id) {
        coursRepo.deleteById(id);
    }
}
