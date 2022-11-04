package com.tc.train.logic;

import java.util.List;
import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;

public class DepoLogic {
	public List<Train> sortByNumber (Depo depo){
		boolean flag = false;
		while (!flag) {
			flag = true;
			for (int i = 0; i < depo.getTrains().size()-1; i++) {
				if (depo.getTrains().get(i+1).getNumber()<depo.getTrains().get(i).getNumber()) {
					Train temp = new Train();
					temp = depo.getTrains().get(i);
					depo.getTrains().set(i, depo.getTrains().get(i+1));
					depo.getTrains().set(i+1, temp);
						flag = false;
				}
			}
		}
		return null;
	}
	
	public void sortByDepartureAndTime(Depo depo){
		boolean flag = false;
		while (!flag) {
			flag = true;
			for (int i = 0; i < depo.getTrains().size()-1; i++) {
				int sr;
				sr = depo.getTrains().get(i+1).getDepaturePlace().compareTo( depo.getTrains().get(i).getDepaturePlace() );
					if (sr < 0) {
					Train temp = new Train();
					temp = depo.getTrains().get(i);
					depo.getTrains().set(i, depo.getTrains().get(i+1));
					depo.getTrains().set(i+1, temp);
						flag = false;
					}
			}
		}
		
		flag = false;
		while (!flag) {
			flag = true;
			for (int j = 0; j < depo.getTrains().size()-1; j++) {
				int sr2;
				sr2 = depo.getTrains().get(j+1).getDepaturePlace().compareTo( depo.getTrains().get(j).getDepaturePlace() );
				if (sr2 == 0) {
					int sr3;
					sr3 = depo.getTrains().get(j+1).getDepatureTime().compareTo(depo.getTrains().get(j).getDepatureTime());
					if (sr3 < 0) {
						Train temp1 = new Train();
						temp1 = depo.getTrains().get(j);
						depo.getTrains().set(j, depo.getTrains().get(j+1));
						depo.getTrains().set(j+1, temp1);
						flag = false;
					}
				}
			}
		}
	}
	
	public String find (int number, Depo depo) {
		String s = "No eligible trains";
		Depo findNumDepo = new Depo();
		for (int i = 0; i < depo.getTrains().size(); i++) {
			if (number == depo.getTrains().get(i).getNumber()) {
				findNumDepo.addTrains(depo.getTrains().get(i));
				s = findNumDepo.toString();
			}
		}
			
		return s;
	}

		
	
}
