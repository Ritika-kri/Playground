#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,st,hcf=1;
  cin>>a>>b>>c;
   st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
 
  if(a >= b && a >= c)
    {
        if(b >= c)
        {
           cout<<"The treasure is in box which has number "<<b;
        }
        else
        {
            cout<<"The treasure is in box which has number "<<c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            cout<<"The treasure is in box which has number "<<a;
        }
        else
        {
            cout<<"The treasure is in box which has number "<<c;
        }
    }

    // c is the largest number of the three
    else if(a >= b)
    {
        cout<<"The treasure is in box which has number "<<a;
    }
    else
    
       cout<<"The treasure is in box which has number "<<b;
    cout<<"\n"<<"The code to open the box is "<<hcf;
    }
  
  
