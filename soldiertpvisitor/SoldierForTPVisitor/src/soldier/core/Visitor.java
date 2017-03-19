package soldier.core;

public interface Visitor {
	public void visit(UnitRider u);
	public void visit(UnitInfantry u);
	public void visit(UnitGroup u);
	public void visit(EquipmentAttack e);
	public void visit(EquipmentDefense e);
	public void visit(EquipmentToy e);
}
