#include <stdio.h>

double avg(int *pT);

int main() {
	/*�迭 ����� ��巹��*/
	int test[5] = { 80,60,55,22,75 };
	printf("test[0]�� �� : %d\n",test[0]);
	printf("test[0]�� �ּ� : %p\n",&test[0]);
	printf("test[0]�� �ּ� : %p\n", test); // �迭�̸� = �迭[0] �ּ�
	printf("test[0]�� ��: %d\n\n\n", *test); //�迭 ������ = �迭[0]�� ��

	//�迭 ������ ����
	printf("test[0]�� �� : %d\n", test[0]);
	printf("test[1]�� �� : %d\n", test[1]);
	printf("test[0]�� �� : %d\n", *test);
	printf("test[1]�� �� : %d\n\n\n", *(test+1));

	//�Լ��� �迭 �μ�
	int i;
	double ans;

	ans = avg(test);
	printf("5���� ��: %lf\n\n\n", ans);

	//���ڿ� �Է�
	char str1[10] = "power"; //str = "good" �Ұ���
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