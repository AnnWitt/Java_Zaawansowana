package z20211009.Generyczne.WAZNEParaCwiczenieGeneryki;

 class ParaRzutowaniem {
    private Object lewyRzut;
    private Object prawyRzut;

     ParaRzutowaniem(Object lewy, Object prawy) {
        this.lewyRzut = lewy;
        this.prawyRzut = prawy;
    }

     Object getLewyRzut() {
        return lewyRzut;
    }

     Object getPrawyRzut() {
        return prawyRzut;
    }

    @Override
    public String toString() {
        return "Para1{" +
                "lewy=" + lewyRzut +
                ", prawy=" + prawyRzut +
                '}';
    }

}
