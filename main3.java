public class Main3 {
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

		Developer[] list1 = new Developer[10];
		Developer[] list2 = new Developer[10];
		Developer[] list3 = new Developer[10];
		Developer[] list4 = new Developer[10];
		int i, j, k, f;
		i = 0;
		j = 0;
		k = 0;
		f = 0;
		for (Developer d : list) {

			if (d.getPosition() == "Junior") {
				list1[i] = d;
				i++;
			}
			if (d.getPosition() == "Middle") {
				list2[j] = d;
				j++;
			}
			if (d.getPosition() == "Senior") {
				list3[k] = d;
				k++;
			}
			if (d.getPosition() == "TeamLead") {
				list4[f] = d;
				f++;
			}
		}

		for (int m = 0; m < 10; m++) {
			System.out.println(list1[m].getName().toString() + "["
				+ list1[m].getPosition() + "]" + ": " + " -> "
					+ list1[m].getSalary());
			
		}
		for (int m = 0; m < 10; m++) {
			System.out.println(list2[m].getName().toString() + "["
				+ list2[m].getPosition() + "]" + ": " + " -> "
					+ list2[m].getSalary());
			
		}
		for (int m = 0; m < 10; m++) {
			System.out.println(list3[m].getName().toString() + "["
				+ list3[m].getPosition() + "]" + ": " + " -> "
					+ list3[m].getSalary());
			
		}
		for (int m = 0; m < 10; m++) {
			System.out.println(list4[m].getName().toString() + "["
				+ list4[m].getPosition() + "]" + ": " + " -> "
					+ list4[m].getSalary());
			
		}
		
	}
}
