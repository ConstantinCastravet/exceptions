package myException;

public class App {

    public static void main(String[] args) {

        Intern intern1 = new Intern("Pele", 18, true, true, false);
        Intern intern2 = new Intern("Johny", 16, false, false, true);

        check(intern1);
        check(intern2);


    }

    public static void check(Intern intern1) {
        try {
            intern1.checkCriminalRecord();
            intern1.checkAge();
            intern1.checkJavaLevel();
            intern1.checkEnglishLevel();
            intern1.accept();

        } catch (MyException e) {
            System.out.print(e.getMessage());
            try {
                intern1.checkAge();
            } catch (IsNotAdult e1) {
                System.out.print(" and " + e1.getMessage());
                try {
                    intern1.checkJavaLevel();
                } catch (NotJavaExpert e2) {
                    System.out.print(" and " + e2.getMessage());
                    try {
                        intern1.checkEnglishLevel();
                    } catch (LowLanguageSpeak e3) {
                        System.out.println(" and " + e3.getMessage());
                    }

                }
            }
        } finally {
            System.out.println("Have a nice day");
        }
    }
}
