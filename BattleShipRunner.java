public class BattleShipRunner
{
   public static void main(String args[])
   {
   
      boolean game = true;
      for (int x = 0; x < arr.length; x++)
      {
         for(int y = 0; y < arr[x].length; y++)
         {
            if!(arr[x][y].equals("X")||arr[x][y].equals(" "))
            {
               game = true;
            }
            else
            {
               game = false;
            }
         }
      }
      while (game == true)
   
   