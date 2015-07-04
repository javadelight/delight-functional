package delight.functional

/** 
 * <p>A simple closure which takes in one generic argument.
 * @author Max
 * @param<P>
 *  The type of the argument for the closure.
 */
interface Closure<P> {
	/** 
	 * The method of this closure.
	 * @param o The parameter for the closure.
	 */
	def void apply(P o)

}
