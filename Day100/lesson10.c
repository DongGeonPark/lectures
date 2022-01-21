#include <stdio.h>

double avg(int *pT);

int main() {
	/*배열 요소의 어드레스*/
	int test[5] = { 80,60,55,22,75 };
	printf("test[0]의 값 : %d\n",test[0]);
	printf("test[0]의 주소 : %p\n",&test[0]);
	printf("test[0]의 주소 : %p\n", test); // 배열이름 = 배열[0] 주소
	printf("test[0]의 값: %d\n\n\n", *test); //배열 포인터 = 배열[0]의 값

	//배열 포인터 접근
	printf("test[0]의 값 : %d\n", test[0]);
	printf("test[1]의 값 : %d\n", test[1]);
	printf("test[0]의 값 : %d\n", *test);
	printf("test[1]의 값 : %d\n\n\n", *(test+1));

	//함수의 배열 인수
	int i;
	double ans;

	ans = avg(test);
	printf("5명의 평군: %lf\n\n\n", ans);

	//문자열 입력
	char str1[10] = "power"; //str = "good" 불가능
	char* str2 = "power";
	str2 = "good";
	printf("%s\n\n", str2);
	
	scanf_s("%s", str1,sizeof(str1));
	printf("%s", str1);
	return 0;
}
double avg(int *pT) {
	int i;
	double sum = 0.0;

	for (i = 0; i < 5; i++) {
		sum += *(pT + i);
		//sum += pT[i];
	}
	return sum / 5;
}