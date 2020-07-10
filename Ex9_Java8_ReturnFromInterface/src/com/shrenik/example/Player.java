package com.shrenik.example;

public class Player {
	private String playername;
	private int age;
	
	
	public Player() {}
	
	public Player(String playername, int age) {
		super();
		this.playername = playername;
		this.age = age;
	}

	public String getPlayername() {
		return playername;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Player [playername=" + playername + ", age=" + age + "]";
	}
	
	
	
	
}
