package org.rohitech.factories;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.rohitech.callouts.BudgetCallOut;

public class BudgetCallOutFactory implements IColumnCalloutFactory {

	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		// TODO Auto-generated method stub
		
		List<IColumnCallout> lista = new ArrayList<IColumnCallout>();
		
		if(tableName.equalsIgnoreCase("ni_budget_allocline") && columnName.equalsIgnoreCase("amount"))
			lista.add(new BudgetCallOut());
			
		return lista != null ? lista.toArray(new IColumnCallout[0]) : new IColumnCallout[0];
	}

}
