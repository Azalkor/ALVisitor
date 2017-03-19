/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

public abstract class UnitInfantry extends UnitSimple {

	public UnitInfantry(String name, BehaviorSoldier behavior) {
		super(name, behavior);
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
