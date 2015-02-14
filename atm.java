class Atm {
	public static void main(String[] args) {
		System.out.println("Enter the amount : ");
		int amount = Integer.parseInt(System.console().readLine());
		atmCalc(amount);
	}
	public static void atmCalc (int amount){
		int notes[] = {1000,500,100,50,20,10,5,2,1};
		int[] atmAmounts = new int[notes.length];

		for(int i = 0; i < notes.length; i++){
			atmAmounts[i] = (amount >= notes[i]) ? (amount/notes[i]) : (0);
			amount = amount % notes[i];
		}
		for(int i = 0; i < notes.length; i++)
			System.out.println(atmAmounts[i]);
	}
}