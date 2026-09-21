void main() {
    int a = Integer.parseInt(IO.readln("Introdueix hores de pantalla diàries: "));
    if (a>=0 && a<3) {
        IO.println("Saludable.");
    }
    else if (a>=3 && a<6) {
        IO.println("Ús considerable.");
    }
    else if (a>5 && a<8){
        IO.println("Ús elevat.");
    }
    else if (a>7){
        IO.println("Adicte a la makineta.");
    }
    else {
        IO.println("No pots tindre hores negatives.");
    }
}