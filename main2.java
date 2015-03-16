public class Main2 {
	public static void main(String[] args) {
		String[] arr = { "Mike", "Dima", "Vova", "Julia", "Jack", "Robby",
				"Ross", "Joe", "Chandler", "Rachel", "Monica", "Feeby",
				"Shaldon", "Howard", "Leonard", "Radjesh", "Penny" };

		Developer[] list = new Developer[40];
		for (int i = 0; i < 10; i++) {
			list[i] = new JuniorDeveloper(
					arr[(int) (Math.random() * arr.length)], 500,
					(int) (Math.random() * 10));
		}
		;
		for (int i = 10; i < 20; i++) {
			list[i] = new MiddleDeveloper(
					arr[(int) (Math.random() * arr.length)], 500,
					2 + (int) (Math.random() * 13));
		}
		;
		for (int i = 20; i < 30; i++) {
			list[i] = new SeniorDeveloper(
					arr[(int) (Math.random() * arr.length)], 500,
					4 + (int) (Math.random() * 16));
		}
		;
		for (int i = 30; i < 40; i++) {
			list[i] = new TeamLeadDeveloper(
					arr[(int) (Math.random() * arr.length)], 500,
					4 + (int) (Math.random() * 16));
		}
		;

		StringBuilder sb;

		for (Developer d : list) {
			if ((d.getSalary() >= 1500) & (d.getPosition() == "Senior")) {
				sb = new StringBuilder();// !!!
				sb.append(d.getName());
				sb.append("[" + d.getPosition() + "]");
				sb.append(": ");
				sb.append(d.getBasicSalary());
				sb.append(" -> ");
				sb.append(d.getSalary());

				System.out.println(sb.toString());
			}
		}

	}

}
