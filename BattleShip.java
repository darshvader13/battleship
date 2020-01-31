public class BattleShip
{
   private static String[][] visible = new String[10][10];
   private static String[][] battleship = new String[10][10];
   public BattleShip(String[][] v, String[][] b)
   {
      for (int i = 0; i < 10; i++)
         for (int j = 0; j < 10; j++)
            visible[i][j] = v[i][j];
      for (int i = 0; i < 10; i++)
         for (int j = 0; j < 10; j++)
            battleship[i][j] = b[i][j];
   }

   public static void setVisibleShip1(int x, int y, String change)
   {
      visible[x][y] = change;
   }
   
   public static void setVisibleShip2(int x, int y, String change)
   {
      visible[x][y] = change;
   }
   
   public static String getVisibleShip1(int x, int y)
   {
      return visible[x][y];
   }

   public static String getVisibleShip2(int x, int y)
   {
      return visible[x][y];
   }
   public static void setBattleShip1(int x, int y, String change)
   {
      battleship[x][y] = change;
   }
   
   public static void setBattleShip2(int x, int y, String change)
   {
      battleship[x][y] = change;
   }
   
   public static String getBattleShip1(int x, int y)
   {
      return battleship[x][y];
   }

   public static String getBattleShip2(int x, int y)
   {
      return battleship[x][y];
   }
}   
  
  
  
   


