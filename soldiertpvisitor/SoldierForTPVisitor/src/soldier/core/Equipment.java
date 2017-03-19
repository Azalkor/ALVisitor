/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

public interface Equipment extends Cloneable {
	String getName();

	BehaviorSoldier createExtension(BehaviorSoldier s);

	void accept(Visitor v);

	Equipment clone();
}
