package kata_2;

import java.util.Map;

public class Kata_2 {

    public static void main(String[] args) {
        Integer[] data = {1,1,2,3,4,1,2,2,3,5,1,9,8,7,6};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        
        for (Object key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
