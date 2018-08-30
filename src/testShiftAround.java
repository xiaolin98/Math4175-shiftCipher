import student.TestCase;

public class testShiftAround extends TestCase {
    private ShiftAround sa;


    public void setUp() {
        // sa = new ShiftAround();
    }


    public void testSA() {
        sa = new ShiftAround();
        sa.solve("HSRSXLERHMXMR");

    }
}
