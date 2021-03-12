public class TestMyPoint {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main() {
		System.out.println("Running all MyPoint tests...");
		testConstructorWithoutParams();
		testConstructorWithParams();
		testGetX();
		testGetY();
		testSetX();
		testSetY();
		testSetXY();
		testToString();
		testDistanceTwoParams();
		testDistanceOneParam();
		testEquals();
		System.out.println("Done! \n");
	}

	public static void testConstructorWithoutParams() {
		MyPoint testPoint = new MyPoint();

		if (testPoint instanceof MyPoint) {
			System.out.println(ANSI_GREEN + "✓ Passed testConstructorWithoutParams" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testConstructorWithoutParams" + ANSI_RESET);
		}
	}

	public static void testConstructorWithParams() {
		MyPoint testPoint = new MyPoint(1, 2);

		if (testPoint instanceof MyPoint && testPoint.getX() == 1 && testPoint.getY() == 2) {
			System.out.println(ANSI_GREEN + "✓ Passed testConstructorWithParams" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testConstructorWithParams" + ANSI_RESET);
		}
	}

	public static void testGetX() {
		MyPoint testPoint = new MyPoint();

		int result = testPoint.getX();
		int expectedResult = 0;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetX" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetX" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testGetY() {
		MyPoint testPoint = new MyPoint();

		int result = testPoint.getY();
		int expectedResult = 0;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetY" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetY" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}
	
	public static void testSetX() {
		MyPoint testPoint = new MyPoint();

		testPoint.setX(1);

		int result = testPoint.getX();
		int expectedResult = 1;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testSetX" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testSetX" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testSetY() {
		MyPoint testPoint = new MyPoint();

		testPoint.setY(1);

		int result = testPoint.getY();
		int expectedResult = 1;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testSetY" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testSetY" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testSetXY() {
		MyPoint testPoint = new MyPoint();

		testPoint.setXY(1, 2);

		int result1 = testPoint.getX();
		int result2 = testPoint.getY();
		int expectedResult1 = 1;
		int expectedResult2 = 2;

		if (result1 == expectedResult1 && result2 == expectedResult2) {
			System.out.println(ANSI_GREEN + "✓ Passed testSetXY" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testSetXY" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult1 + " and " + expectedResult2 +
				"\n   Got: " + result1 + " and " + result2);
		}
	}

	public static void testToString() {
		MyPoint testPoint = new MyPoint();

		String result = testPoint.toString();
		String expectedResult = "MyPoint (0,0)";

		if (result.equals(expectedResult)) {
			System.out.println(ANSI_GREEN + "✓ Passed testToString" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testToString" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testDistanceTwoParams() {
		MyPoint testPoint = new MyPoint();

		double result = testPoint.distance(0, 1);
		double expectedResult = 1.0;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testDistanceTwoParams" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testDistanceTwoParams" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testDistanceOneParam() {
		MyPoint testPoint = new MyPoint();
		MyPoint testPoint2 = new MyPoint(0, 1);

		double result = testPoint.distance(testPoint2);
		double expectedResult = 1.0;


		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testDistanceOneParam" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testDistanceOneParam" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testEquals() {
		MyPoint testPoint = new MyPoint();
		MyPoint testPoint2 = new MyPoint();

		if (testPoint.equals(testPoint2)) {
			System.out.println(ANSI_GREEN + "✓ Passed testEquals" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testEquals" + ANSI_RESET);
		}
	}
}

