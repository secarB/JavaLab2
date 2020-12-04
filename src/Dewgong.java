import ru.ifmo.se.pokemon.*;
public class Dewgong extends Seel{
	public Dewgong (String name, int level)
	{
		super(name, level);
		setStats(90, 70, 80, 70, 95, 70);
		setType(Type.WATER);
		setMove(new SmartStrike(), new AquaJet(), new IcyWind(), new FrostBreath());
	}
}

