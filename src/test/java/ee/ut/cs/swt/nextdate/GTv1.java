package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testRunWithPositiveAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 0, 10);
	    nextDate0.run(0, (-2686), 10);
	    nextDate0.run((-174), (-174), (-174));
	    String string0 = nextDate0.run((-2686), 1641, (-249));
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(2, 6, 1916);
	    assertEquals("2/7/1916", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndRunWithNegativeAndRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(3812, 3812, 3812);
	    nextDate0.run((-1614), 11, 0);
	    nextDate0.run(11, 861, 0);
	    nextDate0.run(494, 0, 11);
	    nextDate0.run((-1478), 494, 3);
	    nextDate0.run(11, 256, 0);
	    nextDate0.run(4430, 861, 0);
	    String string0 = nextDate0.run((-2579), 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    nextDate0.run((-560), 84, 4);
	    nextDate0.run((-560), 0, 0);
	    nextDate0.run(0, 84, 0);
	    nextDate0.run(0, 0, (-1079));
	    String string0 = nextDate0.run((-527), 0, 31);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    nextDate0.run(12, 12, 12);
	    nextDate0.run(12, 12, 2007);
	    String string0 = nextDate0.run(2007, 2007, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZeroAndRunWithZeroAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run(732, 2, (-3492));
	    nextDate0.run((-1994), 0, 0);
	    nextDate0.run((-1994), 6, 856);
	    nextDate0.run(1581, 6, 856);
	    nextDate0.run(1, (-3492), 11);
	    nextDate0.run(11, (-525), 11);
	    nextDate0.run(0, (-1), 0);
	    nextDate0.run(11, 0, 1);
	    nextDate0.run((-1), 31, 0);
	    nextDate0.run((-1994), 1847, 814);
	    nextDate0.run((-1141), 0, 31);
	    String string1 = nextDate0.run((-1994), (-3492), 1347);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(2, 30, 1802);
	    nextDate0.run(6, 30, 1941);
	    nextDate0.run(6, 1040, 30);
	    String string1 = nextDate0.run((-290), 1941, (-1859));
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(470, 470, 1801);
	    nextDate0.run(1446, 1446, 1086);
	    nextDate0.run(1446, 1446, 1801);
	    nextDate0.run((-2548), 1446, 1);
	    nextDate0.run(11, 888, 2899);
	    NextDate nextDate1 = new NextDate(0, 2899, 888);
	    nextDate1.run((-912), 1560, 1560);
	    nextDate1.run((-789), 3454, 5420);
	    nextDate1.run(30, 700, (-417));
	    nextDate1.run((-4358), 1801, 700);
	    String string0 = nextDate0.run(3005, 470, 3454);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRun0() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    String string0 = nextDate0.run(2, 29, 1824);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegative2() throws Throwable {
	    NextDate nextDate0 = new NextDate(344, 470, 470);
	    nextDate0.run((-174), 1801, 748);
	    nextDate0.run(2305, (-174), 2305);
	    nextDate0.run((-1), (-947), (-912));
	    nextDate0.run((-912), 470, 470);
	    nextDate0.run(748, 654, (-673));
	    nextDate0.run(748, (-2537), 2305);
	    nextDate0.run(4, 748, 1);
	    nextDate0.run((-673), (-1), 535);
	    String string0 = nextDate0.run(11, 748, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    nextDate0.run(6, 28, 31);
	    String string0 = nextDate0.run(6, 6, 6);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run((-2735), 31, 6);
	    nextDate0.run(2005, 1909, 6);
	    nextDate0.run(1909, (-11), 1909);
	    String string1 = nextDate0.run(6, 31, 2021);
	    assertEquals("Invalid Input Date", string1);
	    nextDate0.run((-2735), 31, (-2735));
	    nextDate0.run(361, 2376, (-1));
	    String string2 = nextDate0.run(31, 4104, 2021);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    nextDate0.run((-182), 6, 6);
	    nextDate0.run(6, 748, 1641);
	    nextDate0.run((-182), 748, (-182));
	    nextDate0.run(6, 748, 748);
	    nextDate0.run(6, (-2677), (-1));
	    nextDate0.run((-182), 4604, 1022);
	    String string0 = nextDate0.run(6, 9, 2021);
	    assertEquals("6/10/2021", string0);
	    nextDate0.run(9, (-182), (-1368));
	    nextDate0.run(2305, 1641, 3001);
	    nextDate0.run(3001, 6, 1231);
	    nextDate0.run((-1337), 748, 6);
	    nextDate0.run(2, (-1624), (-1368));
	    String string1 = nextDate0.run(2, 2, 1801);
	    assertEquals("2/3/1801", string1);
	    String string2 = nextDate0.run(2, (-1624), 6);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRun1() throws Throwable {
	    NextDate nextDate0 = new NextDate(329, 329, 329);
	    String string0 = nextDate0.run(7, 31, 2018);
	    assertEquals("7/31/2018", string0);
	}

	@Test(timeout = 4000)
	public void testRun2() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(12, 31, 2007);
	    assertEquals("12/32/2007", string1);
	}

	@Test(timeout = 4000)
	public void testRun3() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 1802);
	    assertEquals("3/1/1802", string0);
	}

	@Test(timeout = 4000)
	public void testRun4() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(2, 30, 1833);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void test() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1086), (-1086), (-1086));
	}

	@Test(timeout = 4000)
	public void testRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    String string0 = nextDate0.run(2, 29, 1824);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1833);
	    assertEquals("8/9/1833", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1841);
	    assertEquals("4/5/1841", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(6, 30, 1963);
	    assertEquals("7/1/1963", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1881);
	    assertEquals("7/7/1881", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 31, 1888);
	    assertEquals("2/1/1888", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1824);
	    assertEquals("9/10/1824", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 31, 2007);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithZero1() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, (-1), (-1));
	    nextDate0.run((-174), 1576, 6);
	    nextDate0.run(6, 2305, 1641);
	    nextDate0.run((-174), 0, (-174));
	    nextDate0.run((-1), 748, 748);
	    nextDate0.run(1576, (-2677), (-1));
	    nextDate0.run((-174), 5684, 1022);
	    String string0 = nextDate0.run(6, 2, 2021);
	    assertEquals("6/3/2021", string0);
	    nextDate0.run(2, (-174), (-1368));
	    String string1 = nextDate0.run(2305, 1641, 3001);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1834);
	    assertEquals("1/2/1834", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithZero0() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    nextDate0.run((-182), 1576, 6);
	    nextDate0.run(6, 748, 1641);
	    nextDate0.run((-182), 0, (-182));
	    nextDate0.run(6, 748, 748);
	    nextDate0.run(1576, (-2677), (-1));
	    nextDate0.run((-182), 5684, 1022);
	    nextDate0.run(6, 9, 2021);
	    nextDate0.run(9, (-182), (-1368));
	    nextDate0.run(2305, 1641, 3001);
	    nextDate0.run(3001, 6, 1231);
	    nextDate0.run((-1337), 748, 6);
	    nextDate0.run(2, (-1624), (-1368));
	    nextDate0.run(5, 2, 1801);
	    String string0 = nextDate0.run(2, (-1624), 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 2014);
	    assertEquals("12/13/2014", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 1833, 1833);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1833);
	    assertEquals("10/11/1833", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1134), (-1134), (-1134));
	    String string0 = nextDate0.run((-1134), (-1134), (-1134));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1843);
	    assertEquals("3/4/1843", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive17() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 4214);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1824);
	    assertEquals("2/3/1824", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive18() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 10);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1833);
	    assertEquals("5/6/1833", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(11, 1014, 4);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(4, 16, 2021);
	    assertEquals("4/17/2021", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 2007);
	    assertEquals("6/7/2007", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1833);
	    assertEquals("11/12/1833", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(6, 30, 1963);
	    assertEquals("7/1/1963", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run((-3995), 10, 10);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    nextDate0.run((-560), 84, 4);
	    nextDate0.run((-560), 0, 0);
	    nextDate0.run(0, 84, 0);
	    nextDate0.run(0, 0, (-1079));
	    String string0 = nextDate0.run((-527), 0, 31);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegative2() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, (-21), 10);
	    nextDate0.run((-21), (-2686), 10);
	    nextDate0.run((-174), (-174), (-174));
	    String string0 = nextDate0.run((-2686), 1641, (-249));
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(10, 6, 1916);
	    assertEquals("10/7/1916", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithPositiveAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(16, 16, 16);
	    nextDate0.run(11, 16, 2021);
	    String string0 = nextDate0.run(28, (-130), 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 12);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run(732, 12, (-3492));
	    nextDate0.run((-1994), 0, 0);
	    nextDate0.run((-1994), 6, 856);
	    nextDate0.run(1581, 6, 856);
	    nextDate0.run(1, (-3492), 11);
	    nextDate0.run(11, (-525), 11);
	    nextDate0.run(0, (-1), 0);
	    nextDate0.run(11, 0, 1);
	    nextDate0.run((-1), 31, 0);
	    nextDate0.run((-1994), 1847, 814);
	    nextDate0.run((-1141), 0, 31);
	    nextDate0.run((-1994), (-3492), 1347);
	    String string1 = nextDate0.run(1940, (-525), 1225);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegative3() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, (-1), (-1));
	    nextDate0.run((-174), 1576, 6);
	    nextDate0.run((-174), (-1), (-174));
	    nextDate0.run(1576, 6, 1576);
	    String string0 = nextDate0.run(6, 2, 2021);
	    assertEquals("6/3/2021", string0);
	    String string1 = nextDate0.run(1641, 29, 1641);
	    assertEquals("invalid Input Date", string1);
	    String string2 = nextDate0.run(3, 6, 2021);
	    assertEquals("3/7/2021", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndPositive19() throws Throwable {
	    NextDate nextDate0 = new NextDate(1701, 1701, 1701);
	    String string0 = nextDate0.run(1701, 1701, 1701);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    nextDate0.run(6, 28, 31);
	    String string0 = nextDate0.run(6, 6, 6);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run((-2735), 31, 6);
	    nextDate0.run(2005, 1909, 6);
	    nextDate0.run(1909, (-11), 1909);
	    String string1 = nextDate0.run(1, 31, 2021);
	    assertEquals("2/1/2021", string1);
	    nextDate0.run(0, 28, 6);
	    NextDate nextDate1 = new NextDate(28, 28, 8);
	    nextDate1.run(1801, (-1666), 28);
	    NextDate nextDate2 = new NextDate(2005, 1641, (-1368));
	    nextDate2.run(13, 1801, 0);
	    String string2 = nextDate0.run(28, 2021, 28);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    nextDate0.run(5, 28, 31);
	    nextDate0.run(5, 5, 5);
	    nextDate0.run((-2735), 31, 5);
	    nextDate0.run(2005, 1909, 5);
	    nextDate0.run(1909, (-11), 1909);
	    nextDate0.run(5, 31, 2007);
	    nextDate0.run(8, 28, 1909);
	    String string0 = nextDate0.run((-2735), 2987, (-4832));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    nextDate0.run(6, 28, 31);
	    String string0 = nextDate0.run(6, 6, 6);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run((-2735), 31, 6);
	    nextDate0.run(2005, 1915, 6);
	    nextDate0.run(1915, (-11), 1915);
	    String string1 = nextDate0.run(1, 31, 2021);
	    assertEquals("2/1/2021", string1);
	    nextDate0.run((-515), (-515), (-11));
	    nextDate0.run((-169), 6, (-1));
	    String string2 = nextDate0.run(5, 31, 2005);
	    assertEquals("6/1/2005", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(27, 27, 27);
	    nextDate0.run(27, 27, 27);
	    nextDate0.run((-169), 2305, 1022);
	    String string0 = nextDate0.run(6, 9, 2021);
	    assertEquals("6/10/2021", string0);
	    String string1 = nextDate0.run(9, 28, 2021);
	    assertEquals("9/29/2021", string1);
	}

}