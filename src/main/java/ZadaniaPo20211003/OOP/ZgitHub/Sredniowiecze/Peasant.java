package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 class Peasant extends Citizen {


    Peasant(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }
}
