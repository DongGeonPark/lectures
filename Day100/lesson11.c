#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct Person {
	int age;
	double weight;
	double height;
}Person;
void per(Person* p1);
void perShow(Person* p1);
void aging(Person* p);
int main() {

	//���� 1��
	Person p[2];
	per(&p[0]);
	per(&p[1]);
	perShow(&p[0]);
	perShow(&p[1]);
	aging(&p[1]);
	perShow(&p[1]);

}
void per(Person* p1) {
	printf("���̸� �Է��ϼ���\n");
	scanf_s("%d", &p1->age);
	printf("�����Ը� �Է��ϼ���\n");
	scanf_s("%lf", &p1->weight);
	printf("Ű�� �Է��ϼ���\n");
	scanf_s("%lf", &p1->height);
	
}
void perShow(Person* p1) {
	printf("����:%d, ������:%f, Ű:%f\n", p1->age, p1->weight, p1->height);
}
void aging(Person* p) {
	printf("1���� ����߽��ϴ�\n");
	p->age++;
}