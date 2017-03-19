/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

public abstract class EquipmentToy extends EquipmentAbstract {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
