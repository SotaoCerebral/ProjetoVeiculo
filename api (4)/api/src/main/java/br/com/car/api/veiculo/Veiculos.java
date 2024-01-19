package br.com.car.api.veiculo;

import br.com.car.api.consulta.DadosConsolidados;
import br.com.car.api.placas.Placa;
import br.com.car.api.placas.dadosPlaca;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "veiculo")
@Entity(name = "Veiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String proprietario;
    private String cpf;
    @Embedded
    private Placa placa;



}
