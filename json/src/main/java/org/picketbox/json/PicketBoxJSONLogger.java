/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketbox.json;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.LogMessage;
import org.jboss.logging.Logger;
import org.jboss.logging.Message;
import org.jboss.logging.MessageLogger;

/**
 * An subclass of {@link BasicLogger} from JBoss Logging
 *
 * @author Stefan Guilhen
 * @since Jul 10, 2012
 */
@MessageLogger(projectCode = "PBOXJSON")
public interface PicketBoxJSONLogger extends BasicLogger {

    PicketBoxJSONLogger LOGGER = Logger.getMessageLogger(PicketBoxJSONLogger.class, PicketBoxJSONLogger.class.getPackage()
            .getName());

    @LogMessage(level = Logger.Level.DEBUG)
    @Message(id = 500, value = "Executing query: '%s' with parameters: %s")
    void debugQueryExecution(String query, String params);

}