import java.util.Map;
import java.util.TreeMap;

//EXERCICIO 03
class WordFrequency2 {

 
  
      void frequencia(String txt) {
   
     Map<String, Integer> freq = new TreeMap<>();
     
    // List<String> string  = new ArrayList<>();
    
     String[] frase;
     
     int cont = 1;
     
    
     
     frase = txt.split(" ");
     // Arrays.sort(frase);
     
     //System.out.println(txt);
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
