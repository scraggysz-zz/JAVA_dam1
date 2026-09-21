void main() {
    int a = Integer.parseInt(IO.readln("Escribe un número 1: "));
    int b = Integer.parseInt(IO.readln("Escribe un número 2: "));
    int c = Integer.parseInt(IO.readln("Escribe un número 3: "));
    if (a>b && a>c) {
        IO.println("El número "+a+" es el mayor");
    }
    else if (b>a && b>c) {
        IO.println("El número "+b+" es el mayor.");
    }
    else if (c>a && c>b){
        IO.println("El número "+c+" es el mayor.");
    }
    else {
        IO.println("Hay números iguales.");
    }
}