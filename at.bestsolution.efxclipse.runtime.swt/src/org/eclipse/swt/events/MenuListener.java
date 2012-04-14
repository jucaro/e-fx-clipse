package org.eclipse.swt.events;

import java.util.EventListener;

public interface MenuListener extends EventListener {
	public void menuHidden(MenuEvent e);

	public void menuShown(MenuEvent e);
}
