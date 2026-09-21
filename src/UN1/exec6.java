
    void main() {
        double a = Double.parseDouble(IO.readln("Escribe dineros: "));
        double b = Double.parseDouble(IO.readln("Escribe %: "));
        a = a-(b*a/100);
        IO.println("Preu rebaixat: "+a);
        b = (a*21/100);
        IO.println("IVA (21%): "+b);
        IO.println("Preu final: "+(a+b));
    }
