import java.text.DecimalFormat;

public class PaintThings
{
   //-----------------------------------------------------------------
   //  Creates some shapes and a Paint object
   //  and prints the amount of paint needed
   //  to paint each shape.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      final double COVERAGE = 350;
      Paint paint = new Paint(COVERAGE);

      Rectangle deck = new Rectangle(20, 35);
      Sphere bigBall = new Sphere(15);
      Cylinder tank = new Cylinder(10, 30);

      double deckAmt, ballAmt, tankAmt;

      deckAmt = paint.amount(deck);
      ballAmt = paint.amount(bigBall);
      tankAmt = paint.amount(tank);

      DecimalFormat fmt = new DecimalFormat("0.#");

      System.out.println ("\nNumber of gallons of paint needed...");
      System.out.println ("Deck " + fmt.format(deckAmt));
      System.out.println ("Big Ball " + fmt.format(ballAmt));
      System.out.println ("Tank " + fmt.format(tankAmt));
      
      System.out.println("\nTesting polymorphic reference:");
      Shape s;
      s = deck;
      System.out.println(s + " area=" + s.area());
      s = bigBall;
      System.out.println(s + " area=" + s.area());
      s = tank;
      System.out.println(s + " area=" + s.area());

   }
}