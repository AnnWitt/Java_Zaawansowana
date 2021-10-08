package ZadaniaPo20211003.OOP.ZgitHub.Robot;

public class Robot {
    int poziomBaterii;
    String nazwaRobota;
    boolean czyWlaczony;

    public Robot(String nazwaRobota, int poziomBaterii, boolean czyWlaczony) {
        this.poziomBaterii = poziomBaterii;
        this.nazwaRobota = nazwaRobota;
        this.czyWlaczony = czyWlaczony;
    }

    void poruszRobotem(RuchRobota ruch) {
        StringBuilder str = new StringBuilder("Robot: " + nazwaRobota + " | Nie można wykonać ruchu. ");
        if (poziomBaterii > ruch.energia && czyWlaczony == true) {
            str = new StringBuilder("Robot: " + nazwaRobota + " | Można wykonać ruch. Ruch wykonano: ");
            this.poziomBaterii=this.poziomBaterii- ruch.energia;
        } else {
            if (czyWlaczony == false) {
                str.append("Robot jest wyłączony.");
            }
            if (poziomBaterii < ruch.energia) {
                str.append("Za mało energii. Energia potrzebna na ruch to " + ruch.energia);
            }
        }

        //System.out.println("poziom baterii " +poziomBaterii);
        str.append(" | aktualny poziom baterii " +poziomBaterii);
        System.out.println(str);
    }

    void naladujRobota(){
        StringBuilder str=new StringBuilder("Próba naładowania robota " + nazwaRobota);
        if (czyWlaczony==false) {
            this.poziomBaterii=100;
            str.append(". Robot wyłączony, można ładować. Ladowanie zakończono | aktualny stan baterii " + this.poziomBaterii);
        } else {
            str.append(". Nie można naładować baterii, robot " + nazwaRobota + " musi zostać wyłączony.");

        }
        System.out.println(str);

    }

    void wlaczRobota(){
        this.czyWlaczony=true;
        System.out.println("Robot " + nazwaRobota + " został włączony.");
    }

    void wylaczRobota(){
        this.czyWlaczony=false;
        System.out.println("Robot " + nazwaRobota +" został wyłączony.");
    }




}
