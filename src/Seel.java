import ru.ifmo.se.pokemon.*;
public class Seel extends Pokemon{
	public Seel (String name, int level)
	{
		super(name, level);
		setStats(65, 45, 55, 45, 70, 45);
		setType(Type.WATER);
		setMove(new SmartStrike(), new AquaJet(), new IcyWind());
	}
}

