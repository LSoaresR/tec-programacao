import java.util.Map;
import java.util.Hashtable;

//EXERCICIO 02
class WordFrequency {
   
   
   void frequencia(String txt) {
   
     Map<String, Integer> freq = new Hashtable<>();
     
    // List<String> string  = new ArrayList<>();
    
     String[] frase;
     
     int cont = 1;
      
     frase = txt.split(" ");
     
       for (String frase1 : frase) {
           if (!freq.containsKey(frase1)) {
               freq.put(frase1, cont);
           } else {
               freq.put(frase1, freq.get(frase1) + 1);
           }
       }
                         
  
     System.out.println(freq);
     
      
      
      
      
   }  // chave do final do metodo
   
 }
