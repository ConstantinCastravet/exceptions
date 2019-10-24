package check;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Check_2 {

    public static void main(String[] args) {
        try {
            go();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void go() throws IOException, JAXBException, FileNotFoundException{

    }
}
