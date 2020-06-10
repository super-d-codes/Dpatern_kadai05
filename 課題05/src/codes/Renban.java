package codes;

public class Renban {

	private static Renban renban = new Renban();
	private static int makeNum = 1;

	private Renban() {
	}

	public static Renban getInstance() {
		return renban;
	}

	public int getNumber() {
		return makeNum++;
	}

}
