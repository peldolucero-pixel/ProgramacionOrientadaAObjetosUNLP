package bau.ejer18;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class EvenNumberSet implements Set<Integer>{
	private Set<Integer> numeros; 
	
	public EvenNumberSet() {
		this.numeros = new HashSet<Integer>();
	}
	@Override
	public int size() {
		return this.numeros.size();
	}

	@Override
	public boolean isEmpty() {
		return this.numeros.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return this.numeros.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.numeros.iterator();
	}

	@Override
	public Object[] toArray() {
		return this.numeros.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return this.numeros.toArray(a);
	}

	@Override
	public boolean add(Integer e) {
		if (e % 2 == 0) {
			return this.numeros.add(e);
		}else
			return false;
	}

	@Override
	public boolean remove(Object o) {
		return this.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return this.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		int size = this.numeros.size();
		c.stream()
		.filter(numero -> numero % 2 == 0)
		.forEach(numero-> this.numeros.add(numero));
		
		return size > this.numeros.size();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return this.numeros.retainAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return this.numeros.removeAll(c);
	}

	@Override
	public void clear() {
		this.numeros.clear();
	}

}
