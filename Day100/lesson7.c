#include <stdio.h>

int main() {
	/*���� 1��
	int test[5],max=0;
	printf("���� ������ �Է��ϼ���\n");
	for (int i = 0; i < 5; i++) {
		scanf_s("%d", &test[i]);
	}
	for (int i = 0; i < 5; i++) {
		printf("%d��° ����� ���� ������ %d �Դϴ�.\n", i + 1, test[i]);
		if (max < test[i])
			max = test[i];
	}
	printf("�ְ� ������ %d���Դϴ�\n", max);
	*/

	/*���� 2��
	int test[5], count = 0;
	printf("���� ������ �Է��ϼ���\n");
	for (int i = 0; i < 5; i++) {
		scanf_s("%d", &test[i]);
	}
	for (int i = 0; i < 5; i++) {
		printf("%d��° ����� ���� ������ %d �Դϴ�.\n", i + 1, test[i]);
		if (test[i] > 70)
			count++;
	}
	printf("70�� �̻��� �л��� %d���Դϴ�,\n", count);
	*/

	/*���� 3��
	char s1[10];    // ũ�Ⱑ 10�� char�� �迭�� ����
	int count=0;

	printf("���ڿ��� �Է��ϼ���: ");
	scanf_s("%s", s1,sizeof(s1));     // ǥ�� �Է��� �޾Ƽ� �迭 ������ ���ڿ��� ����

	for (int i = 0; s1[i] != '\0'; i++) {
		count++;
	}
	printf("���ڿ� ũ��� %d�Դϴ�.\n", count);  // ���ڿ��� ������ ���
	*/

	/*���� 4��
	char str[10];
	int count = 0;

	printf("���ڿ��� �Է��ϼ���\n");
	scanf_s("%s", str, sizeof(str));
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] == 'a') {
			count++;
		}
	}
	printf("%s�ȿ� a�� %d�� �ֽ��ϴ�.\n", str, count);
	*/

	/*���� 5��
	char str[10];
	
	printf("���ڿ��� �Է��ϼ���.\n");
	scanf_s("%s", str, sizeof(str));

	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] == 'a') {
			str[i] = 'b';
		}
	}
	printf("%s�� ġȯ�߽��ϴ�.\n", str);
	*/
	return 0;
}