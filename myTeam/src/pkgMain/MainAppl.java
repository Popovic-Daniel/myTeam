package pkgMain;

import pkgData.Player;

public class MainAppl {

	public static void main() {
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("=== " + player.toString());
	}
}
