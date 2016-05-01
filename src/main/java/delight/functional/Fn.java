package delight.functional;

import delight.functional.Closure;
import delight.functional.Function;
import delight.functional.Success;

@SuppressWarnings("all")
public class Fn {
  /**
   * <p>
   * Creates an object with a unique identity. The object will only be equal
   * to itself.
   * @return An object with a unique identity.
   */
  public static final Object object() {
    return new Object() {
      @Override
      public boolean equals(final Object obj) {
        return (obj == this);
      }
    };
  }
  
  public static Closure<Success> expectSuccess() {
    final Closure<Success> _function = new Closure<Success>() {
      @Override
      public void apply(final Success o) {
        if ((!(o != null))) {
          throw new AssertionError();
        }
      }
    };
    return _function;
  }
  
  public static <I extends Object, O extends Object> Function<I, O> compose(final Function... functions) {
    final Function<I, O> _function = new Function<I, O>() {
      @Override
      public O apply(final I input) {
        Object res = input;
        for (final Function f : functions) {
          Object _apply = f.apply(res);
          res = _apply;
        }
        return ((O) res);
      }
    };
    return _function;
  }
}
