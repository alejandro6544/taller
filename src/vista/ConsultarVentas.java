/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControllerCliente;
import control.ControllerConceptoVenta;
import control.ControllerVenta;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ConceptoVentas;
import modelo.Venta;
import modelo.Venta1;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author David
 */
public class ConsultarVentas extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarVentas
     */
    LinkedList<Venta> lv;
    LinkedList<Venta1> lv1;
    String fecha1;
    String fecha2;
    String nombreCliente;
    String nombreConcepto;
    String year1;
    String month1;
    String day1;
    String year2;
    String month2;
    String day2;

    public ConsultarVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    DefaultTableModel modelo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("Buscar Ventas por Fecha");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione Fecha Inicial");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Seleccione Fecha Final");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Guardar Archivo Excel");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lv1 = new LinkedList<>();
        Calendar fechaInicial1 = jDateChooser1.getCalendar();
        Calendar fechaFin1 = jDateChooser2.getCalendar();

        year1 = String.valueOf(fechaInicial1.get(Calendar.YEAR));
        month1 = String.valueOf(fechaInicial1.get(Calendar.MONTH) + 1);
        day1 = String.valueOf(fechaInicial1.get(Calendar.DAY_OF_MONTH));

        year2 = String.valueOf(fechaFin1.get(Calendar.YEAR));
        month2 = String.valueOf(fechaFin1.get(Calendar.MONTH) + 1);
        day2 = String.valueOf(fechaFin1.get(Calendar.DAY_OF_MONTH));

        fecha1 = year1 + "-" + month1 + "-" + day1;//+" 00:00:00"
        fecha2 = year2 + "-" + month2 + "-" + day2;//+" 00:00:00"

        ControllerVenta objcv = new ControllerVenta();
        lv = objcv.consultarVentas(fecha1, fecha2);
        ControllerCliente objcc = new ControllerCliente();
        ControllerConceptoVenta objccv = new ControllerConceptoVenta();
        /*
        creaci??n de tabla primera fila
         */
        String[] columnname = {"FECHA Y HORA", "NOMBRE CLIENTE", "DOCUMENTO", "CONCEPTO VENTA", "DESCRIPCION", "MEDIDA", "CAN.", "ENTRADA"};
        //
        //Se trae la venta, es necesario buscar el nombre del cliente y el concepto para mostrar en la tabla
        modelo = new DefaultTableModel();
        modelo.addColumn("FECHA Y HORA");
        modelo.addColumn("NOMBRE CLIENTE");
        modelo.addColumn("DOCUMENTO");
        modelo.addColumn("CONCEPTO VENTA");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("MEDIDA");
        modelo.addColumn("CAN.");
        modelo.addColumn("ENTRADA");

        for (int i = 0; i < lv.size(); i++) {
            Venta get = lv.get(i);
            String idcliente = get.getIdclientefk();
            Cliente cliente = objcc.consultarCliente(idcliente);
            nombreCliente = cliente.getNombre1cliente() + " " + cliente.getApellido1cliente();
            int idconcepto = get.getIdConceptofk();
//            System.out.println("Venta " + get.toString() + "\n");
//            System.out.println("Nombre cliente " + nombreCliente);
            ConceptoVentas concepto = objccv.buscarConceptosVentas(idconcepto);
            nombreConcepto = concepto.getNombreConcepto();
//            System.out.println("Concepto Venta " + nombreConcepto);
            String[] rowInfo = new String[columnname.length];
            rowInfo[0] = get.getFechaventa();
            rowInfo[1] = nombreCliente;
            rowInfo[2] = get.getIdventa();
            rowInfo[3] = nombreConcepto;
            rowInfo[4] = get.getDescripcionventa();
            rowInfo[5] = get.getMedidaventa();
            rowInfo[6] = String.valueOf(get.getCantidad());
            rowInfo[7] = String.valueOf(get.getValorentrada());

            modelo.addRow(rowInfo);
            lv1.add(new Venta1(get.getIdventa(), get.getDescripcionventa(), get.getMedidaventa(), get.getCantidad(), get.getValorentrada(), nombreCliente, nombreConcepto, get.getFechaventa()));
        }

        //JTable jj=new JTable
        jTable1.setModel(modelo);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //
        String ruta = "";
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            ruta = fichero.getAbsolutePath();
            ruta += "\\";
            //System.out.println("ruta " + fichero.getAbsolutePath());
        }
        //

        String[] columnname = {"FECHA Y HORA", "NOMBRE CLIENTE", "DOCUMENTO", "CONCEPTO VENTA", "DESCRIPCION", "MEDIDA", "CAN.", "ENTRADA"};

        ///
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("VENTAS");

        Object empdate[][] = new Object[lv1.size() + 1][columnname.length];
        int rows = empdate.length;
        int cols = empdate[0].length;
        for (int i = 0; i < 1; i++) {
            //Object[] objects = empdate[i];
            for (int j = 0; j < cols; j++) {
                Object object = columnname[j];
                empdate[i][j] = object;
            }
        }

        //llenar las demas filas con los datos de la lista
        for (int i = 1; i < rows; i++) {
            Venta1 v = lv1.get(i - 1);
            for (int j = 0; j < cols; j++) {
                if (j == 0) {
                    empdate[i][j] = v.getFechaventa();
                }
                if (j == 1) {
                    empdate[i][j] = v.getNombrecliente();
                }
                if (j == 2) {
                    empdate[i][j] = v.getIdventa();
                }
                if (j == 3) {
                    empdate[i][j] = v.getConcepto();
                }
                if (j == 4) {
                    empdate[i][j] = v.getDescripcionventa();
                }
                if (j == 5) {
                    empdate[i][j] = v.getMedidaventa();
                }
                if (j == 6) {
                    empdate[i][j] = v.getCantidad();
                }
                if (j == 7) {
                    empdate[i][j] = v.getValorentrada();
                }

            }

        }

//        System.out.println(rows);
//        System.out.println(cols);
        for (int r = 0; r < rows; r++) {
            XSSFRow row = sheet.createRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.createCell(c);
                Object value = empdate[r][c];

                if (value instanceof String) {
                    cell.setCellValue((String) value);
                }
                if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                }
                if (value instanceof Boolean) {
                    cell.setCellValue((Boolean) value);
                }
                if (value instanceof Double) {
                    cell.setCellValue((Double) value);
                }
            }

        }
        String path = ruta + "archivoMes_" + month2 + ".xlsx";
        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream(path);
            workbook.write(outFile);
            outFile.close();
            System.out.println("se guardo con exito");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainExcel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainExcel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
