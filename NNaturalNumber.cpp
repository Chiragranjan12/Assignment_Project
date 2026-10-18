// #include <iostream>
// using namespace std;
// int main() {
//     int num;
//     int add = 0;
//     cout << "Enter a  number: ";
//     cin >> num;

//     while(num != 0){
//         add = add + num;
//         num = num - 1;
//     }
//     cout << "The natural number is: " << add << endl;
//     return 0;
// }


#include <iostream>
using namespace std;

int main() {
    int num;
    int add = 0;

    std::cout << "Enter a number: ";
    std::cin >> num;

    while (num > 0) {
        add = add + num;
        num = num - 1;
    }

    cout << "The sum of natural numbers is: " << add << endl;

    return 0;
}
