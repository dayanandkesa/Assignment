package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Bird;
import model.Butterfly;
import model.Cat;
import model.Chicken;
import model.Clownfish;
import model.Dog;
import model.Dolphin;
import model.Duck;
import model.Fish;
import model.Frog;
import model.LivingThing;
import model.Parrot;
import model.Rooster;
import model.Shark;
import util.CountAnimals;

public class AnimalCountingTest extends AssignmentTest {

    CountAnimals countAnimals;
    List<LivingThing> livingThings;

    @Before
    public void setUp() {
        this.countAnimals = new CountAnimals();
        livingThings = Arrays.asList(
                new Bird(),  //  Sing, Fly ,Walk
                new Duck(),  //  Sing, Fly ,Walk, Swim
                new Chicken(), // Sing, Fly ,Walk
                new Rooster(), // Sing, Fly ,Walk
                new Parrot(), //Sing, Fly ,Walk
                new Fish(), // Swim
                new Shark(), // Swim
                new Clownfish(), // Swim
                new Dolphin(), // Swim
                new Frog(), // Sing, Walk
                new Dog(), // Sing, Walk
                new Butterfly(), // Fly, Walk
                new Cat());  // Sing, Walk
    }

    @Test
    public void should_Verify_WalkableCount() {
        long count = this.countAnimals.walkableCount(livingThings);
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_FlyableCount() {
        long count = this.countAnimals.flyableCount(livingThings);
        assertEquals(5, count);
    }

    @Test
    public void should_Verify_SingableCount() {
        long count = this.countAnimals.singableCount(livingThings);
        assertEquals(8, count);
    }

    @Test
    public void should_Verify_SwimmableCount() {
        long count = this.countAnimals.swimmableCount(livingThings);
        assertEquals(5, count);
    }
}
