package ZadaniaPo20211003.KlasyInterfejsy.Z3;

class Car {
    String nazwaSamochodu;
    TypSamochodu typSamochodu;
    Engine silnikSamochodu;


    class Engine {
        TypSilnika typSilnika;

        Engine(TypSamochodu typSamochodu) {
            typSilnika = setEngine(typSamochodu);
        }

        TypSilnika setEngine(TypSamochodu typSamochodu) {
            switch (typSamochodu) {
                case luxory: {
                    return TypSilnika.electric;
                }
                case economy: {
                    return TypSilnika.diesel;
                }
                default: {
                    return TypSilnika.petrol;
                }
            }
        }


        TypSilnika getTypSilnika() {
            return typSilnika;
        }

        @Override
        public String toString() {
            return typSilnika.toString();
        }
    }

     Engine getSilnikSamochodu() {
        return silnikSamochodu;
    }

     void setSilnikSamochodu(Engine silnikSamochodu) {
        this.silnikSamochodu = silnikSamochodu;
    }

     Car(String nazwaSamochodu, TypSamochodu typSamochodu) {
        this.nazwaSamochodu = nazwaSamochodu;
        this.typSamochodu = typSamochodu;
        this.silnikSamochodu = new Engine(typSamochodu);

    }

    @Override
    public String toString() {
        return "Car{" +
                "nazwaSamochodu='" + nazwaSamochodu + '\'' +
                ", typSamochodu=" + typSamochodu +
                ", silnikSamochodu=" + silnikSamochodu.toString() +
                '}';
    }
}
