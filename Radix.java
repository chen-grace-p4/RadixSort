public class Radix {
  public static int nth(int n, int col) {
    if (n < 0) {
      n = -n;
    }
    int divNum = 1;
    for (int i = 0; i < col; i++) {
      divNum = divNum * 10;
    }
    n = n / divNum;
    n = n % 10;
    return n;

    // return (n / (int)Math.pow(10, col)) % 10;
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

  public static void negativeSort(SortableLinkedList data) {
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
      reverseMerge(data, buckets);
    }

    for (int i = 0; i < data.size(); i++) {
      data.set(i, -data.get(i));
    }

  }
  public static void reverseMerge(SortableLinkedList original, SortableLinkedList[]buckets) {
    for (int i = buckets.length-1; i >= 0; i--) {
      if (buckets[i] == null) {
        SortableLinkedList placeHold = new SortableLinkedList();
        buckets[i] = placeHold;
      }
      original.extend(buckets[i]);
    }
  }

  public static void radixSort(SortableLinkedList data) { //RETURN TO VOID
    SortableLinkedList negData = new SortableLinkedList();
    SortableLinkedList posData = new SortableLinkedList();
    for (int i = data.size()-1; i >= 0; i--) {
      int val = data.get(i);
      if (val < 0) {
        negData.add(-val);
      } else {
        posData.add(val);
      }
      data.remove(i);
    }
    radixSortSimple(posData);
    negativeSort(negData);

    data.extend(negData);
    data.extend(posData);
  }

}
