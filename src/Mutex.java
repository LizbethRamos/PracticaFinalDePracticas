/**
 *
 * @author Lizbeth Ramos López
 */
public class Mutex {
        private boolean pase = true; 
         Mutex(){
                 
         }
         public void lock(){
               pase = false;
         }
         
         public void unlock(){
                pase= true;
         }

        public boolean isPase() {
                return pase;
        }        
}
