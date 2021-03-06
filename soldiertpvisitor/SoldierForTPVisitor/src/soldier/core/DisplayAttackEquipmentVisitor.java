package soldier.core;

import java.util.Iterator;

public class DisplayAttackEquipmentVisitor implements Visitor{
	
	private String result = "";

	@Override
	public void visit(UnitRider u) {
		Iterator<Equipment> i = u.getEquipments();	
		while(i.hasNext()){
			Equipment tmp = i.next();
			tmp.accept(this);
		}
	}

	@Override
	public void visit(UnitInfantry u) {
		Iterator<Equipment> i = u.getEquipments();	
		while(i.hasNext()){
			Equipment tmp = i.next();
			tmp.accept(this);
		}		
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
		result+=(e.getName());
		System.out.println(e.getName());
	}
	
	public String getResult(){
		return result;
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
