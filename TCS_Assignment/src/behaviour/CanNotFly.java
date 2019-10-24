package behaviour;

public class CanNotFly implements Flyable {

	@Override
	public void fly() {
        System.out.println("Can not fly");
	}
}