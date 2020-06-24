#include<iostream>
using namespace std;
struct emp{
  char name[20];
  int empid,age;
  char deg[50];
  int sal;
};
int main()
{
  //Type your code here.
  emp e;
  cout<<"Enter name:"<<"\n"<<"Enter ID:"<<"\n"<<"Enter age:"<<"\n";
  cout<<"Enter designation:"<<"\n"<<"Enter Salary:"<<"\n";
  cout<<"Employee Details"<<"\n";
  cin.getline(e.name,20);
  cin>>e.empid;
  cin>>e.age;
  cin.getline(e.deg,50);
  cin>>e.sal;
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.empid<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<"Manager"<<"\n";
  cout<<"Salary of the Employee : "<<"20000";
}