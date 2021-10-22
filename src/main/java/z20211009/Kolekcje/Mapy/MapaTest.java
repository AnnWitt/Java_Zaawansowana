package z20211009.Kolekcje.Mapy;

import java.util.*;

public class MapaTest {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        SortedMap<String, Integer> sortedMapMap = new SortedMap<String, Integer>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedMap<String, Integer> subMap(String fromKey, String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, Integer> headMap(String toKey) {
                return null;
            }

            @Override
            public SortedMap<String, Integer> tailMap(String fromKey) {
                return null;
            }

            @Override
            public String firstKey() {
                return null;
            }

            @Override
            public String lastKey() {
                return null;
            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(String key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }
        };
        hashMap.put("Imie1", 1);
        hashMap.put("Imie2", 7);
        hashMap.put("Imie3", 3);

        hashMap.putAll(Map.of("imie4",3));
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
