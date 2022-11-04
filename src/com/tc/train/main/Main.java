package com.tc.train.main;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.tc.train.bean.Depo;
import com.tc.train.bean.Train;
import com.tc.train.logic.DepoLogic;
import com.tc.train.view.DepoView;
import com.tc.train.bean.Month;

public class Main {

	public static void main(String[] args) {
		Date d1 = new Date (2022-1900, Month.JANUARY, 5, 12, 15);
		Date d2 = new Date (2022-1900, Month.JANUARY, 6, 16, 34);
		Date d3 = new Date (2022-1900, Month.FEBRYARY, 2, 10, 14);
		Date d4 = new Date (2022-1900, Month.MARCH, 17, 10, 28);
		Date d5 = new Date (2022-1900, Month.APRIL, 10, 23, 8);
		Date d6 = new Date (2022-1900, Month.MAY, 15, 18, 26);
		Date d7 = new Date (2022-1900, Month.JULE, 12, 7, 49);
		
		Train b01 = new Train (11, "Brest", d1);
		Train b02 = new Train (18, "Gomel", d2);
		Train b03 = new Train (21, "Vitebsk", d3);
		Train b04 = new Train (43, "Mogilev", d4);
		Train b05 = new Train (54, "Brest", d5);
		Train b06 = new Train (11, "Mogilev", d6);
		Train b07 = new Train (11, "Brest",d7);
		
		Depo depo = new Depo();
		
		depo.addTrains(b01);
		depo.addTrains(b02);
		depo.addTrains(b03);
		depo.addTrains(b04);
		depo.addTrains(b05);
		depo.addTrains(b06);
		depo.addTrains(b07);
		
		DepoView view = new DepoView();
		DepoLogic logic = new DepoLogic();
		
		view.print(depo);
			System.out.println();
		view.printKrasivoe(depo);
			System.out.println();
		logic.sortByNumber(depo);
		logic.sortByDepartureAndTime(depo); 
		System.out.println(logic.find(11, depo)); // выводит список поездов с совпавшим номером (но не красиво ))
		view.printKrasivoe(logic.find(65, depo)); // если номер не совпал - выводит сообщение, что нет таких поездов
		view.printKrasivoe(depo);
		
		
	}

}
