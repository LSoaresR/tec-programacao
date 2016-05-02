
public class Main {
    
    public static void main(String args[]) {
         Editor e = new Editor();
         Quadrado q = new Quadrado();
         Circulo c = new Circulo();
         
         //Polimorfismo passando inteiro, e o metodo vai converter em float
         q.setLado(2);
         
         System.out.println("MENU\n"
                            + "Comandos do Editor:\n"
                            + "1 - Adicionar figura\n2 - Remover figura\n3 - Listar figuras\n "
                            + "-------------------------------------------------------------");
         
         e.receberComandos(1, q);
         e.receberComandos(1, c);
         e.receberComandos(3, q);
         e.receberComandos(2, q);
         System.out.println();
         e.receberComandos(3, q);
         
         //Imprimir aras das figuras
         e.imprimirAreas();
    }
    
}
