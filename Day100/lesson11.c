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

	//문제 1번
	Person p[2];
	per(&p[0]);
	per(&p[1]);
	perShow(&p[0]);
	perShow(&p[1]);
	aging(&p[1]);
	perShow(&p[1]);

}
void per(Person* p1) {
	printf("나이를 입력하세요\n");
	scanf_s("%d", &p1->age);
	printf("몸무게를 입력하세요\n");
	scanf_s("%lf", &p1->weight);
	printf("키를 입력하세요\n");
	scanf_s("%lf", &p1->height);
	
}
void perShow(Person* p1) {
	printf("나이:%d, 몸무게:%f, 키:%f\n", p1->age, p1->weight, p1->height);
}
void aging(Person* p) {
	printf("1년이 경과했습니다\n");
	p->age++;
}