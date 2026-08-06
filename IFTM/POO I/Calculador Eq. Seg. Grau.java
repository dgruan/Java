package com.mycompany.prj_calculadoraeqseggrau_poo1;

import com.mycompany.prj_calculadoraeqseggrau_poo1.bo.CalculoEqSegGrau;
import com.mycompany.prj_calculadoraeqseggrau_poo1.models.DadosEntrada;
import com.mycompany.prj_calculadoraeqseggrau_poo1.models.DadosSaida;

public class Prj_CalculadoraEqSegGrau_POO1 {

    public static void main(String[] args) {
        
        DadosEntrada de = new DadosEntrada();
        
        de.setA(1);
        de.setB(5);
        de.setC(6);
        
        CalculoEqSegGrau esg = new CalculoEqSegGrau();
        
        DadosSaida ds = esg.calcularDelta(de);
        ds = esg.calcularX1L(de);
        
        System.out.println("Delta: " + ds.getDelta());
        System.out.println("");
    }
}
