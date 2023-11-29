package br.com.imobiliaria.model;

public class Calculos {
    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double calcularAreaTriangulo(double altura, double base) {
        return (base * altura) / 2;
    }

    public double calcularAreaCirculo(double raio) {
        return 3.14 * (raio * raio);
    }

    public double calcularAreaLosango(double diagonalMenor, double diagonalMaior) {
        return (diagonalMenor * diagonalMaior) / 2;
    }
}
