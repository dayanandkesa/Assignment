package test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import model.Chicken;

public class ChickenTest extends AssignmentTest {

    Chicken chicken;

    @Before
    public void setUp() {
        this.chicken = new Chicken();
    }

    @Test
    public void flyTest() {
        chicken.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }

    @Test
    public void singTest() {
        chicken.sing();
        assertThat(sysOut.asString(), containsString("Cluck, cluck"));
    }
}
