package com.d3stroya.SpringBootcamp.controllers;

import com.d3stroya.SpringBootcamp.models.Bootcamper;
import com.d3stroya.SpringBootcamp.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
//    @GET
//    public String hola() {
//        return "Hola";
//    }

    // ATRIBUTOS
    // El controlador no habla directamente con el modelo
    // Necesita el servicio de intermediario:
    private BootcamperService bootcamperService;

    // CONSTRUCTOR
    // Inyección de dependencias: pasar los servicios por parámetro
    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Franky"));
        this.bootcamperService.add(new Bootcamper("Bridget"));
        this.bootcamperService.add(new Bootcamper("Tess"));
    }

    // MÉTODOS
    // Listar usuarios
    @GET
    @Path("/bootcampers")
    @Produces("application/json")   // Convierte la lista a json
    public List<Bootcamper> listarTodos() {
        // Accede al método getAll() de BootcamperService
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }

    // Crear usuario
    @POST
    @Path("/bootcampers")
    @Produces("application/json")   // Envía la info en json
    @Consumes("application/json")   // Recibe la info en json
    public Response crearBootcamper(Bootcamper bootcamper) {
        // Añade el usuario a la lista
        bootcamperService.add(bootcamper);
        // Devuelve respuesta con url
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }
}
