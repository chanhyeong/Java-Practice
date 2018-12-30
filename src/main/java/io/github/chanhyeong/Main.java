package io.github.chanhyeong;

import io.github.chanhyeong.common.BaseExecutor;
import io.github.chanhyeong.util.FileUtil;

public class Main {
  public static void main(String[] args) throws Exception {
    Class<?> cls = Class.forName("io.github.chanhyeong.workspace.chan.ISSUE100_getAverage");
    BaseExecutor obj = (BaseExecutor)cls.getConstructor().newInstance();
    obj.execute();
    FileUtil.writeFile("writeFileTest", "writeFileTest", "w");
  }
}