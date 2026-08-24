package application;

import java.util.Scanner;
import models.DadosEntradaAluno;
import models.DadosSaidaAluno;
import bo.CalculadoraMedia;

public class NotaAlunoMain {

    public static void main(String[] args) {
        
        String nome;
        double nota1;
        double nota2;
        
        Scanner sc = new Scanner(System.in);
        DadosEntradaAluno de = new DadosEntradaAluno();
        DadosSaidaAluno ds = new DadosSaidaAluno();
        CalculadoraMedia cm = new CalculadoraMedia();
        
        System.out.print("Nome: ");
        nome = sc.nextLine();
        de.setNome(nome);
        
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        de.setNota1(nota1);
        
        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();
        de.setNota2(nota2);
        
        cm.calcular(de, ds);
        
        System.out.println(de.getNome());
        System.out.println(ds.getMedia());
        System.out.println(ds.getResultado());
    }
    
}
