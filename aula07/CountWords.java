import java.util.List;
import java.util.ArrayList;

//EXERCICIO 01
class CountWords {
   int dist;
   int total;
   
   
   void totalPalavras(String st) {
   
      List<String> string  = new ArrayList<>();
      
      String[] frase;
      
      frase = st.split(" ");
      
      for(int i = 0; i < frase.length; i++)  {       
        string.add(frase[i]);                
      }
      
      total = string.size();
      
      System.out.println(total);
    
 }   
 
     void palavrasDistintas(String st) {
      List<String> string  = new ArrayList<>();
      
      String[] frase;
      boolean verificar = false;
                
      frase = st.split(" ");
      
      for(int i = 0; i < frase.length; i++)  {       
        if(!string.contains(frase[i])) 
           string.add(frase[i]);
                           
      }
     
     dist = string.size();
     System.out.println(dist);
         
}   

   
}
