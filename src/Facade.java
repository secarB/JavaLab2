import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    protected Facade(){
        super(Type.NORMAL, 65, 1.00);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        Status Sta = def.getCondition();
        if (Sta.equals(Status.BURN) || Sta.equals(Status.POISON) || Sta.equals(Status.PARALYZE)) {
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
    }
}
