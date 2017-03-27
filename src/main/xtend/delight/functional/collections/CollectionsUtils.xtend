package delight.functional.collections

import java.util.ArrayList
import java.util.List
import java.util.Map

final class CollectionsUtils {
	def final static <GPOutput> boolean isMapComplete(Map<Integer, GPOutput> map, int size) {
		
		for (var int i = 0; i < size; i++) {
			if (map.get(Integer.valueOf(i)) === null) {
				return false
			}

		}
		return true
	}

	def final static <GOutput> List<GOutput> toOrderedList(Map<Integer, GOutput> responseMap) {
		val List<GOutput> localResponses = new ArrayList<GOutput>(responseMap.size())

		for (var int i = 0; i < responseMap.size(); i++) {
			val GOutput rr = responseMap.get(Integer.valueOf(i))
			if (!(rr !== null)) {
				throw new AssertionError()
			}
			localResponses.add(rr)
		}
		return localResponses
	}

	/** 
	 * Flattens the provided list into a single list.
	 * @param lists
	 * @return
	 */
	def final static <V> List<V> flatten(List<List<V>> lists) {
		var int size = 0
		for (List<V> list : lists) {
			size += list.size()
		}
		val List<V> res = new ArrayList<V>(size)
		for (List<V> list : lists) {
			res.addAll(list)
		}
		return res
	}

}
