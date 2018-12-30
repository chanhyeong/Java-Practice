package io.github.chanhyeong.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.List;

public class FileUtil {

	private static final String FILE_NAME_PREFIX = "../data/";
	private static final String DEFAULT_ENCODING = "UTF-8";

	public static void writeFile(String fileName, String contents, String mode) throws Exception {
		FileUtils.writeStringToFile(new File(FILE_NAME_PREFIX + fileName), contents, DEFAULT_ENCODING, isAppend(mode));
	}

	public static void writeFileInCollections(String fileName, List<?> contentList, String mode) throws Exception {
		FileUtils.writeLines(new File(FILE_NAME_PREFIX + fileName), contentList, DEFAULT_ENCODING, isAppend(mode));
	}

	// TODO reflection 으로 프로퍼티 명 최상단에 붙이기

	private static boolean isAppend(String mode) {
		return "a".equals(mode);
	}
}
