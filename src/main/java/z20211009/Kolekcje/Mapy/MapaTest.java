package z20211009.Kolekcje.Mapy;

import java.util.HashMap;

public class MapaTest {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Imie1", 1);
        hashMap.put("Imie2", 7);
        hashMap.put("Imie3", 3);

        // hashMap.putAll(Map.of("imie4",3));
        /* put(Keyket, Value value) –umieszcza nową parę klucz-wartość w mapie•*/

        System.out.println(hashMap);

        hashMap.put("Imie3", 5);
        System.out.println(hashMap);

        //przeiterowanie po mhashapie
        for (String key: hashMap.keySet()) {
            System.out.println(hashMap.get(key));
            //hashMap.get(key);
        }

        //wy[is par
        for(HashMap.Entry<String,Integer> pair: hashMap.entrySet()){
            System.out.println(pair);
        }
    }
}
