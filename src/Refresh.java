import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {
	protected Refresh(){
    }
    @Override
    protected void 	applySelfEffects(Pokemon p){
        Status Sta = p.getCondition();
        if (Sta.equals(Status.BURN) || Sta.equals(Status.POISON) || Sta.equals(Status.PARALYZE)) {
        	 p.restore();
        }
    }
}
