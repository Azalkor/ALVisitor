package soldier.core;

import java.util.Iterator;

public class UnitCounterVisitor implements Visitor{

	private int count=0;
	
	public int getCount(){
		return count;
	}
	
	public void clear(){
		count=0;
	}
		
	@Override
	public void visit(UnitRider u) {
		count++;
	}

	@Override
	public void visit(UnitInfantry u) {
		count++;
	}

	@Override
	public void visit(UnitGroup u) {
		Iterator<Unit> i = u.subUnits();
		while(i.hasNext()){
			Unit tmp = i.next();
			tmp.accept(this);
		}
	}

	@Override
	public void visit(EquipmentAttack e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void visit(EquipmentDefense e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(EquipmentToy e) {
		// TODO Auto-generated method stub
		
	}

}
