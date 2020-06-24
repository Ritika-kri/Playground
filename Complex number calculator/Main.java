#include<iostream>
using namespace std;
struct complex{
  int real;
  int img;
};
int main(){
  complex a,b,c;
  int choice;
  cin>>choice;
  cin>>a.real;
  cin>>a.img;
  cin>>b.real;
  cin>>b.img;
  if(choice==1){
    c.real=a.real+b.real;
    c.img=a.img+b.img;
    cout<<c.real<<"+"<<c.img<<"i";
  }
  else if(choice==2){
    c.real=(a.real)-(b.real);
    c.img=(a.img)-(b.img);
    cout<<c.real;
    if(c.img>0)
      cout<<"+";
    else
      cout<<"-";
    cout<<c.img<<"i";
  }
  else if(choice==3){
    c.real=(a.real*b.real)-(a.img*b.img);
    c.img=(a.real*b.img)+(a.img*b.real);
    cout<<c.real<<c.img<<"i";}
  else
    cout<<"Invalid choice";
}