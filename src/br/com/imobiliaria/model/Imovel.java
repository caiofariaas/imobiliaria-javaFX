package br.com.imobiliaria.model;

import javax.management.monitor.StringMonitor;

public class Imovel extends Calculos{
    private String proprietario, cidade, areaTerreno;

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(String areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public String obterDadosImovel() {
        return String.format("Proprietario: %s\nCidade: %s\nÁrea do Terreno: %.2f", this.proprietario, this.cidade, Double.parseDouble(this.areaTerreno));
    }
}
