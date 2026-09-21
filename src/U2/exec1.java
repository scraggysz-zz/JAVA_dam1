void main() {
int a = Integer.parseInt(IO.readln("Escribe un número: "));
    if (a>0) {
    IO.println("El número es positivo.");
    }
    else if (a==0) {
        IO.println("El número es 0.");
    }
    else {
    IO.println("El número es negativo.");
    }
    if (a%2 == 0) {
        IO.println("El número es parell.");
    }
    else {
        IO.println("Es impar.");
    }
}