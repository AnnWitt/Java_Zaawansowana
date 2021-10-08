package ZadaniaPo20211003.OOP.ZgitHub.Komputer;

 class Komputer {
    int potrzebnaMoc;
    private String producent; //dane tylko aby przecwiczyc z getterem
    TypProcesora typProcesora;

      Komputer(int potrzebnaMoc, String producent, TypProcesora typProcesora) {
         this.potrzebnaMoc = potrzebnaMoc;
         this.producent = producent;
         this.typProcesora = typProcesora;
     }

      String getProducent() {
         return producent;
     }
 }
