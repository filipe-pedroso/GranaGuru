package main.java.com.granaguru.service;

import com.granaguru.model.Receita;
import com.granaguru.repository.ReceitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    private final ReceitaRepository repository;

    public ReceitaService(ReceitaRepository repository) {
        this.repository = repository;
    }

    public Receita salvar(Receita receita) {
        return repository.save(receita);
    }

    public List<Receita> listarPorUsuario(String usuarioId) {
        return repository.findByUsuarioId(usuarioId);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
