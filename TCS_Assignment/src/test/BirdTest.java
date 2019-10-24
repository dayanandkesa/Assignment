package test;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import model.Bird;

public class BirdTest {

    @Rule
    public SysOutResource sysOut = new SysOutResource();
    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    public void walkTest() {
        bird.walk();
        MatcherAssert.assertThat(sysOut.asString(), CoreMatchers.containsString("I am walking"));
    }

    @Test
    public void flyTest() {
        bird.fly();
        MatcherAssert.assertThat(sysOut.asString(), CoreMatchers.containsString("I am flying"));
    }

    @Test
    public void singTest() {
        bird.sing();
        MatcherAssert.assertThat(sysOut.asString(), CoreMatchers.containsString("I am singing"));
    }

}