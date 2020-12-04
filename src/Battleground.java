import ru.ifmo.se.pokemon.*;
public class Battleground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battle b = new Battle();
		Pokemon p1 = new Alomomola("P1", 1);
		Pokemon p2 = new Bellossom("P2", 1);
		Pokemon p3 = new Gloom("P3", 1);
		Pokemon p4 = new Seel("P4", 1);
		Pokemon p5 = new Dewgong("P5", 1);
		Pokemon p6 = new Oddish("P6", 1);
		b.addAlly(p1);
		b.addFoe(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addAlly(p5);
		b.addFoe(p6);
		b.go();
	}

}
