package main.java.com.granaguru.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class GastoFixo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double valor;
    private LocalDate vencimento;
    private String recorrencia; // ex: "mensal", "bimestral"

    @Column(nullable = false)
    private String usuarioId;
}
