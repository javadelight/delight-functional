package delight.functional

abstract class SuccessFail {
	def abstract boolean isSuccess()

	def abstract boolean isFail()

	def abstract Throwable getException()

	static final SuccessFail SUCCESS = new SuccessFail() {
		override boolean isSuccess() {
			return true
		}

		override boolean isFail() {
			return false
		}

		override Throwable getException() {
			throw new IllegalStateException("Success does not have an exception.")
		}

		override String toString() {
			return "SucessFail.SUCCESS"
		}
	}

	def static final SuccessFail success() {
		return SUCCESS
	}

	def static final SuccessFail fail(Throwable t) {
		return new SuccessFail() {
			override boolean isSuccess() {
				return false
			}

			override boolean isFail() {
				return true
			}

			override Throwable getException() {
				return t
			}

			override String toString() {
				return '''SucessFail.FAIL(«t.getMessage()»)'''
			}
		}
	}

}
