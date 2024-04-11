start.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;


public class HelloWorld {
   public static void main(String[] args) {
       try {
           String filePath = "Spec_Benchmark/008.espresso.din";
           Scanner input = new Scanner("Spec_Benchmark/013.spice2g6.din");


           File file = new File(input.nextLine());
           Scanner newInput = new Scanner(file);


           while (newInput.hasNextLine()) {
               String line = newInput.nextLine();
               System.out.println(line);
           }
           input.close();
       }
       catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }
}
