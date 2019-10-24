package test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import model.Fish;

public class FishTest extends AssignmentTest {

    Fish fish;

    @Before
    public void setUp() {
        fish = new Fish();
    }

    @Test
    public void should_Not_Walk_When_Call_Walk() {
        fish.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void should_Not_Sing_When_Call_Sing() {
        fish.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void should_Swim_When_Call_Swim() {
        fish.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }
}
