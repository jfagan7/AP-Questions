
public class Mustang implements Horse {

	private int hp;
	private String name;

	public Mustang(String name, int hp) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.hp=hp;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return hp;
	}

}
