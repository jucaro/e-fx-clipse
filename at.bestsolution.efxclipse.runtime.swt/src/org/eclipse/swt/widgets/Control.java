package org.eclipse.swt.widgets;

import org.eclipse.swt.graphics.Point;


public abstract class Control extends Widget {
	
	private Object layoutData;
	
	public Control(Composite parent, int style) {
		super(parent.getDisplay(),style);
		parent.internal_controlAdded(this);
	}
	
	public Control(Display display, int style) {
		super(display,style);
	}

	public void setBounds(int x, int y, int width, int height) {
		internal_getNode().relocate(x, y);
		internal_getNode().resize(width, height);
		
//		System.err.println("Bounds: " + x + "/" +y + " " + width + "/" + height);
	}
	
	public abstract Point computeSize(int wHint, int hHint, boolean flushCache);
	
	public void setLayoutData(Object layoutData) {
		this.layoutData = layoutData;
	}

	public Object getLayoutData() {
		return layoutData;
	}

	public int getBorderWidth() {
		// FIXME Implement
		return 0;
	}
	
//	public void addControlListener(ControlListener listener) {
//		
//	}
//	
//	public void addDragDetectListener (DragDetectListener listener) {
//		
//	}
//	
//	public void addFocusListener (FocusListener listener) {
//		
//	}
//	
//	public void addGestureListener (GestureListener listener) {
//		
//	}
//	
//	public void addHelpListener (HelpListener listener) {
//		
//	}
//	
//	public void addKeyListener (KeyListener listener) {
//		
//	}
//	
//	public void addMenuDetectListener (MenuDetectListener listener) {
//		
//	}
//	
//	public void addMouseListener (MouseListener listener) {
//		
//	}
//	
//	public void addMouseMoveListener (MouseMoveListener listener) {
//		
//	}
//	
//	public void addMouseTrackListener (MouseTrackListener listener) {
//		
//	}
//	
//	public void addMouseWheelListener (MouseWheelListener listener) {
//		
//	}
//	
//	public void addPaintListener (PaintListener listener) {
//		
//	}
//	
//	public void addTouchListener (TouchListener listener) {
//		
//	}
//	
//	public void addTraverseListener (TraverseListener listener) {
//		
//	}
//	
//	public Point computeSize (int wHint, int hHint) {
//		
//	}
//	
////	public Point computeSize (int wHint, int hHint, boolean changed) {
////		
////	}
//	
//	public boolean dragDetect (MouseEvent event) {
//		
//	}
//	
//	public boolean dragDetect (Event event) {
//		
//	}
//	
//	public boolean forceFocus () {
//		
//	}
//	
//	public Accessible getAccessible () {
//		
//	}
//	
//	public Color getBackground () {
//		
//	}
//	
//	public Image getBackgroundImage () {
//		
//	}
//	
//	public Rectangle getBounds () {
//		
//	}
//	
//	public Cursor getCursor () {
//		
//	}
//	
//	public boolean getDragDetect () {
//		
//	}
//	
//	public boolean getEnabled () {
//		
//	}
//	
//	public Font getFont () {
//		
//	}
//	
//	public Color getForeground () {
//		
//	}
//	
//	public Point getLocation () {
//		
//	}
//	
//	public Monitor getMonitor () {
//		
//	}
//	
//	public int getOrientation () {
//		
//	}
//	
//	public Composite getParent () {
//		
//	}
//	
//	public Region getRegion () {
//		
//	}
//	
//	public Shell getShell () {
//		
//	}
//	
//	public Point getSize () {
//		
//	}
//	
//	public String getToolTipText () {
//		
//	}
//	
//	public boolean getTouchEnabled () {
//		
//	}
//	
//	public boolean getVisible () {
//		
//	}
//	
//	public boolean isEnabled () {
//		
//	}
//	
//	public boolean isFocusControl () {
//		
//	}
//	
//	public boolean isReparentable () {
//		
//	}
//	
//	public boolean isVisible () {
//		
//	}
//	
//	public void moveAbove (Control control) {
//		
//	}
//	
//	public void moveBelow (Control control) {
//		
//	}
//	
//	public void pack () {
//		
//	}
//	
//	public void pack (boolean changed) {
//		
//	}
//	
//	public boolean print (GC gc) {
//		
//	}
//	
//	public void redraw () {
//		
//	}
//	
//	public void redraw (int x, int y, int width, int height, boolean all) {
//		
//	}
//	
//	public void removeControlListener (ControlListener listener) {
//		
//	}
//	
//	public void removeDragDetectListener(DragDetectListener listener) {
//		
//	}
//	
//	public void removeFocusListener(FocusListener listener) {
//		
//	}
//	
//	public void removeGestureListener (GestureListener listener) {
//		
//	}
//	
//	public void removeHelpListener (HelpListener listener) {
//		
//	}
//	
//	public void removeKeyListener(KeyListener listener) {
//		
//	}
//	
//	public void removeMenuDetectListener (MenuDetectListener listener) {
//		
//	}
//	
//	public void removeMouseListener (MouseListener listener) {
//		
//	}
//	
//	public void removeMouseMoveListener(MouseMoveListener listener) {
//		
//	}
//	
//	public void removeMouseTrackListener(MouseTrackListener listener) {
//		
//	}
//	
//	public void removeMouseWheelListener (MouseWheelListener listener) {
//		
//	}
//	
//	public void removePaintListener(PaintListener listener) {
//		
//	}
//	
//	public void removeTouchListener(TouchListener listener) {
//		
//	}
//	
//	public void removeTraverseListener(TraverseListener listener) {
//		
//	}
//	
//	public void setBackground (Color color) {
//		
//	}
//	
//	public void setBackgroundImage (Image image) {
//		
//	}
//		
//	public void setBounds (Rectangle rect) {
//		
//	}
//	
//	public void setCapture (boolean capture) {
//		
//	}
//	
//	public void setCursor (Cursor cursor) {
//		
//	}
//	
//	public void setDragDetect (boolean dragDetect) {
//		
//	}
//	
//	public void setEnabled (boolean enabled) {
//		
//	}
//	
//	public boolean setFocus () {
//		
//	}
//	
//	public void setFont (Font font) {
//		
//	}
//	
//	public void setForeground (Color color) {
//		
//	}
//	
//	public void setLayoutData (Object layoutData) {
//		
//	}
//	
//	public void setLocation (int x, int y) {
//		
//	}
//	
//	public void setLocation (Point location) {
//		
//	}
//	
//	public void setMenu (Menu menu) {
//		
//	}
//	
//	public void setOrientation (int orientation) {
//		
//	}
//	
//	public boolean setParent (Composite parent) {
//		
//	}
//	
//	public void setRedraw (boolean redraw) {
//		
//	}
//	
//	public void setRegion (Region region) {
//		
//	}
//	
//	public void setSize (int width, int height) {
//		
//	}
//	
//	public void setSize (Point size) {
//		
//	}
//	
//	public void setToolTipText (String string) {
//		
//	}
//	
//	public void setTouchEnabled(boolean enabled) {
//		
//	}
//	
//	public void setVisible (boolean visible) {
//		
//	}
//	
//	public Point toControl (int x, int y) {
//		
//	}
//	
//	public Point toControl (Point point) {
//		
//	}
//	
//	public Point toDisplay (int x, int y) {
//		
//	}
//	
//	public Point toDisplay (Point point) {
//		
//	}
//	
//	public boolean traverse (int traversal) {
//		
//	}
//	
//	public boolean traverse (int traversal, KeyEvent event) {
//		
//	}
//	
//	public boolean traverse (int traversal, Event event) {
//		
//	}
//	
//	public void update () {
//		
//	}
}
