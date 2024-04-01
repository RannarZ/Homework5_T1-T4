package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testRunWithPositive20() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 2015);
	    assertEquals("2/3/2015", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-192), (-192), (-192));
	    NextDate nextDate1 = new NextDate((-192), (-192), (-192));
	    nextDate1.run(1813, (-192), 2173);
	    String string0 = nextDate0.run((-192), (-192), 1813);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(4, 30, 1813);
	    assertEquals("5/1/1813", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive21() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 2020);
	    assertEquals("6/7/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate((-203), (-203), (-203));
	    String string0 = nextDate0.run(8, 29, 1896);
	    assertEquals("8/30/1896", string0);
	    nextDate0.run((-2904), 31, 8);
	    nextDate0.run(28, 443, 28);
	    nextDate0.run(0, (-714), 28);
	    String string1 = nextDate0.run(31, (-1), (-203));
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive24() throws Throwable {
	    NextDate nextDate0 = new NextDate(657, 657, 657);
	    String string0 = nextDate0.run(657, 657, 657);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive22() throws Throwable {
	    NextDate nextDate0 = new NextDate(2270, 6, 2270);
	    String string0 = nextDate0.run(6, 2270, 2270);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate() throws Throwable {
	    NextDate nextDate0 = new NextDate((-778), (-489), (-1));
	    nextDate0.run(0, 0, 0);
	    nextDate0.run((-66), 3910, (-489));
	    String string0 = nextDate0.run(2322, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive23() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive19() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1986);
	    assertEquals("9/10/1986", string0);
	}

	@Test(timeout = 4000)
	public void testRun0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-1), (-1));
	    String string0 = nextDate0.run(12, 31, 2020);
	    assertEquals("1/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithZero0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-3410), (-3410), (-3410));
	    nextDate0.run((-3410), (-523), (-3410));
	    NextDate nextDate1 = new NextDate((-523), 6, (-523));
	    nextDate0.run(6, 0, 4);
	    nextDate1.run(4, (-523), 1809);
	    String string0 = nextDate1.run(3, 3, 1809);
	    assertEquals("3/4/1809", string0);
	    NextDate nextDate2 = new NextDate((-1400), 198, 8);
	    nextDate2.run((-14), (-423), (-743));
	    String string1 = nextDate2.run(628, 1, 3);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRun5() throws Throwable {
	    NextDate nextDate0 = new NextDate((-192), (-227), (-227));
	    String string0 = nextDate0.run(2, 31, 1813);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRun6() throws Throwable {
	    NextDate nextDate0 = new NextDate((-200), (-200), (-200));
	    String string0 = nextDate0.run(2, 29, 1869);
	    assertEquals("Invalid Input Date", string0);
	    String string1 = nextDate0.run(29, 10, 1869);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRun7() throws Throwable {
	    NextDate nextDate0 = new NextDate((-387), (-387), (-387));
	    String string0 = nextDate0.run(7, 7, 1813);
	    assertEquals("7/7/1813", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithZero1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-3410), (-3410), (-3410));
	    nextDate0.run((-3410), (-1201), (-3410));
	    NextDate nextDate1 = new NextDate((-1201), 6, (-1201));
	    String string0 = nextDate0.run(4, 9, 6);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run((-1201), 0, 1809);
	    nextDate0.run(4, 8, (-3759));
	    nextDate1.run(1809, 0, 1711);
	    nextDate0.run((-1201), 0, 8);
	    String string1 = nextDate0.run(6, 1, 1809);
	    assertEquals("6/2/1809", string1);
	    nextDate1.run(2156, 1, (-1));
	    nextDate0.run((-1), (-3759), (-1354));
	    String string2 = nextDate0.run(4, 4, 1809);
	    assertEquals("4/5/1809", string2);
	}

	@Test(timeout = 4000)
	public void testRun1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-372), (-372), (-372));
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRun2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1488, 1488, 1488);
	    String string0 = nextDate0.run(2, 28, 1802);
	    assertEquals("3/1/1802", string0);
	}

	@Test(timeout = 4000)
	public void testRun3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1481, 1481, 1481);
	    String string0 = nextDate0.run(2, 28, 1824);
	    assertEquals("2/29/1824", string0);
	}

	@Test(timeout = 4000)
	public void testRun4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1526, 1526, 1526);
	    nextDate0.run(1862, 1526, 1862);
	    String string0 = nextDate0.run(4, 31, 1862);
	    String string1 = nextDate0.run(1625, 512, 2233);
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void test() throws Throwable {
	    NextDate nextDate0 = new NextDate(628, 628, 628);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZero2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1727, 0);
	    nextDate0.run((-601), 0, 1727);
	    nextDate0.run((-906), (-100), (-906));
	    nextDate0.run(2030, 1, 1727);
	    nextDate0.run(0, 0, (-906));
	    nextDate0.run(8, 0, 0);
	    nextDate0.run(2030, (-100), 1727);
	    nextDate0.run(1370, 0, 1);
	    nextDate0.run(1264, 1370, 0);
	    String string0 = nextDate0.run(0, (-2175), (-561));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZero1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1201), 5, 428);
	    nextDate0.run(551, 551, 1022);
	    nextDate0.run(5, 606, (-1201));
	    nextDate0.run(1139, 3, 0);
	    nextDate0.run(606, 1139, 3);
	    nextDate0.run(0, 0, 606);
	    nextDate0.run(1273, (-1201), 551);
	    String string0 = nextDate0.run((-1201), 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate((-3410), (-3410), (-3410));
	    nextDate0.run((-3410), (-1201), (-3410));
	    NextDate nextDate1 = new NextDate((-1201), 6, (-1201));
	    nextDate0.run(4, 9, 6);
	    nextDate0.run((-1201), 0, 1809);
	    nextDate0.run(4, 0, 865);
	    String string0 = nextDate1.run(9, 3, 1809);
	    nextDate1.run(3696, (-2077), 1);
	    nextDate0.run(0, 3696, 3696);
	    nextDate0.run((-253), 9, (-2199));
	    String string1 = nextDate1.run((-2077), (-3410), 2885);
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZero0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-1958), (-1));
	    nextDate0.run((-1958), 2479, 0);
	    nextDate0.run((-1341), 1532, (-666));
	    nextDate0.run(2479, 2479, 0);
	    nextDate0.run(2479, 5, (-1008));
	    nextDate0.run(5, (-1958), (-1008));
	    nextDate0.run(5, 1532, 2479);
	    nextDate0.run(0, 0, 801);
	    nextDate0.run((-941), (-1), (-328));
	    String string0 = nextDate0.run((-666), 0, (-107));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1), (-1), (-1));
	    String string0 = nextDate0.run(12, 31, 2020);
	    assertEquals("1/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1512, 1512, 1862);
	    String string0 = nextDate0.run(5, 31, 1862);
	    assertEquals("6/1/1862", string0);
	    nextDate0.run(1512, 31, (-481));
	    nextDate0.run((-1442), (-3952), 24);
	    nextDate0.run(28, (-1949), 24);
	    nextDate0.run(1801, 1, (-1410));
	    String string1 = nextDate0.run(1923, 2007, 677);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-222), (-222), (-222));
	    nextDate0.run((-14), (-14), (-395));
	    nextDate0.run(5, 400, (-395));
	    nextDate0.run((-14), 1666, 1666);
	    String string0 = nextDate0.run(5, 5, 2021);
	    assertEquals("5/6/2021", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative2() throws Throwable {
	    NextDate nextDate0 = new NextDate((-3398), (-3398), (-3398));
	    nextDate0.run((-3398), (-1201), (-3398));
	    NextDate nextDate1 = new NextDate(31, (-5838), 865);
	    nextDate1.run((-1201), 865, 3);
	    nextDate1.run(535, 1809, 1809);
	    nextDate1.run((-3450), (-1173), 3);
	    String string0 = nextDate0.run(5, 1809, 1801);
	    assertEquals("invalid Input Date", string0);
	    NextDate nextDate2 = new NextDate(535, 865, 3124);
	    String string1 = nextDate0.run(1, 535, (-1152));
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, (-2378), (-2378));
	    String string0 = nextDate0.run(10, 9, 1863);
	    assertEquals("10/10/1863", string0);
	    NextDate nextDate1 = new NextDate((-730), (-2378), 1863);
	    String string1 = nextDate0.run((-1201), (-3397), (-730));
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative4() throws Throwable {
	    NextDate nextDate0 = new NextDate((-192), (-192), (-192));
	    nextDate0.run((-15), (-15), (-395));
	    NextDate nextDate1 = new NextDate((-192), (-192), (-2524));
	    nextDate0.run(11, 400, (-395));
	    nextDate0.run((-15), (-2524), (-2524));
	    String string0 = nextDate0.run(11, 11, 2007);
	    assertEquals("11/12/2007", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 2015);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 31, 2020);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(400, 400, 400);
	    String string0 = nextDate0.run((-2876), 400, (-2876));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegativeAndRunWithNegativeAndRunWithZero0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1061, 1);
	    nextDate0.run(1061, 1061, 1061);
	    nextDate0.run(1, (-842), 1061);
	    nextDate0.run(0, 1, 1);
	    nextDate0.run(1, 1, 1886);
	    nextDate0.run((-842), (-842), 1886);
	    nextDate0.run(29, (-842), 1886);
	    nextDate0.run(2275, 1, (-842));
	    nextDate0.run(215, 1, 1);
	    nextDate0.run(2021, (-842), (-2077));
	    nextDate0.run(1, 1061, 2021);
	    NextDate nextDate1 = new NextDate(1, 1, (-2137));
	    assertFalse(nextDate1.equals((Object) nextDate0));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    nextDate0.run(2, 29, 1801);
	    nextDate0.run(2, 29, 2000);
	    String string0 = nextDate0.run(1801, 29, 3774);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegativeAndRunWithNegativeAndRunWithZero1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1061, 1);
	    nextDate0.run(1061, 1061, 1061);
	    nextDate0.run(1, (-842), 1061);
	    nextDate0.run(0, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1886);
	    assertEquals("1/2/1886", string0);
	    nextDate0.run((-842), (-842), 1886);
	    nextDate0.run(29, (-842), 1886);
	    nextDate0.run(2275, 1, (-842));
	    nextDate0.run(215, 1, 1);
	    String string1 = nextDate0.run((-1149), (-1045), 1319);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-778), (-489), (-1));
	    nextDate0.run(0, 0, 0);
	    nextDate0.run((-66), 3910, (-489));
	    String string0 = nextDate0.run(2322, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1061, 1);
	    NextDate nextDate1 = new NextDate(4, 1061, 597);
	    nextDate0.run(568, 1809, (-34));
	    nextDate0.run((-1945), 1061, (-1));
	    nextDate0.run(1809, 9, 4);
	    NextDate nextDate2 = new NextDate(2, 1809, 1809);
	    nextDate1.run(6, 6, 400);
	    nextDate1.run(1809, 2021, 2233);
	    String string0 = nextDate0.run(1, 9, 1809);
	    String string1 = nextDate0.run(2021, 2, 1);
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1963);
	    assertEquals("5/6/1963", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1805);
	    assertEquals("12/13/1805", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(288, 288, 0);
	    nextDate0.run(0, 288, 0);
	    nextDate0.run(12, 0, 2886);
	    nextDate0.run((-2261), 0, 12);
	    nextDate0.run(0, 0, (-2261));
	    nextDate0.run(1885, 11, 1);
	    nextDate0.run(12, 2886, 12);
	    nextDate0.run((-3116), (-3116), 2886);
	    nextDate0.run((-3116), 12, 400);
	    nextDate0.run(288, 0, 2762);
	    nextDate0.run((-645), 0, 1253);
	    nextDate0.run(0, 2021, 400);
	    nextDate0.run(0, 590, 1);
	    String string0 = nextDate0.run(0, 1, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 2020);
	    assertEquals("3/4/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 31, 2020);
	    assertEquals("4/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1957);
	    assertEquals("11/12/1957", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-203), (-203), (-203));
	    nextDate0.run(1, 1, 1896);
	    String string0 = nextDate0.run(2, 1, 1896);
	    nextDate0.run(1723, 1813, 2);
	    String string1 = nextDate0.run((-94), 1723, 1813);
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void testRunWithPositive17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1997);
	    assertEquals("1/2/1997", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive18() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 2019);
	    assertEquals("10/11/2019", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 2020, 2020);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 2020);
	    assertEquals("4/5/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    String string0 = nextDate0.run(2, 29, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    nextDate0.run(2, 29, 1801);
	    nextDate0.run(2, 29, 2000);
	    String string0 = nextDate0.run(1801, 29, 3774);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1989);
	    assertEquals("7/7/1989", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2018);
	    assertEquals("1/1/2019", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegativeAndRunWithNegative2() throws Throwable {
	    NextDate nextDate0 = new NextDate((-192), (-192), (-192));
	    nextDate0.run((-15), (-15), (-395));
	    nextDate0.run((-192), (-192), (-395));
	    NextDate nextDate1 = new NextDate((-192), (-192), (-2521));
	    nextDate0.run(11, 400, (-395));
	    String string0 = nextDate0.run((-15), (-2521), (-163));
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate1.run(12, 29, 2007);
	    assertEquals("12/30/2007", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 31, 2020);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegativeAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1975), (-192), (-1975));
	    nextDate0.run(1896, (-2132), (-2132));
	    nextDate0.run((-1), 1, 31);
	    nextDate0.run((-2132), (-192), 1812);
	    nextDate0.run((-192), 1896, (-1));
	    String string0 = nextDate0.run(511, (-192), 3348);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(1, 31, 1812);
	    assertEquals("2/1/1812", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 30, 2020);
	    assertEquals("7/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegativeAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-203), (-203), (-203));
	    nextDate0.run(2, 29, 1896);
	    String string0 = nextDate0.run((-627), (-203), (-203));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(29, 29, 29);
	    String string0 = nextDate0.run(2, 29, 1808);
	    assertEquals("3/1/1808", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 2020);
	    assertEquals("8/9/2020", string0);
	}

}