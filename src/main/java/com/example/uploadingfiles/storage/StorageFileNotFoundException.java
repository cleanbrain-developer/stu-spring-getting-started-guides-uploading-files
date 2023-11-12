package com.example.uploadingfiles.storage;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-11-12
 * Comments: 
 * </pre>
 */
public class StorageFileNotFoundException extends StorageException {

	public StorageFileNotFoundException(String message) {
		super(message);
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}