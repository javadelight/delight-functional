package de.mxro.fn

/** 
 * A closure which takes in two generic arguments.
 * @author Max
 * @param<P1>
 * Type of the first argument.
 * @param<P2>
 * Type of the second argument.
 */
interface Closure2<P1, P2> {
	/** 
	 * The main method of this closure.
	 * @param p1 First parameter to be passed.
	 * @param p2 Second parameter to be passed.
	 */
	def void apply(P1 p1, P2 p2)

}
