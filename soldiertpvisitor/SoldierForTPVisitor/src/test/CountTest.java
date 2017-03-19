package test;

import static org.junit.Assert.*;

import org.junit.Test;

import soldier.ages.AgeMiddleFactory;
import soldier.core.AgeAbstractFactory;
import soldier.core.UnitCounterVisitor;
import soldier.core.UnitGroup;

public class CountTest {

	@Test
	public void test() {
		AgeAbstractFactory age1 = new AgeMiddleFactory();
		UnitCounterVisitor counter = new UnitCounterVisitor();

		
		UnitGroup team1 = (UnitGroup) MainFightTwoAges.createTeam(age1, "Team1:");
		counter.visit(team1);
		assertEquals(counter.getCount() , 4);
	}

}
