public class Radix {
  public static int nth(int n, int col) {
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

}
