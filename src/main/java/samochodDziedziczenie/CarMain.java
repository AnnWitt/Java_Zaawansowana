package samochodDziedziczenie;

public class CarMain {
    public static void main(String[] args) {
        CarRodzic sd = new CarRodzic();
        sd.przyspiesz();
/*        for (int i=0; i==3; i++){
            sd.przyspiesz(); //zostanie tutaj tylko bo void. Jakby byl int to by sumowal
        }*/
        sd.przyspiesz();

        System.out.print("czy swiatla wlaczone | ");
        sd.wlaczSwiatla();
        System.out.print("czy swiatla wlaczone | ");
        System.out.println(sd.czySwiatlaWlaczone());

        KabrioletDZ kb = new KabrioletDZ();
        System.out.print("czy dach schowany: | ");
        System.out.println(kb.czyDachSchowany());

        System.out.print("schowaj dach: |");
        kb.schowajDach();
        System.out.print("czy dach schowany | ");
        System.out.println(kb.czyDachSchowany());
        kb.przyspiesz(); //odniesienie do klasy rodzica
    }
}
