package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM
{
	private static int onewin = 0, twowin = 0;
	
	public static Player fight(Player... players)
	{
		Random ran = new Random();
		Pokemon[] pkms1 = players[0].getPokemons();
		Pokemon[] pkms2 = players[1].getPokemons();
		int pkmscp1, pkmscp2;
		for (int i=0;i<3;i++)
		{
			if(pkms1[i].getType()==PokemonType.FIRE&&pkms2[i].getType()==PokemonType.GRASS)
			{
				onewin = onewin + 1;
			}
			else if(pkms1[i].getType() == PokemonType.GRASS && pkms2[i].getType() == PokemonType.FIRE)
			{
				twowin = twowin + 1;
			}
			else if (pkms1[i].getType() == PokemonType.GRASS && pkms2[i].getType() == PokemonType.WATER)
			{
				onewin = onewin + 1;
			}
			else if (pkms1[i].getType() == PokemonType.WATER && pkms2[i].getType() == PokemonType.GRASS)
			{
				twowin = twowin + 1;
			}
			else if (pkms1[i].getType() == PokemonType.WATER && pkms2[i].getType() == PokemonType.FIRE)
			{
				onewin = onewin + 1;
			}
			else if (pkms1[i].getType() == PokemonType.FIRE && pkms2[i].getType() == PokemonType.WATER)
			{
				twowin = twowin + 1;
			}
			else if (pkms1[i].getType() == pkms2[i].getType())
			{
				pkmscp1 = pkms1[i].getCp();
				pkmscp2 = pkms2[i].getCp();
				if (pkmscp1 > pkmscp2)
				{
					onewin = onewin + 1;
				}
				else if (pkmscp1 < pkmscp2)
				{
					twowin = twowin + 1;
				}
				else
				{
					if (ran.nextInt(50)%2 == 1)
					{
						onewin = onewin + 1;
					}
					else
					{
						twowin = twowin + 1;
					}
				}
			}
		}
		if (onewin > twowin)
		{
			return players[0];
		}
		else
		{
			return players[1];
		}
	}
}
