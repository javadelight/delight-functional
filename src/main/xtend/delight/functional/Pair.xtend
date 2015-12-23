package delight.functional

class Pair<T1, T2> {
	
	T1 t1
	
	T2 t2
	
	def first() {
		t1
	}
	
	def second() {
		t2
	}
	
	override int hashCode() {
		return t1.hashCode+t2.hashCode
	}
	
	override boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		
		if (!(o instanceof Pair)) {
			return false;
		}
		
		val Pair other = o as Pair;
		
		return t1.equals(other.first) && t2.equals(other.second)
		
	}
	
	new(T1 t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
}