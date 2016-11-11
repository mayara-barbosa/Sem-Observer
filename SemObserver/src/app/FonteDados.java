/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author mayara.barbosa 
 */
public class FonteDados extends Observable {
    
    private List<Dado> dados = new ArrayList<>();
   
    public List<Dado> getDados(){
        return dados;
    }
    
    public void adicionar(String nome, int valor){
        dados.add(new Dado(valor, nome));
        setChanged();
        notifyObservers();//chama o update dos observers
    }
    
}
