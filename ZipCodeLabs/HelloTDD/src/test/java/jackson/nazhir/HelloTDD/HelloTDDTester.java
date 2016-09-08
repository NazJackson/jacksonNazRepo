package jackson.nazhir.HelloTDD;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/8/16.
 */
public class HelloTDDTester {

    @Test
    public void displayMessageTest(){
        HelloTDD helloTDD = new HelloTDD();
        Assert.assertEquals("The Message returned is equal to cat", "cat", helloTDD.displayMessage(de));
    }

}

