package com.alumini.alumini.alumini.controller;

import com.alumini.alumini.alumini.model.AluminiModel;
import com.alumini.alumini.alumini.service.AluminiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AluminiController {

    @Autowired
    AluminiService aluminiService;

    //API to get all the Alumini
    @GetMapping("/alumini")
    public List<AluminiModel> getALlAlumini() {
        return aluminiService.getAllAlumini();
    }

    //API to get one Alumini
    @GetMapping("/alumini/{id}")
    public AluminiModel getAluminiById(@PathVariable("id") String id) {
        return aluminiService.getAluminiById(id);
    }

    //API to delete one Alumini
    @DeleteMapping("/alumini/delete/{id}")
    public void deleteAluminiById(@PathVariable("id") String id) {
        aluminiService.deleteAluminiById(id);
    }

    //API to add Alumini
    @PostMapping("/alumini/add")
    public String addAlumini(@RequestBody AluminiModel aluminiModel) {
        aluminiService.addAlumini(aluminiModel);
        return aluminiModel.getId();
    }

    //API to update Alumini
    @PutMapping("/alumini/update")
    public AluminiModel updateAlumini(@RequestBody AluminiModel aluminiModel) {
        aluminiService.updateAlumini(aluminiModel);
        return aluminiModel;
    }
    

}
