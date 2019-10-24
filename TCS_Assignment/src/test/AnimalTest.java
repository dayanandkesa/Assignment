package test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import model.Animal;

public class AnimalTest extends AssignmentTest {

    @Test
    public void testWalk() {
        Animal animal = new Animal();
        animal.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }
}
