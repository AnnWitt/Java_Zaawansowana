package z20211009.Generyczne;

public class Para<T> {
    //Para<Czlowiek>para ///zmienna na parze człowiekow - zbedne new Para<czł>
    //T zamieni se na czlowieka

    private T lewy;
    private T prawy; //jakby yblo np "U" to z innego typu

    public Para(T lewy, T prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public T getLewy() {
        return lewy;
    }

    public T getPrawy() {
        return prawy;
    }

    @Override
    public String toString() {
        return "Para{" +
                "lewy=" + lewy +
                ", prawy=" + prawy +
                '}';
    }
}
