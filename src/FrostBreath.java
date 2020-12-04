import ru.ifmo.se.pokemon.*;

public class FrostBreath extends PhysicalMove {

	public FrostBreath() {
		super(Type.ICE, 60, 90);
	}
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
       return 1.5;
    }

}
