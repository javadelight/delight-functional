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
  
  @Override
  public boolean equals(final Object o) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from null to boolean");
  }
  
  public Pair(final T1 t1, final T2 t2) {
    this.t1 = t1;
    this.t2 = t2;
  }
}
