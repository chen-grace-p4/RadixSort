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

}
