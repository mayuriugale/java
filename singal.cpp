#include<iostream>
using namespace std;

class base
{
    public:
     int i,j;
        base()
        {
            cout<<"Inside base constructor\n";
        }

 ~base()
        {
            cout<<"Inside base constructor\n";
        }
         void fun()
        {
            cout<<"Inside base fun\n";
        }

        void gun()
        {
            cout<<"Inside base gunn\n";
        }

};
class Derived : public base
{
   public:
   
   int x,y;

   Derived()
   {
    cout<<"Inside Derived con\n";
   }

    ~Derived()
   {
    cout<<"Inside Derived destr\n";
   }
   void sun()
   {
    cout<<"Inside Derived sun\n";
   }






int main()
{
    cout<<sizeof(base)<<"\n";
     cout<<sizeof(Derived)<<"\n";
    return 0;
}

