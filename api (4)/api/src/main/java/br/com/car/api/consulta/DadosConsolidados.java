package br.com.car.api.consulta;

import br.com.car.api.veiculo.DadosCadastroVeiculo;
import br.com.car.api.veiculo.DadosVeiculos;

public record DadosConsolidados(DadosCadastroVeiculo dadosCadastroVeiculo, DadosVeiculos dadosVeiculos) {
}
