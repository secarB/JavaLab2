import ru.ifmo.se.pokemon.*;
public class Oddish extends Pokemon {
	public Oddish (String name, int level)
	{
		super(name, level);
		setStats(45, 50, 50, 75, 65, 30);
		setType(Type.GRASS, Type.POISON);
		setMove(new Rest(), new EnergyBall());
	}
}
