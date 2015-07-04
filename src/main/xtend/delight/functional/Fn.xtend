package delight.functional

class Fn {
	/** 
	 * <p>
	 * Creates an object with a unique identity. The object will only be equal
	 * to itself.
	 * @return An object with a unique identity.
	 */
	def static final Object object() {
		return new Object() {
			override boolean equals(Object obj) {
				return obj === this
			}
		}
	}

	def static Closure<Success> expectSuccess() {
		return [ Success o |
			if (!(o !== null)) {
				throw new AssertionError()
			}
		]
	}

	def static <I, O> Function<I, O> compose(Function... functions) {
		return [ I input |
			var Object res = input
			for (Function f : functions) {
				res = f.apply(res)
			}
			return res as O
		]
	}

}
