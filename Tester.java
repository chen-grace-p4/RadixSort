import java.util.*;
import java.io.*;
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
    // MyLinkedList a = new MyLinkedList();
    // a.add("one");
    // MyLinkedList b = new MyLinkedList();
    // b.add("two");
    // b.add("three");
    // MyLinkedList c = new MyLinkedList();
    // c.add("four");
    // c.add("five");
    // c.add("six");
    // MyLinkedList[] testbuckets = {a, b, c};
    // MyLinkedList org = new MyLinkedList();
    // org.add("zero");
    // System.out.println("Buck A: " + a);
    // System.out.println("Buck B: " + b);
    // System.out.println("Buck C: " + c);
    // System.out.println("Orginal: " + org);
    // Radix.merge(org, testbuckets);
    // System.out.println("After Merge: " + org);

    // SortableLinkedList a = new SortableLinkedList();
    // a.add(999);a.add(9);a.add(99);a.add(100000);a.add(234);
    // a.add(6932409);a.add(31);a.add(0);a.add(114);
    // a.add(1);a.add(11);a.add(101010);a.add(3);
    // // a.add(12);a.add(34);a.add(42);a.add(32);a.add(44);
    // // a.add(41);a.add(34);a.add(11);a.add(32);a.add(23);
    // // a.add(87);a.add(50);a.add(77);a.add(58);a.add(8);
    // // a.add(3); a.add(2);
    // System.out.println(a);
    // // // System.out.println(Radix.radixSortSimple(a));
    // Radix.radixSortSimple(a);
    // System.out.println(a);

    // SortableLinkedList[] buckets = new SortableLinkedList[10];
    // buckets[0] = a;
    // buckets[0].add(1);
    // System.out.println(buckets[0]);

    // a.add(-12); a.add(24); a.add(0); a.add(-100);
    // a.add(-2000); a.add(-1000); a.add(-333);
    // System.out.println(Radix.radixSort(a));
    // System.out.println(Radix.nth(100, 2));
    // System.out.println(Radix.nth(400, 2));
    // Radix.radixSort(a);
    // System.out.println(a);

    // Random rng = new Random(0);
    // SortableLinkedList l = new SortableLinkedList();
    // ArrayList<Integer> al = new ArrayList();
    // int c;
    // for (int i = 0; i < 10; i++) {
    //      c = rng.nextInt() % 1000;
    //      if (c < 1000) c += 1000;
    //      l.add(c);
    //      al.add(c);
    // }
    // Radix.radixSortSimple(l);
    // Collections.sort(al);
    // System.out.println(l);
    // System.out.println(al);

    System.out.println(Radix.nth(1024,0));
    System.out.println(Radix.nth(1024,1));
    System.out.println(Radix.nth(1024,2)); //should be 0
    System.out.println(Radix.nth(10024,2)); //should be 0
    System.out.println(Radix.nth(1024,3));
    System.out.println(Radix.nth(123,1));
  }
}
