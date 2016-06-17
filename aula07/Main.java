import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      
      Scanner teclado = new Scanner(System.in);
      String frase;
      CountWords ct = new CountWords();
      WordFrequency wf = new WordFrequency();
      WordFrequency2 wf2 = new WordFrequency2();
      WordFrequency3 wf3 = new WordFrequency3();
      WordFrequency4 wf4 = new WordFrequency4();      
      
      frase = teclado.nextLine();
      
      
    //  ct.totalPalavras(frase);
    //  ct.palavrasDistintas(frase);
      
     // wf.frequencia(frase);
     // wf2.frequencia(frase);
     // wf3.frequencia(frase);
        wf4.frequencia(frase);
       
      //System.out.println(frase); 
   }
 }  
