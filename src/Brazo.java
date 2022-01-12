public class Brazo implements  Runnable {
    private String id;
    private int numPiezas;
    private Contenedor contenedor;

    public Brazo(String id, int numPiezas, Contenedor contenedor){
        this.id = id;
        this.numPiezas = numPiezas;
        this.contenedor = contenedor;
    }

    @Override
    public void run() {
        for(int i = 1; i <= numPiezas; i++){
            contenedor.descargarUnaPieza();
            System.out.println("Brazo: "+id+" descarga pieza "+i+" de "+contenedor.getPiezasTotales()+" del contenedor "+contenedor.getId());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
