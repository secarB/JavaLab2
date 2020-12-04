import ru.ifmo.se.pokemon.*;

public class SmartStrike extends PhysicalMove {

	public SmartStrike() {
		super(Type.STEEL, 70, 100);
	} 
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
}
	