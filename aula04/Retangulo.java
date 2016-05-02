
public class Retangulo extends Figura implements FiguraColorida{
        
    private float altura;
    private float largura;
    private String tipo = "não colorido";
    private String cor = " ";
    
    Retangulo(){}
    
    Retangulo(String cor) {
        tipo = "colorido";
        this.cor = cor;
    }
    
    public String toString() {
        return "Retangulo";
    }
    
    //Polimorfismo de sobrecarga
    public void desenhar() {
        System.out.println(this.toString());
    }
    
    public void desenhar(String cor) {
             this.tipo = "Colorido";
             this.cor = cor;
             System.out.println(this.toString());
         }
    
    public void calcularArea() {
        System.out.println("A área é: "+altura*largura);
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public float getLargura() {
        return largura;
    }
    
     public String getTipo() {
        return this.tipo;
    }
    
    public String getCor() {
        return cor;
    }
}
