package delight.functional

import java.util.ArrayList
import java.util.List

/** 
 * <p>An abstract implementation for a construct which might be of a certain value or not.
 * <p>The static methods of this class provide the concrete implementations. Such as in:
 * <pre><code>{@codeMaybe<Integer> maybe = Maybe.is(new Integer(23));}</code></pre>
 * @author Max
 * @param<V>
 */
abstract class Maybe<V> {
	def abstract boolean is()

	def abstract V value()

	def static <V> List<V> allValues(List<Maybe<V>> list) {
		val List<V> ^val = new ArrayList<V>(list.size())
		for (Maybe<V> m : list) {
			if (m.is()) {
				^val.add(m.value())
			}

		}
		return ^val
	}

	def static <V> Maybe<V> is(V outervalue) {
		return new Maybe<V>() {
			override boolean is() {
				return true
			}

			override V value() {
				return outervalue
			}
		}
	}

	def static <V> Maybe<V> isNot(Class<V> clazz) {
		return new Maybe<V>() {
			override boolean is() {
				return false
			}

			override V value() {
				throw new IllegalStateException("Cannot access value of Maybe if it is not.")
			}
		}
	}

	def static <V> Maybe<V> isNot() {
		return new Maybe<V>() {
			override boolean is() {
				return false
			}

			override V value() {
				throw new IllegalStateException("Cannot access value of Maybe if it is not.")
			}
		}
	}
	
	def static <V> Maybe<V> any(Maybe... maybes) {
		for (Maybe m: maybes) {
			if (m.is) {
				return m
			}
		}
		
		return Maybe.isNot()
	}

}
