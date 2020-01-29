import java.util.*;
public class Battleship{
	public static void main(String a[]) throws Exception{
		int[][] player1Map = {{1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 2, 2, 2, 2, 2, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 3, 0}, {0, 0, 5, 0, 0, 0, 0, 0, 3, 0}, {0, 0, 5, 0, 3, 0, 0, 0, 3, 0}, {0, 0, 0, 0, 3, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 3, 0, 0, 0, 0, 0}, {0, 5, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 5, 0, 0, 0, 0, 4, 4, 4, 0}};
		/**
		 * 1 = Battleship(B)
		 * 2 = Carrier(C)
		 * 3 = Cruser(R)
		 * 4 = Sub(S)
		 * 5 = Destroyer(D)
		 */
		String temp = "";
		
		for (int row = 0; row < 10; row++) {
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
	}
}