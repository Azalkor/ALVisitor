package soldier.core;

public class SelectUnitRiderVisitor implements Visitor{

	private int seuilHP;
	
	public SelectUnitRiderVisitor(int seuil) {
		seuilHP=seuil;
	}
	
	@Override
	public void visit(UnitRider u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(UnitInfantry u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(UnitGroup u) {
		// TODO Auto-generated method stub
		
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
