
import java.util.LinkedList;


public class Editor  {
  
 //Figura vetor[] = new Figura[10];
  LinkedList<Figura> list = new LinkedList<Figura>(); 
 //Vetor de Figuras

  
  // QUESTAO 02
void receberComandos(int operacao, Figura fig) {
    
    switch(operacao) {
        
        case 1 : //Adicionar figura
            list.add(fig);
            break;
        
        case 2: //Elimina figura
            for(int i = 0;  i < list.size(); i++)
                if(fig.equals(list.get(i)))
                    list.remove(i);
            break;
            
        case 3 :
            //Mostrar elementos da figura
            for(int i = 0 ; i < list.size(); i++)
                System.out.println(list.get(i));
            break;
        default :
            System.out.println("Operacao invalida");
        
    }
}


//QUESTAO 03
void imprimirAreas() {
    
    for(int i = 0; i < list.size(); i++)
    {
        System.out.println(list.get(i)+ " sua area é: ");
        //Polimorfismo de inclusão: Objeto utilizando um metodo da classe pai Figura
        list.get(i).calcularArea();
    }

}

void desenharFig(Figura fig) {
    
    for(int i = 0; i < list.size(); i++) {
        if(fig.equals(list.get(i))) {
            if(list.get(i) instanceof Quadrado ) {
                Quadrado aux = new Quadrado();
                
                aux = (Quadrado)list.get(i);
                
                //Nome e Atributos
                aux.desenhar();
                System.out.println("Lado: "+aux.getLado()+"\n Cor: "+aux.getCor());
                
                
            }
            
            if(list.get(i) instanceof Circulo) {
                Circulo aux = new Circulo();
                
                aux = (Circulo)list.get(i);
                
                
                aux.desenhar();
                System.out.println("Raio: "+aux.getRaio()+"\n Cor: "+aux.getCor());
            }
            
            if(list.get(i) instanceof Retangulo) {
                Retangulo aux = new Retangulo();
                
                aux = (Retangulo)list.get(i);
                
                aux.desenhar();
                System.out.println("Altura: "+aux.getAltura()+"Largura: "+aux.getLargura()+"\n Cor: "+aux.getCor());
            }
                
        }
    }
        
    
}
}

