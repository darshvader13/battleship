public class BattleShip
{
   public Battleship(String[][] a, int u)
   {
      private String[][] arr = a;
      private int user = u;
   }

   public static void SetVisibleShip1(String[][] a, int x, int y, String change)
   {
      arr[x][y] = change;
   }
   
   public static void SetVisibleShip2(String[][] a, int x, int y, String change)
   {
      arr[x][y] = change;
   }
   
   public static String getVisibleShip1(int x, int y)
   {
      return arr[x][y];
   }

   public static String getVisibleShip2(int x, int y)
   {
      return arr[x][y];
   }
   
   public static String getBattleShip1(int x, int y)
   {
      return arr[x][y];
   }
   
   public static String getBattleShip2(int x, int y)
   {
      return arr[x][y];
   }
  
  
   


