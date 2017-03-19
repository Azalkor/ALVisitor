package soldier.core;

import java.util.ArrayList;
import java.util.Iterator;

public class SelectUnitRiderVisitor implements Visitor{
	private ArrayList<UnitRider> riders;
	private float seuilHP;
	String result = "";
	
	public SelectUnitRiderVisitor(int seuil) {
		seuilHP=seuil;
		riders=new ArrayList<UnitRider>();
	}
	
	public UnitRider[] getRiders(){
		UnitRider tmp[] = new UnitRider[riders.size()];
		riders.toArray(tmp);
		return tmp;
	}
	
	public String getResult(){
		UnitRider riders[] = this.getRiders();
		for (UnitRider rider : riders){
			result += rider.getName();
		}
		return result;
	}
	
	public void reset(){
		riders.clear();
		result = "";
	}
	
	@Override
	public void visit(UnitRider u) {
		if(u.getHealthPoints()>seuilHP){
			System.out.println("Ajoutée avec:" + u.getHealthPoints() + "HP");
			riders.add(u);
		}
	}

	@Override
	public void visit(UnitInfantry u) {
		// TODO Auto-generated method stub
		
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

