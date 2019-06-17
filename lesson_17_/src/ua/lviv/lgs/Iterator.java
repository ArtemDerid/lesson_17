package ua.lviv.lgs;

public interface Iterator {

	public boolean hasNext();

	public Object next();

	class Collection {
		private static Number[] arr;

		Collection(Number[] arr) {
			Collection.arr = arr;
		}
		
//		task 1

		public class Forward implements Iterator {

			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < arr.length;
			}

			@Override
			public Object next() {
				return arr[index++];
			}

		}

		public Forward oddToZero() {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 != 0) {
					arr[i] = 0;
					System.out.println(arr[i]);
				} else {
					System.out.println(arr[i]);
				}
			}
			return new Forward();
		}
		
//		task 2

		public class Backward implements Iterator {

			private int index = arr.length - 1;

			@Override
			public boolean hasNext() {
				return index >= arr.length;
			}

			@Override
			public Object next() {
				return arr[index--];
			}

		}

		public Backward nextButOne() {
			for (int i = arr.length - 1; i >= 0; i--) {
				if (i % 2 == 0) {
					System.out.println(arr[i]);
				}
			}
			return new Backward();
		}
		
//		task 3

		public Iterator anonymousIterator() {
			return new Iterator() {

				private int index = arr.length - 1;

				@Override
				public boolean hasNext() {
					return index >= 0;
				}

				@Override
				public Object next() {
					for (int i = arr.length - 1; i >= 0; i--) {
						if (i % 3 == 0) {
							if (arr[i].intValue() % 2 == 0) {
								System.out.println(arr[i]);
							}
						}
					}
					return arr[index--];
				}

			};
		}
		
//		task 4

		public Iterator localIterator() {
			class NextButFive implements Iterator {

				private int index = 0;

				@Override
				public boolean hasNext() {
					return index < arr.length;
				}

				@Override
				public Object next() {
					for (int i = 0; i < arr.length; i++) {
						if (i % 5 == 0) {
							if (arr[i].intValue() % 2 == 0) {
								System.out.println(arr[i].intValue() - 100);
							}
						}
					}
					return arr[index++];
				}

			}
			return new NextButFive();
		}
		
//		task 5

		private static class StaticIterator implements Iterator {

			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < arr.length;
			}

			@Override
			public Object next() {

				return arr[index++];
			}

		}

		public static StaticIterator isNextButOneIsEven() {
			for (int i = 0; i < arr.length; i++) {
				if (i % 2 != 0) {
					if (arr[i].intValue() % 2 == 0) {
						System.out.println(arr[i].intValue() + 1);
					}
				}
			}
			return new StaticIterator();
		}

	}

}
