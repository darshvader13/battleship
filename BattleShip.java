public class BattleShip
{
   public Battleship(String[][] a, String[][] v, int u)
   {
      private String[][] arr = a;
      private String[][] visible = v;
      private int user = u;
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
   
   public static String getBattleShip1(int x, int y)
   {
      return arr[x][y];
   }
   
   public static String getBattleShip2(int x, int y)
   {
      return arr[x][y];
   }
  
  
   


