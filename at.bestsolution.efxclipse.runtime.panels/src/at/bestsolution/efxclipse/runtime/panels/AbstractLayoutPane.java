package at.bestsolution.efxclipse.runtime.panels;

import java.util.WeakHashMap;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

public abstract class AbstractLayoutPane<D> extends Pane {
	static final int SWT_DEFAULT = -1;
	static final int SWT_BEGINNING = 1;
	static final int SWT_FILL = 4;
	static final int SWT_LEFT = 16384;
	static final int SWT_END = 16777224;
	static final int SWT_RIGHT = 131072;
	static final int SWT_CENTER = 16777216;
	static final int SWT_BOTTOM = 1024;
	static final int SWT_TOP = 128;
	static final int SWT_HORIZONTAL = 256;
	
	static class Size {
		public final double width;
		public final double height;
		
		public Size(double width, double height) {
			this.width = width;
			this.height = height;
		}
	}
	
	private WeakHashMap<Node, D> constraints = new WeakHashMap<Node, D>();
	
	public void setConstraint(Node n, D griddata) {
		constraints.put(n, griddata);
	}
	
	public D getConstraint(Node n) {
		return constraints.get(n);
	}
	
	protected abstract Size computeSize(double width, double height, boolean flushCache);
	
	@Override
	protected double computeMaxHeight(double width) {
		return computeSize(Double.MAX_VALUE, Double.MAX_VALUE, true).height;
	}
	
	@Override
	protected double computeMaxWidth(double height) {
		return computeSize(Double.MAX_VALUE, Double.MAX_VALUE, true).width;
	}
	
	@Override
	protected double computeMinHeight(double width) {
		return computeSize(SWT_DEFAULT, SWT_DEFAULT, true).height;
	}
	
	@Override
	protected double computeMinWidth(double height) {
		return computeSize(SWT_DEFAULT, SWT_DEFAULT, true).width;
	}
	
	@Override
	protected double computePrefHeight(double width) {
		return computeSize(SWT_DEFAULT, SWT_DEFAULT, true).height;
	}
	
	@Override
	protected double computePrefWidth(double height) {
		return computeSize(SWT_DEFAULT, SWT_DEFAULT, true).width;
	}
}
