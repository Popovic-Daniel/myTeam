package pkgData;

public class Player {
	private int number;
	private String name, position;

	public Player(int number, String name, String position) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
	}

	@Override
	public String toString() {
		return "Player [number=" + number + ", name=" + name + ", position=" + position + "]";
	}
}
