package behaviour;

public class CanNotSing implements Singable {

	@Override
	public void sing() {
        System.out.println("Can not sing");
	}

}
