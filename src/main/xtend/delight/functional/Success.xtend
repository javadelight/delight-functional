package delight.functional

/** 
 * <p>
 * Success represents a successfully completed operations.
 * </p>
 * <p>
 * In contrast to {@link SuccessFail} it will not capture failures as values.
 * </p>
 * @author Max
 */
class Success {
	/** 
	 * A singelton of Success
	 */
	public static final Success INSTANCE = new Success()

}
