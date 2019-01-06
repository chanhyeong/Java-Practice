package io.github.chanhyeong.main;

import io.github.chanhyeong.common.BaseExecutor;
import io.github.chanhyeong.util.FileUtil;

public class ExecutorMain {
  public static void main(String[] args) throws Exception {
    Class<?> cls = Class.forName("io.github.chanhyeong.workspace.chan.ISSUE100_getAverage");
    BaseExecutor obj = (BaseExecutor)cls.getConstructor().newInstance();
    obj.execute();
    FileUtil.getSubDirectoryListInStorage().forEach(System.out::println);
    FileUtil.writeFile("chanhyeong/writeFileTest.txt", "writeFileTest Text File", "w"); // chanhyeong 하위에 파일 쓰기
    FileUtil.getFileListInDirectory("chanhyeong").forEach(System.out::println); // 파일이 저장되어있는지 확인
  }
}