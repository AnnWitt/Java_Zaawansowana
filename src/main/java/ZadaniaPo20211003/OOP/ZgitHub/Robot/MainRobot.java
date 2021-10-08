package ZadaniaPo20211003.OOP.ZgitHub.Robot;

public class MainRobot {

    public static void main(String[] args) {

        Robot robot1=new Robot("Nazwa1",20,true);
        robot1.poruszRobotem(RuchRobota.RUCH_REKA_LEWA);
        robot1.poruszRobotem(RuchRobota.RUCH_REKA_PRAWA);
        robot1.poruszRobotem(RuchRobota.KROK_LEWA);
        robot1.poruszRobotem(RuchRobota.KROK_LEWA);
        robot1.naladujRobota();
        robot1.wylaczRobota();
        robot1.naladujRobota();
        robot1.poruszRobotem(RuchRobota.KROK_LEWA);
        robot1.wlaczRobota();
        robot1.poruszRobotem(RuchRobota.RUCH_REKA_PRAWA);
        robot1.poruszRobotem(RuchRobota.KROK_LEWA);

    }

}
