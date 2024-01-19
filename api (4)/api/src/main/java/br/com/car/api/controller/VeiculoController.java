package br.com.car.api.controller;


import br.com.car.api.consulta.DadosConsolidados;
import br.com.car.api.placas.Placa;
import br.com.car.api.veiculo.DadosVeiculos;
import br.com.car.api.veiculo.DadosCadastroVeiculo;
import br.com.car.api.veiculo.VeiculoRepository;
import br.com.car.api.veiculo.Veiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/consulta-dados")
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;
    @GetMapping("/{placa}")
    public DadosVeiculos consultaVeiculo(@PathVariable("placa")String dados){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity <DadosVeiculos> resp =
                restTemplate
                 .getForEntity(String.format("https://my.api.mockaroo.com/veiculos?key=55ad1cd0&placa=%s",dados)
                         ,DadosVeiculos.class);

        return resp.getBody();
    }

    @RequestMapping(value = "/Veiculo", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseEntity<DadosConsolidados> cadastrar(@RequestBody  DadosCadastroVeiculo dadosCadastroVeiculo) {
        DadosVeiculos dadosVeiculos = consultaVeiculo(String.valueOf(dadosCadastroVeiculo.placa()));
        DadosConsolidados dadosConsolidados = new DadosConsolidados(dadosCadastroVeiculo,dadosVeiculos);



        repository.save(new Veiculos();


        return ResponseEntity.ok(dadosConsolidados);
    }
}
