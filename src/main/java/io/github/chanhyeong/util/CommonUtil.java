package io.github.chanhyeong.util;

import io.github.chanhyeong.common.Measure;
import io.github.chanhyeong.common.MeasureFunction;

import java.util.function.Consumer;
import java.util.function.Function;

public class CommonUtil {

	public static <T> Measure<T> getMeasure() {
		return new Measure<>();
	}

	public static <T> Measure<T> getMeasure(Class<T> clazz) {
		return new Measure<>();
	}

	public static <T> Measure<T> getMeasure(T param) {
		return new Measure<>(param);
	}

	public static <T> MeasureFunction<T> getMeasureFunction(T t) {

	}

	public static <T, R extends Consumer> Function<T, R> block(T t) {
		return (R r) -> {
			r.accept(t);
		};
	}

	public static Consumer CONSUMER = (t) -> {
		long start = System.currentTimeMillis();
		System.out.println(start);

		consumer.accept(t);

		System.out.println(System.currentTimeMillis());

		System.out.println(System.currentTimeMillis() - start + " " + logString);
	}

	public static <T, R extends Consumer> Function<T, R> block(T t) {
		return (R r) -> {
			r.accept(t);
		};
	}
}
