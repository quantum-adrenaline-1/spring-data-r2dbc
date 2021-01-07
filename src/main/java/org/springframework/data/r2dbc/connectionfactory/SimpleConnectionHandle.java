/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.r2dbc.connectionfactory;

import io.r2dbc.spi.Connection;

import org.springframework.util.Assert;

/**
 * Simple implementation of the {@link ConnectionHandle} interface, containing a given R2DBC Connection.
 *
 * @author Mark Paluch
 * @author Christoph Strobl
 * @deprecated since 1.2 in favor of Spring R2DBC. Use {@link org.springframework.r2dbc.connection} instead.
 */
@Deprecated
public class SimpleConnectionHandle implements ConnectionHandle {

	private final Connection connection;

	/**
	 * Create a new SimpleConnectionHandle for the given Connection.
	 *
	 * @param connection the R2DBC Connection
	 */
	SimpleConnectionHandle(Connection connection) {

		Assert.notNull(connection, "Connection must not be null");
		this.connection = connection;
	}

	/**
	 * Return the specified Connection as-is.
	 */
	@Override
	public Connection getConnection() {
		return this.connection;
	}

	@Override
	public String toString() {
		return "SimpleConnectionHandle: " + this.connection;
	}

}
