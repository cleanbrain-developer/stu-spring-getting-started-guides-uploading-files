package com.example.uploadingfiles.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <pre>
 * User: clean_brain
 * Date: 2023-11-12
 * Comments: 
 * </pre>
 */
@ConfigurationProperties("storage")
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */
	private String location = "upload-dir";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}