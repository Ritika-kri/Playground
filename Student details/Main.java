#include<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;

typedef struct Student 
{ 
  char name[100]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa; 
};

void getdata(Student c[], int num)
{
  int i;
  for(i=0; i<num; i++)
  {
    cout<<"Enter the details of student "<<i+1;
    cout<<"\nEnter name\n";
    cin>>c[i].name;
    cout<<"Enter department\n";
    cin>>c[i].department;
    cout<<"Enter year of study\n";
    cin>>c[i].yearOfStudy;
    cout<<"Enter cgpa\n";
    cin>>c[i].cgpa;
  }
}

void putdata(Student c[], int num)
{
  int i;
  cout<<"Details of students\n";
  for(i=0; i<num; i++)
  {
    cout<<"Student "<<i+1;
    cout<<"\nName:";
    cout<<c[i].name;
    cout<<"\nDepartment:";
    cout<<c[i].department;
    cout<<"\nYear of study:";
    cout<<c[i].yearOfStudy;
    cout<<"\nCGPA:";
    cout<<((int)(c[i].cgpa * 100 + 0.5) / 100.0)<<"\n";
  }
}

void sort(Student c[], int num)
{
  int i, j, pos;
  Student temp[1];
  for(i=0; i<num; i++)
  {
    for(j=0; j<num-i; j++)
    {
      pos = memcmp(c[j].name,c[j+1].name,sizeof(c[j].name));
      if(pos>0)
      {  
        temp[0] = c[j];
        c[j] = c[j+1];
        c[j+1] = temp[0];
      }
    }
  }
}

int main()
{
  int num;
  cout<<"Enter the number of students\n";
  cin>>num;

  Student c[num];

  getdata(c, num);
    if(num > 1)
    sort(c, num);
  putdata(c, num);
}