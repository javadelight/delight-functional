package delight.functional;

import com.google.common.base.Objects;

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
    boolean _equals = Objects.equal(o, null);
    if (_equals) {
      return false;
    }
    if ((!(o instanceof Pair))) {
      return false;
    }
    final Pair other = ((Pair) o);
    boolean _and = false;
    Object _first = other.first();
    boolean _equals_1 = this.t1.equals(_first);
    if (!_equals_1) {
      _and = false;
    } else {
      Object _second = other.second();
      boolean _equals_2 = this.t2.equals(_second);
      _and = _equals_2;
    }
    return _and;
  }
  
  public Pair(final T1 t1, final T2 t2) {
    this.t1 = t1;
    this.t2 = t2;
  }
}
