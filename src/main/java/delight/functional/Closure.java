package delight.functional;

/**
 * <p>A simple closure which takes in one generic argument.
 * @author Max
 * @param<P>
 *  The type of the argument for the closure.
 */
@SuppressWarnings("all")
public interface Closure<P extends Object> {
  /**
   * The method of this closure.
   * @param o The parameter for the closure.
   */
  public abstract void apply(final P o);
}
