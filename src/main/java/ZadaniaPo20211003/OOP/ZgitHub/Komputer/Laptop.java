package ZadaniaPo20211003.OOP.ZgitHub.Komputer;

 class Laptop extends Komputer{
    double wielkoscMatrycy;
    boolean czyPosiadaRetine;

      Laptop(int potrzebnaMoc, String producent, TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
         super(potrzebnaMoc, producent, typProcesora);
         this.wielkoscMatrycy = wielkoscMatrycy;
         this.czyPosiadaRetine = czyPosiadaRetine;
     }
 }
