void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Introdueix nom i cognom: ");
    String nom = scanner.nextLine();
    String[] separat = nom.split(" ");
    IO.println("Nom: "+separat[0]+" |  Cognom: "+separat[1]);
    String alies = separat[0].substring(0,3).toLowerCase()+separat[1].substring(0,3).toLowerCase();
    IO.println("Àlies d'usuari: %s".formatted(alies));
    IO.println("Correu electrònic: %s@alu.edu.gva.es".formatted(alies));
}