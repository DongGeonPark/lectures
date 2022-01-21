int power(int x, int y) {
	int result = x;

	for (int i = 0; i < y - 1; i++) {
		result *= x;
	}
	return result;
}