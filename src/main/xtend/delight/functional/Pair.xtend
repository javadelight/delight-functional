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
	
	@Override
	def int hashCode() {
		return t1.hashCode+t2.hashCode
	}
	
	new(T1 t1, T2 t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
}