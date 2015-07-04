package delight.functional;

/**
 * A closure which takes in two generic arguments.
 * @author Max
 * @param<P1>
 * Type of the first argument.
 * @param<P2>
 * Type of the second argument.
 */
@SuppressWarnings("all")
public interface Closure2<P1 extends Object, P2 extends Object> {
  /**
   * The main method of this closure.
   * @param p1 First parameter to be passed.
   * @param p2 Second parameter to be passed.
   */
  public abstract void apply(final P1 p1, final P2 p2);
}
