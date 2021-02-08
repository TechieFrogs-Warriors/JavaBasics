package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheakedExcepetions9 {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("somefile.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
            e.printStackTrace();
        }
    }
}
