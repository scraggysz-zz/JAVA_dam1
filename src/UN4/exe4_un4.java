void main() {
    Scanner scanner = new Scanner(System.in);
    Random aleatori = new Random();
    IO.println("--- RONDA DE COMBAT ---");
    int dau1 = aleatori.nextInt(1,7);
    int dau2 = aleatori.nextInt(1,7);
    int suma = dau1+dau2;
    int dau3 = aleatori.nextInt(1,13);
    IO.println("Heroi tira dos daus de 6: ["+dau1+"] + ["+dau2+"] = "+suma);
    boolean critic = aleatori.nextBoolean();
    IO.print("Cop crític aconseguit? "+critic+" -> Dany final heroi: ");
    if (critic==true) {
        suma = suma*2;
    }
    IO.print(suma+" ");
    IO.println("Monstre tira dau de 12: ["+dau3+"] -> Dany final de monstre: "+dau3);
    IO.println("Dany més alt de la ronda: "+Math.max(suma, dau3));
    IO.print("Resultat: ");
    if (suma>=dau3) {
        IO.println("L'Heroi guanya la ronda!");
    }
    else {
        IO.println("L'Heroi perd la ronda.");
    }
}