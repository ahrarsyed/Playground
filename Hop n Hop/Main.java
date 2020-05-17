#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,d,c,x,y;
  cin>>x>>y;
  a=(x-3)*(x-3);
  b=(y-4)*(y-4);
  c=a+b;
  d=sqrt(c);
  cout<<d;
}