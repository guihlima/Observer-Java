
package observer;

public class Observer {

    public static void main(String[] args) {
        CarroPolicia carroP = new CarroPolicia();
        
        CarroRoubado carroR = new CarroRoubado();
        
        carroR.addObserver(carroP);
        
        carroR.frente();
        carroR.direita();
        carroR.frente();
        carroR.esquerda();
        carroR.para();
    }
    
}
