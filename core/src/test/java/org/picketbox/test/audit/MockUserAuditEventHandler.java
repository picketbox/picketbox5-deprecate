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

package org.picketbox.test.audit;

import org.picketbox.core.audit.AuditEvent;
import org.picketbox.core.audit.event.PostAuditEvent;
import org.picketbox.core.audit.event.PreAuditEvent;
import org.picketbox.core.event.EventObserver;

/**
 * @author <a href="mailto:psilva@redhat.com">Pedro Silva</a>
 *
 */
public class MockUserAuditEventHandler {

    private AuditEvent event;

    private boolean preAuditEvent;
    private boolean postAuditEvent;

    @EventObserver
    public void onPreAudit(PreAuditEvent event) {
        this.preAuditEvent = true;
        this.event = event.getEvent();
        event.getEvent().getContextMap().put("customAuditInfo", "Some custom audit info");
    }

    @EventObserver
    public void onPostAudit(PostAuditEvent event) {
        this.postAuditEvent = true;
        this.event = event.getEvent();
    }

    public AuditEvent getEvent() {
        return this.event;
    }

    public boolean isPreAuditEvent() {
        return this.preAuditEvent;
    }

    public boolean isPostAuditEvent() {
        return this.postAuditEvent;
    }
}
