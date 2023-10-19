class KmTOMiles2 extends ConsoleProgram {

  /**
   * Description
   * A program that converts kilometers to miles from 10 to 100km, every 10km in a
   * formatted table
   * 
   * @author: Gordon Z
   */

  public void run() {

    double dblMiles;

    //output the table header 
    System.out.printf("%8S%12S\n", "Km", "Miles");
    System.out.println("-------------------------");

    //output table body
    for (int intKm = 10; intKm <= 100; intKm += 10) {
      dblMiles = intKm * 0.621371;
     // System.out.println(intKm + "km --> " + dblMiles + "mi");

     System.out.printf("%7dkm %9.2fmi \n", intKm, dblMiles);
      

    }
  }
}
