package main.java.com.granaguru.service;

import com.granaguru.model.GastoPontual;
import com.granaguru.repository.GastoPontualRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoPontualService {
    private final GastoPontualRepository repository;

    public GastoPontualService(GastoPontualRepository repository) {
        this.repository = repository;
    }

    public GastoPontual salvar(GastoPontual gasto) {
        return repository.save(gasto);
    }

    public List<GastoPontual> listar(String usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
