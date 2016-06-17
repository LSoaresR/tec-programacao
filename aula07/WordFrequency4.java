import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//EXERCICIO 03
class WordFrequency4 {

  public static Map sortByValue(Map unsortedMap){
    Map sortedMap = new TreeMap(new OrdenarDecFreq(unsortedMap));
    sortedMap.putAll(unsortedMap);
    return sortedMap;
  } 
  
   void frequencia(String txt) {
   
     Map<String, Integer> freq = new HashMap<>();
     
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
                         
    System.out.println("Ordenando por frequencia :");
    
     System.out.println(WordFrequency4.sortByValue(freq));
     
      
      
      
      
   }  // chave do final do metodo



}
