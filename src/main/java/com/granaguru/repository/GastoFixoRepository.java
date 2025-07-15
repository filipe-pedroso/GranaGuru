package main.java.com.granaguru.repository;

import com.granaguru.model.GastoFixo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GastoFixoRepository extends JpaRepository<GastoFixo, Long> {
    List<GastoFixo> findByUsuarioId(String usuarioId);
}
