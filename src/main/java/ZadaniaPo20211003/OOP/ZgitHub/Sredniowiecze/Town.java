package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 class Town {

    static Citizen[] citizens;


     Town(Citizen[] citizens) {

    }

    void howManyCanVote(Citizen[] citizens) {
        int licznik = 0;
        for (Citizen c : citizens) {
            if (c.canVote() == true) {
                licznik++;
            }
            ;
        }
        System.out.println("może głosować " + licznik + " obywateli");
    }

    void whoCanVoteVoid(Citizen[] citizens) {
        for (Citizen c : citizens) {
            if (c.canVote() == true) {
                System.out.println("Imię obywatela " + c.name + " czy glosuje " + c.canVote());
            }

        }
    }

    Citizen[] whoCanVoidTable(Citizen[] citizens) {
         Citizen[] vouters=new Citizen[citizens.length];

         int v=0;
         for(int i=0;i< citizens.length;i++) {
             if (citizens[i].canVote()==true) {
                 vouters[v]=citizens[i];
                 v++;
             }
        }

         return vouters;
    }


}
