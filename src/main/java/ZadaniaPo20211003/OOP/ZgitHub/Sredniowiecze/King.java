package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 class King extends Citizen {

    King(String name) {
        super(name);
    }

    @Override
    boolean canVote() {
        return false;
    }


}
