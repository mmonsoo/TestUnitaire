package com.mmonsoor.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mmonsoor.MyMaths;

public class MyMathsTests2 {

	@Test
	public void testAdd() {
		
		int a,b,res;
		a=5;
		b=5;
		res=a+b;
		assertTrue("a et b positif",MyMaths.add(a, b)==res);
		a=0;
		b=5;
		res=a+b;
		assertTrue("a nul",MyMaths.add(a, b)==res);
		a=5;
		b=0;
		res=a+b;
		assertTrue("b nul",MyMaths.add(a, b)==res);
		a=5;
		b=15;
		res=a+b;
		assertSame("a et b positifs",20,MyMaths.add(a, b));
		a=-5;
		b=5;
		res=a+b;
		assertTrue("a négatif et b positif",MyMaths.add(a, b)==res);
		a=5;
		b=-4;
		res=a+b;
		assertTrue("a positif et b négatif",MyMaths.add(a, b)==res);
		a=-5;
		b=-4;
		res=a+b;
		assertTrue("a négatif et b négatif",MyMaths.add(a, b)==res);
		a=0;
		b=0;
		res=a+b;
		assertTrue("a zéro et b zéro",MyMaths.add(a, b)==res);
		a=-5;
		b=0;
		res=a+b;
		assertTrue("a négatif et b zéro",MyMaths.add(a, b)==res);
		a=0;
		b=-10;
		res=a+b;
		assertTrue("a zéro et b négatif",MyMaths.add(a, b)==res);
	}

	@Test
	public void testSubstract() {
		int a,b,res;
		a=5;
		b=5;
		res=a-b;
		assertTrue("a et b positif",MyMaths.substract(a, b)==res);
		a=0;
		b=5;
		res=a-b;
		assertTrue("a nul",MyMaths.substract(a, b)==res);
		a=5;
		b=0;
		res=a-b;
		assertTrue("b nul",MyMaths.substract(a, b)==res);
		a=5;
		b=15;
		res=a-b;
		assertSame("a et b positifs",-10,MyMaths.substract(a, b));
		a=-5;
		b=5;
		res=a-b;
		assertTrue("a négatif et b positif",MyMaths.substract(a, b)==res);
		a=5;
		b=-4;
		res=a-b;
		assertTrue("a positif et b négatif",MyMaths.substract(a, b)==res);
		a=-5;
		b=-4;
		res=a-b;
		assertTrue("a négatif et b négatif",MyMaths.substract(a, b)==res);
		a=0;
		b=0;
		res=a-b;
		assertTrue("a zéro et b zéro",MyMaths.substract(a, b)==res);
		a=-5;
		b=0;
		res=a-b;
		assertTrue("a négatif et b zéro",MyMaths.substract(a, b)==res);
		a=0;
		b=-10;
		res=a-b;
		assertTrue("a zéro et b négatif",MyMaths.substract(a, b)==res);
	
	}

	@Test
	public void testMultiply() {
		int a,b,res;
		a=5;
		b=5;
		res=a*b;
		assertTrue("a et b positif",MyMaths.multiply(a, b)==res);
		a=0;
		b=5;
		res=a*b;
		assertTrue("a nul",MyMaths.multiply(a, b)==res);
		a=5;
		b=0;
		res=a*b;
		assertTrue("b nul",MyMaths.multiply(a, b)==res);
		a=5;
		b=15;
		res=a*b;
		assertSame("a et b positifs",75,MyMaths.multiply(a, b));
		a=-5;
		b=5;
		res=a*b;
		assertTrue("a négatif et b positif",MyMaths.multiply(a, b)==res);
		a=5;
		b=-4;
		res=a*b;
		assertTrue("a positif et b négatif",MyMaths.multiply(a, b)==res);
		a=-5;
		b=-4;
		res=a*b;
		assertTrue("a négatif et b négatif",MyMaths.multiply(a, b)==res);
		a=0;
		b=0;
		res=a*b;
		assertTrue("a zéro et b zéro",MyMaths.multiply(a, b)==res);
		a=-5;
		b=0;
		res=a*b;
		assertTrue("a négatif et b zéro",MyMaths.multiply(a, b)==res);
		a=0;
		b=-10;
		res=a*b;
		assertTrue("a zéro et b négatif",MyMaths.multiply(a, b)==res);
	}

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		int a,b,res;
		a=5;
		b=5;
		res=a/b;
		assertTrue("a et b positif",MyMaths.divide(a, b)==res);
		a=15;
		b=15;
		res=a/b;
		assertSame("a et b positifs",1,MyMaths.divide(a, b));
		a=-5;
		b=5;
		res=a/b;
		assertTrue("a négatif et b positif",MyMaths.divide(a, b)==res);
		a=5;
		b=-4;
		res=a/b;
		assertTrue("a positif et b négatif",MyMaths.divide(a, b)==res);
		a=-5;
		b=-4;
		res=a/b;
		assertTrue("a négatif et b négatif",MyMaths.divide(a, b)==res);
		a=5;
		b=0;
		res=a/b;
		assertTrue("a positif et b null",MyMaths.divide(a, b)==res);
		
	}

}
