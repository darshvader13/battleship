public class BattleShip
{
   private static String[][] visible = new String[10][10];
   public BattleShip(String[][] v)
   {
      for (int i = 0; i < 10; i++)
         for (int j = 0; j < 10; j++)
            visible[i][j] = v[i][j];
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
}   
  
  
  
   


