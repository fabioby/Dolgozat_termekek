import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Vegyesbolt {
    private static final ArrayList<Termek> lista = new ArrayList<>();

    public static void bevasarlok(String eleres){
        try {
            File myObj = new File(eleres);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] st = data.split(";");
                if(st[0].equals("salata")){
                    lista.add(new Salata(parseInt(st[1]), parseInt(st[2])));
                } else {
                    lista.add(new RohadtParadicsom(parseInt(st[1]),  Double.parseDouble(st[2])));
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void mivanakosaramban(){
        try {
            File file = new File("kosar.txt");

           FileWriter myWriter = new FileWriter(file);

            for (Termek e: lista) {
                myWriter.write(e.toString() + "\n");
            }

            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
