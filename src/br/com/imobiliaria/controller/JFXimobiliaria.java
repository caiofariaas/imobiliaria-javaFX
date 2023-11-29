package br.com.imobiliaria.controller;

import br.com.imobiliaria.model.Calculos;
import br.com.imobiliaria.model.Imovel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JFXimobiliaria {
    @FXML
    private TextField tfProprietario, tfCidade, tfArea;
    @FXML
    private Button bQuadrado, bRetangulo, bTriangulo, bCirculo, bLosango,
    bSalvar, bFechar;

    Calculos calc = new Calculos();
    Imovel imovel = new Imovel();

    public void calcularQuadrado() {
        double lado;

        while (true){
            try {
                lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado: "));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }
        imovel.setAreaTerreno(String.valueOf(calc.calcularAreaQuadrado(lado)));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno()));
    }

    public void calcularRetangulo() {
        double base, altura;

        while (true){
            try {
                base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: "));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }
        while (true){
            try {
                altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: "));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }

        imovel.setAreaTerreno(String.valueOf(calc.calcularAreaRetangulo(base, altura)));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno()));
    }

    public void calcularTriangulo() {
        double base, altura;

        while (true){
            try {
                base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base: "));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }
        while (true){
            try {
                altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da altura: "));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }

        imovel.setAreaTerreno(String.valueOf(calc.calcularAreaTriangulo(base, altura)));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno()));
    }

    public void calcularCirculo() {
        double raio;

        while (true){
            try {
                raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio: "));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }
        imovel.setAreaTerreno(String.valueOf(calc.calcularAreaCirculo(raio)));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno()));
    }
    public void calcularLosango() {
        double diagonalMaior, diagonalMenor;

        while (true){
            try {
                diagonalMaior = Double.parseDouble((JOptionPane.showInputDialog("Informe o valor da diagonal maior: ")));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }
        while (true){
            try {
                diagonalMenor = Double.parseDouble((JOptionPane.showInputDialog("Informe o valor da diagonal menor: ")));
                break;
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor numérico!");
            }
        }

        imovel.setAreaTerreno(String.valueOf(calc.calcularAreaLosango(diagonalMenor, diagonalMaior)));
        tfArea.setText(String.valueOf(imovel.getAreaTerreno()));
    }

    public void salvar() {

        if (tfProprietario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não é possivel salvar sem a entrada de informações!");
            return;
        }
        else if (tfCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não é possivel salvar sem a entrada de informações!");
            return;
        }
        else if (tfArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não é possivel salvar sem a entrada de informações!");
            return;
        }

        imovel.setProprietario(tfProprietario.getText());
        imovel.setCidade(tfCidade.getText());

        String dados = imovel.obterDadosImovel();

        JOptionPane.showMessageDialog(null, dados);
    }

    public void fechar() {
        System.exit(0);
    }
}
