
public class Transaction {

	private String to;
	private String from;
	private int amount;

	public Transaction(String to, String from, int amount) {
		this.to = to;
		this.from = from;
		this.amount = amount;
	}

	public String getTo() {
		return to;
	}

	public String getFrom() {
		return from;
	}

	public int getAmount() {
		return amount;
	}

}
