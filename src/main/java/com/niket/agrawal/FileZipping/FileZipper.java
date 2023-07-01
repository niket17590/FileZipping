package com.niket.agrawal.FileZipping;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder(setterPrefix = "set")
@Data
public class FileZipper {

	@NonNull
	private String sourceFilePath;
	@NonNull
	private String sourceFileName;
	@NonNull
	private String sourceFileExtension;
	@NonNull
	private String zippedFilePath;
	@NonNull
	private String zippedFileName;
	private boolean deleteSourceAfterZipped;
}
