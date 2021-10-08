package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 class Main {
    public static void main(String[] args) {

        Citizen citizen1 = new King("krol1");
        Citizen citizen2 = new Peasant("peasant1");
        Citizen citizen3 = new Peasant("peasant2");
        Citizen citizen4 = new Peasant("peasant3");
        Citizen citizen5 = new Soldier("soldier1");
        Citizen citizen6 = new Soldier("soldier2");
        Citizen citizen7 = new Townsman("townsman1");
        Citizen citizen8 = new Townsman("townsman2");
        Citizen citizen9 = new Townsman("townsman3");
        Citizen citizen10 = new Townsman("townsman4");

        Citizen[] citizens = new Citizen[]{citizen1, citizen2, citizen3, citizen4, citizen5, citizen6, citizen7, citizen8, citizen9, citizen10};

        Town town = new Town(citizens); //stworzenie miasta z tabeli citizenow

        town.howManyCanVote(citizens);
       // town.whoCanVoteVoid(citizens);

        Citizen[] vouters= town.whoCanVoidTable(citizens);

        for (Citizen c: vouters) {
            if (c!=null) {
                System.out.println("imię " + c.name);
            }
        }


    }
}
