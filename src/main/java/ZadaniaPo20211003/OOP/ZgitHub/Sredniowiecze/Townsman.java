package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 class Townsman extends Citizen {

    Townsman(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return true;
    }
}
