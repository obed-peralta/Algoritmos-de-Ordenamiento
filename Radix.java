class Radix{
	
	public static void AlgoritmoRadix(int[] a) {
		int x, i, j;
		for (x = Integer.SIZE - 1; x >= 0; x--) {
			int auxiliar[] = new int[a.length];

			j = 0;
			for (i = 0; i < a.length; i++) {
				boolean mover = a[i] << x >= 0;
				if (x == 0 ? !mover : mover) {

					auxiliar[j] = a[i];
					j++;

				} else {
					a[i - j] = a[i];

				}
			}
			for (i = j; i < auxiliar.length; i++) {
				auxiliar[i] = a[i - j];
			}
			a = auxiliar;
		}

		//MostrarArreglo(a);

	}

}