package delight.functional.collections

import java.util.List

interface ReadOnlyList<E> extends Iterable<E> {
	def int size()

	def boolean isEmpty()

	def boolean contains(Object o)

	def E get(int index)

	def List<E> asList()

}
