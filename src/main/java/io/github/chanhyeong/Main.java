package io.github.chanhyeong;

import io.github.chanhyeong.common.BaseExecutor;

public class Main {
  public static void main(String[] args) throws Exception {
    Class<?> cls = Class.forName("io.github.chanhyeong.workspace.chan.ISSUE100_getAverage");
    BaseExecutor obj = (BaseExecutor)cls.getConstructor().newInstance();
    obj.execute();
  }
}