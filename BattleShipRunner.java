import java.util.*;
import java.io.*;
public class BattleShipRunner
{
   public static void main(String args[])
   {
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
  
      String[][] visible1 = new String[10][10]; 
      String[][] visible2 = new String[10][10];
      for (int i = 0; i < 10; i++)
         {
            for(int j = 0; j < 10; j++)
            {
               visible1[i][j] = "*";
               visible2[i][j] = "*";
            } 
         }
   
   
   
      //insert arrays
      BattleShip player1 = new BattleShip(visible1);
      //BattleShip player2 = new BattleShip(,2);
      boolean game = true;
      while (game == true)
      {
         for (int x = 0; x < 10; x++)
         {
            for(int y = 0; y < 10; y++)
            {
               if(!((visible1[x][y].equals("X")||visible1[x][y].equals(" "))&&(visible2[x][y].equals("X")||visible2[x][y].equals(" "))))
               {
                  game = true;
               }
               else
               {
                  game = false;
               }
            }
         }
         
         
         
      //insert input and moves
       ArrayList<Integer> user_x_values = new ArrayList<>();
	    ArrayList<String> user_y_values = new ArrayList<>();
       Scanner input = new Scanner(System.in);
       System.out.println("YOUR TURN");
	 	 System.out.print("Enter X coordinate(0-9): ");
		 int x = input.nextInt();
		 System.out.print("Enter Y coordiante(A-J): ");
		 String y = input.next();
		
		//Check if guess is on board
		while(((!(x>=0 && x<=9))) || (!((y.equalsIgnoreCase("A")) || (y.equalsIgnoreCase("B")) || (y.equalsIgnoreCase("C")) || (y.equalsIgnoreCase("D")) || (y.equalsIgnoreCase("E")) || (y.equalsIgnoreCase("F")) || (y.equalsIgnoreCase("G")) || (y.equalsIgnoreCase("H")) || (y.equalsIgnoreCase("I")) || (y.equalsIgnoreCase("J")))))
		{
			System.out.println("Oops! That coordinate is out of bounds. Please enter another coordinate... ");
			System.out.print("Re-enter X coordinate: ");
			x = input.nextInt();
			System.out.print("Re-enter Y coordinate: ");
			y = input.next();
		}
		
		//Check if guess has been repeated
		while(user_x_values.contains(x) && user_y_values.contains(y)) 
		{
			System.out.println("Oops! You already tried that guess. Please make another guess... ");
			System.out.print("Enter X coordinate: ");
			x = input.nextInt();
			System.out.print("Enter Y coordiante: ");
			y = input.next();
		}
      user_x_values.add(x);
		user_y_values.add(y);
         
         
         
         
         
         
         int a = x; 
         int b; //input location ints
         
         if(y.equalsIgnoreCase("A"))
             b = 0;
         else if(y.equalsIgnoreCase("B"))
             b = 1;
         else if(y.equalsIgnoreCase("C"))
             b = 2;
         else if(y.equalsIgnoreCase("D"))
             b = 3;
         else if(y.equalsIgnoreCase("E"))
             b = 4;
         else if(y.equalsIgnoreCase("F"))
             b = 5;
         else if(y.equalsIgnoreCase("G"))
             b = 6;
         else if(y.equalsIgnoreCase("H"))
             b = 7;
         else if(y.equalsIgnoreCase("I"))
             b = 8;
         else if(y.equalsIgnoreCase("J"))
             b = 9;
         else
             b = 0;
         
         
         int count = 0;
         
         if (!visible1[a][b].equals("*"))
         {
            player1.setVisibleShip1(a,b,"X");
            printVisible1(player1);
         }
         else
         {
            player1.setVisibleShip1(a,b,"O");
            printVisible1(player1);
         }
   
      }
    }
         
            
   
   public static void printVisible1(BattleShip player)
   {
      int count = 0;
         for (int i = 0; i < 10; i++)
         {
            for(int j = 0; j < 10; j++)
            {
               System.out.print(player.getVisibleShip1(i,j) + " ");
               count++;
               if (count % 10 == 0)
               {
                  System.out.println("");
               }
            }
          }
    }
      
}
   
   