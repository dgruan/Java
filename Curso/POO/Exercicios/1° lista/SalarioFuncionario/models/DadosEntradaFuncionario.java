package models;

public class DadosEntradaFuncionario {
    private String nome;
    private double salarioBase;
    private double qtdHrsExtra;
    private double valorHrExtra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getQtdHrsExtra() {
        return qtdHrsExtra;
    }

    public void setQtdHrsExtra(double qtdHrsExtra) {
        this.qtdHrsExtra = qtdHrsExtra;
    }

    public double getValorHrExtra() {
        return valorHrExtra;
    }

    public void setValorHrExtra(double valorHrExtra) {
        this.valorHrExtra = valorHrExtra;
    }
    
    
}
