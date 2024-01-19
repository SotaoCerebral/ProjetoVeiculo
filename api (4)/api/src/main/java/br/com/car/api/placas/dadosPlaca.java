package br.com.car.api.placas;

public record dadosPlaca( String marca, String modelo, String chassi) {


    public static dadosPlaca fromString(dadosPlaca  placa) {
        return new dadosPlaca( null, null, null);
    }

    public Boolean licenciado() {
        return licenciado();
    }
}