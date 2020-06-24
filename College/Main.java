#include<iostream>
#include<cstring>
#include<iomanip>
using namespace std;
struct college{
  char name[100];
  char city[100];
  int year;
  float per;
};
int main()
{
  int n,j,i;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  college col[n],t;
  for(i=1;i<=n;i++){
    cout<<"Enter the details of college "<<i<<endl;
    cout<<"Enter name"<<endl;
    //cin.getline(c.name,100);
    cin>>col[i].name;
    cout<<"Enter city"<<endl;
    //cin.get(c.city,100);
    cin>>col[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>col[i].year;
    cout<<"Enter pass percentage"<<endl;
    cin>>col[i].per;
  }
  for(i=1;i<=n;i++){
    for(j=i+1;j<=n;j++){
      if(strcmp(col[i].name,col[j].name)>0)
      {
        t=col[i];
        col[i]=col[j];
        col[j]=t;
      }
    }
  }
    cout<<"Details of colleges"<<endl;
  for(i=1;i<=n;i++){
    cout<<"College:"<<i<<endl;
  cout<<"Name:"<<col[i].name<<endl;
  cout<<"City:"<<col[i].city<<endl;
  cout<<"Year of establishment:"<<col[i].year<<endl;
  cout<<"Pass percentage:"<<col[i].per<<endl;
  }
}

 