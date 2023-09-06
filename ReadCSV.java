package CSV;

import java.io.File;
import java.util.Scanner;

public class ReadCSV {
    public static void main(String[] args) throws Exception {
        //parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("D:/Product_Details/Advait_Deshpande.csv"));
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();  //closes the scanner

    }
}
