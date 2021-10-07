package ZadaniaPo20211003.OOP.ZgitHub.Sredniowiecze;

 abstract class Citizen {
    String name;

    Citizen(String name) {
        this.name = name;
    }

    abstract boolean canVote();


}
