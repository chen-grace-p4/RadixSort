public class Tester {
  public static void main(String[]args) {
    // System.out.println(Radix.nth(1234, 1));
    // System.out.println(Radix.nth(1234, 3));
    // System.out.println(Radix.nth(1234, 2));
    // System.out.println(Radix.nth(0, 0));
    // System.out.println(Radix.nth(-123, 2));

    // System.out.println(Radix.length(999));
    // System.out.println(Radix.length(1));
    // System.out.println(Radix.length(0));
    // System.out.println(Radix.length(15));
    // System.out.println(Radix.length(5112));
    // System.out.println(Radix.length(-5112));
    // System.out.println(Radix.length(5112));
    // System.out.println(Radix.length(5050));
    MyLinkedList a = new MyLinkedList();
    a.add("one");
    MyLinkedList b = new MyLinkedList();
    b.add("two");
    b.add("three");
    MyLinkedList c = new MyLinkedList();
    c.add("four");
    c.add("five");
    c.add("six");
    MyLinkedList[] testbuckets = {a, b, c};
    MyLinkedList org = new MyLinkedList();
    org.add("zero");
    System.out.println("Buck A: " + a);
    System.out.println("Buck B: " + b);
    System.out.println("Buck C: " + c);
    System.out.println("Orginal: " + org);
    Radix.merge(org, testbuckets);
    System.out.println("After Merge: " + org); 
  }
}
