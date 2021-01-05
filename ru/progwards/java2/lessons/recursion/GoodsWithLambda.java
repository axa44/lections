package ru.progwards.java2.lessons.recursion;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GoodsWithLambda {

	private List<Goods> goods;
	
	public void setGood(List<Goods> list)
{
		this.goods = list;
	}
	
	public List<Goods> sortByName()
	{
		this.goods.sort(Comparator.comparing(a -> a.getName()));
		return this.goods;
	}
	
	public List<Goods> sortByNumber()
	{
		this.goods.sort((a, b) -> a.getNumber().compareToIgnoreCase(b.getNumber()));
		return this.goods;
	}
	public List<Goods> sortByPartNumber()
	{
		this.goods.sort((a, b) -> a.getNumber().substring(0, 3).compareToIgnoreCase(b.getNumber().substring(0, 3)));
		return this.goods;
	}
	
	public List<Goods> sortByAvailabilityAndNumber()
	{
		
		this.goods.stream().sorted((a, b) -> a.getNumber().compareToIgnoreCase(b.getNumber())).sorted((a, b) -> Integer.compare( a.getAvailable(), b.getAvailable())).collect(Collectors.toList());
		return this.goods;
	}



	public List<Goods> expiredAfter(Instant date)
	{
		List<Goods>  list =  this.goods.stream().filter((x) -> x.getExpired().compareTo(date) == 1 ).collect(Collectors.toList());
		return list;
	}
	
	public List<Goods> ñountLess(int count)
	{
		List<Goods>  list =  this.goods.stream().filter(a -> (Integer.compare(a.getAvailable(),  count) == -1)).collect(Collectors.toList());
		return list;
	}
	
	public List<Goods> ñountBetween(int count1, int count2)
	{
		 Predicate<Goods> greater = x -> x.getAvailable() > count1;  
		 Predicate<Goods> below = x -> x.getAvailable() < count2; 
		 
		 List<Goods>  list = this.goods.stream().filter(greater.and(below)).collect(Collectors.toList());
		 return list;
	}
	
}
