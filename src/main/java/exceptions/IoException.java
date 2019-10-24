package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoException {

    public static void main(String[] args) {
        input();
    }

    private static void input () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = reader.readLine();
            System.out.println("Your input is: " + s);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                reader.close();
                System.out.println("Channel is closed!");
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}