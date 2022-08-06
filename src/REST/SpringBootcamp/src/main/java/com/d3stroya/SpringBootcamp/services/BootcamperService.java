package com.d3stroya.SpringBootcamp.services;

import com.d3stroya.SpringBootcamp.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private List<Bootcamper> bootcampers = new ArrayList();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        // Recorre la lista
        for(Bootcamper bootcamper : bootcampers) {
            // Si coincide con el parámetro, lo devuelve
            if(bootcamper.getNombre().equalsIgnoreCase(nombre)) {
                return bootcamper;
            }
        }
        return null;
    }
}
