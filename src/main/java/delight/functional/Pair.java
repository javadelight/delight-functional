package delight.functional;

@SuppressWarnings("all")
public class Pair<T1 extends Object, T2 extends Object> {
  private T1 t1;
  
  private T2 t2;
  
  public T1 first() {
    return this.t1;
  }
  
  public T2 second() {
    return this.t2;
  }
  
  public Pair(final T1 t1, final T2 t2) {
    this.t1 = t1;
    this.t2 = t2;
  }
}
