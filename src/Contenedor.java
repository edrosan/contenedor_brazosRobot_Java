public class Contenedor {

    private  int piezasTotales;
    private int piezas;
    private String id;


    public Contenedor(int piezas, String id){
        this.piezas = piezas;
        this.piezasTotales = piezas;
        this.id = id;
    }

    public synchronized  void descargarUnaPieza(){
        if(piezas > 0){
            piezas--;
        }
    }

    public String getId() {
        return id;
    }

    public int getPiezas() {
        return piezas;
    }

    public int getPiezasTotales() {
        return piezasTotales;
    }
}
