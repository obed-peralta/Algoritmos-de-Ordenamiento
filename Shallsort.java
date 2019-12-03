class Shallsort{
	
	public static void algoritmoShell(int a[]) {
		int intervalo, i, j, k;
		int n = a.length;
		intervalo = n / 2;
		while (intervalo > 0) {

			for (i = intervalo; i < n; i++) {
				j = i - intervalo;
				while (j >= 0) {
					k = j + intervalo;
					if (a[j] <= a[k])
						j = -1;
					else {
						int temp;
						temp = a[j];
						a[j] = a[k];
						a[k] = temp;
						j -= intervalo;
					}
				}
			}
			intervalo = intervalo / 2;
		}
	}
	
}