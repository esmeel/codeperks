/*
 * Copyright 2009 Christopher J. Stehno
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.stehno.codeperks.io;

import java.io.IOException;
import java.io.InputStream;

/**
 *	Callback used for reading data from an InputStream.
 *
 * @author Christopher J. Stehno (chris@stehno.com)
 *
 * @param <I> InputStream extension to be used
 */
public interface InputStreamCallback<I extends InputStream> {

	/**
	 * Provides a managed non-null InputStream to be read from.
	 *
	 * @param in
	 * @throws IOException
	 */
	void input(I in) throws IOException;
}
