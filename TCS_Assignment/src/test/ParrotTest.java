package test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import behaviour.CatSound;
import behaviour.DogSound;
import behaviour.DuckSound;
import behaviour.RoosterSound;
import model.Parrot;

public class ParrotTest extends AssignmentTest {

    Parrot parrot;

    @Before
    public void setUp(){
        parrot= new Parrot();
    }

    @Test
    public void should_Say_Woof_Woof_When_ParrotLivingWithDog(){
        parrot.setSingable(new DogSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Woof,woof"));
    }

    @Test
    public void should_Say_Meow_When_ParrotLivingWithCat(){
        parrot.setSingable(new CatSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Meow"));
    }

    @Test
    public void should_Say_Cock_a_doodle_doo_When_ParrotLivingWithRooster(){
        parrot.setSingable(new RoosterSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void should_Say_Quack_Quack_When_ParrotLivingWithDuck(){
        parrot.setSingable(new DuckSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Quack, quack"));
    }

}