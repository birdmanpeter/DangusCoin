import java.util.Arrays;

public class Block {

	private int previousHash;
	private Transaction[] transactions;
	private int hash;

	public Block(int previousHash, Transaction[] transactions) {
		this.previousHash = previousHash;

		if (transactions == null)
			transactions = new Transaction[0];
		else
			this.transactions = transactions;

		Object[] contents = { Arrays.hashCode(transactions), previousHash };
		hash = Arrays.hashCode(contents);
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public Transaction[] getTransactions() {
		return transactions;
	}

	public int getHash() {
		return hash;
	}

}
