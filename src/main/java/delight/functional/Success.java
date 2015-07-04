package delight.functional;

/**
 * <p>
 * Success represents a successfully completed operations.
 * </p>
 * <p>
 * In contrast to {@link SuccessFail} it will not capture failures as values.
 * </p>
 * @author Max
 */
@SuppressWarnings("all")
public class Success {
  /**
   * A singelton of Success
   */
  public final static Success INSTANCE = new Success();
}
