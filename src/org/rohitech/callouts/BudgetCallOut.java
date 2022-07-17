package org.rohitech.callouts;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.CLogger;

public class BudgetCallOut implements IColumnCallout {
	
	CLogger log = CLogger.getCLogger(BudgetCallOut.class);
	
	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub
		
		// CAMPO Amount
		// log.warning("VALOR DEL AMOUNT:" + value);
		
		BigDecimal valor = (BigDecimal) value;
		BigDecimal campo1 = (BigDecimal) mTab.getValue("campo1");
		
		if(valor.doubleValue() <= 0.00)
		{
			return "El valor de este campo no puede ser negativo";
		}
		else
		{
			mTab.setValue("campo2", valor.add(campo1));
			
			return null;
		}
	}
}
