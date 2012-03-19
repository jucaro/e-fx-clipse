package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFListHelper  {
	static class WrappedList<T> implements ObservableList<T> {
		private EObject owner;
		private final EList<T> wrappedList;
		private List<InvalidationListener> invalidationListeners;
		private List<ListChangeListener<? super T>> changeListeners;
		
		private Adapter emfAdapter;

		@SuppressWarnings("unchecked")
		public WrappedList(EStructuralFeature feature, EObject owner) {
			this.wrappedList = (EList<T>) owner.eGet(feature);
			this.owner = owner;
		}
		
		@Override
		public int size() {
			return wrappedList.size();
		}

		@Override
		public boolean isEmpty() {
			return wrappedList.isEmpty();
		}

		@Override
		public boolean contains(Object o) {
			return wrappedList.contains(o);
		}

		@Override
		public Iterator<T> iterator() {
			return wrappedList.iterator();
		}

		@Override
		public Object[] toArray() {
			return wrappedList.toArray();
		}

		@Override
		public <V> V[] toArray(V[] a) {
			return wrappedList.toArray(a);
		}

		@Override
		public boolean add(T e) {
			return wrappedList.add(e);
		}

		@Override
		public boolean remove(Object o) {
			return wrappedList.remove(o);
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			return wrappedList.containsAll(c);
		}

		@Override
		public boolean addAll(Collection<? extends T> c) {
			return wrappedList.addAll(c);
		}

		@Override
		public boolean addAll(int index, Collection<? extends T> c) {
			return wrappedList.addAll(index, c);
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			return wrappedList.removeAll(c);
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			return wrappedList.removeAll(c);
		}

		@Override
		public void clear() {
			wrappedList.clear();
		}

		@Override
		public T get(int index) {
			return wrappedList.get(index);
		}

		@Override
		public T set(int index, T element) {
			return wrappedList.set(index, element);
		}

		@Override
		public void add(int index, T element) {
			wrappedList.add(index, element);
		}

		@Override
		public T remove(int index) {
			return wrappedList.remove(index);
		}

		@Override
		public int indexOf(Object o) {
			return wrappedList.indexOf(o);
		}

		@Override
		public int lastIndexOf(Object o) {
			return wrappedList.lastIndexOf(o);
		}

		@Override
		public ListIterator<T> listIterator() {
			return wrappedList.listIterator();
		}

		@Override
		public ListIterator<T> listIterator(int index) {
			return wrappedList.listIterator(index);
		}

		@Override
		public List<T> subList(int fromIndex, int toIndex) {
			return wrappedList.subList(fromIndex, toIndex);
		}

		@Override
		public boolean addAll(T... elements) {
			return wrappedList.addAll(Arrays.asList(elements));
		}
		
		@Override
		public void remove(int from, int to) {
			//TODO Improve performance??
			for( int idx = to; idx >= from; idx-- ) {
				wrappedList.remove(idx);
			}
		}

		@Override
		public boolean removeAll(T... elements) {
			return wrappedList.removeAll(Arrays.asList(elements));
		}

		@Override
		public boolean retainAll(T... elements) {
			return wrappedList.retainAll(Arrays.asList(elements));
		}

		@Override
		public boolean setAll(T... elements) {
			//TODO Improve performance
			wrappedList.clear();
			return wrappedList.addAll(Arrays.asList(elements));
		}

		@Override
		public boolean setAll(Collection<? extends T> col) {
			//TODO Improve performance
			wrappedList.clear();
			return wrappedList.addAll(col);
		}
		
		
		
		@Override
		public void addListener(InvalidationListener listener) {
			if( invalidationListeners == null ) {
				invalidationListeners = new ArrayList<InvalidationListener>();
			}
			
			invalidationListeners.add(listener);
			
			handleEMFAdapter();
		}
		
		
		@Override
		public void addListener(ListChangeListener<? super T> listener) {
			if( changeListeners == null ) {
				changeListeners = new ArrayList<ListChangeListener<? super T>>();
			}
			
			changeListeners.add(listener);
			
			handleEMFAdapter();
		}
		
		@Override
		public void removeListener(InvalidationListener listener) {
			if( invalidationListeners != null ) {
				invalidationListeners.remove(listener);
				if( invalidationListeners.isEmpty() ) {
					invalidationListeners = null;
				}
			}
			handleEMFAdapter();
		}
		
		@Override
		public void removeListener(ListChangeListener<? super T> listener) {
			if( changeListeners == null ) {
				changeListeners.remove(listener);
				if( changeListeners.isEmpty() ) {
					changeListeners = null;
				}
			}
			
			handleEMFAdapter();
		}
		
		private void handleEMFAdapter() {
			if( changeListeners != null || invalidationListeners != null ) {
				if( emfAdapter == null ) {
					emfAdapter = new AdapterImpl() {
						
					};
					owner.eAdapters().add(emfAdapter);
				}
			} else {
				if( emfAdapter != null ) {
					owner.eAdapters().remove(emfAdapter);
					emfAdapter = null;
				}
			}
		}
	}
	
	public static <T> ObservableList<T> adaptList(EStructuralFeature feature, EObject owner) {
		return new WrappedList<T>(feature, owner);
	}
}
