package ru.progwards.java2.lessons.recursion;

public class AsNumbersSum {
//
//	����������� �����, AsNumbersSum, ���������� �����
//	public static String asNumbersSum(int number), ������� ������������ �������� number,
//	��� ������������ ���������� ���������� ���� ����������� �����, ��������:
//	5 = 4+1 = 3+2 = 3+1+1 = 2+2+1 = 2+1+1+1 = 1+1+1+1+1
//
//	������ ������ ��������� ���������, ����������������� �����, ��� ������� � �������.
//	��������� ���������� �� �����������, ��������, ���� � ������ ��� ���� 3+2, �� 2+3 ��� ���� �� ������.
//	������ ������ ���� ������ ������� ��������, ����� ������������ ���������.
	
	public static String asNumbersSum(int number) {
		String str = String.valueOf(number);
		
		int a[] = new int[100];
		str = AsNumbersSum.getCombination( number, number-1, 0, a, str);

		return str;
		
	}
	public static String getCombination( int number, int rest, int incr, int[] a, String str) {
		  if (number < 0 ) return str;
		  if (number == 0 ) {
			 str = str + printCombinationStr(a, incr);
		    
		  } else {
		    if ( number - rest >= 0) {
		      a[incr] = rest; 
		      str =  getCombination(number - rest, rest, incr + 1, a, str);
		    }
		    
		    if ( rest - 1 > 0) { 
		    	str =  getCombination(number, rest - 1, incr, a, str);
		    }
		  }
		  return str;
		}
	
	public static String printCombinationStr(int[] a, int length) {
		
		StringBuffer sb = new StringBuffer(" = " + a[0]);
	    
		for (int i = 1; i < length; i++) {
		      sb.append("+" + a[i]);
		}
		sb.append(" ");
		
		return sb.toString();
	}
}
