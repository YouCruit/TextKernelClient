package com.youcruit.textkernel.client.exceptions;

import java.io.IOException;

public class TextKernelParsingException extends IOException {
    private static final long serialVersionUID = 2711268918739143600L;

    public TextKernelParsingException(String message) {
	super(message);
    }
}
