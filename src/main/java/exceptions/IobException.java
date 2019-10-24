package exceptions;

import java.util.ArrayList;

public class IobException {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("My");
        list.add("Name");
        try {
            System.out.println(list.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("Oops!");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Check array length!");
        }
    }
}
