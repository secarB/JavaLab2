import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove  {
	public EnergyBall(){
		super(Type.GRASS, 90, 100);
	}
	@Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) damage);
    }
	@Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() <= 0.1){
            p.setMod(Stat.SPECIAL_DEFENSE,(int) -1);
        }
    }
}
