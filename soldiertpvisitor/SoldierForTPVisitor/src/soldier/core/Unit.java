/**
 * D. Auber & P. Narbel
 * Solution TD Architecture Logicielle 2016 Universit� Bordeaux.
 */
package soldier.core;

import java.util.Iterator;
 
public interface Unit {
	/**
	 * Unit methods
	 */
	public String getName();
	public float getHealthPoints();
	public boolean alive();
	public void heal();
	public float parry(float force); 
	public float strike();

	/**
	 * Behavior extensions
	 */
	public void addEquipment(Equipment w);
	public void removeEquipment(Equipment w);
	public Iterator<Equipment> getEquipments();

	/**
	 * Composite methods
	 */
	public Iterator<Unit> subUnits();
	public void addUnit(Unit au);
	public void removeUnit(Unit au);

	/**
	 * Observable methods
	 */
	public void addObserver(UnitObserver ob);
	public void removeObserver(UnitObserver ob);
	public void notifyObservers();
	
	/**
	 * Visitor methods
	 */
	public void accept(Visitor visitor);
}
