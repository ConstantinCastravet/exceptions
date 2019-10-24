package exceptions;

import java.util.Arrays;
import java.util.List;

public class PrintNullSalary {

    private void print(Object s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        PrintNullSalary print = new PrintNullSalary();
        List list = Arrays.asList("first salary", null, "third salary");

        for (Object s : list) {
            try {
                print.print(s);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            } finally {
                System.out.println("Inside finally block");
            }
            System.out.println("Continue....");
            System.out.println("-----------------");
        }
    }
}