package ru.progwards.java2.lessons.recursion;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRunner {

	public static void main(String[] args) {

		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods("bla", "qq2qqq", 2, 123, "2018-01-11T21:12:00Z"));
		list.add(new Goods("Bla", "QW3ERT", 5, 123, "2019-01-11T21:12:00Z"));
		list.add(new Goods("abl", "AS4DFG", 12, 521, "2029-04-25T21:12:00Z"));
		list.add(new Goods("Abl", "ab7cde", 6, 521, "2020-11-15T21:12:00Z"));
		
		GoodsWithLambda gl = new GoodsWithLambda();
		gl.setGood(list);
		List<Goods> res  = gl.sortByName();
		res.forEach(System.out::println);
		res = gl.sortByNumber();
		System.out.println("sortByNumber");

		res.forEach(System.out::println);
		res = gl.sortByPartNumber();
		System.out.println("sortByPartNumber");
		res.forEach(System.out::println);
		res = gl.sortByAvailabilityAndNumber();
		System.out.println("sortByAvailabilityAndNumber");
		res.forEach(System.out::println);
		res = gl.expiredAfter(Instant.now());
		System.out.println("expiredAfter");
		
		res.forEach(System.out::println);

		res  = gl.ñountLess(7);
		System.out.println("Count");
		res.forEach(System.out::println);
		
		res  = gl.ñountBetween(3, 9);
		System.out.println("ñountBetween");
		res.forEach(System.out::println);
		
		System.out.println(AsNumbersSum.asNumbersSum(7));
		
		
		HanoiTower hanoi =  new HanoiTower(3, 0);
		hanoi.print();
		hanoi.move(0, 2);
	}

}
