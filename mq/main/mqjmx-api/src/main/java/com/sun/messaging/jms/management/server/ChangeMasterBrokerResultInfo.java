/*
 * Copyright (c) 2000, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

/*
 * @(#)BrokerClusterInfo.java	1.13 07/02/07
 */

package com.sun.messaging.jms.management.server;

/**
 * This class contains constants/names for fields in the CompositeData that is returned by the changeMasterBroker
 * operation of the Cluster Monitor and Cluster Config MBeans.
 */
public class ChangeMasterBrokerResultInfo implements java.io.Serializable {

    /**
     * Whether an BrokerException was thrown whilst performing this operation
     */
    public static final String SUCCESS = "Success";

    /**
     * StatusCode of any BrokerException thrown when performing this operation
     */
    public static final String STATUS_CODE = "StatusCode";

    /**
     * DetailMessage of any BrokerException thrown when performing this operation
     */
    public static final String DETAIL_MESSAGE = "DetailMessage";

    /**
     * Make constructor private to prevent this class being instantiated
     */
    private ChangeMasterBrokerResultInfo() {
    }
}
