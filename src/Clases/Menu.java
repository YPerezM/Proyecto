
package Clases;

import java.awt.Desktop;
import java.io.*;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    PrintWriter pw;
    Scanner sc;
    String fcanciones = "fcanciones.txt";
    String delim = ",";
    ArrayList<Cancion> canciones=new ArrayList();
    int bucle;
    String linea;
    boolean guardado=true;

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonAñadir = new javax.swing.JButton();
        BotonMostrar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de Música Borja ft.Yago");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/contreSpace.png")));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/youtube_logo_stacked-vfl225ZTx.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonBuscar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        BotonAñadir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BotonAñadir.setText("Añadir Cancion");
        BotonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirActionPerformed(evt);
            }
        });

        BotonMostrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BotonMostrar.setText("Mostrar todas");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        BotonGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                    .addComponent(BotonAñadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotonAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonGuardar)
                .addGap(7, 7, 7)
                .addComponent(BotonMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void openArrayList() throws FileNotFoundException {
        String delim = ",";

        try {
            sc = new Scanner(new File(fcanciones)).useDelimiter(delim);
            while (sc.hasNextLine()) {
                linea = sc.nextLine();
                String[] l = linea.split(",");
                for (int i = 0; i < l.length; i += 5) {
                    canciones.add(new Cancion(l[i], l[i + 1], l[i + 2], l[i + 3], l[i + 4]));
                }

            }
        } catch (FileNotFoundException ex) {

        } finally {
            sc.close();
        }
    }
    
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        if(guardado==false){
        String[] elegir = {"Sí","No"};                    
        int confirmar=JOptionPane.showOptionDialog(null, "¿Seguro que quieres salir sin guardar?", null,JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE ,null,elegir,null);
                            switch (confirmar) {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    break;
                            }
        }else{
            System.exit(0);
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed

        boolean existe = false;
        String[] choices = {"Abrir", "Borrar", "Siguiente canción"};
        String nbuscar = JOptionPane.showInputDialog("Introduzca el nombre de la canción");
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getNombreC().equals(nbuscar)) {
                try {
                    existe = true;
                    int respuesta = JOptionPane.showOptionDialog(null, "Cancion: " + canciones.get(i).getNombreC() + "\nIntérprete: " + canciones.get(i).getInterprete() + "\nAlbum: " + canciones.get(i).getAlbum() + "\nGénero: " + canciones.get(i).getGenero() + "\n\n¿Deseas abrirla o borrarla?", null, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null);
                    switch (respuesta) {
                        case 0:
                            abrir(i);
                            break;
                        case 1:
                            String[] elegir = {"Sí","No"};
                            int confirmar=JOptionPane.showOptionDialog(null, "¿Seguro que quieres borrar?", null,JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE ,null,elegir,null);
                            switch (confirmar) {
                                case 0:
                                    borrar(i);
                                    break;
                                case 1:
                                    break;
                            }
                            
                            break;
                        case 2:
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "No existe ninguna cancion con ese nombre");
        }

    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
       
String nc, in, alb, gen, url;
        nc = JOptionPane.showInputDialog("Introduzca el nombre");
        in = JOptionPane.showInputDialog("Introduzca el intérprete");
        alb = JOptionPane.showInputDialog("Introduzca el album");
        gen = JOptionPane.showInputDialog("Introduzca el género");
        url = JOptionPane.showInputDialog("Introduzca la URL (Youtube o URI de Spotify)");

        canciones.add(new Cancion(nc, in, alb, gen, url));
        guardado=false;
    }//GEN-LAST:event_BotonAñadirActionPerformed

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed

        for (int i = 0; i < canciones.size(); i++) {
            String mNombre=canciones.get(i).getNombreC();
            String mAutor=canciones.get(i).getInterprete();
            String mAlbum=canciones.get(i).getAlbum();
            String mGenero=canciones.get(i).getGenero();
            
            System.out.println("Cancion: "+mNombre+ "||Autor: "+mAutor+"||Album: "+mAlbum+"||Genero: " +mGenero);
           
        }
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        try {

            pw = new PrintWriter(new File(fcanciones));

            for (int i = 0; i < canciones.size(); i++) {
                pw.println(canciones.get(i));
            }
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente");
            guardado=true;
        } catch (FileNotFoundException e) {
        } finally {
            pw.close();
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    public void abrir(int i) throws IOException {

        String direccion = canciones.get(i).getUrl();

        try {

            Desktop.getDesktop().browse(new URI(direccion));

        } catch (URISyntaxException ex) {

            System.out.println(ex);

        }
    }

    public void borrar(int i) {

        canciones.remove(i);
        guardado=false;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadir;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
/*==============================================================================*/
