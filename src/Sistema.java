public class Sistema {

    public static void main(String[] args) {
        Contenedor contenedorA = new Contenedor(50, "X");

        Thread brazoA = new Thread(new Brazo("A",25, contenedorA));
        Thread brazoB = new Thread(new Brazo("B",25, contenedorA));

        brazoA.start();
        brazoB.start();
    }

}
