package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testRunWithPositive20() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1912, 1912);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZeroAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(818, 818, 818);
	    String string0 = nextDate0.run(10, 628, 1857);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run(628, (-1), 818);
	    nextDate0.run(818, 0, 628);
	    String string1 = nextDate0.run(10, (-2358), 1857);
	    assertEquals("invalid Input Date", string1);
	    nextDate0.run((-2358), (-1), 11);
	    nextDate0.run(458, 11, 628);
	    nextDate0.run((-1107), (-764), (-475));
	    String string2 = nextDate0.run(10, 10, 1860);
	    assertEquals("10/11/1860", string2);
	    nextDate0.run(1857, 1860, (-2654));
	    nextDate0.run((-764), 2, 0);
	    String string3 = nextDate0.run(1857, (-1685), 15);
	    assertEquals("invalid Input Date", string3);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive21() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1912);
	    assertEquals("1/2/1912", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 618, 618);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive24() throws Throwable {
	    NextDate nextDate0 = new NextDate(1035, 1035, 1035);
	    String string0 = nextDate0.run(1035, 1035, 1035);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive22() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 6);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate() throws Throwable {
	    NextDate nextDate0 = new NextDate((-663), (-663), 162);
	    nextDate0.run(162, (-663), (-1179));
	    nextDate0.run((-634), 1230, 1230);
	    nextDate0.run(162, 0, 0);
	    nextDate0.run(162, 1, 0);
	    nextDate0.run(4006, 1, 0);
	    nextDate0.run(65, 65, 4006);
	    String string0 = nextDate0.run(1, 65, (-638));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive23() throws Throwable {
	    NextDate nextDate0 = new NextDate(1035, 1035, 1035);
	    String string0 = nextDate0.run(1035, 1035, 1035);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(407, 0, 0);
	    nextDate0.run(0, 0, 11);
	    nextDate0.run(0, 0, 0);
	    nextDate0.run(0, (-720), 0);
	    nextDate0.run((-197), 0, (-5730));
	    NextDate nextDate1 = new NextDate(11, 407, (-2376));
	    nextDate1.run(637, 520, 11);
	    nextDate0.run((-720), (-1633), 1);
	    String string0 = nextDate1.run(1, 12, 407);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run(637, 0, (-197));
	    nextDate0.run(12, 520, (-1));
	    nextDate1.run(11, (-2376), 407);
	    String string1 = nextDate0.run(165, 165, 0);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZeroAndRunWithNegativeAndRunWithZeroAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(818, 818, 818);
	    String string0 = nextDate0.run(10, 628, 1857);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run(628, (-1), 818);
	    nextDate0.run(818, 0, 628);
	    String string1 = nextDate0.run(10, (-2358), 1857);
	    assertEquals("invalid Input Date", string1);
	    nextDate0.run((-2358), (-1), 11);
	    nextDate0.run((-264), 818, (-1));
	    nextDate0.run(0, 0, 1056);
	    nextDate0.run(628, 29, 0);
	    nextDate0.run(29, 0, 939);
	    nextDate0.run(1165, (-1713), (-264));
	    nextDate0.run(0, 1165, (-2895));
	    nextDate0.run((-2889), 818, (-1));
	    String string2 = nextDate0.run((-1), (-1713), 10);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2372), (-2372), (-2372));
	    nextDate0.run(2, 30, 1906);
	    String string0 = nextDate0.run(8, (-2372), (-798));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive19() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 3137, 3137);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(781, 781, 781);
	    String string0 = nextDate0.run(7, 11, 2021);
	    assertEquals("7/11/2021", string0);
	    String string1 = nextDate0.run((-3014), 3693, (-2053));
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRun0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 1938);
	    assertEquals("1/1/1939", string0);
	    String string1 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string1);
	    String string2 = nextDate0.run(1938, 31, 2021);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithZero0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1289), (-1), (-1289));
	    nextDate0.run(3, (-4874), (-1387));
	    nextDate0.run((-459), (-1749), (-1387));
	    nextDate0.run((-1289), (-4874), (-667));
	    nextDate0.run((-459), 0, 2502);
	    nextDate0.run((-4874), (-3012), (-1289));
	    String string0 = nextDate0.run(12, 16, 1801);
	    assertEquals("12/17/1801", string0);
	    String string1 = nextDate0.run((-4874), 0, 12);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(581, 581, 581);
	    NextDate nextDate1 = new NextDate(581, 581, 31);
	    nextDate0.run(31, 1803, (-266));
	    String string0 = nextDate0.run(31, 1, 3649);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate1.run(10, 31, 1803);
	    assertEquals("11/1/1803", string1);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2372), (-2372), (-2372));
	    String string0 = nextDate0.run(2, 1906, 1906);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run((-2372), 1906, 1906);
	    String string1 = nextDate0.run(2, 28, 1906);
	    assertEquals("3/1/1906", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegativeAndRunWithNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(818, 818, 818);
	    nextDate0.run(818, 11, 818);
	    nextDate0.run(818, (-226), 818);
	    nextDate0.run(11, 2724, 11);
	    nextDate0.run(2724, (-2358), (-2358));
	    nextDate0.run(11, 28, 1932);
	    NextDate nextDate1 = new NextDate(818, (-2358), (-2358));
	    nextDate1.run(8, 11, 2021);
	    String string0 = nextDate0.run((-4989), (-4370), (-2358));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRun5() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    nextDate0.run(6, 30, 1912);
	    String string0 = nextDate0.run(6, 1912, 4);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRun1() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 4, 4);
	    String string0 = nextDate0.run(12, 30, 1803);
	    nextDate0.run(12, 31, 1803);
	    String string1 = nextDate0.run(1803, 4, 4835);
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithZero1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1312), (-1), (-1312));
	    nextDate0.run(3, (-4874), (-1387));
	    nextDate0.run((-412), (-1), 3);
	    nextDate0.run(1075, 0, 1932);
	    nextDate0.run((-1645), (-4273), (-4273));
	    String string0 = nextDate0.run(1, 3, (-1));
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(1, 4, 1801);
	    assertEquals("1/5/1801", string1);
	    NextDate nextDate1 = new NextDate(1075, 1, 3441);
	    nextDate1.run(3, (-1645), (-1));
	    NextDate nextDate2 = new NextDate(10, 1801, 1932);
	    nextDate2.run((-300), 3, 1);
	    String string2 = nextDate2.run((-1387), (-4874), 5);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithZero2() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1312), (-1), (-1312));
	    nextDate0.run((-1), 1801, (-1387));
	    nextDate0.run(3, (-4874), (-1387));
	    nextDate0.run((-459), (-1749), (-1387));
	    nextDate0.run((-1312), (-4874), 1);
	    nextDate0.run(549, (-4874), (-2192));
	    nextDate0.run((-459), 0, 2502);
	    nextDate0.run((-4874), (-3012), (-1312));
	    nextDate0.run(2503, 549, (-1553));
	    String string0 = nextDate0.run(5, 1, 1801);
	    assertEquals("5/2/1801", string0);
	    nextDate0.run((-2192), 687, 1801);
	    String string1 = nextDate0.run((-74), (-1387), (-452));
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRun2() throws Throwable {
	    NextDate nextDate0 = new NextDate(3457, 1902, (-1));
	    String string0 = nextDate0.run(9, 31, 1802);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRun3() throws Throwable {
	    NextDate nextDate0 = new NextDate(755, 755, 755);
	    nextDate0.run(755, 26, 755);
	    nextDate0.run(2, 26, 2021);
	    String string0 = nextDate0.run(2021, 26, 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndRunWithNegativeAndRunWithNegativeAndRunWithNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(818, 818, 818);
	    nextDate0.run(10, 628, 1857);
	    nextDate0.run(628, (-1), 818);
	    nextDate0.run(818, 10, 628);
	    String string0 = nextDate0.run(10, (-2358), 1857);
	    assertEquals("invalid Input Date", string0);
	    nextDate0.run(628, 18, 12);
	    nextDate0.run(1083, 708, 1857);
	    nextDate0.run((-1), 12, (-1));
	    NextDate nextDate1 = new NextDate(1083, 0, 2);
	    nextDate1.run((-1454), (-1), 3325);
	    nextDate1.run(1083, 8, (-1153));
	    NextDate nextDate2 = new NextDate(1860, 802, (-2358));
	    String string1 = nextDate2.run(12, 1857, 1801);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRun4() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4995), (-4995), (-4995));
	    String string0 = nextDate0.run(1072, 1072, 60);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(12, 12, 2021);
	    assertEquals("12/13/2021", string1);
	}

	@Test(timeout = 4000)
	public void test() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4995), (-4995), (-4995));
	}

	@Test(timeout = 4000)
	public void testRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 1938);
	    assertEquals("1/1/1939", string0);
	    String string1 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string1);
	    String string2 = nextDate0.run(1938, 31, 2021);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative0() throws Throwable {
	    NextDate nextDate0 = new NextDate(755, 755, 755);
	    nextDate0.run(755, 11, 755);
	    String string0 = nextDate0.run(8, 11, 2021);
	    assertEquals("8/12/2021", string0);
	    nextDate0.run(755, 8, 755);
	    String string1 = nextDate0.run(4, 8, 2021);
	    assertEquals("4/9/2021", string1);
	    String string2 = nextDate0.run((-1286), 1528, 4);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZeroAndRunWithNegativeAndRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(818, 818, 818);
	    nextDate0.run(10, 11, 10);
	    nextDate0.run(11, (-1), 818);
	    nextDate0.run(818, 0, 11);
	    nextDate0.run(10, (-2358), 11);
	    nextDate0.run((-2358), (-1), 11);
	    nextDate0.run(458, (-226), 458);
	    nextDate0.run(11, 2724, 3);
	    nextDate0.run(0, (-2358), 458);
	    nextDate0.run(11, 28, 1932);
	    NextDate nextDate1 = new NextDate((-396), (-2816), 628);
	    nextDate1.run((-799), 4835, 1);
	    String string0 = nextDate0.run(11, (-1), 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative1() throws Throwable {
	    NextDate nextDate0 = new NextDate(818, 818, 818);
	    nextDate0.run(18, 628, 1857);
	    nextDate0.run(628, (-1), 818);
	    nextDate0.run(818, 25, 628);
	    nextDate0.run(18, 628, 1857);
	    nextDate0.run(18, (-1), 11);
	    nextDate0.run(458, 11, 628);
	    String string0 = nextDate0.run(10, 18, 1860);
	    NextDate nextDate1 = new NextDate(628, 18, 458);
	    String string1 = nextDate1.run(1860, 25, 31);
	    assertFalse(string1.equals((Object) string0));
	}

	@Test(timeout = 4000)
	public void testRunWithPositiveAndNegative2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    NextDate nextDate1 = new NextDate((-218), 3288, 1912);
	    String string0 = nextDate1.run(3, 29, 1912);
	    assertEquals("3/30/1912", string0);
	    String string1 = nextDate0.run((-1), 2061, 1);
	    assertEquals("invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithZeroAndRunWithZeroAndRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(3939, 1, 3939);
	    nextDate0.run(1, 0, 9);
	    String string0 = nextDate0.run(9, 1, 3939);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string1);
	    nextDate0.run(0, 1, 1);
	    nextDate0.run(1, (-1581), 0);
	    nextDate0.run(9, 3939, 2);
	    nextDate0.run(0, 1, 1);
	    nextDate0.run(28, 2796, 2021);
	    String string2 = nextDate0.run(1, 984, 12);
	    assertEquals("invalid Input Date", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive9() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1983);
	    assertEquals("7/7/1983", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive8() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 2011);
	    assertEquals("6/7/2011", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4995), (-4995), (-4995));
	    String string0 = nextDate0.run((-4995), (-4995), (-4995));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunAndRunWithNegativeAndRunWithNegativeAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1269), (-1269), (-1269));
	    String string0 = nextDate0.run((-1269), (-1269), (-1269));
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(2, 29, 1802);
	    assertEquals("Invalid Input Date", string1);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-663), (-663), 162);
	    nextDate0.run(162, (-663), (-1179));
	    nextDate0.run((-634), 1230, 1230);
	    nextDate0.run(162, 0, 0);
	    nextDate0.run(162, 1, 0);
	    nextDate0.run(4006, 1, 0);
	    nextDate0.run(65, 65, 4006);
	    String string0 = nextDate0.run(1, 65, (-638));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive10() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 4, 1824);
	    assertEquals("4/5/1824", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive13() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 12, 1810);
	    assertEquals("12/13/1810", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive14() throws Throwable {
	    NextDate nextDate0 = new NextDate(755, 755, 755);
	    String string0 = nextDate0.run(755, 26, 755);
	    assertEquals("invalid Input Date", string0);
	    String string1 = nextDate0.run(2, 26, 2021);
	    assertEquals("2/27/2021", string1);
	    String string2 = nextDate0.run(6, 26, 2021);
	    assertEquals("6/27/2021", string2);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive11() throws Throwable {
	    NextDate nextDate0 = new NextDate(8, 8, 8);
	    String string0 = nextDate0.run(8, 8, 1888);
	    assertEquals("8/9/1888", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive12() throws Throwable {
	    NextDate nextDate0 = new NextDate(5, 5, 5);
	    String string0 = nextDate0.run(5, 5, 1934);
	    assertEquals("5/6/1934", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive17() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 10);
	    String string0 = nextDate0.run(10, 10, 1917);
	    assertEquals("10/11/1917", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive18() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 9, 1912);
	    assertEquals("9/10/1912", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive15() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(11, 11, 1912);
	    assertEquals("11/12/1912", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive16() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 2, 1938);
	    assertEquals("2/3/1938", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 31, 1943);
	    assertEquals("4/1/1943", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(12, 12, 12);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive3() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 31, 1822);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1964);
	    assertEquals("3/1/1964", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1957);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive4() throws Throwable {
	    NextDate nextDate0 = new NextDate(4, 4, 4);
	    String string0 = nextDate0.run(4, 30, 1831);
	    assertEquals("5/1/1831", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive7() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1917);
	    assertEquals("3/4/1917", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 31, 1943);
	    assertEquals("Invalid Input Date", string0);
	}

}