package io.github.chanhyeong;

import io.github.chanhyeong.common.BaseExecutor;

public class Main {
  public static void main(String[] args) throws Exception {
    Class<?> cls = Class.forName("io.github.chanhyeong.workspace.hyeong.ISSUE101_insertNewItem");
    BaseExecutor obj = (BaseExecutor)cls.getConstructor().newInstance();
    obj.execute();
  }
}
