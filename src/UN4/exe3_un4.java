void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Introdueix catet A: ");
    double a = scanner.nextDouble();
    IO.print("Introdueix catet B: ");
    double b = scanner.nextDouble();
    double hipo = Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
    IO.println("Hipotenusa: %.2f".formatted(hipo));
    IO.println("Fica radi del cercle: ");
    double radi = scanner.nextDouble();
    double area = Math.PI*Math.pow(radi, 2);
    double perimetre = 2*Math.PI*radi;
    IO.println("Àrea del cercle: %.2f".formatted(area));
    IO.println("Perímetre del cercle: %.2f".formatted(perimetre)+" (arrodonit a l'enter més proper: "+Math.round(perimetre)+")");
}