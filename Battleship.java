import java.util.*;
public class Battleship{
	public static void main(String a[]) throws Exception{
		int[][] player1Map = {{1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 2, 2, 2, 2, 2, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 3, 0}, {0, 0, 5, 0, 0, 0, 0, 0, 3, 0}, {0, 0, 5, 0, 3, 0, 0, 0, 3, 0}, {0, 0, 0, 0, 3, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 3, 0, 0, 0, 0, 0}, {0, 5, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 5, 0, 0, 0, 0, 4, 4, 4, 0}};
		
		int[][] player2Map = {{3, 3, 3, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 5, 0, 4, 4, 4, 0}, {0, 0, 0, 0, 5, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 5, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 5, 0, 0, 3}, {0, 0, 1, 0, 0, 0, 0, 0, 0, 3}, {0, 0, 1, 0, 0, 0, 0, 0, 0, 3}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {2, 2, 2, 2, 2, 0, 0, 0, 0, 0}};
		
		int[][] player1View = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
		int[][] player2View = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		/**
		 * 1 = Battleship(B)
		 * 2 = Carrier(C)
		 * 3 = Cruser(R)
		 * 4 = Sub(S)
		 * 5 = Destroyer(D)
		 */
		String temp = "";
		
		System.out.println("Player 1 Map\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player1Map[row][column] == 0)
					temp = " * ";
				else if(player1Map[row][column] == 1)
					temp = " B ";
				else if(player1Map[row][column] == 2)
					temp = " C ";
				else if(player1Map[row][column] == 3)
					temp = " R ";
				else if(player1Map[row][column] == 4)
					temp = " S ";
				else if(player1Map[row][column] == 5)
					temp = " D ";
				else
					temp = "ERROR";
				System.out.print(temp);
            }
            System.out.println();
        }
		
		String temp2 = "";
		
		System.out.println("\n\nPlayer 2 Map\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player2Map[row][column] == 0)
					temp2 = " * ";
				else if(player2Map[row][column] == 1)
					temp2 = " B ";
				else if(player2Map[row][column] == 2)
					temp2 = " C ";
				else if(player2Map[row][column] == 3)
					temp2 = " R ";
				else if(player2Map[row][column] == 4)
					temp2 = " S ";
				else if(player2Map[row][column] == 5)
					temp2 = " D ";
				else
					temp2 = "ERROR";
				System.out.print(temp2);
            }
            System.out.println();
        }
		
		String temp3 = "";
		
		System.out.println("\n\nPlayer 1 View\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player1View[row][column] == 0)
					temp3 = " * ";
				else if(player1View[row][column] == 1)
					temp3 = " B ";
				else if(player1View[row][column] == 2)
					temp3 = " C ";
				else if(player1View[row][column] == 3)
					temp3 = " R ";
				else if(player1View[row][column] == 4)
					temp3 = " S ";
				else if(player1View[row][column] == 5)
					temp3 = " D ";
				else
					temp3 = "ERROR";
				System.out.print(temp3);
            }
            System.out.println();
        }
		
		String temp4 = "";
		
		System.out.println("\n\nPlayer 2 View\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player2View[row][column] == 0)
					temp4 = " * ";
				else if(player2View[row][column] == 1)
					temp4 = " B ";
				else if(player2View[row][column] == 2)
					temp4 = " C ";
				else if(player2View[row][column] == 3)
					temp4 = " R ";
				else if(player2View[row][column] == 4)
					temp4 = " S ";
				else if(player2View[row][column] == 5)
					temp4 = " D ";
				else
					temp4 = "ERROR";
				System.out.print(temp4);
            }
            System.out.println();
        }
		
		
		Scanner sc = new Scanner(System.in);
		boolean gameOn = true;
		
		while(gameOn){
			try{
				System.out.print("Enter the X-coordinate: ");
				String x_cord = sc.next();
				System.out.print("Enter the Y-Coordinate: ");
				String y_cord = sc.next();
				
				if()
				break;
			} catch(Exception e){
				System.out.println("An Error has occured.");
			}
		}
		
		
	}
}