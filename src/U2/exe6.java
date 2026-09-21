void main() {
    String clase = IO.readln("Elige tu clase (guerrero, mago, arquero, cazador, ladrón): ").toLowerCase();
    String habilidad;

    if (clase.equals("guerrero")) {
        habilidad = "Golpe sísmico: daño masivo en área";
    } else if (clase.equals("mago")) {
        habilidad = "Tormenta arcana: lluvia de meteoritos";
    } else if (clase.equals("arquero")) {
        habilidad = "Disparo certero: crítico garantizado a distancia";
    } else if (clase.equals("ladrón")) {
        habilidad = "Sombra veloz: invisibilidad durante 5 segundos";
    } else {
        habilidad = "Clase desconeguda, cap habilitat.";
    }

    IO.println("Habilidad especial: " +habilidad);
}