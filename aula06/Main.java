import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[10];
        
        
        //Set<String> set = new HashSet<>();
         Set<String> set = new TreeSet<>();
        // Set<String> set = new LinkedHashSet<>();
        //List<String> set = new ArrayList<>();
        
        
    
        array[0] = "January";
        array[1] = "February";
        array[2] = "March";
        array[3] = "January";
        array[4] = "April";
        
        
        Testar t1 = new Testar(set, array);
        
        t1.verificar();
    }
}
