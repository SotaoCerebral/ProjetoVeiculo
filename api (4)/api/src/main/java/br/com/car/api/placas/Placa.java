package br.com.car.api.placas;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Placa {
    private String marca;
    private String modelo;
    private String chassi;
    private Boolean licenciado;


    public Placa(dadosPlaca dados){
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.chassi = dados.chassi();
        this.licenciado = dados.licenciado();
    }
}
