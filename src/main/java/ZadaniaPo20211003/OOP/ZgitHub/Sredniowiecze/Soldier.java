package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 class Soldier extends Citizen {

    Soldier(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
