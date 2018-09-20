public class HelloRockets {
	private static void DrawTopCone() {
		System.out.print("   /\\   ");
	}
	private static void DrawMiddleCone() {
		System.out.print("  /  \\  ");
	}
	private static void DrawBottomCone() {
		System.out.print(" /    \\ ");
	}
	
	private static void Draw2Cones() {
		DrawTopCone();
		System.out.print(" ");
		DrawTopCone();
		System.out.println();
		
		DrawMiddleCone();
		System.out.print(" ");
		DrawMiddleCone();
		System.out.println();
		
		DrawBottomCone();
		System.out.print(" ");
		DrawBottomCone();
		System.out.println();
	}
	
	private static void DrawHorizontal() {
		System.out.print("+------+");
	}
	private static void DrawVertical() {
		System.out.print("|      |");
	}
	
	private static void Draw2Horizontals() {
		for(int i = 0; i < 2; i++) {
			DrawHorizontal();	
			System.out.print(" ");
		}
		System.out.println();
	}
	
	private static void Draw2Verticals() {
		for(int i = 0; i < 2; i++) {
			DrawVertical();	
			System.out.print(" ");
		}
		System.out.println();
	}
	public static void Draw2Boxes() {
		Draw2Horizontals();
		Draw2Verticals();
		Draw2Verticals();
		Draw2Horizontals();
	}
	private static void Draw2Centers() {
		Draw2Boxes();
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
		Draw2Boxes();
	}
	
	public static void TwoRockets() {
		Draw2Cones();
		Draw2Centers();
		Draw2Cones();
	}
}
