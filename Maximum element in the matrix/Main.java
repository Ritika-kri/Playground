#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;
int findMax(int a[][20],int m, int n)
{
    int i,j,max=0;
    for(i=0;i<=m-1;i++)
    {
        for(j=0;j<=n-1;j++)
        {
            if(max<a[i][j])
                max=a[i][j];
        }
    }
    return max;
}

int main()
{
 
    int i,j,r,c,s=0;
    cin>>r;
    cin>>c;
  int a[r][20];
    for(i=0;i<=r-1;i++)
    {
        for(j=0;j<=c-1;j++)
            cin>>a[i][j];
    }
    s=findMax(a,r,c);
    cout<<"The maximum element is "<<s;
    for(i=0;i<=r;i++)
        //free(a[i]);
    return 0;
}