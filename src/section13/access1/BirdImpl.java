package section13.access1;

public class BirdImpl implements Bird {

	private String name = "비둘기";
	
	@Override
	public void fly() {}

	@Override
	public void sing() {}

	public String getName() {
		return name;
	}
	
}
