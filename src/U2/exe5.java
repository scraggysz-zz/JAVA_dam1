void main() {
    int a = Integer.parseInt(IO.readln("Introdueix bateria: "));
    if (a>=0 && a<15) {
        IO.println("Bateria crítica.");
    }
    else if (a>=15 && a<35) {
        IO.println("Bateria baixa.");
    }
    else if (a>34 && a<65){
        IO.println("Bateria mitjana.");
    }
    else if (a>64 && a<100){
        IO.println("Molta bateria.");
    }
    else if (a==100){
        IO.println("Bateria completa.");
    }
    else {
        IO.println("Error, número negatiu o major que 100.");
    }
}