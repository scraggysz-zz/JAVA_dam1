void main() {
    Scanner scanner = new Scanner(System.in);
    IO.print("Com et dius? ");
    String nom = scanner.nextLine();
    IO.println("Nom net: '"+nom.trim()+"'");
    IO.println("Longitud total: "+nom.length()+" caràcters.");
    IO.println("Lletres (sense espais): "+nom.replace(" ","").length()+" .");
    IO.println("Primer caràcter: "+nom.charAt(0)+".");
    IO.println("Últim caràcter: "+nom.charAt(nom.length()-1)+".");
}