package textinfo;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TextinfoTest {

    @Test
    public void TestgetcharCount(){
        Logic charCount = new Logic();
        charCount.setText("helo");
        int actual = charCount.getcharCount();
        int expected = 4;
    }
    @Test
    public void TestgetrowCount(){
        Logic rowCount = new Logic();
        rowCount.setText("helo");
        int actual = rowCount.getrowCount();
        int expected = 1;
    }
    @Test
    public void TestStop(){
        Logic end = new Logic();
        end.setText("stop");
        boolean actual = end.runstate();
        boolean expected = false;
    }

}


