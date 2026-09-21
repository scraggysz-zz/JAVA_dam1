void main() {
    int a = Integer.parseInt(IO.readln("Introduse numero 2 sifras: "));
    if (a<10 && a>-10) {IO.println("Número no ser 2 sifras. Programa parar ahora.");}
    else {
        IO.println("Cifra decenas: " + (a / 10));
        IO.println("Cifra unidades: " + (a % 10));
        IO.println("Suma total: " + ((a / 10) + (a % 10)));
    }
}