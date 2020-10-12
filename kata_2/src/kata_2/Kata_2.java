package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        int[] data = {1,1,2,3,4,1,2,2,3,5,1,9,8,7,6};
        Map<Integer,Integer> histogram = new HashMap();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            /*
            Esta expresión se traduce a lenguaje natural así: “Si el histograma contiene la clave key,
            rellena el mapa con el valor correspondiente y súmale 1, y si no contiene la clave key, 
            rellena el mapa con el valor 1.
            */
        }
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
    
}
