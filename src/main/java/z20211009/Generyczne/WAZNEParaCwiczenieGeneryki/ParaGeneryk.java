package z20211009.Generyczne.WAZNEParaCwiczenieGeneryki;

 class ParaGeneryk<DowolnyTyp> { //<T> konwencja - typ - tu dla przykladu
    private DowolnyTyp lewyGen;
    private DowolnyTyp prawyGen;

     ParaGeneryk(DowolnyTyp lewy, DowolnyTyp prawy) {
        this.lewyGen = lewy;
        this.prawyGen = prawy;
    }

     DowolnyTyp getLewyGen() {
        return lewyGen;
    }

     DowolnyTyp getPrawyGen() {
        return prawyGen;
    }

    @Override
    public String toString() {
        return "ParaGeneryk{" +
                "lewy=" + lewyGen +
                ", prawy=" + prawyGen +
                '}';
    }
}
