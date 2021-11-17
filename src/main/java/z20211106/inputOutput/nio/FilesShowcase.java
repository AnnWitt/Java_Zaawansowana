package z20211106.inputOutput.nio;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

 class FilesShowcase {
    public static void main(String[] args) throws IOException {
    Path one=null;
    Path two=null;
       // Files.copy(cos, dokads, StandardCopyOption.ATOMIC_MOVE);
    //w 3 mozna zapisac jak ma zapisywac czy nadpisywać czy doklejac (CopyOption)

        Files.copy(one, two,StandardCopyOption.REPLACE_EXISTING);
        Files.isReadable(one);
        Files.isWritable(two);
        Files.delete(two); //usuwanie czegos pod sciezka
        Files.deleteIfExists(two);

        //moze isc i do pliku i do katalogu, jezeli niepusty rzuci wyjatkiem


/*        public enum StandardCopyOption implements CopyOption {
            *//**
             * Replace an existing file if it exists.
             *//*
            REPLACE_EXISTING,
            *//**
             * Copy attributes to the new file.
             *//*
            COPY_ATTRIBUTES,
            *//**
             * Move the file as an atomic file system operation.
             *//*
            ATOMIC_MOVE;
        }*/

/*        Files.isWritable() //czy dsotepny do zapisu
                Files.isReadable() //czy do odczytu*/
    }

}
