#include <bits/stdc++.h> 
using namespace std;
int main()
{
	int arr[20], size, insert, i, pos;
  cout<<"Enter the number of elements in the array"<<"\n";
	cin>>size;
  cout<<"Enter the elements in the array"<<"\n";
	for(i=0; i<size; i++)
	{
		cin>>arr[i];
	}
  cout<<"Enter the location where you wish to insert an element"<<"\n";
	cin>>pos;
	// now create a space at the required position
   if(pos<size){
    cout<<"Enter the value to insert"<<"\n";
	cin>>insert;
	for(i=size; i>pos; i--)
	{
		arr[i]=arr[i-1];
	}
  	arr[pos]=arr[pos-1];
	arr[pos-1]=insert;
  cout<<"Array after insertion is "<<"\n";
	for(i=0; i<size+1; i++)
	{
		cout<<arr[i]<<"\n";
	}
   }
  else
    cout<<"Invalid Input"; 
}
