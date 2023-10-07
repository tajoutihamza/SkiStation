package Hamza.Taoujouti.skistation.services;

import Hamza.Taoujouti.skistation.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    public Moniteur addMoniteur(Moniteur moniteur);
    public void deleteMoniteur(Long moniteurId);
    public Moniteur updateMoniteur(Moniteur moniteur);
    public Moniteur getMoniteur(Long moniteurId);
    public List<Moniteur> getAllMoniteurs();
}
