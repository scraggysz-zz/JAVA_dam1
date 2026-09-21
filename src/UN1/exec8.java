void main() {
    double a = Double.parseDouble(IO.readln("Nota chino: "));
    double b = Double.parseDouble(IO.readln("Nota indio: "));
    double c = Double.parseDouble(IO.readln("Nota ruso: "));
    IO.println("Nota media: "+((a+b+c)/3));
    IO.println("APROVAT? "+ (( ((a+b+c)/3) >= 5) ? "Siuu" : "NOP!!!"));
}