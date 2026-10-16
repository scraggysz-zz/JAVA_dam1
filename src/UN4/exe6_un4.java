void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Introdueix matrícula: ");
    String matricula = scanner.nextLine();
    IO.print("\n");
    String numseparat = matricula.replaceAll("[^0-9]", "");
    String lletres = matricula.replaceAll("[^a-zA-z]", "");
    IO.println("Matrícula normalitzada: %s".formatted(matricula.trim().toUpperCase()));
    IO.println("Part numèrica: %s".formatted(numseparat));
    IO.println("Part alfabètica: %s".formatted(lletres.toUpperCase()));
    IO.print("Lletres en ordre invers: ");
    for (int i = 2; i >= 0; i--) {
        IO.print(lletres.substring(i, i+1).toUpperCase());
    }
    IO.println("\nMatrícula completa: "+numseparat+"-"+lletres.toUpperCase());
}