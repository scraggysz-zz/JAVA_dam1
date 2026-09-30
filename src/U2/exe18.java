import static java.lang.IO.*;

void main() {
    int a = Integer.parseInt(readln("Introduix un número: "));
    int c = Integer.parseInt(readln("Introduix un número: "));
    for (   int b=a  ;  b<c   ;    b++  ) {
        if (b%3==0) {
            println("Fizz");
        }
        else if(b%5==0){
            println("Buzz");
        }
        else if(b%15==0){
            println("Fizzbuzz");
        }
        else {
            println(b);
        }
    }
}