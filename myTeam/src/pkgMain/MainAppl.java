package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main() {
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("=== " + player.toString());
		Player player2 = new Player(1, "Alaba", "Defense");
		System.out.println("=== " + player2.toString());
		Player player3 = new Player(3, "Hinteregger", "Defense");
		System.out.println("=== " + player3.toString());
		Player player4 = new Player(4, "Kalajdzic", "Striker");
		System.out.println("=== " + player4.toString());
	}
}
