/**
 *
 * @author Lizbeth Ramos López
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Hilo extends Thread{
    private JTextArea area;
    private RecursoCompartido rc;  
    private boolean corriendo = true;
    private int numHilo;
    private int algoritmo;
    private Dekker grupo, general;
    
    Hilo(JTextArea area, RecursoCompartido rc, int n){
        this.area = area;
        this.rc = rc;
        this.numHilo = n;
        this.setName("Perrito " + n);
    }
   
    @Override
    public void run(){
        try{
            while(true){
                switch(algoritmo){
                    case 0:
                        rc.setDatoCompartido(this.getName(), numHilo);
                        area.append(rc.getDatoCompartido()+ "\n");
                        this.sleep(1000);
                        if(!corriendo)
                            this.stop();
                        break;
                    case 1:
                       if(rc.accedeDI()){
                            rc.bloquea();
                            rc.setDatoCompartido(this.getName(), numHilo);
                            area.append(rc.getDatoCompartido() + "\n");  
                            if(!corriendo)
                                this.stop();
                            rc.desbloquea();
                        }else{
                            if(!corriendo)
                                this.join();
                            area.append("En espera \n");
                       }
                       this.sleep(1000); 
                       break;
                    case 2:
                            if(rc.accedeCerradura()){
                                rc.bloqueaC();
                                rc.setDatoCompartido(this.getName(), numHilo);
                                area.append(rc.getDatoCompartido() + "\n");
                                if(!corriendo)
                                    this.stop();
                                rc.desbloqueaC();
                            }else{
                                if(!corriendo)
                                    this.join();
                                    area.append("En espera \n");
                            }
                            sleep(1000);
                            break;
                    case 3:
                           if(rc.accedeMutex()){
                               try{
                                    rc.lock();
                                    rc.setDatoCompartido(this.getName(), numHilo);
                                    area.append(rc.getDatoCompartido() + "\n");
                                    if(!corriendo)
                                        this.stop();
                               }finally{
                                   rc.unlok();
                               } 
                           }else{
                                if(!corriendo)
                                    this.join();
                                    area.append("En espera \n");
                            }
                            sleep(1000);
                        break;
                    case 4:
                        if(general.getTurno() == 0){//si el es el turno del grupo 1 hilo 1 y 2
                            if(grupo.getTurno() == 0){//si es turno del hilo 1
                                rc.setDatoCompartido(this.getName(), numHilo);
                                area.append(rc.getDatoCompartido() + "\n");
                                if(!corriendo)
                                    this.stop();
                                grupo.setTurno(1);
                                general.setTurno(1);
                            }else{//turno del hilo 2
                                rc.setDatoCompartido(this.getName(), numHilo);
                                area.append(rc.getDatoCompartido() + "\n");
                                if(!corriendo)
                                    this.stop();
                                grupo.setTurno(0);
                                general.setTurno(1);
                            }
                        }else{//turno del grupo 2 hilo 3 y 4
                            if(grupo.getTurno() == 0){//si es turno del hilo 3
                                 rc.setDatoCompartido(this.getName(), numHilo);
                                area.append(rc.getDatoCompartido() + "\n");
                                if(!corriendo)
                                    this.stop();
                                grupo.setTurno(1);
                                general.setTurno(0); 
                            }else{//turno del hilo 4
                                rc.setDatoCompartido(this.getName(), numHilo);
                                area.append(rc.getDatoCompartido() + "\n");
                                if(!corriendo)
                                    this.stop();
                                grupo.setTurno(0);
                                general.setTurno(0);                              
                            }                                                    
                        }
                        sleep(1000);
                        break;
                    case 5:
                        rc.setDatoCompartido(this.getName(), numHilo);
                        if(rc.accedeDijkstra()){
                            area.append(rc.getDatoCompartido()+ "\n");
                            if(!corriendo)
                                this.join();
                            rc.liberaDijkstra();
                        }else
                            area.append("En espera \n");
                            this.sleep(1000);
                        break;
                    default:
                        System.out.println("elija un algortimo");
                        break;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    
    public void setAlgoritmo(int alg){
        this.algoritmo = alg;
    }
    
    public void setDekkers(Dekker d1, Dekker d2){
           this.grupo = d1;
           this.general = d2;
    }
    public void parar(){
        this.corriendo = false;
    }
}
