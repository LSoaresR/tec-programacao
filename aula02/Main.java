import javax.swing.JOptionPane;
/* 1 - Conjuntos ainda nao podem conter elementos repetidos 
   2- Zeros estao sendo ignorados, pois 0 esta sendo o vazio dentro de um conjunto
*/

class Main {

	// 0 EM UM CONJUNTO ESTA SENDO DESCONSIDERADO
	static final int MAX = 10;
    
	public static void main(String[] args) {
		
/*
		int teste[] = new int[MAX];
		
		
		teste[0] = 1;
		teste[1] = 5;
		teste[2] = 3;

		int valor;
        
     
		 valor = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero: "));

	

		 // 2ª QUESTAO

		 //Conjunto 1: 10 primeiros numeros naturais
		   Conjunto a = new Conjunto(10);

		 a.insercao(1);
		 a.insercao(2);
		 a.insercao(3);
		 a.insercao(4);
         a.insercao(5);
         a.insercao(6);
         a.insercao(7);
         a.insercao(8);
         a.insercao(9);
         a.insercao(10);
         
         //Conjunto 2: 5 primeiros numeros pares
         Conjunto b = new Conjunto(5);

         b.insercao(2);
         b.insercao(4);
         b.insercao(6);
         b.insercao(8);
         b.insercao(10);

         //Conjunto 3: 5 primeiros impares
         Conjunto c = new Conjunto(5);

         c.insercao(1);
         c.insercao(3);
         c.insercao(5);
         c.insercao(7);
         c.insercao(9);

         //Conjunto 4: 10 primeiro primos
         Conjunto d = new Conjunto(10);

         d.insercao(1);
         d.insercao(3);
         d.insercao(5);
         d.insercao(7);
         d.insercao(11);
         d.insercao(13);
         d.insercao(17);
         d.insercao(19);
         d.insercao(23);
         d.insercao(29);


         //Itens 

         // A
         System.out.println("\nITEM A \n");

         boolean teste = d.subconjunto(d);



         if(teste) 
         	System.out.println("A e subconjunto de si mesmo");
         
         else 
         	System.out.println("Nao e subconjunto de si mesmo");
         

         //B

         System.out.println("\nITEM B \n");
         teste = false;

        
         
         teste = a.subconjunto(b);

         if(teste) 
            System.out.println("2 e subconjunto de 1");
         
         else 
            System.out.println(" 2 nao e subconjunto de 1 ");

         teste = a.subconjunto(c);

            
         if(teste) 
            System.out.println("3 e subconjunto de 1");
         
         else 
            System.out.println(" 3 nao e subconjunto de 1 ");
         

         teste = a.subconjunto(d);

         if(teste) 
            System.out.println("4 e subconjunto de 1");
         
         else 
            System.out.println("4 nao e subconjunto de 1 ");



         //C
         System.out.println("\nITEM C\n");

         Conjunto uni = b.uniao(c);
         Conjunto dif = uni.diferenca(a);
         //Primeira : criar um laco para verificar elemento por elemento 
         //Segunda: Criar um metodo para verificar se sao iguais 
         if(dif.getVazio()) 
         	System.out.println("Sao iguais");
         else
         	System.out.println("Nao sao iguais");

         
         //D
         
         Conjunto inter = a.interseccao(b);
         
         if(inter.getVazio()) 
        	 System.out.println("\nE vazia");
         else
        	 System.out.println("\nNao e vazia");
         
         //E
         
         Conjunto di = a.diferenca(b);
         
         
        // b.pro_cartesiano(c);
         //di.Print();
         
         Conjunto cart = a.produto_cartesiano(b);
         
         cart.Print_Matrix();
         
         
         //QUESTAO 05
         
         //Mostrar Lei de Morgan
         
         //Conjunto universo
         
         Conjunto universo = new Conjunto(50);
         
         for(int i= 1; i <= 50; i++) {
        	 universo.insercao(i);
         }
         
         //~(A U B) = ~A ^ ~B
        
         //Primeiro lado
         Conjunto unn = a.uniao(b);
         Conjunto barrado = universo.diferenca(unn);
        
         //barrado.Print();
         
         //Segundo lado
         
         Conjunto barra_a = universo.diferenca(a);
         Conjunto barra_b = universo.diferenca(b);
         
         Conjunto sec = barra_a.interseccao(barra_b);
         
        // sec.Print();
         
         
        //~(A^B) = ~A U ~B
                 
         Conjunto in = a.interseccao(b);
         //in.Print();
         Conjunto ba = universo.diferenca(in);
         
         Conjunto uni_ao = barra_a.uniao(barra_b);
         
         uni_ao.Print();
         
         //barra.Print();
        	 
        	 */
		
		//QUESTAO 03
		
		 //Conjunto 1: 10 primeiros numeros naturais
	  Conjunto a = new Conjunto(10);

	  a.insercao(1);
	  a.insercao(2);
	  a.insercao(3);
	  a.insercao(4);
      a.insercao(5);
      a.insercao(6);
      a.insercao(7);
      a.insercao(8);
      a.insercao(9);
      a.insercao(10);
      
      
      //Conjunto 2: 5 primeiros numeros pares
      Conjunto b = new Conjunto(5);

      b.insercao(2);
      b.insercao(4);
      b.insercao(6);
      b.insercao(8);
      b.insercao(10);

      //Conjunto 3: 5 primeiros impares
      Conjunto c = new Conjunto(5);

      c.insercao(1);
      c.insercao(3);
      c.insercao(5);
      c.insercao(7);
      c.insercao(9);

      //Conjunto 4: 10 primeiro primos
      Conjunto d = new Conjunto(10);

      d.insercao(1);
      d.insercao(3);
      d.insercao(5);
      d.insercao(7);
      d.insercao(11);
      d.insercao(13);
      d.insercao(17);
      d.insercao(19);
      d.insercao(23);
      d.insercao(29);
      
      // A
      System.out.println("\nITEM A \n");

      boolean teste = d.subconjunto(d);



      if(teste) 
      	System.out.println("A e subconjunto de si mesmo");
      
      else 
      	System.out.println("Nao e subconjunto de si mesmo");
      
      //B

      System.out.println("\nITEM B \n");
      teste = false;

     
      
      teste = a.subconjunto(b);

      if(teste) 
         System.out.println("2 e subconjunto de 1");
      
      else 
         System.out.println(" 2 nao e subconjunto de 1 ");

      teste = a.subconjunto(c);

         
      if(teste) 
         System.out.println("3 e subconjunto de 1");
      
      else 
         System.out.println(" 3 nao e subconjunto de 1 ");
      

      teste = a.subconjunto(d);

      if(teste) 
         System.out.println("4 e subconjunto de 1");
      
      else 
         System.out.println("4 nao e subconjunto de 1 ");



      //C
      System.out.println("\nITEM C\n");

      Conjunto uni = b.uniao(c);
      Conjunto dif = uni.diferenca(a);
      //Primeira : criar um laco para verificar elemento por elemento 
      //Segunda: Criar um metodo para verificar se sao iguais 
      if(dif.getVazio()) 
      	System.out.println("Sao iguais");
      else
      	System.out.println("Nao sao iguais");

      
      //D
      
      Conjunto inter = a.interseccao(b);
      
      if(inter.getVazio()) 
     	 System.out.println("\nE vazia");
      else
     	 System.out.println("\nNao e vazia");
      
      //E
      
      Conjunto di = a.diferenca(b);
      
      
     // b.pro_cartesiano(c);
      //di.Print();
      
      Conjunto cart = a.produto_cartesiano(b);
      
      cart.Print_Matrix();
		
		


   
      


        // universo.Print();


	}
}