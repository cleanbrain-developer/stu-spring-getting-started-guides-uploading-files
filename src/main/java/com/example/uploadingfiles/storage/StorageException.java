package com.example.uploadingfiles.storage;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-11-12
 * Comments: 
 * </pre>
 */
public class StorageException extends RuntimeException {

	public StorageException(String message) {
		super(message);
	}

	public StorageException(String message, Throwable cause) {
		super(message, cause);
	}
}