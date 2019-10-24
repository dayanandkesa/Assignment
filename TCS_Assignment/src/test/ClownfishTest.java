package test;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;

import model.Clownfish;
import model.Color;
import model.Size;

public class ClownfishTest extends AssignmentTest {

   Clownfish clownfish;

   @Before
   public void setUp() {
       this.clownfish = new Clownfish();
   }

   @Test
   public void notWalkTest() {
       clownfish.walk();
       assertThat(sysOut.asString(), containsString("Can not walk"));
   }

   @Test
   public void notSingTest() {
       clownfish.sing();
       assertThat(sysOut.asString(), containsString("Can not sing"));
   }

   @Test
   public void swimTest() {
       clownfish.swim();
       assertThat(sysOut.asString(), containsString("I am swimming"));
   }

   @Test
   public void sizeTest() {
       Size size = clownfish.size();
       assertEquals(Size.SMALL, size);
   }

   @Test
   public void colorTest() {
       Color color = clownfish.color();
       assertEquals(Color.ORANGE, color);
   }
}
