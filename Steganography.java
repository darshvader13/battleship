import java.awt.*;

public class Steganography
{
   public static void main (String[] banana)
   {
      Picture beach = new Picture ("beach.jpg");
      beach.explore();
      Picture copy =  testClearLow(beach);
      copy.explore();
      Picture beach2 = new Picture("beach.jpg");
      beach2.explore();
      Picture copy2 = testSetLow(beach2, Color.PINK);
      copy2.explore();
      
   }
   public static void clearLow(Pixel p)
   {
      p.setRed(p.getRed() - (p.getRed() % 4));
      p.setBlue(p.getBlue() - (p.getBlue() % 4));
      p.setGreen(p.getGreen() - (p.getGreen() % 4));
   }
   
   public static void setLow(Pixel p, Color c)
   {
      clearLow(p);
      p.setRed(p.getRed() + (c.getRed() - c.getRed() % 64));
      p.setGreen(p.getGreen() + (c.getGreen() - c.getGreen() % 64));
      p.setBlue(p.getBlue() + (c.getBlue() - c.getBlue() % 64));
   }
   
   
   public static Picture testSetLow(Picture pp, Color c)
   {
      for (int i = 0; i < pp.getWidth(); i++)
      {
         for (int j = 0; j < pp.getHeight(); j++)
         {
            setLow(pp.getPixel(i,j), c);
         }
      }
      return pp;
   }
   
   public static Picture testClearLow(Picture pp)
   {
      for (int i = 0; i < pp.getWidth(); i++)
      {
         for (int j = 0; j < pp.getHeight(); j++)
         {
            clearLow(pp.getPixel(i,j));
         }
      }
      return pp;
   }
   
   public static Picture revealPicture(Picture hidden)
   {
      Picture copy = new Picture(hidden);
      Picture[][] pixels = copy.getPixels2D();
      Picture[][] source = hidden.getPixels2D();
      for (int r = 0; r < pixels.length;r++)
      { 
         for (int c = 0; c < pixels[0].length;c++)
         {
            Color col = source[r][c].getColor();
         }
      }
      return copy;
   }
}