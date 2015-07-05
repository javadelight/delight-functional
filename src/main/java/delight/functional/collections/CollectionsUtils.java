package delight.functional.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public final class CollectionsUtils {
  public static final <GPOutput extends Object> boolean isMapComplete(final Map<Integer, GPOutput> map, final int size) {
    for (int i = 0; (i < size); i++) {
      Integer _valueOf = Integer.valueOf(i);
      GPOutput _get = map.get(_valueOf);
      boolean _tripleEquals = (_get == null);
      if (_tripleEquals) {
        return false;
      }
    }
    return true;
  }
  
  public static final <GOutput extends Object> List<GOutput> toOrderedList(final Map<Integer, GOutput> responseMap) {
    try {
      int _size = responseMap.size();
      final List<GOutput> localResponses = new ArrayList<GOutput>(_size);
      for (int i = 0; (i < responseMap.size()); i++) {
        {
          Integer _valueOf = Integer.valueOf(i);
          final GOutput rr = responseMap.get(_valueOf);
          if ((!(rr != null))) {
            throw new AssertionError();
          }
          localResponses.add(rr);
        }
      }
      return localResponses;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Flattens the provided list into a single list.
   * @param lists
   * @return
   */
  public static final <V extends Object> List<V> flatten(final List<List<V>> lists) {
    int size = 0;
    for (final List<V> list : lists) {
      int _size = size;
      int _size_1 = list.size();
      size = (_size + _size_1);
    }
    final List<V> res = new ArrayList<V>(size);
    for (final List<V> list_1 : lists) {
      res.addAll(list_1);
    }
    return res;
  }
}
