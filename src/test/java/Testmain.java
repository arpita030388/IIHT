
import org.testng.annotations.Test;

import static org.example.Main.printNumber;

public class Testmain {

    @Test(description ="This test prints a number" )
    public void TestPrintNumber(){
        printNumber();
        System.out.println("Modify file in Local folder");
    }

}
