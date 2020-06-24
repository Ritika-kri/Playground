#include<iostream>
using namespace std;
int main()
{
int d1, c1, d2, c2;
cin>>d1>>c1>>d2>>c2;
int dollar=d1+d2;
int cent=c1+c2;
while(cent>100)
{
  cent=cent-100;
  dollar=dollar+1;
  break;
}
cout<<dollar<<"\n"<<cent;
}