package jaffospackage;

public class JaffosFirstPick {

	/*//TODO pass an array in?
	static void printStonk(String stonkname, String stonkticker) {
		System.out.println("Name: " + stonkname + " " + stonkticker);
	}
	*/
	
	public static void main(String[] args) {
		String stockName;
		String stockTicker;
		String stockWhy;
		String dateBought;
		Boolean commons;
		

		// TODO Auto-generated method stub
		
		// TODO Constructor
			System.out.println("Welcome to Jaffo's Picks!");
			stockName = "Palantir";
			stockTicker = "(PLTR)";
			stockWhy = "Meme originally but valued way under SNOW which provides roughly the same service";
			dateBought = "11/10/20";
			commons = true;
			
			// TODO Auto-Generate format and printout
			System.out.println("Jaffo's First pick is....!");
			System.out.println("Name: " + stockName + " " + stockTicker);
			System.out.println("Picked because: " + stockWhy);
			System.out.println("Bought on: " + dateBought);
			if(commons == true) {
				System.out.println("Commons");
			}
			else
				System.out.println("Calls");
			
			//printStonk(stockName, stockTicker);
	}

}
