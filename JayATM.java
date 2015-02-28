class JayATM  {

	public JayATM(String typeOfCurrency) {
		
	}

	public Cash[] getCash(int amount) {
		Denomination denominations[] = Denomination.getRupees();
		Cash cash[] = new Cash[denominations.length];
		for(int i = 0; i < denominations.length; i++){
			int numOfNotes = denominations[i].howManyNotesIn(amount);
			cash[i] = new Cash(denominations[i], numOfNotes);
			amount = amount - cash[i].totalValue();
		}
		return cash;		
	}

	public static void main(String[] args) {
		JayATM atm=new JayATM();
		Cash notes[]=atm.getCash(Integer.parseInt(args[0]));
		

		for (int i=0;i<notes.length;i++ ) {
			System.out.println(notes[i]);
		}
	}
}