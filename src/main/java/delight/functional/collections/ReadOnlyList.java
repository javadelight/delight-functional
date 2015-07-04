package delight.functional.collections;

import java.util.List;

@SuppressWarnings("all")
public interface ReadOnlyList<E extends Object> extends Iterable<E> {
  public abstract int size();
  
  public abstract boolean isEmpty();
  
  public abstract boolean contains(final Object o);
  
  public abstract E get(final int index);
  
  public abstract List<E> asList();
}
