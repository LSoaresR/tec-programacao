
public class ObZeroNegativo implements Observer {
    public void notificar(Observable o) {
        double d = o.execute();
        if(d == 0)
            System.out.println("Valor da Expressão é 0");
        if(d < 0)
            System.out.println("Valor da expressão é um nomero negativo");
    }
    
}
