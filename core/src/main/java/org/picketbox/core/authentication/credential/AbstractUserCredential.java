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

package org.picketbox.core.authentication.credential;

import org.picketlink.idm.credential.AbstractBaseCredentials;
import org.picketlink.idm.credential.Credentials;

/**
 * <p>
 * Base class for the {@link UserCredential} interface.
 * </p>
 *
 * @author <a href="mailto:psilva@redhat.com">Pedro Silva</a>
 *
 */
public class AbstractUserCredential extends AbstractBaseCredentials implements UserCredential {

    private String userName;

    private Credentials credential;

    public AbstractUserCredential() {
    }

    public AbstractUserCredential(Credentials credential) {
        this.credential = credential;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.picketbox.core.Credential#getUserName()
     */
    @Override
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Credentials getCredential() {
        return this.credential;
    }

    public void setCredential(Credentials credential) {
        this.credential = credential;
    }

    @Override
    public void invalidate() {
        this.credential = null;
    }

}
