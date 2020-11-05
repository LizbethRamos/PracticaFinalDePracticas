/**
 *
 * @author Lizbeth Ramos López
 */
import java.util.ArrayList;
public class RecursoCompartido {
    private String datoCompartido;
    private int algoritmo;
    private int numHilo;
    private ArrayList<Interrupcion> interrupciones;
    private Dijkstra dijkstra;
    private Cerradura cerradura;
    private Mutex mutex;

    RecursoCompartido(Dijkstra algDijk, Cerradura algCerr, Mutex algMutex){
        this.datoCompartido = "";
        this.dijkstra = algDijk;
        this.interrupciones = new ArrayList<Interrupcion>();
        for(int i = 0; i < 10; i++){
            interrupciones.add(new Interrupcion());
        }
        this.cerradura = algCerr;
        this.mutex = algMutex;
    }

    public String getDatoCompartido() {
        return datoCompartido;
    }

    public void setDatoCompartido(String datoCompartido, int n) {
        this.datoCompartido = datoCompartido;
        this.numHilo = n -1;
    }

    public int getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(int algoritmo) {
        this.algoritmo = algoritmo;
    } 
        
    public boolean accedeCerradura(){
        if(cerradura.isCerrado() == 0)
            return true;
        else
            return false;
    }
    public void bloqueaC(){
        this.cerradura.setCerrado(1);
    }
    public void desbloqueaC(){
        this.cerradura.setCerrado(0);
    }
    
    public boolean accedeDijkstra() {
        int j, k = 0;
        dijkstra.setB(false, numHilo);
        do{
            dijkstra.setC(true, numHilo);
            if(dijkstra.getB()[k])
                k = numHilo;
        }while(k != numHilo);
        dijkstra.setC(false, numHilo);
        for(j = 0; j< 4; j++){
            if(j != numHilo && !dijkstra.getC()[j])
                    break;
        }
        if(!dijkstra.getB()[numHilo] && !dijkstra.getC()[numHilo]){
            return true;
        }
        else
            return false;
    }

    public void liberaDijkstra(){
        dijkstra.setB(true, numHilo);
        dijkstra.setC(true, numHilo);
    }
    public boolean accedeDI(){
        boolean ban = false;
        for(Interrupcion i : interrupciones)
            if(i.isInter())
                ban = true;
            else
                return false;
        return ban;
    }
    public void bloquea(){
        for(Interrupcion i: interrupciones){
            i.setInter(false);
        }
    }
    public void desbloquea(){
        for(Interrupcion i: interrupciones){
            i.setInter(true);
        }
    }
    
    public void lock(){
        this.mutex.lock();
    }
    
    public void unlok(){
        this.mutex.unlock();
    }
    public boolean accedeMutex(){
        return mutex.isPase();
    }
}
