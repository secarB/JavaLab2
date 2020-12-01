import ru.ifmo.se.pokemon.*;
public class Gloom extends Oddish {
	public Gloom (String name, int level)
	{
		super(name, level);
		setStats(60, 65, 70, 85, 75, 40);
		setType(Type.GRASS, Type.POISON);
		setMove(new Rest(), new EnergyBall(), new PoisonPowder());
	}
}