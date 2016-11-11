/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author mayara.barbosa
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FonteDados dados;
        dados = new FonteDados();
        dados.adicionar("prog3", 3);
        dados.adicionar("prog4", 4);
        dados.adicionar("prog5", 5);
        
        
        Tabela tabela; 
        tabela = new Tabela(dados);
        tabela.mostrar();
        
        Grafico grafico;
        grafico = new Grafico(dados);
        grafico.plotar();
        
        dados.addObserver(grafico);
        dados.addObserver(tabela);
        
        for(int i=10;i<20;i++){
            
            dados.adicionar("prog" + i, i);
        }
        
        
        /*
        Scanner sc;
        sc = new Scanner(System.in);
        for(;;){
            String nome;
            int valor;
            
            nome= sc.nextLine();
            valor= sc.nextInt();*/
        }
    }
    

