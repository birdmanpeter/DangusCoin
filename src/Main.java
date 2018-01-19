import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Block ogB = new Block(0, null);
		System.out.println(ogB.getHash());

		Block newB = new Block(ogB.getHash(), new Transaction[] { getRandTransaction(), getRandTransaction() });
		System.out.println(newB.getHash());

		Block newnewB = new Block(newB.getHash(), new Transaction[] { getRandTransaction(), getRandTransaction() });
		System.out.println(newnewB.getHash());

	}

	private static Transaction getRandTransaction() {
		Random r = new Random();

		int amount = r.nextInt(100);
		System.out.printf("Amount: %d\n", amount);

		String[] names = { "Peter", "Garrett", "Casey", "Mark", "Billy", "Carl" };

		return new Transaction(names[r.nextInt(names.length)], names[r.nextInt(names.length)], amount);

	}

}
