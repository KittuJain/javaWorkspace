class Atm {
	public static void main(String[] args) {
		System.out.println("Enter the amount : ");
		int amount = Integer.parseInt(System.console().readLine());
		int notes[] = {1000,500,100,50,20,10,5,2,1};
		int atmAmounts[] = atmCalc(notes, amount);
		printNotesCalculation (notes,atmAmounts);
	}
	public static int[] atmCalc (int[] notes, int amount){
		int[] atmAmounts = new int[notes.length];
		for(int i = 0; i < notes.length; i++){
			atmAmounts[i] = (amount >= notes[i]) ? (amount/notes[i]) : (0);
			amount = amount % notes[i];
		}
		return atmAmounts;	
	}
	public static void printNotesCalculation (int[] notes,int[] atmAmounts){
		for(int i = 0; i < notes.length; i++)
			System.out.println("notes of "+notes[i]+ " : " + atmAmounts[i]);
	}
}