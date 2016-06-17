
import java.util.Comparator;
import java.util.Map;

public class OrdenarDecFreq implements Comparator   {
   

   Map map;
   
   public OrdenarDecFreq(Map m) {
       map = m;
   }
   @Override
    public int compare(Object keyA, Object keyB) {
        Integer valueA = (Integer)  map.get(keyA);
        Integer valueB = (Integer)  map.get(keyB);
        
        return valueB.compareTo(valueA);
    }

 
    
}
