package fcu.iecs.oop.pokemon;

public class Player
{
	private String playerName;
	private Pokemon pokemons[];
	private int level;
	public Player(String playerName)
	{
		super();
		this.playerName=playerName;
		level=1;
	}
	public void setPlayerName(String playerName)
	{
		this.playerName=playerName;
	}
	public String getPlayerName()
	{
		return playerName;
	}
	public void setPokemons(Pokemon[] pokemons)
	{
		this.pokemons=pokemons;
	}
	public Pokemon[] getPokemons()
	{
		return pokemons;
	}
	public void setLevel(int level)
	{
		this.level=level;
	}
	public int getLevel()
	{
		return level;
	}
}
