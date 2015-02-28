class Cash {
	Denomination denomination;
	int numberOfNotes;

	public Cash(Denomination d, int numberOfNotes) {
		this.denomination = d;
		this.numberOfNotes = numberOfNotes;
	}
	
	public String toString() {
		return numberOfNotes + " of " + denomination.toString();
	}

	public int totalValue() {
		return numberOfNotes*denomination.getValue();
	}
}