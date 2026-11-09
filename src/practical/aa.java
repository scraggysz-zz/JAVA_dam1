void main() {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    char[] lletra = new char[a];

    for (int i=0;i<a;i++) {
        lletra[i] = scanner.next().charAt(0);
    }
    for (int i=0;i<a;i++) {
        switch (lletra[i]) {
            case 'a', 'e', 'i', 'o', 'u' -> IO.println(lletra[i]);
        }
    }
}