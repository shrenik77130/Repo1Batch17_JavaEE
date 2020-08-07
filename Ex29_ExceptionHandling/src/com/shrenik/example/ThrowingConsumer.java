package com.shrenik.example;

@FunctionalInterface
public interface ThrowingConsumer <T, E extends Exception>{
	void accept(T t);
}
