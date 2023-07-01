package com.niket.agrawal.FileZipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileZippingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileZippingApplication.class, args);

		FileZipper fileZipper = FileZipper.builder()
				.setSourceFilePath("C:/Data/")
				.setSourceFileName("UserData")
				.setSourceFileExtension("xlsx")
				.setZippedFileName("ZippedUserData")
				.setZippedFilePath("C:/Data/")
				.setDeleteSourceAfterZipped(true)
				.build();

		FileZippingService.zipExportFile(fileZipper);
	}

}
