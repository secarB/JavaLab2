import ru.ifmo.se.pokemon.*;

public class Alomomola extends Pokemon {
	
	public Alomomola (String name, int level)
	{
		super(name, level);
		setStats(165, 75, 80, 40, 45, 65);
		setType(Type.WATER);

		setMove(new Rest(), new Pound(), new Facade(), new Refresh());
	}

}