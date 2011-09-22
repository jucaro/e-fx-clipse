package at.bestsolution.efxclipse.runtime.panels;

import javafx.geometry.BoundingBox;
import javafx.geometry.Bounds;
import javafx.scene.Node;

public class RowLayoutPane extends AbstractLayoutPane<RowLayoutPane.RowData> {
	public static class RowData {
		/**
		 * width specifies the desired width in pixels. This value is the wHint
		 * passed into Control.computeSize(int, int, boolean) to determine the
		 * preferred size of the control.
		 * 
		 * The default value is SWT.DEFAULT.
		 * 
		 * @see org.eclipse.swt.widgets.Control#computeSize(int, int, boolean)
		 */
		public int width = SWT_DEFAULT;
		/**
		 * height specifies the preferred height in pixels. This value is the
		 * hHint passed into Control.computeSize(int, int, boolean) to determine
		 * the preferred size of the control.
		 * 
		 * The default value is SWT.DEFAULT.
		 * 
		 * @see org.eclipse.swt.widgets.Control#computeSize(int, int, boolean)
		 */
		public int height = SWT_DEFAULT;

		/**
		 * exclude informs the layout to ignore this control when sizing and
		 * positioning controls. If this value is <code>true</code>, the size
		 * and position of the control will not be managed by the layout. If
		 * this value is <code>false</code>, the size and position of the
		 * control will be computed and assigned.
		 * 
		 * The default value is <code>false</code>.
		 * 
		 * @since 3.1
		 */
		public boolean exclude = false;

		/**
		 * Constructs a new instance of RowData using default values.
		 */
		public RowData() {
		}

		/**
		 * Constructs a new instance of RowData according to the parameters. A
		 * value of SWT.DEFAULT indicates that no minimum width or no minimum
		 * height is specified.
		 * 
		 * @param width
		 *            a minimum width for the control
		 * @param height
		 *            a minimum height for the control
		 */
		public RowData(int width, int height) {
			this.width = width;
			this.height = height;
		}

		String getName() {
			String string = getClass().getName();
			int index = string.lastIndexOf('.');
			if (index == -1)
				return string;
			return string.substring(index + 1, string.length());
		}

		/**
		 * Returns a string containing a concise, human-readable description of
		 * the receiver.
		 * 
		 * @return a string representation of the RowData object
		 */
		public String toString() {
			String string = getName() + " {";
			if (width != SWT_DEFAULT)
				string += "width=" + width + " ";
			if (height != SWT_DEFAULT)
				string += "height=" + height + " ";
			if (exclude)
				string += "exclude=" + exclude + " ";
			string = string.trim();
			string += "}";
			return string;
		}
	}

	/**
	 * type specifies whether the layout places controls in rows or columns.
	 * 
	 * The default value is HORIZONTAL.
	 * 
	 * Possible values are:
	 * <ul>
	 * <li>HORIZONTAL: Position the controls horizontally from left to right</li>
	 * <li>VERTICAL: Position the controls vertically from top to bottom</li>
	 * </ul>
	 * 
	 * @since 2.0
	 */
	public int type = SWT_HORIZONTAL;

	/**
	 * marginWidth specifies the number of pixels of horizontal margin that will
	 * be placed along the left and right edges of the layout.
	 * 
	 * The default value is 0.
	 * 
	 * @since 3.0
	 */
	public int marginWidth = 0;

	/**
	 * marginHeight specifies the number of pixels of vertical margin that will
	 * be placed along the top and bottom edges of the layout.
	 * 
	 * The default value is 0.
	 * 
	 * @since 3.0
	 */
	public int marginHeight = 0;

	/**
	 * spacing specifies the number of pixels between the edge of one cell and
	 * the edge of its neighbouring cell.
	 * 
	 * The default value is 3.
	 */
	public int spacing = 3;

	/**
	 * wrap specifies whether a control will be wrapped to the next row if there
	 * is insufficient space on the current row.
	 * 
	 * The default value is true.
	 */
	public boolean wrap = true;

	/**
	 * pack specifies whether all controls in the layout take their preferred
	 * size. If pack is false, all controls will have the same size which is the
	 * size required to accommodate the largest preferred height and the largest
	 * preferred width of all the controls in the layout.
	 * 
	 * The default value is true.
	 */
	public boolean pack = true;

	/**
	 * fill specifies whether the controls in a row should be all the same
	 * height for horizontal layouts, or the same width for vertical layouts.
	 * 
	 * The default value is false.
	 * 
	 * @since 3.0
	 */
	public boolean fill = false;

	/**
	 * center specifies whether the controls in a row should be centered
	 * vertically in each cell for horizontal layouts, or centered horizontally
	 * in each cell for vertical layouts.
	 * 
	 * The default value is false.
	 * 
	 * @since 3.4
	 */
	public boolean center = false;

	/**
	 * justify specifies whether the controls in a row should be fully
	 * justified, with any extra space placed between the controls.
	 * 
	 * The default value is false.
	 */
	public boolean justify = false;

	/**
	 * marginLeft specifies the number of pixels of horizontal margin that will
	 * be placed along the left edge of the layout.
	 * 
	 * The default value is 3.
	 */
	public int marginLeft = 3;

	/**
	 * marginTop specifies the number of pixels of vertical margin that will be
	 * placed along the top edge of the layout.
	 * 
	 * The default value is 3.
	 */
	public int marginTop = 3;

	/**
	 * marginRight specifies the number of pixels of horizontal margin that will
	 * be placed along the right edge of the layout.
	 * 
	 * The default value is 3.
	 */
	public int marginRight = 3;

	/**
	 * marginBottom specifies the number of pixels of vertical margin that will
	 * be placed along the bottom edge of the layout.
	 * 
	 * The default value is 3.
	 */
	public int marginBottom = 3;

	@Override
	protected at.bestsolution.efxclipse.runtime.panels.AbstractLayoutPane.Size computeSize(
			double wHint, double hHint, boolean flushCache) {
		Size extent;
		if (type == SWT_HORIZONTAL) {
			extent = layoutHorizontal(false, (wHint != SWT_DEFAULT) && wrap,
					wHint, flushCache);
		} else {
			extent = layoutVertical(false, (hHint != SWT_DEFAULT) && wrap,
					hHint, flushCache);
		}
		
		double width = extent.width; 
		double height = extent.height; 
		
		if (wHint != SWT_DEFAULT)
			width = wHint;
		if (hHint != SWT_DEFAULT)
			height = hHint;
		
		return new Size(width,height);
	}

	Size computeSize(Node control, boolean flushCache) {
		int wHint = SWT_DEFAULT, hHint = SWT_DEFAULT;
		RowData data = (RowData) getConstraint(control);
		if (data != null) {
			wHint = data.width;
			hHint = data.height;
		}
		return new Size(control.prefWidth(wHint), control.prefHeight(hHint));
	}

	@Override
	protected void layoutChildren() {
		super.layoutChildren();
		Bounds clientArea = getLayoutBounds();
		if (type == SWT_HORIZONTAL) {
			layoutHorizontal(true, wrap, clientArea.getWidth(), true);
		} else {
			layoutVertical(true, wrap, clientArea.getHeight(), true);
		}
	}

	Size layoutHorizontal(boolean move, boolean wrap, double width,
			boolean flushCache) {
		Node[] children = getChildren().toArray(new Node[0]);
		int count = 0;
		for (int i = 0; i < children.length; i++) {
			Node control = children[i];
			RowData data = (RowData) getConstraint(control);
			if (data == null || !data.exclude) {
				children[count++] = children[i];
			}
		}
		if (count == 0) {
			return new Size(marginLeft + marginWidth * 2 + marginRight,
					marginTop + marginHeight * 2 + marginBottom);
		}
		double childWidth = 0, childHeight = 0, maxHeight = 0;
		if (!pack) {
			for (int i = 0; i < count; i++) {
				Node child = children[i];
				Size size = computeSize(child, flushCache);
				childWidth = Math.max(childWidth, size.width);
				childHeight = Math.max(childHeight, size.height);
			}
			maxHeight = childHeight;
		}
		double clientX = 0, clientY = 0;
		if (move) {
			Bounds rect = getLayoutBounds();
			clientX = rect.getMinX();
			clientY = rect.getMinY();
		}
		double[] wraps = null;
		boolean wrapped = false;
		Bounds[] bounds = null;
		if (move && (justify || fill || center)) {
			bounds = new Bounds[count];
			wraps = new double[count];
		}
		double maxX = 0, x = marginLeft + marginWidth, y = marginTop
				+ marginHeight;
		for (int i = 0; i < count; i++) {
			Node child = children[i];
			if (pack) {
				Size size = computeSize(child, flushCache);
				childWidth = size.width;
				childHeight = size.height;
			}
			if (wrap && (i != 0) && (x + childWidth > width)) {
				wrapped = true;
				if (move && (justify || fill || center))
					wraps[i - 1] = maxHeight;
				x = marginLeft + marginWidth;
				y += spacing + maxHeight;
				if (pack)
					maxHeight = 0;
			}
			if (pack || fill || center) {
				maxHeight = Math.max(maxHeight, childHeight);
			}
			if (move) {
				double childX = x + clientX, childY = y + clientY;
				if (justify || fill || center) {
					bounds[i] = new BoundingBox(childX, childY, childWidth,
							childHeight);
				} else {
					child.resizeRelocate(childX, childY, childWidth,
							childHeight);
				}
			}
			x += spacing + childWidth;
			maxX = Math.max(maxX, x);
		}
		maxX = Math.max(clientX + marginLeft + marginWidth, maxX - spacing);
		if (!wrapped)
			maxX += marginRight + marginWidth;
		if (move && (justify || fill || center)) {
			double space = 0, margin = 0;
			if (!wrapped) {
				space = Math.max(0, (width - maxX) / (count + 1));
				margin = Math.max(0, ((width - maxX) % (count + 1)) / 2);
			} else {
				if (fill || justify || center) {
					int last = 0;
					if (count > 0)
						wraps[count - 1] = maxHeight;
					for (int i = 0; i < count; i++) {
						if (wraps[i] != 0) {
							int wrapCount = i - last + 1;
							if (justify) {
								int wrapX = 0;
								for (int j = last; j <= i; j++) {
									wrapX += bounds[j].getWidth() + spacing;
								}
								space = Math.max(0, (width - wrapX)
										/ (wrapCount + 1));
								margin = Math
										.max(0,
												((width - wrapX) % (wrapCount + 1)) / 2);
							}
							for (int j = last; j <= i; j++) {
								if (justify)
									bounds[j] = changeX(bounds[j], (space * (j
											- last + 1))
											+ margin);
								if (fill) {
									bounds[j] = changeHeight(bounds[j],
											wraps[i]);
								} else {
									if (center) {
										bounds[j] = changeY(
												bounds[j],
												Math.max(
														0,
														(wraps[i] - bounds[j]
																.getHeight()) / 2));
									}
								}
							}
							last = i + 1;
						}
					}
				}
			}
			for (int i = 0; i < count; i++) {
				if (!wrapped) {
					if (justify)
						bounds[i] = changeX(bounds[i], (space * (i + 1))
								+ margin);
					if (fill) {
						bounds[i] = changeHeight(bounds[i], maxHeight);
					} else {
						if (center) {
							bounds[i] = changeY(bounds[i], Math.max(0,
									(maxHeight - bounds[i].getHeight()) / 2));
						}
					}
				}
				children[i].resizeRelocate(bounds[i].getMinX(),
						bounds[i].getMinY(), bounds[i].getWidth(),
						bounds[i].getHeight());
			}
		}
		return new Size(maxX, y + maxHeight + marginBottom + marginHeight);
	}
	
	Size layoutVertical (boolean move, boolean wrap, double height, boolean flushCache) {
		Node [] children = getChildren ().toArray(new Node[0]);
		int count = 0;
		for (int i=0; i<children.length; i++) {
			Node control = children [i];
			RowData data = (RowData) getConstraint(control);
			if (data == null || !data.exclude) {
				children [count++] = children [i];
			} 
		}
		if (count == 0) {
			return new Size (marginLeft + marginWidth * 2 + marginRight, marginTop + marginHeight * 2 + marginBottom);
		}
		double childWidth = 0, childHeight = 0, maxWidth = 0;
		if (!pack) {
			for (int i=0; i<count; i++) {
				Node child = children [i];
				Size size = computeSize (child, flushCache);
				childWidth = Math.max (childWidth, size.width);
				childHeight = Math.max (childHeight, size.height);
			}
			maxWidth = childWidth;
		}
		double clientX = 0, clientY = 0;
		if (move) {
			Bounds rect = getLayoutBounds();
			clientX = rect.getMinX();
			clientY = rect.getMinY();
		}
		double [] wraps = null;
		boolean wrapped = false;
		Bounds [] bounds = null;
		if (move && (justify || fill || center)) {
			bounds = new Bounds [count];
			wraps = new double [count];
		}
		double maxY = 0, x = marginLeft + marginWidth, y = marginTop + marginHeight;
		for (int i=0; i<count; i++) {
			Node child = children [i];
			if (pack) {
				Size size = computeSize (child, flushCache);
				childWidth = size.width;
				childHeight = size.height;
			}
			if (wrap && (i != 0) && (y + childHeight > height)) {
				wrapped = true;
				if (move && (justify || fill || center)) wraps [i - 1] = maxWidth;
				x += spacing + maxWidth;
				y = marginTop + marginHeight;
				if (pack) maxWidth = 0;
			}
			if (pack || fill || center) {
				maxWidth = Math.max (maxWidth, childWidth);
			}
			if (move) {
				double childX = x + clientX, childY = y + clientY;
				if (justify || fill || center) {
					bounds [i] = new BoundingBox(childX, childY, childWidth, childHeight);
				} else {
					child.resizeRelocate(childX, childY, childWidth, childHeight);
				}
			}
			y += spacing + childHeight;
			maxY = Math.max (maxY, y);
		}
		maxY = Math.max (clientY + marginTop + marginHeight, maxY - spacing);
		if (!wrapped) maxY += marginBottom + marginHeight;
		if (move && (justify || fill || center)) {
			double space = 0, margin = 0;
			if (!wrapped) {
				space = Math.max (0, (height - maxY) / (count + 1));
				margin = Math.max (0, ((height - maxY) % (count + 1)) / 2);
			} else {
				if (fill || justify || center) {
					int last = 0;
					if (count > 0) wraps [count - 1] = maxWidth;
					for (int i=0; i<count; i++) {
						if (wraps [i] != 0) {
							int wrapCount = i - last + 1;
							if (justify) {
								int wrapY = 0;
								for (int j=last; j<=i; j++) {
									wrapY += bounds [j].getHeight() + spacing;
								}
								space = Math.max (0, (height - wrapY) / (wrapCount + 1));
								margin = Math.max (0, ((height - wrapY) % (wrapCount + 1)) / 2);
							}
							for (int j=last; j<=i; j++) {
								if (justify) bounds [j] = changeY(bounds [j], (space * (j - last + 1)) + margin);
								if (fill) {
									bounds [j] = changeWidth(bounds [j],wraps [i]);
								} else {
									if (center) {
										bounds [j] = changeX(bounds [j],Math.max (0, (wraps [i] - bounds [j].getWidth()) / 2));
									}
								}
							}
							last = i + 1;
						}
					}
				}
			}
			for (int i=0; i<count; i++) {
				if (!wrapped) {
					if (justify) bounds [i] = changeY(bounds [i],(space * (i + 1)) + margin);
					if (fill) {
						bounds [i] = changeWidth(bounds [i], maxWidth);
					} else {
						if (center) {
							bounds [i] = changeX(bounds [i],Math.max (0, (maxWidth - bounds [i].getWidth()) / 2));
						}
					}

				}
				children [i].resizeRelocate(bounds [i].getMinX(),bounds [i].getMinY(), bounds [i].getWidth(), bounds [i].getHeight());
			}
		}
		return new Size (x + maxWidth + marginRight + marginWidth, maxY);
	}

	private static Bounds changeX(Bounds original, double amount) {
		return new BoundingBox(original.getMinX() + amount, original.getMinY(),
				original.getWidth(), original.getHeight());
	}

	private static Bounds changeY(Bounds original, double amount) {
		return new BoundingBox(original.getMinX(), original.getMinY() + amount,
				original.getWidth(), original.getHeight());
	}

	private static Bounds changeHeight(Bounds original, double amount) {
		return new BoundingBox(original.getMinX(), original.getMinY(),
				original.getWidth(), original.getHeight() + amount);
	}
	
	private static Bounds changeWidth(Bounds original, double amount) {
		return new BoundingBox(original.getMinX(), original.getMinY(),
				original.getWidth() + amount, original.getHeight());
	}
}
