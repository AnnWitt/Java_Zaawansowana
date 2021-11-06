package z20211106.Serializacja;

import java.io.*;

public class SerializacjaShowcase {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     //musi byc jakis streamm
        FileOutputStream fileOutputStream=new FileOutputStream("someObject.data");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        //file wypuszczmy jako obiekt
        outputStream.writeObject(new Integer(1));
        //na pliku dwa razy shift to mozna znalesc na liscie i celownik
        //moze byc not serializable
        //public class Dog implements Comparable<Dog>, serializable


        //deserializacja
        FileInputStream fileInputStream=new FileInputStream("someObject.data");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    }
}
