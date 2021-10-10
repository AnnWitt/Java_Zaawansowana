package z20211009.Generyczne.Garaz;

public class Garaz<T> {
    private T one;
    private T two;

    public Garaz(T one, T two) {
        this.one = one;
        this.two = two;
    }

    void zaparkuj(T auto) {
        if (this.one == null) {
            this.one = auto;
        } else if (this.two == null) {
            this.one = auto;
        } else {
            System.out.println("Garaz pełen, nie można zaparkować " + auto);
        }
    }

    public T getAutoOut(T auto) { //auto a potem this. one aby nie bylo null pointer exepc.
        if (auto != null) {
            if (auto.equals(this.one)) {
                T temp=this.one;
                this.one = null;
                System.out.println(auto + " wyprowadzono z 1 miejsca");
                return temp; //sprawdzenie czy na 1 pozycji
            } else if (auto.equals(this.two)) {
                T temp=this.two;
                this.two = null;
                System.out.println(auto + "wyprowadzono z 2 miejsca");
                return temp;
            } else {
                System.out.println("no such car in a garage");
            }

        } else {
            System.out.println("Whatever");
        }


        return auto;
    }
}


