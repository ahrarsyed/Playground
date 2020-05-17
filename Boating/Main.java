#include<iostream>
using namespace std;
int main()
{
  int bh,b,x,y;
  cin>>bh>>x>>y;
  b=(x*75)+(y*30);
  if(b<=bh)
    cout<<"Boat is stable"<<endl;
  else cout<<"Boat will drow";
  
}