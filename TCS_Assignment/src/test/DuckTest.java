package test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


import model.Duck;

public class DuckTest {

    @Rule
    public SysOutResource sysOut = new SysOutResource();
    Duck duck;

    @Before
    public void setUp() {
        this.duck = new Duck();
    }

    @Test
    public void should_Say_Quack_quack_When_Call_Sing() {
        duck.sing();
        assertThat(sysOut.asString(), containsString("Quack, quack"));
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        duck.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }
}
