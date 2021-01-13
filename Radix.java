public class Radix {
  public static int nth(int n, int col) {
    if (n < 0) {
      n = -n;
    }
    int modNum = 10;
    for (int i = 0; i < col; i++) {
      modNum = modNum * 10;
    }
    n = n % modNum;
    while (n > 10) {
      n = n / 10;
    }
    return n;
  }

  public static int length(int n) {
    if (n < 0) {
      n = -n;
    }

    if (n == 0) {
      return 1;
    }
    int nLog = (int) Math.log10(n);
    return nLog + 1;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets) {
    for (int i = 0; i < buckets.length; i++) {
      if (buckets[i] == null) {
        SortableLinkedList placeHold = new SortableLinkedList();
        buckets[i] = placeHold;
      }
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    int passes = 1;
    for (int digit = 0; digit < passes; digit++) {
      int max = 0;

      while (data.size() > 0) {
        int val = data.get(0);

        if (digit == 0) {
          if (val > max) {
            max = val;
          }
        }

        int numCol = nth(val, digit);
        if (length(val) < digit+1) {
          numCol = 0;
        }
        if (buckets[numCol] == null) {
          SortableLinkedList placeHold = new SortableLinkedList();
          buckets[numCol] = placeHold;
        }
        buckets[numCol].add(val);
        data.remove(0);
      }

      if (digit == 0) passes = length(max);
      merge(data, buckets);
    }
  }

}
