package io.github.chanhyeong.main;

import java.util.stream.IntStream;

public class MeasureMethodMain {
	public static void main(String[] args) {
	}

	private static void func(int i) {
		IntStream.range(0, i)
			.forEach(System.out::println);
	}
}
