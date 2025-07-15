package main.java.com.granaguru.controller;

import com.granaguru.model.GastoPontual;
import com.granaguru.service.GastoPontualService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gastos-pontuais")
@CrossOrigin(origins = "*")
public class GastoPontualController {
    private final GastoPontualService service;

    public GastoPontualController(GastoPontualService service) {
        this.service = service;
    }

    @PostMapping
    public GastoPontual criar(@RequestBody GastoPontual gasto) {
        return service.salvar(gasto);
    }

    @GetMapping("/{usuarioId}")
    public List<GastoPontual> listar(@PathVariable String usuarioId) {
        return service.listar(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
