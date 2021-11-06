package z20211106.inputOutput.io;

import java.io.*;
//to jest stary sposób :)
 class CharakterStream {

    public static void main(String[] args) throws IOException {

        FileReader in = null;
        FileWriter out = null;


        try {
            in = new FileReader("C:\\Users\\Anna_\\" +
                    "IdeaProjects\\JavaZaawansowana\\src\\main\\resources" +
                    "\\user.txt");
        /*    out = new FileWriter("C:\\Users\\Anna_" +
                    "\\IdeaProjects\\JavaZaawansowana\\src\\main\\resources" +
                    "\\user_output.txt");*/ //wtedy nadpisze
            out = new FileWriter("C:\\Users\\Anna_" +
                    "\\IdeaProjects\\JavaZaawansowana\\src\\main\\resources" +
                    "\\user_output.txt",true); //wtedy dopisze a nie nadpisze
            int c;

            while ((c = in.read()) != -1) {
                out.append((char) c); //wymaga zrzutowania na char
               // out.write(c); //zapisuje po jedny byte
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
//zastepuje cale pliki

    }

}
