class CurrencyDemo extends ConsoleProgram {

  /**
   * Description
   * A program that converts kilometers to miles from 10 to 100km, every 10km in a
   * formatted table
   * 
   * @author: Gordon Z
   */

  public void run() {

    double dblSubtotal = 9.99;
    double dblTax = 0.13;
    double dblTotal;

    dblTotal = (dblSubtotal * dblTax) + dblSubtotal;
    System.out.printf("The total is $%.2f\n", dblTotal);
  }
}
