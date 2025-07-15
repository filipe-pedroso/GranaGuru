package main.java.com.granaguru.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class GastoPontual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double valor;
    private String categoria; // ex: "lazer", "transporte"
    private LocalDate data;

    @Column(nullable = false)
    private String usuarioId;
}
