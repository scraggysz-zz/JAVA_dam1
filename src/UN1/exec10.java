void main() {
    int a = Integer.parseInt(IO.readln("Introduce billete: "));
    IO.println("Desglossament de bilets:");
    IO.println("- Billetets de 50€: "+(a/50));
    IO.println("- Billetets de 20€: "+((a%50)/20)%10);
    IO.println("- Billetets de 10€: "+((a%50)%20)/10);
}