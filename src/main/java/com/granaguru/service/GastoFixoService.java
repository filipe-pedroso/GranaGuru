package main.java.com.granaguru.service;

import com.granaguru.model.GastoFixo;
import com.granaguru.repository.GastoFixoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoFixoService {
    private final GastoFixoRepository repository;

    public GastoFixoService(GastoFixoRepository repository) {
        this.repository = repository;
    }

    public GastoFixo salvar(GastoFixo gasto) {
        return repository.save(gasto);
    }

    public List<GastoFixo> listar(String usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
