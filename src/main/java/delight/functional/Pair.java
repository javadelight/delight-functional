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
  
  @Override
  public int hashCode() {
    int _hashCode = this.t1.hashCode();
    int _hashCode_1 = this.t2.hashCode();
    return (_hashCode + _hashCode_1);
  }
  
  public Pair(final T1 t1, final T2 t2) {
    this.t1 = t1;
    this.t2 = t2;
  }
}
