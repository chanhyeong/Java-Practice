package io.github.chanhyeong.common;

import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.function.Consumer;

@Setter
@Accessors(fluent = true, chain = true)
public class Measure<T> {

	private T param;
	private String logString;

	public Measure() {

	}

	public Measure(T param) {
		this.param = param;
	}

	public void block(Consumer<T> consumer) {
		long start = System.currentTimeMillis();
		System.out.println(start);

		consumer.accept(this.param);

		System.out.println(System.currentTimeMillis());

		System.out.println(System.currentTimeMillis() - start + " " + logString);
	}
}
