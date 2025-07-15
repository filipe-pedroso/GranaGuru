package main.java.com.granaguru.controller;

import com.granaguru.model.GastoFixo;
import com.granaguru.service.GastoFixoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gastos-fixos")
@CrossOrigin(origins = "*")
public class GastoFixoController {
    private final GastoFixoService service;

    public GastoFixoController(GastoFixoService service) {
        this.service = service;
    }

    @PostMapping
    public GastoFixo criar(@RequestBody GastoFixo gasto) {
        return service.salvar(gasto);
    }

    @GetMapping("/{usuarioId}")
    public List<GastoFixo> listar(@PathVariable String usuarioId) {
        return service.listar(usuarioId);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
