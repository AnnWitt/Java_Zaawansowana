package z20211009.Mapy;

import java.util.HashMap;
import java.util.Map;

public class MapaTest {
    public static void main(String[] args) {

        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("Imie1",1);
        hashMap.put("Imie2",2);
        hashMap.put("Imie3",3);

       // hashMap.putAll(Map.of("imie4",3));
       /* put(Keyket, Value value) –umieszcza nową parę klucz-wartość w mapie•*/

        System.out.println(hashMap);

        hashMap.put("Imie3",5);
        System.out.println(hashMap);

    }
}
