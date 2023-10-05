package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Cours;

import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);
    List<Cours> getAll();
    Cours getById(long id);
    Cours updateCours(Cours cours);
    void DeleteCours(long id);


}
