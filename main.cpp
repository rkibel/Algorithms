#include <iostream>
using namespace std;
namespace A {
 void f() { cout << "A.f()" << endl; }
 void g() { cout << "A.g()" << endl; }
}
namespace B {
 void f() { cout << "B.f()" << endl; }
}
void f() { cout << "f()" << endl; }
void g() { cout << "g()" << endl; }
using namespace std;
using namespace B;
int main() {
 //f(); 
 g(); 
 A::f(); 
 A::g(); 
 B::f(); 
 //B::g(); 
 ::f(); 
 ::g(); 
}