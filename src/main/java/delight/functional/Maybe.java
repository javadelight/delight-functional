package delight.functional;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>An abstract implementation for a construct which might be of a certain value or not.
 * <p>The static methods of this class provide the concrete implementations. Such as in:
 * <pre><code>{@codeMaybe<Integer> maybe = Maybe.is(new Integer(23));}</code></pre>
 * @author Max
 * @param<V>
 */
@SuppressWarnings("all")
public abstract class Maybe<V extends Object> {
  public abstract boolean is();
  
  public abstract V value();
  
  public static <V extends Object> List<V> allValues(final List<Maybe<V>> list) {
    int _size = list.size();
    final List<V> val = new ArrayList<V>(_size);
    for (final Maybe<V> m : list) {
      boolean _is = m.is();
      if (_is) {
        V _value = m.value();
        val.add(_value);
      }
    }
    return val;
  }
  
  public static <V extends Object> Maybe<V> is(final V outervalue) {
    return new Maybe<V>() {
      @Override
      public boolean is() {
        return true;
      }
      
      @Override
      public V value() {
        return outervalue;
      }
    };
  }
  
  public static <V extends Object> Maybe<V> isNot(final Class<V> clazz) {
    return new Maybe<V>() {
      @Override
      public boolean is() {
        return false;
      }
      
      @Override
      public V value() {
        throw new IllegalStateException("Cannot access value of Maybe if it is not.");
      }
    };
  }
  
  public static <V extends Object> Maybe<V> isNot() {
    return new Maybe<V>() {
      @Override
      public boolean is() {
        return false;
      }
      
      @Override
      public V value() {
        throw new IllegalStateException("Cannot access value of Maybe if it is not.");
      }
    };
  }
}
