/**
 *
 * @author Lizbeth Ramos López
 */
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        d = new Dijkstra();
        c = new Cerradura();
        m = new Mutex();
        rc = new RecursoCompartido(d, c, m);
        principal = new Dekker();
        grupo1 = new Dekker();
        grupo2 = new Dekker();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        Plato1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Plato2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Plato3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Plato4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Correr = new javax.swing.JButton();
        Matar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAlgoritmos = new javax.swing.JMenu();
        OpcionCondiciones = new javax.swing.JMenuItem();
        OpcionDI = new javax.swing.JMenuItem();
        OpcionCerradura = new javax.swing.JMenuItem();
        OpcionMutex = new javax.swing.JMenuItem();
        OpcionDekker = new javax.swing.JMenuItem();
        OpcionDijkstra = new javax.swing.JMenuItem();

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Plato1.setColumns(20);
        Plato1.setRows(5);
        jScrollPane1.setViewportView(Plato1);

        Plato2.setColumns(20);
        Plato2.setRows(5);
        jScrollPane2.setViewportView(Plato2);

        Plato3.setColumns(20);
        Plato3.setRows(5);
        jScrollPane3.setViewportView(Plato3);

        Plato4.setColumns(20);
        Plato4.setRows(5);
        jScrollPane4.setViewportView(Plato4);

        jLabel1.setText("Plato 1");

        jLabel2.setText("Plato 2");

        jLabel3.setText("Plato 3");

        jLabel4.setText("Plato 4");

        Correr.setText("Iniciar");
        Correr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrerActionPerformed(evt);
            }
        });

        Matar.setText("Matar");
        Matar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatarActionPerformed(evt);
            }
        });

        MenuAlgoritmos.setText("Algoritmos");

        OpcionCondiciones.setText("Condiciones Competencias");
        OpcionCondiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionCondicionesActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(OpcionCondiciones);

        OpcionDI.setText("Desactivacion de Interrupciones");
        OpcionDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionDIActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(OpcionDI);

        OpcionCerradura.setText("Variable de Cerradura");
        OpcionCerradura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionCerraduraActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(OpcionCerradura);

        OpcionMutex.setText("Mutex");
        OpcionMutex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionMutexActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(OpcionMutex);

        OpcionDekker.setText("Dekker");
        OpcionDekker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionDekkerActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(OpcionDekker);

        OpcionDijkstra.setText("Dijkstra");
        OpcionDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionDijkstraActionPerformed(evt);
            }
        });
        MenuAlgoritmos.add(OpcionDijkstra);

        jMenuBar1.add(MenuAlgoritmos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(100, 100, 100)
                .addComponent(jLabel4)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(Correr)
                .addGap(121, 121, 121)
                .addComponent(Matar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correr)
                    .addComponent(Matar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrerActionPerformed
        primeraVez = true;
        h1 = new Hilo(Plato1, rc, 1);
        h1.setAlgoritmo(algoritmo);
        h1.setDekkers(grupo1, principal);
        h2 = new Hilo(Plato2, rc, 2);
        h2.setAlgoritmo(algoritmo);
        h2.setDekkers(grupo1, principal);
        h3 = new Hilo(Plato3, rc, 3);
        h3.setAlgoritmo(algoritmo);
        h3.setDekkers(grupo2, principal);        
        h4 = new Hilo(Plato4, rc, 4);
        h4.setAlgoritmo(algoritmo);
        h4.setDekkers(grupo2, principal);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }//GEN-LAST:event_CorrerActionPerformed

    private void OpcionCerraduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionCerraduraActionPerformed
        algoritmo = 2;
        prepararAlgoritmo();
    }//GEN-LAST:event_OpcionCerraduraActionPerformed

    private void OpcionCondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionCondicionesActionPerformed
        algoritmo = 0;
        prepararAlgoritmo();
    }//GEN-LAST:event_OpcionCondicionesActionPerformed

    private void MatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatarActionPerformed
        h4.parar();
    }//GEN-LAST:event_MatarActionPerformed

    private void OpcionDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionDijkstraActionPerformed
        algoritmo = 5;
        prepararAlgoritmo();
    }//GEN-LAST:event_OpcionDijkstraActionPerformed

    private void OpcionDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionDIActionPerformed
        algoritmo = 1;
        prepararAlgoritmo();
    }//GEN-LAST:event_OpcionDIActionPerformed

    private void OpcionMutexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionMutexActionPerformed
        algoritmo = 3;
        prepararAlgoritmo();
    }//GEN-LAST:event_OpcionMutexActionPerformed

    private void OpcionDekkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionDekkerActionPerformed
        algoritmo = 4;
        prepararAlgoritmo();
    }//GEN-LAST:event_OpcionDekkerActionPerformed

    private void prepararAlgoritmo(){
        if(primeraVez){
            h1.parar();
            h2.parar();
            h3.parar();
            h4.parar();
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
            }
            Plato1.setText("");
            Plato2.setText("");
            Plato3.setText("");
            Plato4.setText("");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Correr;
    private javax.swing.JButton Matar;
    private javax.swing.JMenu MenuAlgoritmos;
    private javax.swing.JMenuItem OpcionCerradura;
    private javax.swing.JMenuItem OpcionCondiciones;
    private javax.swing.JMenuItem OpcionDI;
    private javax.swing.JMenuItem OpcionDekker;
    private javax.swing.JMenuItem OpcionDijkstra;
    private javax.swing.JMenuItem OpcionMutex;
    private javax.swing.JTextArea Plato1;
    private javax.swing.JTextArea Plato2;
    private javax.swing.JTextArea Plato3;
    private javax.swing.JTextArea Plato4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private Hilo h1,h2,h3,h4;
    private RecursoCompartido rc;
    private Dijkstra d;
    private Cerradura c;
    private Mutex m;
    private Dekker grupo1, grupo2, principal;
    private int algoritmo;
    private boolean primeraVez = false;
}
