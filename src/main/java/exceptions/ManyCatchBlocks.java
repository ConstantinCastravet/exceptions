package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManyCatchBlocks {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Users/Username/Desktop/test.txt"));
            System.out.println(366 / 0);
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            System.out.println("Error! File not found!!");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by 0!");
        }
    }
}
