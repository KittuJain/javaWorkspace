public class Denomination {

	int value;
	String currency;

	public static void main(String[] args) {
		Denomination[] getAllRupees = Denomination.getRupees();
	}

	public Denomination(int value, String currency){
		this.value=value;
		this.currency=currency;
	}

	public static Denomination[] getRupees() {
		int rupeeValues[] = {1000,500,100,50,20,10,5,2,1};
		Denomination denominations[] = new Denomination[rupeeValues.length];
		for (int i = 0; i < rupeeValues.length; i++ ) {
			denominations[i] = new Denomination(rupeeValues[i],"Rs");
		}
		return denominations;
	}

	public int howManyNotesIn(int amount) {
		return amount/value;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return currency.toString() + " " + value;
	}
}