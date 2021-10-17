package z20211017.KasyWZA;

public class AnonymousMain {

    public static void main(String[] args) {

        someMethod();
    }

    public static void someMethod() {

        Soundy bird = new Soundy() { //---anonimowa  klasa implemnent interfejs soundy
            // klasyimpl interf
            @Override //-------> to jest ta anonymous implementująca interfejs albo klase
            //nie ma wlasnje nazwy. Istnieje tylko jedna instancja, przestaje istniec
            //nie jest instancja interfesju, obiekt implementujacy interfejs
            public void playsound() {
                System.out.println("z anonymoiuc");

            }
        };
        bird.playsound();
    }


}
