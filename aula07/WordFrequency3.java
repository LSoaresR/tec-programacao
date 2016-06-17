

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

//EXERCICIO 04
class WordFrequency3 {

 
  
      void frequencia(String txt) {
   
     Map<String, Integer> freq = new LinkedHashMap<>();
    
     String[] frase;
     
     int cont = 1;
      
     frase = txt.split(" ");
      Arrays.sort(frase);
     
     
     for(int i = frase.length-1; i >= 0; i--)  { 
       if(!freq.containsKey(frase[i]))  {     
         freq.put(frase[i], cont);                
         
        } else {
          freq.put(frase[i], freq.get(frase[i])+1);
      }
     }
     
     //freq.reverseOrder();
                         
  
     System.out.println(freq);
         
      
   }  

}
