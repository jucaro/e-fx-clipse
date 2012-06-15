/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl - initial API and implementation
 *******************************************************************************/
package @@packageName@@;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;

@SuppressWarnings({ "restriction" })
public class RefreshHandler {
	public static final String REFRESH_EVENT = "media/refresh";
	
	@Execute
	public void execute(IEventBroker broker)
			throws InvocationTargetException, InterruptedException {
		broker.send(REFRESH_EVENT, UUID.randomUUID().toString());
	}
}