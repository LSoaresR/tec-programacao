
public class Circulo extends Figura implements FiguraColorida {
    static final double pi = 3.14;

    private double raio;
    private String tipo = "não colorido";
    private String cor = " ";
    
    //Construtor
    Circulo() {}
    Circulo(String cor) {
        this.tipo = "Colorido";
        this.cor = cor;
    }

    public String toString() {
    	return "Circulo, "+this.tipo;
    }
//******************************Desenho()***************************************
    public void desenhar() {
    	System.out.println(this.toString());
    }
    
    public void desenhar(String cor) {
       this.tipo = "Colorido";
       this.cor = cor;
       System.out.println(this.toString());
    }
//******************************************************************************
    public void calcularArea() {
    	 System.out.println("Area é: "+ pi *( raio*raio));
    } 

    //Metodos gets e sets

    public void  setRaio(int raio) {
        this.raio = raio;
    } 

    public double getRaio() {
        return this.raio;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public String getCor() {
        return this.cor;
    }
   
    
}
