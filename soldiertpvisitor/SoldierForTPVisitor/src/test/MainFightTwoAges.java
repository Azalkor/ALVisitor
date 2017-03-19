/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package test;

import soldier.ages.AgeFutureFactory;
import soldier.ages.AgeMiddleFactory;
import soldier.core.AgeAbstractFactory;
import soldier.core.DisplayAttackEquipmentVisitor;
import soldier.core.Unit;
import soldier.core.UnitCounterVisitor;
import soldier.core.UnitGroup;

public class MainFightTwoAges {

	public static Unit createTeam(AgeAbstractFactory fact, String prefix)  {
		UnitGroup sg = new UnitGroup(prefix + "Animals");
		UnitGroup bl  = new UnitGroup(prefix + "Worms");
		bl.addUnit(fact.infantryUnit(prefix + "nicky"));
		bl.addUnit(fact.infantryUnit(prefix + "tomy"));
		sg.addUnit(bl);
		bl.addEquipment(fact.attackWeapon());
		bl.addEquipment(fact.defenseWeapon());
		bl.addEquipment(fact.attackWeapon());
		UnitGroup pig = new UnitGroup(prefix + "Pigs");
		pig.addUnit(fact.riderUnit(prefix + "jenny"));
		pig.addUnit(fact.riderUnit(prefix + "kenny"));
		sg.addUnit(pig);
		pig.addEquipment(fact.defenseWeapon());
		pig.addEquipment(fact.defenseWeapon());
		pig.addEquipment(fact.attackWeapon());
		return sg;
	}
	
	public static void main(String[] args) {
		UnitCounterVisitor counter = new UnitCounterVisitor();
		DisplayAttackEquipmentVisitor displayAtk = new DisplayAttackEquipmentVisitor();
		AgeAbstractFactory age1 = new AgeMiddleFactory();
		AgeAbstractFactory age2 = new AgeFutureFactory();

		Unit team1 = createTeam(age1, "Team1::"); 
		counter.visit((UnitGroup)team1);
		int tmp = counter.getCount();
		counter.clear();
		System.out.println("team1 est composée de "+tmp+" unités");
		Unit team2 = createTeam(age2, "Team2::"); 
		counter.visit((UnitGroup)team2);
		tmp=counter.getCount();
		System.out.println("team2 est composée de "+tmp+" unités");
		displayAtk.visit((UnitGroup)team1);
		

		int round = 0;
		while(team1.alive() && team2.alive()) {
			System.out.println("Round  #" + round++);
			float st1 = team1.strike();
			System.out.println(team1.getName() + " attack with force : " + st1);
			team2.parry(st1);
			float st2 = team2.strike();
			System.out.println(team2.getName() + " attack with force : " + st2);
			team1.parry(st2);
		}
		System.out.println("The end ... " + (team1.alive() ? team1.getName() : team2.getName()) + " won." );
	}

}