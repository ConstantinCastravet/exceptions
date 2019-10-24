package check;

public class Check_4 {

    public static void main(String[] args) {
        try{
            bar();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        foo();
    }

    public static void bar(){

    }

    public static void foo() throws IndexOutOfBoundsException {

    }
}
