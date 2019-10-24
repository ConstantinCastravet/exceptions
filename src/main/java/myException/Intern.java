package myException;

public class Intern {

    private String firstName;
    private int age;
    private boolean isJavaExpert;
    private boolean isEnglishSpeaker;
    private boolean criminalRecord;

    public Intern(String firstName, int age, boolean isJavaExpert, boolean isEnglishSpeaker, boolean criminalRecord) {
        this.firstName = firstName;
        this.age = age;
        this.isJavaExpert = isJavaExpert;
        this.isEnglishSpeaker = isEnglishSpeaker;
        this.criminalRecord = criminalRecord;
    }

    public boolean checkAge() throws IsNotAdult {
        if (age < 18)
            throw new IsNotAdult("person " + this.firstName + " is not adult");

        return true;
    }

    public boolean checkCriminalRecord() throws isCriminal {
        if (criminalRecord)
            throw new isCriminal(firstName + " has a criminal record");
        return false;
    }

    public boolean checkJavaLevel() throws NotJavaExpert {
        if (!isJavaExpert)
            throw new NotJavaExpert("not a Java Expert");

        return this.isJavaExpert = true;
    }

    public boolean checkEnglishLevel() throws LowLanguageSpeak {
        if (!isEnglishSpeaker)
            throw new LowLanguageSpeak("low knowledge of english");
        return true;
    }


    void accept(){
        System.out.println("This person " + firstName + " was accepted");
        System.out.println();


    }
}


