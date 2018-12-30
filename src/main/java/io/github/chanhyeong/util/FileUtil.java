package io.github.chanhyeong.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

	/**
	 * 정의한 디렉토리(/data) 하위에 정의된 디렉토리 목록 가져오기
	 * http://www.avajava.com/tutorials/lessons/how-do-i-get-the-directories-in-a-directory-using-a-filter.html
	 *
	 * @return 작업자 별 데이터 저장 경로
	 */
	public static List<String> getSubDirectoryListInStorage() {
		File[] dirs = new File(FILE_NAME_PREFIX).listFiles((FileFilter) DirectoryFileFilter.DIRECTORY);
		return Arrays.stream(dirs != null ? dirs : new File[] {})
			.map(File::getName)
			.collect(Collectors.toList());
	}

	public static List<String> getFileListInDirectory(String directoryName) {
		return FileUtils.listFiles(new File(FILE_NAME_PREFIX + directoryName), TrueFileFilter.TRUE, null)
			.stream()
			.map(File::getName)
			.collect(Collectors.toList());
	}

	private static boolean isAppend(String mode) {
		return "a".equals(mode);
	}
}
