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

  public static SortableLinkedList radixSortSimple(SortableLinkedList data) { //return to void after
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    int passes = 1;
    for (int digit = 0; digit < passes; digit++) {
      int max = 0;

      for (int i = 0; i < data.size(); i++) {
        if (digit == 0) {
          if (data.get(i) > max) {
            max = data.get(i);
          }
        }

        int numCol = nth(data.get(i), digit);
        if (length(data.get(i)) < digit+1) {
          numCol = 0;
        }
        if (buckets[numCol] == null) {
          SortableLinkedList placeHold = new SortableLinkedList();
          buckets[numCol] = placeHold;
        }
        buckets[numCol].add(data.get(i));
      }

      if (digit == 0) passes = length(max);
      SortableLinkedList placeHolder = new SortableLinkedList();
      merge(placeHolder, buckets);
      data = placeHolder;
      // return placeHolder;
    }
    return data;
  }

}
