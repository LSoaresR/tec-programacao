
public class Quadrado extends Figura implements FiguraColorida  {
    	private Ponto a, b, c, d;
	private float lado;
        private String tipo = "não colorido";
        private String cor = " ";

        //Construtor
        Quadrado() {}
        Quadrado(String cor) {
            this.tipo = "Colorido";
            this.cor = cor;
        }
        
//Redefinindo o metodo toString, da classe Object
	public String toString() {
		return "Quadrado, "+this.tipo ;
	}
        
        //Polimorfismo de sobrecarga desenhar() desenhar(String cor)
	 public void desenhar() {

		System.out.println(this.toString());
	}
        //Polimorfismo de sobrecarga desenhar() desenhar(String cor)
         public void desenhar(String cor) {
             this.tipo = "Colorido";
             this.cor = cor;
             System.out.println(this.toString());
         }

	void calcularLado() {
		
	}
    
    public void calcularArea() {
         System.out.println("Area é: "+lado*lado);
    }

    //Metodos sets e gets

    public void setLado(float lado) {
    	this.lado = lado;
    }

    public float getLado() {
    	return this.lado;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String getCor() {
        return cor;
    }

    
}
