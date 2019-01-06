package io.github.chanhyeong.workspace.common;

import io.github.chanhyeong.common.BaseExecutor;
import io.github.chanhyeong.common.Measure;
import io.github.chanhyeong.util.CommonUtil;

import java.util.stream.IntStream;

public class TestMethodMeasure implements BaseExecutor {
	public void execute() {
		new Measure<>()
			.param(100)
			.logString("테스트")
			.block(i -> IntStream.range(0, i)
				.forEach(System.out::println));

		new Measure<>(100)
			.logString("2222")
			.block(this::func);

		CommonUtil.getMeasure(Integer.TYPE)
			.param(100)
			.logString("2323")
			.block(this::func);

		CommonUtil.getMeasure(100)
			.logString("테스트")
			.block(this::func);

		CommonUtil.block(100)
	}

	private <T> void func(int i) {
		IntStream.range(0, i)
			.forEach(System.out::println);
	}
}
