public class Worker {
  private int baodi;
  private int gongshi;
  private int danjia;
  private int guding;
  public int way(int baodi, int gongshi, int danjia) {
    return baodi + gongshi * danjia;
  }
  public int way(int guding) {
    return guding * 12;
  }
}