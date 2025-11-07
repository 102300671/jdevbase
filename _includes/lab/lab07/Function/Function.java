public class Function {
  private int x;
  private int y;
  private int z;
  public int f() {
    return 0;
  }
  public int f(int x) {
    return x * x;
  }
  public int f(int x, int y) {
    return x * x + y * y;
  }
  public int f(int x, int y, int z) {
    return x * x + y * y + z * z;
  }
}