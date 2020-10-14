package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;

    public Histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    public Map<T,Integer> getHistogram(){
        Map<T,Integer> histogram = new HashMap();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            /*
            Esta expresión se traduce a lenguaje natural así: “Si el histograma contiene la clave key,
            rellena el mapa con el valor correspondiente y súmale 1, y si no contiene la clave key, 
            rellena el mapa con el valor 1.
            */
        }
        return histogram;
    }
}
