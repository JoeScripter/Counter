package company;

import java.io.*;

public class FileManipulation {

    public static String readFile(File fileToRead){
        String ret = "";

        try {
            FileReader reader = new FileReader(fileToRead);
            BufferedReader bufferedReader = new BufferedReader(reader);
            ret = String.valueOf(bufferedReader.read());
            bufferedReader.close();
        }
        catch(IOException ex){
            System.out.println(ex + " readFile");
        }

        return ret;
    }

    public static void writeToFile(File fileToWrite, String input){
        try{
            FileWriter fileWriter = new FileWriter(fileToWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(input);
            bufferedWriter.close();
        }
        catch(IOException ex){
            System.out.println(ex + " writeToFile");
        }
    }

}
