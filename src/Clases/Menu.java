
package Clases;


import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.*;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
     int nroFilas=0;
    PrintWriter pw;
    Scanner sc;
    String fcanciones = "fcanciones.txt";
    String delim = ",";
    ArrayList<Cancion> canciones=new ArrayList();
    int bucle;
    String linea;
    boolean guardado=true;
 
    public Menu(JTable tabla) {
        
        this.tabla=tabla;
    }

    public Menu(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameA�adir = new javax.swing.JFrame();
        a�adirTitulo = new javax.swing.JTextField();
        a�adirInterprete = new javax.swing.JTextField();
        a�adirAlbum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        a�adirURL = new javax.swing.JTextField();
        a�adirGenero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        guardarCancion = new javax.swing.JButton();
        buscarFrame = new javax.swing.JFrame();
        parametro = new javax.swing.JComboBox();
        nombreParam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBuscar = new javax.swing.JTable();
        buscarEx = new javax.swing.JButton();
        opciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();
        BotonA�adir = new javax.swing.JButton();
        BotonMostrar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        frameA�adir.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a�adirTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a�adirTituloActionPerformed(evt);
            }
        });

        jLabel2.setText("T�tulo");

        jLabel3.setText("Int�rprete");

        jLabel4.setText("�lbum");

        jLabel5.setText("G�nero");

        jLabel6.setText("URL");

        a�adirGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a�adirGeneroActionPerformed(evt);
            }
        });

        jLabel7.setText("A�ADIR CANCI�N");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        guardarCancion.setText("Guardar");
        guardarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameA�adirLayout = new javax.swing.GroupLayout(frameA�adir.getContentPane());
        frameA�adir.getContentPane().setLayout(frameA�adirLayout);
        frameA�adirLayout.setHorizontalGroup(
            frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameA�adirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameA�adirLayout.createSequentialGroup()
                        .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameA�adirLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(16, 16, 16))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameA�adirLayout.createSequentialGroup()
                        .addGap(0, 93, Short.MAX_VALUE)
                        .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameA�adirLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameA�adirLayout.createSequentialGroup()
                                .addComponent(guardarCancion)
                                .addGap(34, 34, 34))))))
            .addGroup(frameA�adirLayout.createSequentialGroup()
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addGroup(frameA�adirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar)
                    .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(a�adirGenero)
                        .addComponent(a�adirURL, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addComponent(a�adirInterprete)
                        .addComponent(a�adirTitulo)
                        .addComponent(a�adirAlbum)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frameA�adirLayout.setVerticalGroup(
            frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameA�adirLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a�adirTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a�adirInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a�adirAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(a�adirGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(a�adirURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(frameA�adirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(guardarCancion))
                .addContainerGap())
        );

        parametro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T�tulo", "Int�rprete", "�lbum", "G�nero" }));

        nombreParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreParamActionPerformed(evt);
            }
        });

        jLabel8.setText("Par�metro a buscar:");

        tablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Int�rprete", "�lbum", "G�nero", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaBuscar);

        buscarEx.setText("Buscar");
        buscarEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarExActionPerformed(evt);
            }
        });

        opciones.setText("Opciones");
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buscarFrameLayout = new javax.swing.GroupLayout(buscarFrame.getContentPane());
        buscarFrame.getContentPane().setLayout(buscarFrameLayout);
        buscarFrameLayout.setHorizontalGroup(
            buscarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(nombreParam, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(buscarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opciones)
                    .addComponent(buscarEx))
                .addGap(33, 33, 33))
        );
        buscarFrameLayout.setVerticalGroup(
            buscarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscarEx)
                .addGap(4, 4, 4)
                .addGroup(buscarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(opciones))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor de M�sica Borja ft.Yago");
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

        BotonA�adir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        BotonA�adir.setText("A�adir Cancion");
        BotonA�adir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonA�adirActionPerformed(evt);
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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Int�prete", "�lbum", "G�nero", "URL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonA�adir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonMostrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BotonA�adir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
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

        buscarFrame.setVisible(true);
          buscarFrame.setSize(590, 500);
        buscarFrame.setLocationRelativeTo(null);
        
        guardado=false;
        /**
        boolean existe = false; String[] choices = {"Abrir", "Borrar", "Siguiente canción"};
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
**/
    }//GEN-LAST:event_BotonBuscarActionPerformed

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public int getNroFilas() {
        return nroFilas;
    }

    public void setNroFilas(int nroFilas) {
        this.nroFilas = nroFilas;
    }

    /**
    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
    
        frameAñadir.setVisible(true);
        frameA�adir.setSize(350, 300);
        frameAñadir.setLocationRelativeTo(null);
        
        guardado=false;
    }//GEN-LAST:event_BotonAñadirActionPerformed
**/
        private void BotonA�adirActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
        frameA�adir.setVisible(true);
        frameA�adir.setSize(350, 300);
        frameA�adir.setLocationRelativeTo(null);
        
        guardado=false;
    }    
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
       int cursorF = 0;
        Connection conn = null;
        Conectar m = new Conectar();
        conn= m.conexion();
        try {
            Statement s;
            s = conn.createStatement();

            s.executeUpdate("delete from app.canciones");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (cursorF < tabla.getRowCount()) {

      

            String titulo1 = tabla.getValueAt(cursorF, 0).toString();
            String interprete1 = tabla.getValueAt(cursorF, 1).toString();
             String album1 = tabla.getValueAt(cursorF, 2).toString();
             String genero1=tabla.getValueAt(cursorF, 3).toString();
             String url1=tabla.getValueAt(cursorF,4).toString();
            cursorF++;
           try {
                Statement s;
                s = conn.createStatement();
                s.executeUpdate("insert into app.canciones values('" + titulo1 + "','" + interprete1 + "','"+album1+"','"+genero1+"','"+url1+"')");
                guardado=true;
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (guardado==true){
            JOptionPane.showMessageDialog(null, "Canciones guardadas en la base de datos");
        }else{
            JOptionPane.showMessageDialog(null, "Error en el guardado");
        }
   
        
    }//GEN-LAST:event_BotonGuardarActionPerformed
/**
    private void añadirTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirTituloActionPerformed
 **/
  private void a�adirTituloActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             
private void a�adirGeneroActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }   
/**
    private void añadirGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirGeneroActionPerformed
**/
    private void guardarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCancionActionPerformed

       

        DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tabla.getModel();

        modeloDeMiTabla.addRow(new Object[nroFilas]);

        tabla.setValueAt(a�adirTitulo.getText(), nroFilas, 0);
        tabla.setValueAt(a�adirInterprete.getText(),nroFilas, 1);
        tabla.setValueAt(a�adirAlbum.getText(), nroFilas, 2);
        tabla.setValueAt(a�adirGenero.getText(),nroFilas, 3);
        tabla.setValueAt(a�adirURL.getText(), nroFilas, 4);

        nroFilas++;

        
        frameA�adir.setVisible(false);

    }//GEN-LAST:event_guardarCancionActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       frameA�adir.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void nombreParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreParamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreParamActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tablaBuscar.getModel();
         try {
             abrir(tablaBuscar.getValueAt(tablaBuscar.getSelectedRow(), 4).toString());
             /** String[] choices = {"Abrir", "Borrar", "Siguiente canción"};
              * int respuesta = JOptionPane.showOptionDialog(null, "¿Deseas abrirla o borrarla?", null, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null);
              * switch (respuesta) {
              * case 0:
              * abrir(url);
              * break;
              * case 1:
              * String[] elegir = {"Sí","No"};
              * int confirmar=JOptionPane.showOptionDialog(null, "¿Seguro que quieres borrar?", null,JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE ,null,elegir,null);
              * switch (confirmar) {
              * case 0:
              * borrar(i);
              * break;
              * case 1:
              * break;
              * }        // TODO add your handling code here:
              * 
              * }

        /** String[] choices = {"Abrir", "Borrar", "Siguiente canción"};
        int respuesta = JOptionPane.showOptionDialog(null, "¿Deseas abrirla o borrarla?", null, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices, null);
                    switch (respuesta) {
                        case 0:
                            abrir(url);
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
                            }        // TODO add your handling code here:
                            
    }//GEN-LAST:event_opcionesActionPerformed
   **/ } catch (IOException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    private void buscarExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarExActionPerformed
int cursorF;
int  nroFilasBuscar=0;
String titulo, interprete, album,genero, url;
        if(parametro.getSelectedItem()=="Título") {
      cursorF=0;
       while (cursorF < tabla.getRowCount()) {

      if(nombreParam.getText().equals(tabla.getValueAt(cursorF, 0).toString())){

             titulo = tabla.getValueAt(cursorF, 0).toString();
             interprete = tabla.getValueAt(cursorF, 1).toString();
             album = tabla.getValueAt(cursorF, 2).toString();
              genero=tabla.getValueAt(cursorF, 3).toString();
              url=tabla.getValueAt(cursorF,4).toString();
            cursorF++;
            
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tablaBuscar.getModel();

        modeloDeMiTabla.addRow(new Object[nroFilasBuscar]);

        tablaBuscar.setValueAt(titulo, nroFilasBuscar, 0);
        tablaBuscar.setValueAt(interprete,nroFilasBuscar, 1);
        tablaBuscar.setValueAt(album, nroFilasBuscar, 2);
        tablaBuscar.setValueAt(genero,nroFilasBuscar, 3);
        tablaBuscar.setValueAt(url, nroFilasBuscar, 4);

        nroFilasBuscar++;

        
       
      }
       }
  } else if(parametro.getSelectedItem()=="Intérprete"){
      cursorF=0;
       while (cursorF < tabla.getRowCount()) {

      if(nombreParam.getText().equals(tabla.getValueAt(cursorF, 1).toString())){

             titulo = tabla.getValueAt(cursorF, 0).toString();
             interprete = tabla.getValueAt(cursorF, 1).toString();
             album = tabla.getValueAt(cursorF, 2).toString();
              genero=tabla.getValueAt(cursorF, 3).toString();
              url=tabla.getValueAt(cursorF,4).toString();
            cursorF++;
            
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tablaBuscar.getModel();

        modeloDeMiTabla.addRow(new Object[nroFilasBuscar]);

        tablaBuscar.setValueAt(titulo, nroFilasBuscar, 0);
        tablaBuscar.setValueAt(interprete,nroFilasBuscar, 1);
        tablaBuscar.setValueAt(album, nroFilasBuscar, 2);
        tablaBuscar.setValueAt(genero,nroFilasBuscar, 3);
        tablaBuscar.setValueAt(url, nroFilasBuscar, 4);

        nroFilasBuscar++;
      }}
      
  }else if(parametro.getSelectedItem()=="�?lbum"){
      cursorF=0;
      
       while (cursorF < tabla.getRowCount()) {

      if(nombreParam.getText().equals(tabla.getValueAt(cursorF, 2).toString())){

             titulo = tabla.getValueAt(cursorF, 0).toString();
             interprete = tabla.getValueAt(cursorF, 1).toString();
             album = tabla.getValueAt(cursorF, 2).toString();
              genero=tabla.getValueAt(cursorF, 3).toString();
              url=tabla.getValueAt(cursorF,4).toString();
            cursorF++;
            
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tablaBuscar.getModel();

        modeloDeMiTabla.addRow(new Object[nroFilasBuscar]);

        tablaBuscar.setValueAt(titulo, nroFilasBuscar, 0);
        tablaBuscar.setValueAt(interprete,nroFilasBuscar, 1);
        tablaBuscar.setValueAt(album, nroFilasBuscar, 2);
        tablaBuscar.setValueAt(genero,nroFilasBuscar, 3);
        tablaBuscar.setValueAt(url, nroFilasBuscar, 4);

        nroFilasBuscar++;
      }}
      
  }else if(parametro.getSelectedItem()=="Genero"){
      cursorF=0;
       while (cursorF < tabla.getRowCount()) {

      if(nombreParam.getText().equals(tabla.getValueAt(cursorF, 3).toString())){

             titulo = tabla.getValueAt(cursorF, 0).toString();
             interprete = tabla.getValueAt(cursorF, 1).toString();
             album = tabla.getValueAt(cursorF, 2).toString();
              genero=tabla.getValueAt(cursorF, 3).toString();
              url=tabla.getValueAt(cursorF,4).toString();
            cursorF++;
            
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tablaBuscar.getModel();

        modeloDeMiTabla.addRow(new Object[nroFilasBuscar]);

        tablaBuscar.setValueAt(titulo, nroFilasBuscar, 0);
        tablaBuscar.setValueAt(interprete,nroFilasBuscar, 1);
        tablaBuscar.setValueAt(album, nroFilasBuscar, 2);
        tablaBuscar.setValueAt(genero,nroFilasBuscar, 3);
        tablaBuscar.setValueAt(url, nroFilasBuscar, 4);

        nroFilasBuscar++;
      }}
  }
    }//GEN-LAST:event_buscarExActionPerformed

    public void abrir(String url) throws IOException {

//        iniciarVideo(url);
        /**String direccion = canciones.get(i).getUrl();

        try {

            Desktop.getDesktop().browse(new URI(direccion));

        } catch (URISyntaxException ex) {

            System.out.println(ex);

        }
        * */
    }

    public void borrar(int i) {

        canciones.remove(i);
        guardado=false;
    }

    public static void main(String args[]) throws SQLException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
               
            }
            
        });
    }
  
     public  void insertarInicio() throws SQLException {

        Connection conn = null;
        Conectar m = new Conectar();
        conn = m.conexion();

        Statement s = conn.createStatement();
        s.execute("select * from app.canciones");
        ResultSet rs = s.getResultSet();

        while (rs.next()) {
            DefaultTableModel modeloDeMiTabla = (DefaultTableModel) tabla.getModel();

            modeloDeMiTabla.addRow(new Object[nroFilas]);

            tabla.setValueAt(rs.getString("titulo"), nroFilas, 0);  
            tabla.setValueAt(rs.getString("interprete"), nroFilas, 1);
           tabla.setValueAt(rs.getString("album"), nroFilas, 2); 
           tabla.setValueAt(rs.getString("genero"), nroFilas, 3); 
            tabla.setValueAt(rs.getString("url"), nroFilas, 4);
            
                     
            nroFilas++;
        }
            conn.close();
            s.close();

         
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA�adir;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonMostrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField a�adirAlbum;
    private javax.swing.JTextField a�adirGenero;
    private javax.swing.JTextField a�adirInterprete;
    private javax.swing.JTextField a�adirTitulo;
    private javax.swing.JTextField a�adirURL;
    private javax.swing.JButton buscarEx;
    private javax.swing.JFrame buscarFrame;
    private javax.swing.JButton cancelar;
    private javax.swing.JFrame frameA�adir;
    private javax.swing.JButton guardarCancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreParam;
    private javax.swing.JButton opciones;
    private javax.swing.JComboBox parametro;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaBuscar;
    // End of variables declaration//GEN-END:variables
 
 /**
public void iniciarVideo(String url){
    final String theurl=url;
    NativeInterface.open();
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            JFrame frame = new JFrame("YouTube Viewer");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.getContentPane().add(getBrowserPanel(theurl), BorderLayout.CENTER);
            frame.setSize(800, 600);
            frame.setLocationByPlatform(true);
            frame.setVisible(true);
        }
    });
    NativeInterface.runEventPump();
    // don't forget to properly close native components
    Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
        @Override
        public void run() {
            NativeInterface.close();
        }
    }));
}

public  JPanel getBrowserPanel(String url) {
    JPanel webBrowserPanel = new JPanel(new BorderLayout());
    JWebBrowser webBrowser = new JWebBrowser();
    webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
    webBrowser.setBarsVisible(false);
    webBrowser.navigate("http://www.youtube.com/watch?v=iM-RhdTU3Gk");
    return webBrowserPanel;
}
    }
**/
/*==============================================================================*/
}