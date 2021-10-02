package samochodDziedziczenie;

public class KabrioDZBroken extends KabrioletDZ {

    public KabrioDZBroken() {
    }

    @Override
    void schowajDach(){
        this.dach=false;
        System.out.println(" Uszkodzenie");
    }
}
