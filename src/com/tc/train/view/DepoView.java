package com.tc.train.view;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;

public class DepoView {

	public void print(Depo depo) {
		for (Train i : depo.getTrains()) {
			System.out.print(i);
		}
	}
	
	public void printKrasivoe(Depo depo) {
		for (Train i : depo.getTrains()) {
			System.out.print(i.toStringKrasivoe());
		}
	}
}
