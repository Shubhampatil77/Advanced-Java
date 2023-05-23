package Exception;
import java.util.*;

class Demo {
  int x, y;

  void get() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Two Numbers:");
    x = sc.nextInt();
    y = sc.nextInt();
  }

  void display() {
    try {
      if (y == 0)
        throw new ArithmeticException("Division by zero is not possible");
      else if (x < y)
        throw new Exception("1st number is smaller than 2nd number");
      else
        System.out.println("Division=" + (x / y));
    } catch (ArithmeticException ae) {
      System.out.println(ae.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Thanks");
    }

    System.out.println("Sum:" + (x + y));
    System.out.println("Difference:" + (x - y));
    System.out.println("Product:" + (x * y));
  }
}

public class Demo1 {
  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.get();
    demo.display();
  }
}
