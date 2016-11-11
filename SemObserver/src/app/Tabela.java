/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mayara.barbosa
 */
public class Tabela implements Observer {
    
    private FonteDados fonteDado;
    
    public Tabela(FonteDados fonteDado){
        this.fonteDado = fonteDado;
    }
    
    public void mostrar(){
        for(Dado d: fonteDado.getDados()){
            System.out.printf("%s - %d\n",
                    d.getNome(),
                    d.getValor());
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        mostrar();
    }
}
