package mx.edu.utez.pokemon.Controller;

import mx.edu.utez.pokemon.Destinos.Destinos;
import mx.edu.utez.pokemon.Service.Destin.DestinoService;
import mx.edu.utez.pokemon.Usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api-pokemon/destinos")
@CrossOrigin(origins = {"*"})

public class Destinos_controller {
    @Autowired
    private DestinoService service;
    @GetMapping("/")
    public ResponseEntity<List<Destinos>> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable("id") Long id){
        return this.service.getOne(id);
    }

    @PostMapping("/")
    public Destinos saveDestino(
            @Valid @RequestBody Destinos destino)
    {
        return service.saveDestino(destino);
    }
}