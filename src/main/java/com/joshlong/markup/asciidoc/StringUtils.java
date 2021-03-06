/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.joshlong.markup.asciidoc;

import java.io.*;

/**
 * Strings <em>are</em> basically all we do in parsers. So, we're allowed our own.
 *
 * @author Josh Long
 */
public class StringUtils {
	public static void write(Writer writer, String toWrite) {
		try {
			writer.write(toWrite);
			writer.flush();
		}
		catch (IOException e) {
			throw new RuntimeException("couldn't write the string to the writer.");
		}
		finally {
			try {
				writer.close();
			}
			catch (IOException e) {
				// don't care
			}
		}
	}

	public static void write(File file, String content) {
		try {
			FileWriter fileWriter = new FileWriter(file);
			write(fileWriter, content);
		}
		catch (IOException e) {
			throw new RuntimeException("couldn't write to the file " + file.getAbsolutePath());
		}
	}

	public static String read(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			return read(fileReader);
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("couldn't read the file " + file.getAbsolutePath());
		}

	}

	public static String defaultString(String a, String b) {
		return a != null && a.length() > 0 ? a : b;
	}

	public static String read(Reader is) {
		BufferedReader bufferedReader = new BufferedReader(is);
		StringBuilder string = new StringBuilder();
		try {
			final String lineSep = System.getProperty("line.separator");
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				string.append(line).append(lineSep);
			}
			string.trimToSize();
			return string.toString();
		}
		catch (IOException e) {
			throw new RuntimeException("couldn't read from reader.");
		}
		finally {
			try {
				bufferedReader.close();
			}
			catch (IOException e) {
				// don't care
			}
		}
	}
}
