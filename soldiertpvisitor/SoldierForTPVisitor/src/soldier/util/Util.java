package soldier.util;

import java.util.Iterator;

import soldier.core.Unit;
import soldier.core.UnitGroup;
import soldier.core.UnitObserver;

public class Util {
	public static void propagerObserver(UnitGroup u, UnitObserver obs){
		Iterator<Unit>i =(Iterator<Unit>)u.subUnits();
		while(i.hasNext()){
			Unit tmp=i.next();
			if(tmp instanceof UnitGroup)
				propagerObserver((UnitGroup)tmp, obs);
			else
				tmp.addObserver(obs);
		}
	}
}
