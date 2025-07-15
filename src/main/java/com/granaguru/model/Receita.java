package main.java.com.granaguru.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Double valor;
    private LocalDate data;

    @Column(nullable = false)
    private String usuarioId; // Firebase UID
}