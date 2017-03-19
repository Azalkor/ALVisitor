package test;

import static org.junit.Assert.*;

import org.junit.Test;

import soldier.ages.AgeMiddleFactory;
import soldier.core.AgeAbstractFactory;
import soldier.core.DisplayAttackEquipmentVisitor;
import soldier.core.UnitGroup;

public class VisitorEquipementTest {

	@Test
	public void test() {
		AgeAbstractFactory age1 = new AgeMiddleFactory();
		DisplayAttackEquipmentVisitor displayAtk = new DisplayAttackEquipmentVisitor();


		UnitGroup team1 = (UnitGroup) MainFightTwoAges.createTeam(age1, "Team1:");
		displayAtk.visit(team1);
		assertEquals("SwordSwordSword", displayAtk.getResult());

	}

}
