/*#include<iostream>
#include<cstring>
#include<stdlib.h>
using namespace std;
int main()
{
  char s1[50],s2[50],s3[50],temp;
  int i,j=0;
  gets(s1);
  int len=strlen(s1);
  gets(s2);
  strncpy(s3,s1,len);
	for(i=0,j=len-1;i<len/2;++i,--j)
	{
		temp=s3[i];
		s3[i]=s3[j];
		s3[j]=temp;
	}
  cout<<s3<<endln;
  //cout<<s1;
  if(strcmp(s2,s3)==0)
    cout<<"It is correct";
    else
      cout<<"It is wrong"; 
}*/


#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
        char str[50],str2[50],temp;
        int i=0, j;     
  		gets(str);
  		gets(str2);
        i=0;
        j=strlen(str)-1;
        while(i<j)  //loop for reversing a string
        {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                i++;
                j--;
        }
       // cout<<str;  //displaying reverse string
  		if(strcmp(str,str2)==0)
          cout<<"It is correct";
    	else
          cout<<"It is wrong";     
        return 0;
}