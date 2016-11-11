package app;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mayara.barbosa
 */
public class Grafico implements Observer{

    private final FonteDados fonteDados;
    
    public Grafico(FonteDados fonteDados){
        this.fonteDados = fonteDados;
    }
    
    public void plotar(){
        for(Dado d: fonteDados.getDados()){
            System.out.printf("%s - ",
                    d.getNome());
              for(int i=0; i<d.getValor(); i++){
                  System.out.printf("#");
              }   
              System.out.printf("\n");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
     plotar(); 
    }
}
