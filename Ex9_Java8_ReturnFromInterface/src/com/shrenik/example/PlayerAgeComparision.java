package com.shrenik.example;

import java.util.List;

@FunctionalInterface
public interface PlayerAgeComparision {
	public Player checkWhoPlayerIsYounger(List <Player>records);
}
