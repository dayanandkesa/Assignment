package test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import model.Butterfly;

public class ButterflyTest extends AssignmentTest {

    Butterfly butterfly;
    @Before
    public void setUp(){
        this.butterfly=new Butterfly();
    }

    @Test
    public void flyTest() {
        butterfly.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void singTest() {
        butterfly.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }
}
