void main() {
    double a = Double.parseDouble(IO.readln("Preu base: "));
    double b = Double.parseDouble(IO.readln("% de descompte: "));
    double iva = 21;
    IO.println("Preu rebaixat: "+(a-(a*b/100)));
    IO.println("IVA (21%): "+((a-(a*b/100))*21/100));
    IO.println("Preu final: "+(((a-(a*b/100))+((a-(a*b/100))*21/100))));
}