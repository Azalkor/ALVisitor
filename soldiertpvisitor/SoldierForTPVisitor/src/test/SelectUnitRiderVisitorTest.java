package test;

import static org.junit.Assert.*;

import org.junit.Test;

import soldier.ages.AgeMiddleFactory;
import soldier.core.AgeAbstractFactory;
import soldier.core.DisplayAttackEquipmentVisitor;
import soldier.core.SelectUnitRiderVisitor;
import soldier.core.UnitGroup;
import soldier.core.UnitRider;

public class SelectUnitRiderVisitorTest {

	@Test
	public void test() {
		AgeAbstractFactory age1 = new AgeMiddleFactory();
		SelectUnitRiderVisitor rVisitor = new SelectUnitRiderVisitor(10);


		UnitGroup team1 = new UnitGroup("Team1");
		team1.addUnit(age1.riderUnit("Team1:jenny"));
		team1.addUnit(age1.riderUnit("Team1:kenny"));
		System.out.println(team1.getHealthPoints());
		rVisitor.visit(team1);
		assertEquals("Team1:jennyTeam1:kenny",rVisitor.getResult());
		team1.parry(25);
		rVisitor.reset();
		rVisitor.visit(team1);
		assertEquals("",rVisitor.getResult());
		}

}
