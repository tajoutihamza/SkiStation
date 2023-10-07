package Hamza.Taoujouti.skistation.controllers;

import Hamza.Taoujouti.skistation.entities.Cours;
import Hamza.Taoujouti.skistation.services.ICoursService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cours")
@RequiredArgsConstructor
public class CoursController {

    @Qualifier("ICoursServiceImpl")
    private final ICoursService coursService;

    @PostMapping()
    public Cours addCours(@RequestBody Cours cours){
        return coursService.addCours(cours);
    }

    @GetMapping("{id}")
    public Cours getCours(@PathVariable long id){
        return  coursService.getById(id);
    }
    @GetMapping()
    public List<Cours> getAllCours(){
        return coursService.getAll();
    }
    @DeleteMapping("{id}")
    public void deleteCours(@PathVariable long id){
        coursService.DeleteCours(id);
    }
    @PutMapping("update")
    public Cours updateCours(@RequestBody Cours cours){
        return coursService.updateCours(cours);
    }

}
