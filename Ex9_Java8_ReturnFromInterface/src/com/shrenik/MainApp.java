package com.shrenik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.shrenik.example.Player;
import com.shrenik.example.PlayerAgeComparision;
import com.shrenik.example.PlayerDisplayInterface;



public class MainApp {

	public static void main(String[] args) {
		
		List <Player>playerRecords = new ArrayList();
		
		playerRecords.add(new Player("Virat",32));
		playerRecords.add(new Player("M S Dhoni",39));
		playerRecords.add(new Player("Sachin",31));
		
		// First Example
		PlayerDisplayInterface pd = (List <Player>pRecords) -> {
			//toString()
			//Enhanced Loop
			//Iterator
			
			Iterator it = pRecords.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			//forEach
		};
		
		pd.showPlayers(playerRecords);
		
		
		//Second Example
		PlayerAgeComparision page = (List<Player> records) -> {
				int min=records.get(0).getAge();
				Player x=records.get(0);
				for(int i=0;i<records.size();i++)
				{
					if(records.get(i).getAge() < min)
					{
						min = records.get(i).getAge();
						x = records.get(i);
					}
				}
				return x;
		};
		
		Player ans = page.checkWhoPlayerIsYounger(playerRecords);
	
		
		System.out.println("Player who is Younger = " + ans);
		
		
		

	}
}
