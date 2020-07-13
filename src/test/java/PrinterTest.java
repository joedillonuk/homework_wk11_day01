import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(10, 5);
    }

    @Test
    public void hasPaper(){
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(5, printer.getToner());
    }

    @Test
    public void canPrint(){
        printer.print(2, 2);
        assertEquals(6, printer.getPaper());
    }

    @Test
    public void wontPrintWhenPaperLow(){
        printer.print(2, 6);
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void tonerReducesWhenPrinting(){
        printer.print(2, 2);
        assertEquals(1, printer.getToner());
    }

}
