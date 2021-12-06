package com.alumini.alumini.alumini.service;

import com.alumini.alumini.alumini.model.AluminiModel;
import com.alumini.alumini.alumini.repository.AluminiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AluminiService {

    @Autowired
    private AluminiRepository aluminiRepository;

    public List<AluminiModel> getAllAlumini() {
        List<AluminiModel> alumini = new ArrayList<AluminiModel>();
        aluminiRepository.findAll().forEach(aluminis -> alumini.add(aluminis));
        return alumini;
    }

    public AluminiModel getAluminiById(String id) {
        return aluminiRepository.findById(id).get();
    }

    public void addAlumini(AluminiModel alumini) {
        aluminiRepository.save(alumini);
    }

    public void updateAlumini(AluminiModel alumini) {
        aluminiRepository.save(alumini);
    }

    public void deleteAluminiById(String id) {
        aluminiRepository.deleteById(id);
    }
}
