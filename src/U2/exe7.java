void main() {
    String clase = IO.readln("Fica tipus de pokemon (foc, aigüa, planta, elèctric, terra, roca): ").toLowerCase();
    String debilidad = switch (clase) {
        case "foc" -> "Aigüa, Terra y Roca";
        case "aigua", "aigüa" -> "Planta y Elèctric";
        case "planta" -> "Foc";
        case "elèctric", "electric" -> "Terra";
        case "terra", "roca" -> "Aigüa i Planta";
        default -> "Desconegut: ¡consulta la Pokédex!";
    };

    IO.println("Feble amb: " + debilidad);
}