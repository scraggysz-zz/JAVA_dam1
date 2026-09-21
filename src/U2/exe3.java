void main() {
    int a = Integer.parseInt(IO.readln("Introdueix edat: "));
    if (a>=0 && a<3) {
        IO.println("L'entrada es gratuïta.");
    }
    else if (a>=3 && a<13) {
        IO.println("L'entrada val 5€.");
    }
    else if (a>12 && a<18){
        IO.println("L'entrada val 10€.");
    }
    else if (a>17 && a<65){
        IO.println("L'entrada val 15€.");
    }
    else if (a>64){
        IO.println("L'entrada val 7€.");
    }
    else {
        IO.println("L'edat no pot ser negativa.");
    }
}