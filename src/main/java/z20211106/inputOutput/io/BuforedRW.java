package z20211106.inputOutput.io;

import java.io.*;

 class BuforedRW {
    public static void main(String[] args) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;


        try {
            in = new BufferedReader(new FileReader("C:\\Users\\Anna_\\" +
                    "IdeaProjects\\JavaZaawansowana\\src\\main\\resources" +
                    "\\user.txt"));

            out = new BufferedWriter(new FileWriter("C:\\Users\\Anna_" +
                    "\\IdeaProjects\\JavaZaawansowana\\src\\main\\resources" +
                    "\\user_output.txt",true)); //kasujemy appenda aby nadpisał

            //pakujemy w inny typ, wczyutjemy [p wiecej niz jednym bajcie
            String line;

            while ((line = in.readLine()) != null) { //wczyta aż do entera
                out.write((line)+"\n");
            }
//--------------dalej nie zmianiamy, duże uproszczenie - z chara na line
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

    }

}
