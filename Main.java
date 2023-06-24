/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.calculomedia;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String args[]){   
       
        Operacoes biblioteca = new Operacoes();
        
        double[] vetorSoma = new double[10];
        
        vetorSoma[0] = 1;
        vetorSoma[1] = 10;
        vetorSoma[2] = 100;
        vetorSoma[3] = 15;
        vetorSoma[4] = 156;
        vetorSoma[5] = 12;
        vetorSoma[6] = 20;
        vetorSoma[7] = 90;
        vetorSoma[8] = 65;
        vetorSoma[9] = 4;
        
        System.out.println(biblioteca.max(vetorSoma));
        System.out.println(biblioteca.min(vetorSoma));
        System.out.println(biblioteca.media(vetorSoma));
        System.out.println(biblioteca.mediana(vetorSoma));
        
        System.out.println(biblioteca.divisao(10,2));
        System.out.println(biblioteca.multiplicacao(10,2));
        System.out.println(biblioteca.subtracao(10,2));
        
    	System.exit(0);
		
    }
		
}