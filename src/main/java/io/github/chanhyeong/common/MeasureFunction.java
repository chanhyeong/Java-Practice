package io.github.chanhyeong.common;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface MeasureFunction<T> extends Consumer<T> {

	default void param(T t) {
		Objects.requireNonNull(t);
		accept(t);
	}
}
