public class CustomArrayListApplication {

		public static void main(String[] args) {

			test2();
	System.out.println("");
			test1();
		}

		private static void test2() {
			String[] nameArray = { "Lebron James", "Stephen Curry", "Michael Jackson", "Klay Thompson", "Black Panther", "Tom Brady",
					"Aaron Rodgers", "Boo", "Jalen Hurts", "Patrick Mahomes", "Four", "One", "Joe Burrow" };
			CustomList<String> names = new CustomArrayList<>();
			for (int i = 0; i < nameArray.length; i++) {
				names.add(nameArray[i]);
			}
			for (int i = 0; i < names.getSize(); i++) {
				System.out.println(names.get(i));
			}
			System.out.println(names.getSize());

		}

		private static void test1() {
			CustomList<Integer> numbers = new CustomArrayList<>();

	
			for (int i = 1; i <= 42; i++) {
				numbers.add(i);
			}

			
			for (int i = 0; i < numbers.getSize(); i++) {
				System.out.println(numbers.get(i));

			}
			System.out.println(numbers.getSize());
		}

	}