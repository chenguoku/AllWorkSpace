package com.hh.coffeebar.iotest;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

	protected UpperCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int read = super.read();
		return read == -1 ? read : Character.toUpperCase((char) read);
	}

}
