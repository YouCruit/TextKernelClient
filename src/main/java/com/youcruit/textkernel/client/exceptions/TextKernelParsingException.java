package com.youcruit.textkernel.client.exceptions;

import java.io.IOException;

public class TextKernelParsingException extends IOException {
    private static final long serialVersionUID = 2711268918739143600L;
    private final String fullError;

    public TextKernelParsingException(String message, String fullError) {
	super(message);
	this.fullError = fullError;
    }

    public String getFullError() {
	return fullError;
    }
}
