package main.java.com.granaguru.controller;

import com.granaguru.model.Receita;
import com.granaguru.service.ReceitaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
@CrossOrigin(origins = "*") // Habilita CORS para o frontend Angular
public class ReceitaController {
    private final ReceitaService service;

    public ReceitaController(ReceitaService service) {
        this.service = service;
    }

    @PostMapping
    public Receita criarReceita(@RequestBody Receita receita) {
        return service.salvar(receita);
    }

    @GetMapping("/{usuarioId}")
    public List<Receita> listar(@PathVariable String usuarioId) {
        return service.listarPorUsuario(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
