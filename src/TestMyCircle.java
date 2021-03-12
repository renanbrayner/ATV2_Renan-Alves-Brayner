public class TestMyCircle {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	public static void main() {
		System.out.println("Running all MyCircle tests...");
		testContructorMyCircle();
		testConstructorWithMyPointMyCircle();
		testGetRadius();
		testGetCenter();
		testGetCenterX();
		testGetCenterY();
		testSetRadius();
		testSetCenter();
		testSetCenterXY();
		testToString();
		testGetArea();
		System.out.println("Done! \n");
	}

	public static void testContructorMyCircle() {
		MyCircle testCircle = new MyCircle(0, 0, 1);

		if (testCircle instanceof MyCircle) {
			System.out.println(ANSI_GREEN + "✓ Passed testConstructorMyCircle" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testConstructorMyCircle" + ANSI_RESET);
		}
	}

	public static void testConstructorWithMyPointMyCircle() {
		MyPoint testPoint = new MyPoint();
		MyCircle testCircle = new MyCircle(testPoint, 1);

		if (testCircle instanceof MyCircle) {
			System.out.println(ANSI_GREEN + "✓ Passed testConstructorWithMyPointMyCircle" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testConstructorWithMyPointMyCircle" + ANSI_RESET);
		}
	}
	
	public static void testGetRadius() {
		MyCircle testCircle = new MyCircle(0, 0, 1);
		
		int result = testCircle.getRadius();
		int expectedResult = 1;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetRadius" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetRadius" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testGetCenter() {
		MyCircle testCircle = new MyCircle(0, 0, 1);
		
		MyPoint result = testCircle.getCenter();
		MyPoint expectedResult = new MyPoint(0, 0);

		if (result.getX() == expectedResult.getX() && result.getY() == expectedResult.getY()) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetCenter" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetCenter" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testGetCenterX() {
		MyCircle testCircle = new MyCircle(0, 0, 1);

		int result = testCircle.getCenterX();
		int expectedResult = 0;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetCenterX" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetCenterX" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testGetCenterY() {
		MyCircle testCircle = new MyCircle(0, 0, 1);

		int result = testCircle.getCenterY();
		int expectedResult = 0;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetCenterY" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetCenterY" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testSetRadius() {
		MyCircle testCircle = new MyCircle(0, 0, 1);

		testCircle.setRadius(2);

		int result = testCircle.getRadius();
		int expectedResult = 2;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testSetRadius" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testSetRadius" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testSetCenter() {
		MyCircle testCircle = new MyCircle(0, 0, 1);
		MyPoint testPoint = new MyPoint(1, 0);

		testCircle.setCenter(testPoint);

		MyPoint result = testCircle.getCenter();
		MyPoint expectedResult = new MyPoint(1, 0);

		if (result.equals(expectedResult)) {
			System.out.println(ANSI_GREEN + "✓ Passed testSetCenter" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testSetCenter" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testSetCenterXY() {
		MyCircle testCircle = new MyCircle(0, 0, 1);
		
		testCircle.setCenterXY(1, 0);

		MyPoint result = testCircle.getCenter();
		MyPoint expectedResult = new MyPoint(1, 0);

		if (result.equals(expectedResult)) {
			System.out.println(ANSI_GREEN + "✓ Passed testSetCenterXY" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testSetCenterXY" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testToString() {
		MyCircle testCircle = new MyCircle(0, 0, 1);

		String result = testCircle.toString();
		String expectedResult = "Circle @ (0,0) radius=1; area=3.14159265";

		if (result.equals(expectedResult)) {
			System.out.println(ANSI_GREEN + "✓ Passed testToString" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testToString" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}

	public static void testGetArea() {
		MyCircle testCircle = new MyCircle(0, 0, 1);

		double result = testCircle.getArea();
		double expectedResult = 3.14159265;

		if (result == expectedResult) {
			System.out.println(ANSI_GREEN + "✓ Passed testGetArea" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + "✗ Failed testGetArea" + ANSI_RESET);
			System.out.println("   Expected: " + expectedResult + "\n   Got: " + result);
		}
	}
}
