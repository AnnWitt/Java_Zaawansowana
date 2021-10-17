package z20211017.Lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data //mozna settery bez ustawianie setterow
@RequiredArgsConstructor //musza byc finalne albo bedzie, że niezainicjowany. Ogarnia
//tylko finalne jako konstruktor
//@AllArgsConstructor //ogarnia wszystkie pola "w konstruktorze"
public class Student {
    private  String name ="imie";
    private int wiek;
    private final String surname;


}
