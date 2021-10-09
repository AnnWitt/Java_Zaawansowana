package z20211009.Wprowadzenie;

public class MainSpiewaj {
    public static void main(String[] args) {
        //bez konstruktora, nie mozna z ()
        // Spiewajacy spiewajacy= new Spiewajacy { .. }
        //ale mozna chwilowa implementaxcje
        Spiewajacy spiewajacyObiektInterfejsu = new Spiewajacy() {
            @Override
            public void spiewa() {

            }

            @Override
            public int wiek() {
                return 0;
            }

            @Override
            public double oblicz() {
                return 0;
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        Spiewajacy ociektInt=new Spiewajacy() {
            @Override
            public void spiewa() {
                System.out.println("brrrr");
            }

            @Override
            public int wiek() {
                return 0;
            }

            @Override
            public double oblicz() {
                return 0;
            }

            @Override
            public int compareTo(Object o) {
                return 0;
            }

            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };


        Ptak jakis=new Ptak();
        jakis.spiewa();;

        Spiewajacy ptak=new Ptak();
        ptak.spiewa();

    }
}

