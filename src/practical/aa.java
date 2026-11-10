void main() {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int[] matri = new int[a];

    for (int i=0;i<a;i++) {
        matri[i] = scanner.nextInt();
    }
    a = scanner.nextInt();
    int[] matridos = new int[a];
    for (int i=0;i<a;i++) {
        matridos[i] = scanner.nextInt();
    }
    int contador = 0;
    for (int i=0;i<matridos.length;i++) {
        for (int j=0;j<matri.length;j++) {
            if (matridos[i]==matri[j]) {
                contador++;
                break;
            }
        }
    }
    if (contador==matri.length) {
        IO.println("SI");
    }
    else {
        IO.println("NO");
    }
}