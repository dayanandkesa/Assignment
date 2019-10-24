package test;

import org.junit.Before;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

import model.Caterpillar;

public class CaterpillarTest extends AssignmentTest {

    Caterpillar caterpillar;
    @Before
    public void setUp(){
        this.caterpillar=new Caterpillar();
    }

    @Test
    public void crawlTest() {
        caterpillar.walk();
        assertThat(sysOut.asString(), containsString("I am crawling"));
    }

    @Test
    public void notFlyTest() {
        caterpillar.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }
}
