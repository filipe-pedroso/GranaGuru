package main.java.com.granaguru.repository;

import com.granaguru.model.GastoPontual;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GastoPontualRepository extends JpaRepository<GastoPontual, Long> {
    List<GastoPontual> findByUsuarioId(String usuarioId);
}
