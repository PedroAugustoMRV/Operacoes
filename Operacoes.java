/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.calculomedia;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Operacoes {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static double soma(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public static double max(double[] vetor){
        
        double max = vetor[0];
        
        for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] > max)
            {
                max =  vetor[i];
            }
        }
        return max;
    }
    
    public static double min(double[] vetor){
        
        double min = vetor[0];
        
        
        for(int i = 0; i < vetor.length; i++)
        {

            if(vetor[i] < min)
            {
                min =  vetor[i];
            }
        }

        return min;
    }
    
    public static double divisao(double valor1, double valor2)
    {
        return valor1 / valor2;
    }
    
    public static double multiplicacao(double valor1, double valor2)
    {
        return valor1 * valor2;
    }
    
    public static double subtracao(double valor1, double valor2)
    {
        return valor1 - valor2;
    }
    
    public static double media(double vetor[]){
        
        double soma = 0;
        double media = 0;
        
        for(int i = 0; i < vetor.length; i++)
        {
            soma += vetor[i]; 
        }
        media = soma / vetor.length;
        
        return media;
    }
    
    public static double mediana(double[] vetor) {
        
        int tamanho = vetor.length;
        Arrays.sort(vetor); // ordena o vetor em ordem crescente

        if (tamanho % 2 == 0) 
        {
            // Número de elementos é par
            int indice1 = tamanho / 2 - 1;
            int indice2 = tamanho / 2;
            return (vetor[indice1] + vetor[indice2]) / 2.0;
        } 
        else 
        {
            // Número de elementos é ímpar
            int indice = tamanho / 2;
            return vetor[indice];
        }
    }
}