
public abstract class StringProblem extends Problem {

	public StringProblem(int bonusTurns, int bonusPoints, String name) {
		super(bonusTurns, bonusPoints, name);
	}

	protected static String randomString(int min, int max) {
		return randomString(min, max, 1);
	}

	protected static String randomString(int min, int max, int step) {
		min = min/step;
		max = max/step;
		int length = rng.nextInt(max-min+1) + min;
		length = length*step;

		StringBuilder sb = new StringBuilder();
		int rand;
		for(int i = 0; i < length; i++) {
			rand = rng.nextInt(36);
			if(rand < 26) {
				sb.append((char)('A' + rand));
			} else {
				sb.append((char)('0' + (rand-26)));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			System.out.println(randomString(4,12,2));
		}
	}

}
