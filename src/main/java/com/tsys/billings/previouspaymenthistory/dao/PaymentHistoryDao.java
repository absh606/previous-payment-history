package com.tsys.billings.previouspaymenthistory.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.tsys.billings.previouspaymenthistory.model.History;

@Repository
public class PaymentHistoryDao {

	/* mocking up the dao implementaion
	 * with Previous history records
	 * 
	*/
	public List<History> getHistories(String customerId,  String fromDate, String toDate, String limit, String offset) throws SQLException{
		List<History> histories = new ArrayList<History>();
		History history1  = new History("2001", "CC", "1001001001", "2021-05-05", "13:11:10.23436", "43.56", "Macy's");
		History history2  = new History("2002", "CC", "1001001001", "2021-05-11", "14:11:10.23436", "101.56", "Target");
		History history3  = new History("2003", "CC", "1001001001", "2021-05-10", "19:11:10.23436", "15.00", "MacDonald's");
		History history4  = new History("2004", "CC", "1001001001", "2021-05-17", "20:11:10.23436", "25.00", "Lowes");
		History history5  = new History("2005", "CC", "1001001001", "2021-06-21", "20:11:10.23436", "35.00", "HomeDepot");
		histories.add(history1);
		histories.add(history2);
		histories.add(history3);
		histories.add(history4);
		histories.add(history5);
		return histories;
	}
}
