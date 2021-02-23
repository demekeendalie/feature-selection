
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demopage extends javax.swing.JFrame {

    ArrayList<String> list;

    public Demopage() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gain = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        Df = new javax.swing.JButton();
        chi = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gain.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        gain.setText("IG");
        gain.setActionCommand("Information gain");
        gain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gainActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        area.setColumns(20);
        area.setFont(new java.awt.Font("Power Geez Unicode2", 0, 13)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        Df.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Df.setText("DF");
        Df.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DfActionPerformed(evt);
            }
        });

        chi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chi.setText("x2");
        chi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Newmodel", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Justice", "Agriculture", "politics", "Technology", "health", "Army" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DFthroshold", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Law", "Agriculture", "politics", "Technology", "health", "Army", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Intersection", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Justice", "Agriculture", "politics", "Technology", "health", "Army" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Union Feature", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Justice", "Agriculture", "politics", "Technology", "health", "Army" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setText("allsize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chi square throshold", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Law", "Agriculture", "politics", "Technology", "health", "Army" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "InformationGain", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Justice", "Agriculture", "politics", "Technology", "health", "Army" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Test_doc");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Whole", "Economy", "Education", "Sport", "Culture", "Accident", "Environment", "Deplomacy", "Justice", "Agriculture", "politics", "Technology", "health", "Army" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jButton3.setText("Unique");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chi)
                                    .addComponent(Df)
                                    .addComponent(gain, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gain)
                        .addGap(18, 18, 18)
                        .addComponent(Df))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chi)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)
                        .addGap(79, 79, 79)
                        .addComponent(jButton1))
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gainActionPerformed
        // TODO add your handling code here: 

//        read();
//        informationGain(depfeature, 7,3);
//        List data = new ArrayList(informationgaindep.keySet());
//        List value = new ArrayList(informationgainagri.values());
//        for (int i = 0; i < data.size(); i++) {
//            area.append(data.get(i).toString() + "\n");
//        }

    }//GEN-LAST:event_gainActionPerformed

    private void DfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DfActionPerformed
        // TODO add your handling code here:
        //document frequency calculation
        read();
        documentFrequncy(ecofeature, 1, 40);
        List data = new ArrayList(documntfrequencyeco.keySet());
        List value = new ArrayList(documntfrequencyeco.values());
        for (int i = 0; i < data.size(); i++) {
            area.append(data.get(i).toString() + "       " + value.get(i) + "\n");
        }
        System.out.println(data.size());

    }//GEN-LAST:event_DfActionPerformed

    private void chiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiActionPerformed
        // TODO add your handling code here:
        read();
        chi_Sqare(ecofeature, 1, 40);
        List data = new ArrayList(chisqareeco.keySet());
        List value = new ArrayList(chisqareeco.values());
        for (int i = 0; i < data.size(); i++) {
            area.append(data.get(i).toString() + "       " + value.get(i) + "\n");
        }
        System.out.println(data.size());
    }//GEN-LAST:event_chiActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count14 + count12 + count13;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        if (jComboBox2.getSelectedItem() == "Economy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\econew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = 0; i < newunion.size(); i++) {
                Cell cell1 = r.createCell(i);
                cell1.setCellValue(newunion.get(i));
            }
            for (int i = 0; i < count1; i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < newunion.size(); j++) {
                    Cell cell = row.createCell(j);
                    if (economydocument[i].contains(newunion.get(j))) {
                        temp = newunion.get(j);
                        d = DF(temp);
                        fre = Collections.frequency(economydocument[i], temp);
                        tf = (double) fre / economydocument[i].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(0);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Education") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\edunew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int j = 0; j < count2; j++) {
                Row row = sheet.createRow(j + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (educationdocument[j].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[j], temp);
                        tf = ((double) fre / educationdocument[j].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(1);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox2.getSelectedItem() == "Sport") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\sponew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int k = 0; k < count3; k++) {
                Row row = sheet.createRow(k + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (sportdocument[k].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[k], temp);
                        tf = ((double) fre / sportdocument[k].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(2);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox2.getSelectedItem() == "Culture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\culnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int cu = 0; cu < count4; cu++) {
                Row row = sheet.createRow(cu + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (culturedocument[cu].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[cu], temp);
                        tf = ((double) fre / culturedocument[cu].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(3);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Accident") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\accnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int acc = 0; acc < count5; acc++) {
                Row row = sheet.createRow(acc + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (accedentdocument[acc].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        fre = Collections.frequency(accedentdocument[acc], temp);
                        tf = ((double) fre / accedentdocument[acc].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(4);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Environment") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\envnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int env = 0; env < count6; env++) {
                Row row = sheet.createRow(env + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (environmntaldocument[env].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[env], temp);
                        tf = ((double) fre / environmntaldocument[env].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(5);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Deplomacy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\depnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int dep = 0; dep < count7; dep++) {
                Row row = sheet.createRow(dep + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (foreign_affairdocument[dep].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[dep], temp);
                        tf = ((double) fre / foreign_affairdocument[dep].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(6);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Justice") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\lawnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int law = 0; law < count8; law++) {
                Row row = sheet.createRow(law + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (law_justicedocument[law].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        fre = Collections.frequency(law_justicedocument[law], temp);
                        tf = ((double) fre / law_justicedocument[law].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(7);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Agriculture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\agrnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ag = 0; ag < count9; ag++) {
                Row row = sheet.createRow(ag + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (agriculture[ag].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ag], temp);
                        tf = ((double) fre / agriculture[ag].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(8);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (jComboBox2.getSelectedItem() == "politics") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\polnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int pol = 0; pol < count10; pol++) {
                Row row = sheet.createRow(pol + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (politicsdocument[pol].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[pol], temp);
                        tf = ((double) fre / politicsdocument[pol].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(9);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Technology") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\scinew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int sci = 0; sci < count12; sci++) {
                Row row = sheet.createRow(sci + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (science_technologydocument[sci].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[sci], temp);
                        tf = ((double) fre / science_technologydocument[sci].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(10);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "health") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\helnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int he = 0; he < count13; he++) {
                Row row = sheet.createRow(he + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (healthdocument[he].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[he], temp);
                        tf = ((double) fre / healthdocument[he].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(11);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox2.getSelectedItem() == "Army") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\armnew" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ar = 0; ar < count14; ar++) {
                Row row = sheet.createRow(ar + count);
                for (int l = 0; l < newunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (army[ar].contains(newunion.get(l))) {
                        temp = newunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(army[ar], temp);
                        tf = ((double) fre / army[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(newunion.size());
                lable.setCellValue(12);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count12 + count13 + count14;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        if (jComboBox1.getSelectedItem() == "Economy") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\ecodf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = 0; i < count1; i++) {
                Row row = sheet.createRow(i + count);
                for (int j = 0; j < dfunion.size(); j++) {
                    Cell cell = row.createCell(j);
                    if (economydocument[i].contains(dfunion.get(j))) {
                        temp = dfunion.get(j);
                        d = DF(temp);
                        fre = Collections.frequency(economydocument[i], temp);
                        tf = (double) fre / economydocument[i].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(0);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } else if (jComboBox1.getSelectedItem() == "Education") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\edudf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int j = 0; j < count2; j++) {
                Row row = sheet.createRow(j + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (educationdocument[j].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[j], temp);
                        tf = (double) fre / educationdocument[j].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(1);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Sport") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\spodf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int k = 0; k < count3; k++) {
                Row row = sheet.createRow(k + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (sportdocument[k].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[k], temp);
                        tf = (double) fre / sportdocument[k].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(2);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Culture") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\culdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int cu = 0; cu < count4; cu++) {
                Row row = sheet.createRow(cu + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (culturedocument[cu].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[cu], temp);
                        tf = ((double) fre / culturedocument[cu].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(3);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Accident") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\accdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int acc = 0; acc < count5; acc++) {
                Row row = sheet.createRow(acc + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (accedentdocument[acc].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(accedentdocument[acc], temp);
                        tf = ((double) fre / accedentdocument[acc].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(4);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Environment") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\envdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int env = 0; env < count6; env++) {
                Row row = sheet.createRow(env + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (environmntaldocument[env].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[env], temp);
                        tf = ((double) fre / environmntaldocument[env].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(5);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Deplomacy") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\depdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int dep = 0; dep < count7; dep++) {
                Row row = sheet.createRow(dep + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (foreign_affairdocument[dep].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[dep], temp);
                        tf = ((double) fre / foreign_affairdocument[dep].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(6);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox1.getSelectedItem() == "Law") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\jusdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int law = 0; law < count8; law++) {
                Row row = sheet.createRow(law + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (law_justicedocument[law].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(law_justicedocument[law], temp);
                        tf = ((double) fre / law_justicedocument[law].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(7);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } else if (jComboBox1.getSelectedItem() == "Agriculture") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\agrdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ag = 0; ag < count9; ag++) {
                Row row = sheet.createRow(ag + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (agriculture[ag].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ag], temp);
                        tf = ((double) fre / agriculture[ag].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(8);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "politics") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\poldf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int pol = 0; pol < count10; pol++) {
                Row row = sheet.createRow(pol + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (politicsdocument[pol].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[pol], temp);
                        tf = ((double) fre / politicsdocument[pol].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(9);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Technology") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\scidf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int sci = 0; sci < count12; sci++) {
                Row row = sheet.createRow(sci + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (science_technologydocument[sci].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[sci], temp);
                        tf = ((double) fre / science_technologydocument[sci].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(10);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "health") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\heldf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int he = 0; he < count13; he++) {
                Row row = sheet.createRow(he + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (healthdocument[he].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[he], temp);
                        tf = ((double) fre / healthdocument[he].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(11);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox1.getSelectedItem() == "Army") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\DF features\\features\\armdf" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ar = 0; ar < count14; ar++) {
                Row row = sheet.createRow(ar + count);
                for (int l = 0; l < dfunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (army[ar].contains(dfunion.get(l))) {
                        temp = dfunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(army[ar], temp);
                        tf = ((double) fre / army[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(dfunion.size());
                lable.setCellValue(12);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count12 + count13 + count14;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        if (jComboBox3.getSelectedItem() == "Economy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\ecoin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = 0; i < count1; i++) {
                Row row = sheet.createRow(i + count);
                for (int j = 0; j < interunion.size(); j++) {
                    Cell cell = row.createCell(j);
                    if (economydocument[i].contains(interunion.get(j))) {
                        fre = Collections.frequency(economydocument[i], interunion.get(j));
                        d = DF(interunion.get(j));
                        tf = (double) fre / economydocument[i].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);

                    } else {
                        cell.setCellValue(0);
                    }

                }

                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(0);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Education") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\eduin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int j = 0; j < count2; j++) {
                Row row = sheet.createRow(j + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (educationdocument[j].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[j], temp);
                        tf = (double) fre / educationdocument[j].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(1);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox3.getSelectedItem() == "Sport") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\spoin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int k = 0; k < count3; k++) {
                Row row = sheet.createRow(k + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (sportdocument[k].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[k], temp);
                        tf = (double) fre / sportdocument[k].size();
                        d = DF(temp);
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(2);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox3.getSelectedItem() == "Culture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\culin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int cu = 0; cu < count4; cu++) {
                Row row = sheet.createRow(cu + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (culturedocument[cu].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[cu], temp);
                        tf = (double) fre / culturedocument[cu].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);

                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(3);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Accident") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\accin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int acc = 0; acc < count5; acc++) {
                Row row = sheet.createRow(acc + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (accedentdocument[acc].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(accedentdocument[acc], temp);
                        tf = (double) fre / accedentdocument[acc].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(4);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox3.getSelectedItem() == "Environment") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\envin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int env = 0; env < count6; env++) {
                Row row = sheet.createRow(env + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (environmntaldocument[env].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[env], temp);
                        tf = (double) fre / environmntaldocument[env].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(5);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Deplomacy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\depin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int dep = 0; dep < count7; dep++) {
                Row row = sheet.createRow(dep + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (foreign_affairdocument[dep].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[dep], temp);
                        tf = (double) fre / foreign_affairdocument[dep].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(6);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Justice") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\lawin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int law = 0; law < count8; law++) {
                Row row = sheet.createRow(law + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (law_justicedocument[law].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(law_justicedocument[law], temp);
                        tf = (double) fre / law_justicedocument[law].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(7);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Agriculture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\agrin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ag = 0; ag < count9; ag++) {
                Row row = sheet.createRow(ag + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (agriculture[ag].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ag], temp);
                        tf = (double) fre / agriculture[ag].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(8);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (jComboBox3.getSelectedItem() == "politics") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\polin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int pol = 0; pol < count10; pol++) {
                Row row = sheet.createRow(pol + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (politicsdocument[pol].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[pol], temp);
                        tf = (double) fre / politicsdocument[pol].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(9);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Technology") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\sciin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int sci = 0; sci < count12; sci++) {
                Row row = sheet.createRow(sci + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (science_technologydocument[sci].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[sci], temp);
                        tf = (double) fre / science_technologydocument[sci].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(10);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "health") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\helin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int he = 0; he < count13; he++) {
                Row row = sheet.createRow(he + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (healthdocument[he].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[he], temp);
                        tf = (double) fre / healthdocument[he].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(11);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox3.getSelectedItem() == "Army") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Intersection\\feature\\armin" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ar = 0; ar < count14; ar++) {
                Row row = sheet.createRow(ar + count);
                for (int l = 0; l < interunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (army[ar].contains(interunion.get(l))) {
                        temp = interunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(army[ar], temp);
                        tf = (double) fre / army[ar].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(interunion.size());
                lable.setCellValue(12);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        //union features of the three feature selection techniques
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count14 + count12 + count13;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        if (jComboBox4.getSelectedItem() == "Economy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\ecoun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = 0; i < count1; i++) {
                Row row = sheet.createRow(i + count);
                for (int j = 0; j < union_3.size(); j++) {
                    Cell cell = row.createCell(j);
                    if (economydocument[i].contains(union_3.get(j))) {
                        temp = union_3.get(j);
                        d = DF(temp);
                        fre = Collections.frequency(economydocument[i], temp);
                        tf = ((double) fre / economydocument[i].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(0);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Education") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\eduun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int j = 0; j < count2; j++) {
                Row row = sheet.createRow(j + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (educationdocument[j].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[j], temp);
                        tf = ((double) fre / educationdocument[j].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(1);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox4.getSelectedItem() == "Sport") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\spoun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int k = 0; k < count3; k++) {
                Row row = sheet.createRow(k + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (sportdocument[k].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[k], temp);
                        tf = ((double) fre / sportdocument[k].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(2);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox4.getSelectedItem() == "Culture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\culun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int cu = 0; cu < count4; cu++) {
                Row row = sheet.createRow(cu + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (culturedocument[cu].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[cu], temp);
                        tf = ((double) fre / culturedocument[cu].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(3);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Accident") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\accun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int acc = 0; acc < count5; acc++) {
                Row row = sheet.createRow(acc + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (accedentdocument[acc].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(accedentdocument[acc], temp);
                        tf = ((double) fre / accedentdocument[acc].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(4);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Environment") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\envun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int env = 0; env < count6; env++) {
                Row row = sheet.createRow(env + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (environmntaldocument[env].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[env], temp);
                        tf = ((double) fre / environmntaldocument[env].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(5);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Deplomacy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\depun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int dep = 0; dep < count7; dep++) {
                Row row = sheet.createRow(dep + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (foreign_affairdocument[dep].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[dep], temp);
                        tf = ((double) fre / foreign_affairdocument[dep].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(6);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Justice") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\lawun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int law = 0; law < count8; law++) {
                Row row = sheet.createRow(law + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (law_justicedocument[law].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(law_justicedocument[law], temp);
                        tf = ((double) fre / law_justicedocument[law].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(7);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Agriculture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\agrun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ag = 0; ag < count9; ag++) {
                Row row = sheet.createRow(ag + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (agriculture[ag].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ag], temp);
                        tf = ((double) fre / agriculture[ag].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(8);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (jComboBox4.getSelectedItem() == "politics") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\polun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int pol = 0; pol < count10; pol++) {
                Row row = sheet.createRow(pol + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (politicsdocument[pol].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[pol], temp);
                        tf = ((double) fre / politicsdocument[pol].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(9);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Technology") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\sciun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int sci = 0; sci < count12; sci++) {
                Row row = sheet.createRow(sci + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (science_technologydocument[sci].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[sci], temp);
                        tf = ((double) fre / science_technologydocument[sci].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(10);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "health") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\helun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int he = 0; he < count13; he++) {
                Row row = sheet.createRow(he + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (healthdocument[he].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[he], temp);
                        tf = ((double) fre / healthdocument[he].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(11);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox4.getSelectedItem() == "Army") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\union\\features\\armun" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ar = 0; ar < count14; ar++) {
                Row row = sheet.createRow(ar + count);
                for (int l = 0; l < union_3.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (army[ar].contains(union_3.get(l))) {
                        temp = union_3.get(l);
                        fre = Collections.frequency(army[ar], temp);
                        tf = ((double) fre / army[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(union_3.size());
                lable.setCellValue(12);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        read();
        total.addAll(all);
//        for (int i = 0; i < total.size(); i++) {
//            area.append(total.get(i) + "\n");
//        }
        System.out.println(total.size());

//        dfUnion();
//        infogainunion();
//        unionChisquare();
//        listallDf.removeAll(listallCH);
//        listallDf.removeAll(listallIG);
//        deme.addAll(listallDf);
//        listallDf.clear();
//        listallDf.addAll(deme);
////        for(String str:listallCH ){
////            if(listallIG.contains(str)){
////                if(listallDf.contains(str)){
////                    deme1.add(str);
////                }
////            }
////        }
//        for (int i = 0; i < listall.size(); i++) {
//            area.append(listall.get(i) + "\n");
//        }
//        System.out.println(listall.size());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count12 + count13 + count14;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        if (jComboBox5.getSelectedItem() == "Economy") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\ecochi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = 0; i < count1; i++) {
                Row row = sheet.createRow(i + count);
                for (int j = 0; j < chiunion.size(); j++) {
                    Cell cell = row.createCell(j);
                    if (economydocument[i].contains(chiunion.get(j))) {
                        temp = chiunion.get(j);
                        d = DF(temp);
                        fre = Collections.frequency(economydocument[i], temp);
                        tf = (double) fre / economydocument[i].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(0);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } else if (jComboBox5.getSelectedItem() == "Education") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\educhi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int j = 0; j < count2; j++) {
                Row row = sheet.createRow(j + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (educationdocument[j].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[j], temp);
                        tf = (double) fre / educationdocument[j].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(1);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Sport") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\spochi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int k = 0; k < count3; k++) {
                Row row = sheet.createRow(k + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (sportdocument[k].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[k], temp);
                        tf = (double) fre / sportdocument[k].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(2);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Culture") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\culchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int cu = 0; cu < count4; cu++) {
                Row row = sheet.createRow(cu + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (culturedocument[cu].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[cu], temp);
                        tf = ((double) fre / culturedocument[cu].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(3);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Accident") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\accchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int acc = 0; acc < count5; acc++) {
                Row row = sheet.createRow(acc + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (accedentdocument[acc].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(accedentdocument[acc], temp);
                        tf = ((double) fre / accedentdocument[acc].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(4);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Environment") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\envchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int env = 0; env < count6; env++) {
                Row row = sheet.createRow(env + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (environmntaldocument[env].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[env], temp);
                        tf = ((double) fre / environmntaldocument[env].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(5);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Deplomacy") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\depchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int dep = 0; dep < count7; dep++) {
                Row row = sheet.createRow(dep + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (foreign_affairdocument[dep].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[dep], temp);
                        tf = ((double) fre / foreign_affairdocument[dep].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(6);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox5.getSelectedItem() == "Law") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\juschi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int law = 0; law < count8; law++) {
                Row row = sheet.createRow(law + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (law_justicedocument[law].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(law_justicedocument[law], temp);
                        tf = ((double) fre / law_justicedocument[law].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(7);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } else if (jComboBox5.getSelectedItem() == "Agriculture") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\agrchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ag = 0; ag < count9; ag++) {
                Row row = sheet.createRow(ag + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (agriculture[ag].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ag], temp);
                        tf = ((double) fre / agriculture[ag].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(8);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "politics") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\polchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int pol = 0; pol < count10; pol++) {
                Row row = sheet.createRow(pol + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (politicsdocument[pol].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[pol], temp);
                        tf = ((double) fre / politicsdocument[pol].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(9);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Technology") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\scichi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int sci = 0; sci < count12; sci++) {
                Row row = sheet.createRow(sci + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (science_technologydocument[sci].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[sci], temp);
                        tf = ((double) fre / science_technologydocument[sci].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(10);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "health") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\helchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int he = 0; he < count13; he++) {
                Row row = sheet.createRow(he + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (healthdocument[he].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[he], temp);
                        tf = ((double) fre / healthdocument[he].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(11);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (jComboBox5.getSelectedItem() == "Army") {
            try {
                feco = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\chisquare\\feature\\armchi" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ar = 0; ar < count14; ar++) {
                Row row = sheet.createRow(ar + count);
                for (int l = 0; l < chiunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (army[ar].contains(chiunion.get(l))) {
                        temp = chiunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(army[ar], temp);
                        tf = ((double) fre / army[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(chiunion.size());
                lable.setCellValue(12);
            }
            try {
                workbook.write(feco);
                System.out.println("sucesss");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count14 + count12 + count13;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        if (jComboBox6.getSelectedItem() == "Economy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\ecoig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int i = 0; i < count1; i++) {
                Row row = sheet.createRow(i + count);
                for (int j = 0; j < igunion.size(); j++) {
                    Cell cell = row.createCell(j);
                    if (economydocument[i].contains(igunion.get(j))) {
                        temp = igunion.get(j);
                        d = DF(temp);
                        fre = Collections.frequency(economydocument[i], temp);
                        tf = (double) fre / economydocument[i].size();
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(0);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Education") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\eduig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int j = 0; j < count2; j++) {
                Row row = sheet.createRow(j + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (educationdocument[j].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[j], temp);
                        tf = ((double) fre / educationdocument[j].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(1);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox6.getSelectedItem() == "Sport") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\spoig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int k = 0; k < count3; k++) {
                Row row = sheet.createRow(k + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (sportdocument[k].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[k], temp);
                        tf = ((double) fre / sportdocument[k].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(2);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        if (jComboBox6.getSelectedItem() == "Culture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\culig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int cu = 0; cu < count4; cu++) {
                Row row = sheet.createRow(cu + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (culturedocument[cu].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[cu], temp);
                        tf = ((double) fre / culturedocument[cu].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(3);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Accident") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\accig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int acc = 0; acc < count5; acc++) {
                Row row = sheet.createRow(acc + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (accedentdocument[acc].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        fre = Collections.frequency(accedentdocument[acc], temp);
                        tf = ((double) fre / accedentdocument[acc].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(4);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Environment") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\envig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int env = 0; env < count6; env++) {
                Row row = sheet.createRow(env + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (environmntaldocument[env].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[env], temp);
                        tf = ((double) fre / environmntaldocument[env].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(5);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Deplomacy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\depig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int dep = 0; dep < count7; dep++) {
                Row row = sheet.createRow(dep + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (foreign_affairdocument[dep].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[dep], temp);
                        tf = ((double) fre / foreign_affairdocument[dep].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(6);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Justice") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\lawig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int law = 0; law < count8; law++) {
                Row row = sheet.createRow(law + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (law_justicedocument[law].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        fre = Collections.frequency(law_justicedocument[law], temp);
                        tf = ((double) fre / law_justicedocument[law].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(7);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Agriculture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\agrig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ag = 0; ag < count9; ag++) {
                Row row = sheet.createRow(ag + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (agriculture[ag].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ag], temp);
                        tf = ((double) fre / agriculture[ag].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(8);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (jComboBox6.getSelectedItem() == "politics") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\polig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int pol = 0; pol < count10; pol++) {
                Row row = sheet.createRow(pol + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (politicsdocument[pol].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[pol], temp);
                        tf = ((double) fre / politicsdocument[pol].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(9);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Technology") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\sciig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int sci = 0; sci < count12; sci++) {
                Row row = sheet.createRow(sci + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (science_technologydocument[sci].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[sci], temp);
                        tf = ((double) fre / science_technologydocument[sci].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(10);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "health") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\helig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int he = 0; he < count13; he++) {
                Row row = sheet.createRow(he + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (healthdocument[he].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[he], temp);
                        tf = ((double) fre / healthdocument[he].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(11);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox6.getSelectedItem() == "Army") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\IGfeatures\\features\\armig" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            for (int ar = 0; ar < count14; ar++) {
                Row row = sheet.createRow(ar + count);
                for (int l = 0; l < igunion.size(); l++) {
                    Cell cell = row.createCell(l);
                    if (army[ar].contains(igunion.get(l))) {
                        temp = igunion.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(army[ar], temp);
                        tf = ((double) fre / army[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
                Cell lable = row.createCell(igunion.size());
                lable.setCellValue(12);
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count14 + count12 + count13;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        try {
            Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\Newmodelfeature\\features\\test3" + ".xlsx"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i <newunion.size(); i++) {
            Cell cell1 = r.createCell(i);
            cell1.setCellValue(newunion.get(i));
        }
        r = sheet.createRow(1);
        for (int j = 0; j < newunion.size(); j++) {
            Cell cell = r.createCell(j);
            if (file_test.contains(newunion.get(j))) {
                temp = newunion.get(j);
                d = DF(temp);
                fre = Collections.frequency(file_test, temp);
                tf = (double) fre / file_test.size();
                idf = (double) n / d;
                idf = Math.log(idf);
                if (idf < 0) {
                    idf = idf * -1;
                }
                tf_idf = tf * idf;
                cell.setCellValue((double) tf_idf);
            } else {
                cell.setCellValue(0);
            }

        }
        try {
            workbook.write(Dfmatrix);
            System.out.println("sucess");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        read();
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count14 + count12 + count13;
        FileOutputStream Dfmatrix = null;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();
        Row r = sheet.createRow(0);
        total.addAll(all);
        System.out.println(total.size());
        if (jComboBox7.getSelectedItem() == "Economy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\ecowhole2" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 120; ar < 180; ar++) {
                    Cell cell = row.createCell(ar);
                    if (economydocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(economydocument[ar], temp);
                        tf = ((double) fre / economydocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Education") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\eduwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count2; ar++) {
                    Cell cell = row.createCell(ar);
                    if (educationdocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(educationdocument[ar], temp);
                        tf = ((double) fre / educationdocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Sport") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\spowhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count3; ar++) {
                    Cell cell = row.createCell(ar);
                    if (sportdocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(sportdocument[ar], temp);
                        tf = ((double) fre / sportdocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Culture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\culwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count4; ar++) {
                    Cell cell = row.createCell(ar);
                    if (culturedocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(culturedocument[ar], temp);
                        tf = ((double) fre / culturedocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Accident") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\accwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count5; ar++) {
                    Cell cell = row.createCell(ar);
                    if (accedentdocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(accedentdocument[ar], temp);
                        tf = ((double) fre / accedentdocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Environment") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\envwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count6; ar++) {
                    Cell cell = row.createCell(ar);
                    if (environmntaldocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(environmntaldocument[ar], temp);
                        tf = ((double) fre / environmntaldocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Deplomacy") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\depwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count7; ar++) {
                    Cell cell = row.createCell(ar);
                    if (foreign_affairdocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(foreign_affairdocument[ar], temp);
                        tf = ((double) fre / foreign_affairdocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Justice") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\lawwhole2" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 120; ar < count8; ar++) {
                    Cell cell = row.createCell(ar);
                    if (law_justicedocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(law_justicedocument[ar], temp);
                        tf = ((double) fre / law_justicedocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Agriculture") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\agriwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count9; ar++) {
                    Cell cell = row.createCell(ar);
                    if (agriculture[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(agriculture[ar], temp);
                        tf = ((double) fre / agriculture[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "politics") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\polwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count10; ar++) {
                    Cell cell = row.createCell(ar);
                    if (politicsdocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(politicsdocument[ar], temp);
                        tf = ((double) fre / politicsdocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Technology") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\sciwhole2" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 120; ar < 180; ar++) {
                    Cell cell = row.createCell(ar);
                    if (science_technologydocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(science_technologydocument[ar], temp);
                        tf = ((double) fre / science_technologydocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "health") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\helwhole3" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 180; ar < count13; ar++) {
                    Cell cell = row.createCell(ar);
                    if (healthdocument[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(healthdocument[ar], temp);
                        tf = ((double) fre / healthdocument[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (jComboBox7.getSelectedItem() == "Army") {
            try {
                Dfmatrix = new FileOutputStream(new File("C:\\Users\\pc\\Documents\\deme data\\allfeatures\\Fatures\\armig4" + ".xlsx"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            for (int l = 0; l < total.size(); l++) {
                Row row = sheet.createRow(l);
                for (int ar = 150; ar < count14; ar++) {
                    Cell cell = row.createCell(ar);
                    if (army[ar].contains(total.get(l))) {
                        temp = total.get(l);
                        d = DF(temp);
                        fre = Collections.frequency(army[ar], temp);
                        tf = ((double) fre / army[ar].size());
                        idf = (double) n / d;
                        idf = Math.log(idf);
                        if (idf < 0) {
                            idf = idf * -1;
                        }
                        tf_idf = tf * idf;
                        cell.setCellValue((double) tf_idf);
                    } else {
                        cell.setCellValue(0);
                    }
                }
            }
            try {
                workbook.write(Dfmatrix);
                System.out.println("sucess");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        read();
        ArrayList DFUnique=new ArrayList<String>();
        DFUnique.addAll(dfunion);
        DFUnique.removeAll(newunion);
        //DFUnique.removeAll(chiunion);
       // area.append(dfunion.toString());
       // area.append(chiunion.toString());
        area.append(DFUnique.toString());
        System.out.println(DFUnique.size());
        
    }//GEN-LAST:event_jButton3ActionPerformed

//character normalization
    String Normalization(String token) {

        for (char rem : token.toCharArray()) {
            switch (rem) {
                case '÷':
                    token = token.replace(rem, ' ');
                    break;
                case '፥':
                    token = token.replace(rem, ' ');
                    break;
                case '|':
                    token = token.replace(rem, ' ');
                    break;
                case '›':
                    token = token.replace(rem, ' ');
                    break;
                case '፦':
                    token = token.replace(rem, ' ');
                    break;
                case '‹':
                    token = token.replace(rem, ' ');
                    break;
                case '﻿':
                    token = token.replace(rem, ' ');
                    break;
                case '–':
                    token = token.replace(rem, ' ');
                    break;
                case '˝':
                    token = token.replace(rem, ' ');
                    break;
                case '።':
                    token = token.replace(rem, ' ');
                    break;
                case '፣':
                    token = token.replace(rem, ' ');
                    break;
                case '‘':
                    token = token.replace(rem, ' ');
                    break;
                case '“':
                    token = token.replace(rem, ' ');
                    break;
                case '”':
                    token = token.replace(rem, ' ');
                    break;
                case ':':
                    token = token.replace(rem, ' ');
                    break;
                case '፤':
                    token = token.replace(rem, ' ');
                    break;
                case '(':
                    token = token.replace(rem, ' ');
                    break;
                case ')':
                    token = token.replace(rem, ' ');
                    break;
                case '’':
                    token = token.replace(rem, ' ');
                    break;
                case '?':
                    token = token.replace(rem, ' ');
                    break;
                case '!':
                    token = token.replace(rem, ' ');
                    break;
                case '-':
                    token = token.replace(rem, ' ');
                    break;
                case '/':
                    token = token.replace(rem, ' ');
                    break;
                case '.':
                    token = token.replace(rem, ' ');
                    break;
                case '"':
                    token = token.replace(rem, ' ');
                    break;

                default:
                    break;
            }
        }
        token = token.replace("፡፡", "");
        token = token.replace("…", "");
        token = token.replace("—", "");
        token = token.replace("፡", "");
        token = token.replaceAll("\\s", "");
        token = token.replace("\n", " ");
        for (char c : token.toCharArray()) {
            if ((c == 'ኃ') || (c == 'ሃ') || (c == 'ኀ') || (c == 'ሐ') || (c == 'ሓ')) {
                token = token.replace(c, 'ሀ');
            } else if ((c == 'ኁ') || (c == 'ሑ')) {
                token = token.replace(c, 'ሁ');
            } else if ((c == 'ኂ') || (c == 'ሒ')) {
                token = token.replace(c, 'ሂ');
            } else if ((c == 'ኄ') || (c == 'ሔ')) {
                token = token.replace(c, 'ሄ');
            } else if ((c == 'ኅ') || (c == 'ሕ')) {
                token = token.replace(c, 'ህ');
            } else if ((c == 'ኆ') || (c == 'ሖ')) {
                token = token.replace(c, 'ሆ');
            } else if ((c == 'ሠ')) {
                token = token.replace(c, 'ሰ');
            } else if ((c == 'ሡ')) {
                token = token.replace(c, 'ሱ');
            } else if ((c == 'ሢ')) {
                token = token.replace(c, 'ሲ');
            } else if ((c == 'ሣ')) {
                token = token.replace(c, 'ሳ');
            } else if ((c == 'ሤ')) {
                token = token.replace(c, 'ሴ');
            } else if ((c == 'ሥ')) {
                token = token.replace(c, 'ስ');
            } else if ((c == 'ሦ')) {
                token = token.replace(c, 'ሶ');
            } else if ((c == 'ፀ')) {
                token = token.replace(c, 'ጸ');
            } else if ((c == 'ፁ')) {
                token = token.replace(c, 'ጹ');
            } else if ((c == 'ፂ')) {
                token = token.replace(c, 'ጺ');
            } else if ((c == 'ፃ')) {
                token = token.replace(c, 'ጻ');
            } else if ((c == 'ፄ')) {
                token = token.replace(c, 'ጼ');
            } else if ((c == 'ፅ')) {
                token = token.replace(c, 'ጽ');
            } else if ((c == 'ፆ')) {
                token = token.replace(c, 'ጾ');
            } else if ((c == 'ዉ')) {
                token = token.replace(c, 'ው');
            } else if ((c == 'ዪ')) {
                token = token.replace(c, 'ይ');
            } else if ((c == 'ዬ')) {
                token = token.replace(c, 'የ');
            } else if ((c == 'ኣ' || c == 'ዐ' || c == 'ዓ')) {
                token = token.replace(c, 'አ');
            } else if ((c == 'ዑ')) {
                token = token.replace(c, 'ኡ');
            } else if ((c == 'ዒ')) {
                token = token.replace(c, 'ኢ');
            } else if ((c == 'ዔ')) {
                token = token.replace(c, 'ኤ');
            } else if ((c == 'ዕ')) {
                token = token.replace(c, 'እ');
            } else if ((c == 'ዖ')) {
                token = token.replace(c, 'ኦ');
            } else if (c == 'ጎ') {
                token = token.replace(c, 'ጐ');
            }
        }
        return token;
    }
// chi square

    void chi_Sqare(Set<String> feature, int index, int troush) {
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count12 + count13 + count14;
        switch (index) {
            // chi for educaction terms
            case 1:
                for (String eco : feature) {
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(eco)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {
                        if (culturedocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(eco)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(eco)) {
                            m++;
                        }
                    }
                    p = count1;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqareeco.put(eco, product);
                    }
                    a = 0;
                    m = 0;
                }
                break;
            // chi square for sport documents
            case 2:
                for (String edu : feature) {
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(edu)) {
                            a++;
                            m++;
                        }
                    }

                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(edu)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {
                        if (culturedocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(edu)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(edu)) {
                            m++;
                        }
                    }
                    p = count2;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqareedu.put(edu, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            // chi-square for culture
            case 3:
                for (String spo : feature) {
                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(spo)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(spo)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(spo)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(spo)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(spo)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(spo)) {
                            m++;
                        }
                    }
                    p = count3;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqarespo.put(spo, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            // chi square for accident
            case 4:
                for (String cul : feature) {
                    for (int i = 0; i < count4; i++) {
                        if (culturedocument[i].contains(cul)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(cul)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(cul)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(cul)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(cul)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(cul)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(cul)) {
                            m++;
                        }
                    }
                    p = count4;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqarecul.put(cul, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            //chi-square for envr document
            case 5:
                for (String acc : feature) {
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(acc)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(acc)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(acc)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(acc)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(acc)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(acc)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(acc)) {
                            m++;
                        }
                    }
                    p = count5;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqareaccid.put(acc, product);
                    }

                }
                a = 0;
                m = 0;
                break;
            // chi sqauare for diplomancy
            case 6:
                for (String env : feature) {
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(env)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(env)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(env)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(env)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(env)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(env)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(env)) {
                            m++;
                        }
                    }
                    p = count6;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqareenv.put(env, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            // chi square for law and juctice
            case 7:
                for (String dep : feature) {
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(dep)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(dep)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(dep)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(dep)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(dep)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(dep)) {
                            m++;
                        }
                    }
                    p = count7;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqaredep.put(dep, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            case 8:
                for (String law : feature) {
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(law)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(law)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(law)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(law)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(law)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(law)) {
                            m++;
                        }
                    }
                    p = count8;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqarelaw.put(law, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            case 9:
                for (String agr : feature) {
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(agr)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(agr)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(agr)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(agr)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(agr)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(agr)) {
                            m++;
                        }
                    }
                    p = count9;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqareagri.put(agr, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            case 10:
                for (String pol : feature) {
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(pol)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(pol)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {
                        if (culturedocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(pol)) {
                            m++;
                        }
                    }

//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(pol)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(pol)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(pol)) {
                            m++;
                        }
                    }
                    p = count10;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqarepol.put(pol, product);
                    }
                }
                a = 0;
                m = 0;
                break;
//            case 11:
//                for (String soc : feature) {
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(soc)) {
//                            a++;
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count1; i++) {
//                        if (economydocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count2; i++) {
//                        if (educationdocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//
//                    for (int i = 0; i < count3; i++) {
//                        if (sportdocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count4; i++) {
//
//                        if (culturedocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count5; i++) {
//                        if (accedentdocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count6; i++) {
//                        if (environmntaldocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count7; i++) {
//                        if (foreign_affairdocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count8; i++) {
//                        if (law_justicedocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count9; i++) {
//                        if (agriculture[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count10; i++) {
//                        if (politicsdocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count12; i++) {
//                        if (science_technologydocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count13; i++) {
//                        if (healthdocument[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    for (int i = 0; i < count14; i++) {
//                        if (army[i].contains(soc)) {
//                            m++;
//                        }
//                    }
//                    p = count11;
//                    nomi = (int) ((int) n * Math.pow((a * n - m * p), 2));
//                    denom = p * m * ((n - p) * (n - m));
//                    if (nomi < 0) {
//                        nomi = nomi * -1;
//                    }
//                    if (denom < 0) {
//                        denom = denom * -1;
//                    }
//                    product = (long) ((double) nomi / denom);
//                    if (product > troush) {
//                        chisqaresocial.put(soc, product);
//                    }
//                }
//                a = 0;
//                m = 0;
//                break;
            case 11:
                for (String sci : feature) {
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(sci)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(sci)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(sci)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(sci)) {
//                            m++;
//                        }
//                    }

                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(sci)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(sci)) {
                            m++;
                        }
                    }
                    p = count12;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqaresci.put(sci, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            case 12:
                for (String hel : feature) {
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(hel)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(hel)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {
                        if (culturedocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(hel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(hel)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(hel)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(hel)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(hel)) {
                            m++;
                        }
                    }
                    p = count13;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqarehel.put(hel, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            case 13:
                for (String rel : feature) {
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(rel)) {
                            a++;
                            m++;
                        }
                    }
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(rel)) {
                            m++;
                        }
                    }

                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count4; i++) {

                        if (culturedocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(rel)) {
                            m++;
                        }
                    }
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(rel)) {
//                            m++;
//                        }
//                    }
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(rel)) {
                            m++;
                        }
                    }
                    p = count14;
                    nomi = (int) ((int) n * Math.pow(((a * m) - (m * p)), 2));
                    denom = p * m * ((n - p) * (n - m));
                    if (nomi < 0) {
                        nomi = nomi * -1;
                    }
                    if (denom < 0) {
                        denom = denom * -1;
                    }
                    product = (long) ((double) nomi / denom);
                    if (product > troush) {
                        chisqarearmy.put(rel, product);
                    }
                }
                a = 0;
                m = 0;
                break;
            default:
                break;
        }
    }

    //information gain calculator
    void informationGain(Set<String> features, int index, float troushold) {
        n = count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9 + count10 + count12 + count13 + count14;
        pc1 = (double) count1 / n;
        pclog1 = pc1 * Math.log10(pc1);
        pc2 = (double) count2 / n;
        pclog2 = pc2 * Math.log10(pc2);
        pc3 = (double) count3 / n;
        pclog3 = pc3 * Math.log10(pc3);
        pc4 = (double) count4 / n;
        pclog4 = pc4 * Math.log10(pc4);
        pc5 = (double) count5 / n;
        pclog5 = pc5 * Math.log10(pc5);
        pc6 = (double) count6 / n;
        pclog6 = pc6 * Math.log10(pc6);
        pc7 = (double) count7 / n;
        pclog7 = pc7 * Math.log10(pc7);
        pc8 = (double) count8 / n;
        pclog8 = pc8 * Math.log10(pc8);
        pc9 = (double) count9 / n;
        pclog9 = pc9 * Math.log10(pc9);
        pc10 = (double) count10 / n;
        pclog10 = pc10 * Math.log10(pc10);
//        pc11 = (double) count11 / n;
//        pclog11 = pc11 * Math.log10(pc11);
        pc12 = (double) count12 / n;
        pclog12 = pc12 * Math.log(pc12);
        pc13 = (double) count13 / n;
        pclog13 = pc13 * Math.log10(pc13);
        pc14 = (double) count14 / n;
        pclog14 = pc14 * Math.log10(pc14);
        //     calculating information gain 
        for (String str : features) {
            for (int i = 0; i < count1; i++) {
                if (economydocument[i].contains(str)) {
                    occ_tinc1++;
                }
            }
            for (int i = 0; i < count2; i++) {
                if (educationdocument[i].contains(str)) {
                    occ_tinc2++;
                }
            }
            for (int i = 0; i < count3; i++) {
                if (sportdocument[i].contains(str)) {
                    occ_tinc3++;
                }
            }
            for (int i = 0; i < count4; i++) {
                if (culturedocument[i].contains(str)) {
                    occ_tinc4++;
                }
            }
            for (int i = 0; i < count5; i++) {
                if (accedentdocument[i].contains(str)) {
                    occ_tinc5++;
                }
            }
            for (int i = 0; i < count6; i++) {
                if (environmntaldocument[i].contains(str)) {
                    occ_tinc6++;
                }
            }
            for (int i = 0; i < count7; i++) {
                if (foreign_affairdocument[i].contains(str)) {
                    occ_tinc7++;
                }
            }
            for (int i = 0; i < count8; i++) {
                if (law_justicedocument[i].contains(str)) {
                    occ_tinc8++;
                }
            }
            for (int i = 0; i < count9; i++) {
                if (agriculture[i].contains(str)) {
                    occ_tinc9++;
                }
            }
            for (int i = 0; i < count10; i++) {
                if (politicsdocument[i].contains(str)) {
                    occ_tinc10++;
                }
            }
//            for (int i = 0; i < count11; i++) {
//                if (social_affairsdocument[i].contains(str)) {
//                    occ_tinc11++;
//                }
//            }
            for (int i = 0; i < count12; i++) {
                if (science_technologydocument[i].contains(str)) {
                    occ_tinc12++;
                }
            }
            for (int i = 0; i < count13; i++) {
                if (healthdocument[i].contains(str)) {
                    occ_tinc13++;
                }
            }
            for (int i = 0; i < count14; i++) {
                if (army[i].contains(str)) {
                    occ_tinc14++;
                }
            }
            switch (index) {
                case 1:
                    termfrequancy = Collections.frequency(allecofeature, str);
                    pro_t = (double) termfrequancy / allecofeature.size();
                    notpro_t = (double) (allecofeature.size() - termfrequancy) / allecofeature.size();
                    break;
                case 2:
                    termfrequancy = Collections.frequency(alledufeature, str);
                    pro_t = (double) termfrequancy / alledufeature.size();
                    notpro_t = (double) (alledufeature.size() - termfrequancy) / alledufeature.size();
                    break;
                case 3:
                    termfrequancy = Collections.frequency(allspofeature, str);
                    pro_t = (double) termfrequancy / allspofeature.size();
                    notpro_t = (double) (allspofeature.size() - termfrequancy) / allspofeature.size();
                    break;
                case 4:
                    termfrequancy = Collections.frequency(allculfeature, str);
                    pro_t = (double) termfrequancy / allculfeature.size();
                    notpro_t = (double) (allculfeature.size() - termfrequancy) / allculfeature.size();
                    break;
                case 5:
                    termfrequancy = Collections.frequency(allaccfeature, str);
                    pro_t = (double) termfrequancy / allaccfeature.size();
                    notpro_t = (double) (allaccfeature.size() - termfrequancy) / allaccfeature.size();
                    break;
                case 6:
                    termfrequancy = Collections.frequency(allenvfeature, str);
                    pro_t = (double) termfrequancy / allenvfeature.size();
                    notpro_t = (double) (allenvfeature.size() - termfrequancy) / allenvfeature.size();
                    break;
                case 7:
                    termfrequancy = Collections.frequency(alldepfeature, str);
                    pro_t = (double) termfrequancy / alldepfeature.size();
                    notpro_t = (double) (alldepfeature.size() - termfrequancy) / alldepfeature.size();
                    break;
                case 8:
                    termfrequancy = Collections.frequency(alllawfeature, str);
                    pro_t = (double) termfrequancy / alllawfeature.size();
                    notpro_t = (double) (alllawfeature.size() - termfrequancy) / alllawfeature.size();
                    break;
                case 9:
                    termfrequancy = Collections.frequency(allagrifeature, str);
                    pro_t = (double) termfrequancy / allagrifeature.size();
                    notpro_t = (double) (allagrifeature.size() - termfrequancy) / allagrifeature.size();
                    break;
                case 10:
                    termfrequancy = Collections.frequency(allpolfeature, str);
                    pro_t = (double) termfrequancy / allpolfeature.size();
                    notpro_t = (double) (allpolfeature.size() - termfrequancy) / allpolfeature.size();
                    break;
//                case 11:
//                    termfrequancy = Collections.frequency(allsocfeature, str);
//                    pro_t = (double) termfrequancy / allsocfeature.size();
//                    notpro_t = (double) (allsocfeature.size() - termfrequancy) / allsocfeature.size();
//                    break;
                case 11:
                    termfrequancy = Collections.frequency(allscifeature, str);
                    pro_t = (double) termfrequancy / allscifeature.size();
                    notpro_t = (double) (allscifeature.size() - termfrequancy) / allscifeature.size();
                    break;
                case 12:
                    termfrequancy = Collections.frequency(allhelfeature, str);
                    pro_t = (double) termfrequancy / allhelfeature.size();
                    notpro_t = (double) (allhelfeature.size() - termfrequancy) / allhelfeature.size();
                    break;
                case 13:
                    termfrequancy = Collections.frequency(allarmfeature, str);
                    pro_t = (double) termfrequancy / allarmfeature.size();
                    notpro_t = (double) (allarmfeature.size() - termfrequancy) / allarmfeature.size();
                    break;
                default:
                    break;
            }
            notocc_tinc1 = count1 - occ_tinc1;
            notocc_tinc2 = count2 - occ_tinc2;
            notocc_tinc3 = count3 - occ_tinc3;
            notocc_tinc4 = count4 - occ_tinc4;
            notocc_tinc5 = count5 - occ_tinc5;
            notocc_tinc6 = count6 - occ_tinc6;
            notocc_tinc7 = count7 - occ_tinc7;
            notocc_tinc8 = count8 - occ_tinc8;
            notocc_tinc9 = count9 - occ_tinc9;
            notocc_tinc10 = count10 - occ_tinc10;
//            notocc_tinc11 = count11 - occ_tinc11;
            notocc_tinc12 = count12 - occ_tinc12;
            notocc_tinc13 = count13 - occ_tinc13;
            notocc_tinc14 = count14 - occ_tinc14;
            pro_ct1 = (double) occ_tinc1 / count1;
            pro_ct1 = (double) pro_ct1 / pro_t;
            if (pro_ct1 <= 0) {
                pro_ct1 = pro_ct1 * Math.log10(1);
            } else {
                pro_ct1 = pro_ct1 * Math.log10(pro_ct1);
            }
            pro_ct2 = (double) occ_tinc2 / count2;
            pro_ct2 = (double) pro_ct2 / pro_t;
            if (pro_ct2 <= 0) {
                pro_ct2 = pro_ct2 * Math.log10(1);
            } else {
                pro_ct2 = pro_ct2 * Math.log10(pro_ct2);
            }

            pro_ct3 = (double) occ_tinc3 / count3;
            pro_ct3 = (double) pro_ct3 / pro_t;
            if (pro_ct3 <= 0) {
                pro_ct3 = pro_ct3 * Math.log10(1);
            } else {
                pro_ct3 = pro_ct3 * Math.log10(pro_ct3);
            }

            pro_ct4 = (double) (occ_tinc4 / count4);
            pro_ct4 = (double) pro_ct4 / pro_t;
            if (pro_ct4 <= 0) {
                pro_ct4 = pro_ct4 * Math.log10(1);
            } else {
                pro_ct4 = pro_ct4 * Math.log10(pro_ct4);
            }

            pro_ct5 = (double) (occ_tinc5 / count5);
            pro_ct5 = (double) pro_ct5 / pro_t;
            if (pro_ct5 <= 0) {
                pro_ct5 = pro_ct5 * Math.log10(1);
            } else {
                pro_ct5 = pro_ct5 * Math.log10(pro_ct5);
            }

            pro_ct6 = (double) (occ_tinc6 / count6);
            pro_ct6 = (double) pro_ct6 / pro_t;
            if (pro_ct6 <= 0) {
                pro_ct6 = pro_ct6 * Math.log10(1);
            } else {
                pro_ct6 = pro_ct6 * Math.log10(pro_ct6);
            }

            pro_ct7 = (double) (occ_tinc7 / count7);
            pro_ct7 = (double) pro_ct7 / pro_t;
            if (pro_ct7 <= 0) {
                pro_ct7 = pro_ct7 * Math.log10(1);
            } else {
                pro_ct7 = pro_ct7 * Math.log10(pro_ct7);
            }

            pro_ct8 = (double) (occ_tinc8 / count8);
            pro_ct8 = (double) pro_ct8 / pro_t;
            if (pro_ct8 <= 0) {
                pro_ct8 = pro_ct8 * Math.log10(1);
            } else {
                pro_ct8 = pro_ct8 * Math.log10(pro_ct8);
            }

            pro_ct9 = (double) (occ_tinc9 / count9);
            pro_ct9 = (double) pro_ct9 / pro_t;
            if (pro_ct9 <= 0) {
                pro_ct9 = pro_ct9 * Math.log10(1);
            } else {
                pro_ct9 = pro_ct9 * Math.log10(pro_ct9);
            }
            pro_ct10 = (double) (occ_tinc10 / count10);
            pro_ct10 = (double) pro_ct10 / pro_t;
            if (pro_ct10 <= 0) {
                pro_ct10 = pro_ct10 * Math.log10(1);
            } else {
                pro_ct10 = pro_ct10 * Math.log10(pro_ct10);
            }

//            pro_ct11 = (double) (occ_tinc11 / count11);
//            pro_ct11 = (double) pro_ct11 / pro_t;
//            if (pro_ct11 <= 0) {
//                pro_ct11 = pro_ct11 * Math.log10(1);
//            } else {
//                pro_ct11 = pro_ct11 * Math.log10(pro_ct11);
//            }
            pro_ct12 = (double) (occ_tinc12 / count12);
            pro_ct12 = (double) pro_ct12 / pro_t;
            if (pro_ct12 <= 0) {
                pro_ct12 = pro_ct12 * Math.log10(1);
            } else {
                pro_ct12 = pro_ct12 * Math.log10(pro_ct12);
            }

            pro_ct13 = (double) (occ_tinc13 / count13);
            pro_ct13 = (double) pro_ct13 / pro_t;
            if (pro_ct13 <= 0) {
                pro_ct13 = pro_ct13 * Math.log10(1);
            } else {
                pro_ct13 = pro_ct13 * Math.log10(pro_ct13);
            }
            pro_ct14 = (double) (occ_tinc14 / count14);
            pro_ct14 = (double) pro_ct14 / pro_t;
            if (pro_ct14 <= 0) {
                pro_ct14 = pro_ct14 * Math.log10(1);
            } else {
                pro_ct14 = pro_ct14 * Math.log10(pro_ct14);
            }
            pro_coutt1 = (float) notocc_tinc1 / count1;
            pro_coutt1 = (float) pro_coutt1 / notpro_t;
            if (pro_coutt1 <= 0) {
                pro_coutt1 = pro_coutt1 * Math.log(1);
            } else {
                pro_coutt1 = pro_coutt1 * Math.log(pro_coutt1);
            }

            pro_coutt2 = (float) (notocc_tinc2 / count2);
            pro_coutt2 = (float) pro_coutt2 / notpro_t;
            if (pro_coutt2 <= 0) {
                pro_coutt2 = pro_coutt2 * Math.log(1);
            } else {
                pro_coutt2 = pro_coutt2 * Math.log(pro_coutt2);
            }

            pro_coutt3 = (float) (notocc_tinc3 / count3);
            pro_coutt3 = (float) pro_coutt3 / notpro_t;
            if (pro_coutt3 <= 0) {
                pro_coutt3 = pro_coutt3 * Math.log(1);
            } else {
                pro_coutt3 = pro_coutt3 * Math.log(pro_coutt3);
            }

            pro_coutt4 = (float) (notocc_tinc4 / count4);
            pro_coutt4 = (float) pro_coutt4 / notpro_t;
            if (pro_coutt4 <= 0) {
                pro_coutt4 = pro_coutt4 * Math.log(1);
            } else {
                pro_coutt4 = pro_coutt4 * Math.log(pro_coutt4);
            }

            pro_coutt5 = (float) (notocc_tinc5 / count5);
            pro_coutt5 = (float) pro_coutt5 / notpro_t;
            if (pro_coutt5 <= 0) {
                pro_coutt5 = pro_coutt5 * Math.log(1);
            } else {
                pro_coutt5 = pro_coutt5 * Math.log(pro_coutt5);
            }
            pro_coutt6 = (float) (notocc_tinc6 / count6);
            pro_coutt6 = (float) pro_coutt6 / notpro_t;
            if (pro_coutt6 <= 0) {
                pro_coutt6 = pro_coutt6 * Math.log(1);
            } else {
                pro_coutt6 = pro_coutt6 * Math.log(pro_coutt6);
            }

            pro_coutt7 = (float) (notocc_tinc7 / count7);
            pro_coutt7 = (float) pro_coutt7 / notpro_t;
            if (pro_coutt7 <= 0) {
                pro_coutt7 = pro_coutt7 * Math.log(1);
            } else {
                pro_coutt7 = pro_coutt7 * Math.log(pro_coutt7);
            }
            pro_coutt8 = (float) (notocc_tinc8 / count8);
            pro_coutt8 = (float) pro_coutt8 / notpro_t;
            if (pro_coutt8 <= 0) {
                pro_coutt8 = pro_coutt8 * Math.log(1);
            } else {
                pro_coutt8 = pro_coutt8 * Math.log(pro_coutt8);
            }
            pro_coutt9 = (float) (notocc_tinc9 / count9);
            pro_coutt9 = (float) pro_coutt9 / notpro_t;
            if (pro_coutt9 <= 0) {
                pro_coutt9 = pro_coutt9 * Math.log(1);
            } else {
                pro_coutt9 = pro_coutt9 * Math.log(pro_coutt9);
            }
            pro_coutt10 = (float) (notocc_tinc10 / count10);
            pro_coutt10 = (double) pro_coutt10 / notpro_t;
            if (pro_coutt10 <= 0) {
                pro_coutt10 = pro_coutt10 * Math.log(1);
            } else {
                pro_coutt10 = pro_coutt10 * Math.log(pro_coutt10);
            }
//            pro_coutt11 = (float) (notocc_tinc11 / count11);
//            pro_coutt11 = (float) pro_coutt11 / notpro_t;
//            if (pro_coutt11 <= 0) {
//                pro_coutt11 = pro_coutt11 * Math.log(1);
//            } else {
//                pro_coutt11 = pro_coutt11 * Math.log(pro_coutt11);
//            }
            pro_coutt12 = (float) (notocc_tinc12 / count12);
            pro_coutt12 = (float) pro_coutt12 / notpro_t;
            if (pro_coutt12 <= 0) {
                pro_coutt12 = pro_coutt12 * Math.log(1);
            } else {
                pro_coutt12 = pro_coutt12 * Math.log(pro_coutt12);
            }
            pro_coutt13 = (float) (notocc_tinc13 / count13);
            pro_coutt13 = (float) pro_coutt13 / notpro_t;
            if (pro_coutt13 <= 0) {
                pro_coutt13 = pro_coutt13 * Math.log(1);
            } else {
                pro_coutt13 = pro_coutt13 * Math.log(pro_coutt13);
            }
            pro_coutt14 = (float) (notocc_tinc14 / count14);
            pro_coutt14 = (float) pro_coutt14 / notpro_t;
            if (pro_coutt14 <= 0) {
                pro_coutt14 = pro_coutt14 * Math.log(1);
            } else {
                pro_coutt14 = pro_coutt14 * Math.log(pro_coutt14);
            }
            //probablity of temr in c without

            sumpc = sumpc - pclog1;
            sumpct = sumpct + pro_ct1;
            sumpcwt = sumpcwt + pro_coutt1;

            sumpc = sumpc - pclog2;
            sumpct = sumpct + pro_ct2;
            sumpcwt = sumpcwt + pro_coutt2;

            sumpc = sumpc - pclog3;
            sumpct = sumpct + pro_ct3;
            sumpcwt = sumpcwt + pro_coutt3;

            sumpc = sumpc - pclog4;
            sumpct = sumpct + pro_ct4;
            sumpcwt = sumpcwt + pro_coutt4;

            sumpc = sumpc - pclog5;
            sumpct = sumpct + pro_ct5;
            sumpcwt = sumpcwt + pro_coutt5;

            sumpc = sumpc - pclog6;
            sumpct = sumpct + pro_ct6;
            sumpcwt = sumpcwt + pro_coutt6;

            sumpc = sumpc - pclog7;
            sumpct = sumpct + pro_ct7;
            sumpcwt = sumpcwt + pro_coutt7;

            sumpc = sumpc - pclog8;
            sumpct = sumpct + pro_ct8;
            sumpcwt = sumpcwt + pro_coutt8;

            sumpc = sumpc - pclog9;
            sumpct = sumpct + pro_ct9;
            sumpcwt = sumpcwt + pro_coutt9;

            sumpc = sumpc - pclog10;
            sumpct = sumpct + pro_ct10;
            sumpcwt = sumpcwt + pro_coutt10;

//            sumpc = sumpc - pclog11;
//            sumpct = sumpct + pro_ct11;
//            sumpcwt = sumpcwt + pro_coutt11;
            sumpc = sumpc - pclog12;
            sumpct = sumpct + pro_ct12;
            sumpcwt = sumpcwt + pro_coutt12;
            sumpc = sumpc - pclog13;
            sumpct = sumpct + pro_ct13;
            sumpcwt = sumpcwt + pro_coutt13;
            sumpc = sumpc - pclog14;
            sumpct = sumpct + pro_ct14;
            sumpcwt = sumpcwt + pro_coutt14;

            sumpct = pro_t * sumpct;
            sumpcwt = notpro_t * sumpcwt;
            info_gain = sumpc + sumpct + sumpcwt;
            //info_gain = Math.round(info_gain * 100.0) / 100.0;
            switch (index) {
                case 1:
                    if (info_gain > troushold) {
                        informationgaineco.put(str, info_gain);
                    }
                    break;
                case 2:
                    if (info_gain > troushold) {
                        informationgainedu.put(str, info_gain);
                    }
                    break;
                case 3:
                    if (info_gain > troushold) {
                        informationgainspo.put(str, info_gain);
                    }
                    break;
                case 4:
                    if (info_gain > troushold) {
                        informationgaincul.put(str, info_gain);
                    }
                    break;
                case 5:
                    if (info_gain > troushold) {
                        informationgainaccid.put(str, info_gain);
                    }
                    break;
                case 6:
                    if (info_gain > troushold) {
                        informationgainenv.put(str, info_gain);
                    }
                    break;
                case 7:
                    if (info_gain > troushold) {
                        informationgaindep.put(str, info_gain);
                    }
                    break;
                case 8:
                    if (info_gain > troushold) {
                        informationgainlaw.put(str, info_gain);
                    }
                    break;
                case 9:
                    if (info_gain > troushold) {
                        informationgainagri.put(str, info_gain);
                    }
                    break;
                case 10:
                    if (info_gain > troushold) {
                        informationgainpol.put(str, info_gain);
                    }
                    break;
//                case 11:
//                    if (info_gain > troushold) {
//                        informationgainsocial.put(str, info_gain);
//                    }
//                    break;
                case 11:
                    if (info_gain > troushold) {
                        informationgainsci.put(str, info_gain);
                    }
                    break;
                case 12:
                    if (info_gain > troushold) {
                        informationgainhel.put(str, info_gain);
                    }
                    break;
                case 13:
                    if (info_gain > troushold) {
                        informationgainarmy.put(str, info_gain);
                    }
                    break;
                default:
                    break;
            }
            sumpc = 0;
            sumpct = 0;
            sumpcwt = 0;
            pro_ct1 = 0;
            pro_ct2 = 0;
            pro_ct3 = 0;
            pro_ct4 = 0;
            pro_ct5 = 0;
            pro_ct6 = 0;
            pro_ct7 = 0;
            pro_ct8 = 0;
            pro_ct9 = 0;
            pro_ct10 = 0;
            pro_ct11 = 0;
            pro_ct12 = 0;
            pro_ct13 = 0;
            pro_ct14 = 0;
            occ_tinc1 = 0;
            occ_tinc2 = 0;
            occ_tinc3 = 0;
            occ_tinc4 = 0;
            occ_tinc5 = 0;
            occ_tinc6 = 0;
            occ_tinc7 = 0;
            occ_tinc8 = 0;
            occ_tinc9 = 0;
            occ_tinc10 = 0;
            occ_tinc12 = 0;
            occ_tinc13 = 0;
            occ_tinc14 = 0;
            pro_coutt1 = 0;
            pro_coutt2 = 0;
            pro_coutt3 = 0;
            pro_coutt4 = 0;
            pro_coutt5 = 0;
            pro_coutt6 = 0;
            pro_coutt7 = 0;
            pro_coutt8 = 0;
            pro_coutt9 = 0;
            pro_coutt10 = 0;
            pro_coutt12 = 0;
            pro_coutt13 = 0;
            pro_coutt14 = 0;
            termfrequancy = 0;

        }
    }

    //document frequncy
//document frequency calculator
    void documentFrequncy(Set<String> features,
            int index,
            int troush
    ) {
        for (String str : features) {
            switch (index) {
                case 1:
                    for (int i = 0; i < count1; i++) {
                        if (economydocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyeco.put(str, e);
                    }
                    e = 0;
                    break;
                case 2:
                    for (int i = 0; i < count2; i++) {
                        if (educationdocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyedu.put(str, e);
                    }
                    e = 0;
                    break;
                case 3:
                    for (int i = 0; i < count3; i++) {
                        if (sportdocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyspo.put(str, e);
                    }
                    e = 0;
                    break;
                case 4:
                    for (int i = 0; i < count4; i++) {
                        if (culturedocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencycul.put(str, e);
                    }
                    e = 0;
                    break;
                case 5:
                    for (int i = 0; i < count5; i++) {
                        if (accedentdocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyaccid.put(str, e);
                    }
                    e = 0;
                    break;
                case 6:
                    for (int i = 0; i < count6; i++) {
                        if (environmntaldocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyenv.put(str, e);
                    }
                    e = 0;
                    break;
                case 7:
                    for (int i = 0; i < count7; i++) {
                        if (foreign_affairdocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencydep.put(str, e);
                    }
                    e = 0;
                    break;
                case 8:
                    for (int i = 0; i < count8; i++) {
                        if (law_justicedocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencylaw.put(str, e);
                    }
                    e = 0;
                    break;
                case 9:
                    for (int i = 0; i < count9; i++) {
                        if (agriculture[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyagri.put(str, e);
                    }
                    e = 0;
                    break;
                case 10:
                    for (int i = 0; i < count10; i++) {
                        if (politicsdocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencypoltics.put(str, e);
                    }
                    e = 0;
                    break;
//                case 11:
//
//                    for (int i = 0; i < count11; i++) {
//                        if (social_affairsdocument[i].contains(str)) {
//                            e++;
//                        }
//                    }
//                    if (e > troush) {
//                        documntfrequencysocial.put(str, e);
//                    }
//                    e = 0;
//                    break;
                case 11:
                    for (int i = 0; i < count12; i++) {
                        if (science_technologydocument[i].contains(str)) {
                            e++;
                        }
                    }

                    if (e > troush) {
                        documntfrequencysci.put(str, e);
                    }
                    e = 0;
                    break;
                case 12:
                    for (int i = 0; i < count13; i++) {
                        if (healthdocument[i].contains(str)) {
                            e++;
                        }
                    }
                    if (e > troush) {
                        documntfrequencyhel.put(str, e);
                    }
                    e = 0;
                    break;
                case 13:
                    for (int i = 0; i < count14; i++) {
                        if (army[i].contains(str)) {
                            e++;
                        }
                    }

                    if (e > troush) {
                        documntfrequencyarmy.put(str, e);
                    }
                    e = 0;
                    break;
                default:
                    break;
            }

        }
    }
//DF for each terms in the whole document

    int DF(String term) {
        for (int i = 0; i < count1; i++) {
            if (economydocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count2; i++) {
            if (educationdocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count3; i++) {
            if (sportdocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count4; i++) {
            if (culturedocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count5; i++) {
            if (accedentdocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count6; i++) {
            if (environmntaldocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count7; i++) {
            if (foreign_affairdocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count8; i++) {
            if (law_justicedocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count9; i++) {
            if (agriculture[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count10; i++) {
            if (politicsdocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count12; i++) {
            if (science_technologydocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count13; i++) {
            if (healthdocument[i].contains(term)) {
                df++;
            }
        }
        for (int i = 0; i < count14; i++) {
            if (army[i].contains(term)) {
                df++;
            }
        }
        return df;
    }

    //feature selection using only document frequency troshloding
    void dfUnion() {
        // economic class
        listallDf.clear();
        alldf.clear();
        documentFrequncy(ecofeature, 1, 40);
        dfeco = new ArrayList(documntfrequencyeco.keySet());
        alldf.addAll(dfeco);
        // education class
        documentFrequncy(edufeature, 2, 40);
        dfedu = new ArrayList(documntfrequencyedu.keySet());
        alldf.addAll(dfedu);
        //sport 
        documentFrequncy(spofeature, 3, 40);
        dfspo = new ArrayList(documntfrequencyspo.keySet());
        alldf.addAll(dfspo);
        // cultureal document
        documentFrequncy(culfeature, 4, 40);
        dfcul = new ArrayList(documntfrequencycul.keySet());
        alldf.addAll(dfcul);
        //accident
        documentFrequncy(accfeature, 5, 35);
        dfacc = new ArrayList(documntfrequencyaccid.keySet());
        alldf.addAll(dfacc);
        //environmental protection
        documentFrequncy(envfeature, 6, 40);
        dfenv = new ArrayList(documntfrequencyenv.keySet());
        alldf.addAll(dfenv);
        //deplomatic relation
        documentFrequncy(depfeature, 7, 35);
        dfdep = new ArrayList(documntfrequencydep.keySet());
        alldf.addAll(dfdep);
        //law and justice
        documentFrequncy(lawfeature, 8, 28);
        dflaw = new ArrayList(documntfrequencylaw.keySet());
        alldf.addAll(dflaw);
        //agriculture class
        documentFrequncy(agrifeature, 9, 42);
        dfagr = new ArrayList(documntfrequencyagri.keySet());
        alldf.addAll(dfagr);
        //poltical news class
        documentFrequncy(polfeature, 10, 40);
        dfpol = new ArrayList(documntfrequencypoltics.keySet());
        alldf.addAll(dfpol);
        //science class
        documentFrequncy(scifeature, 11, 40);
        dfsci = new ArrayList(documntfrequencysci.keySet());
        alldf.addAll(dfsci);
        //health class
        documentFrequncy(helfeature, 12, 40);
        dfhel = new ArrayList(documntfrequencyhel.keySet());
        alldf.addAll(dfhel);
        //arrmy class
        documentFrequncy(armfeature, 13, 37);
        dfarm = new ArrayList(documntfrequencyarmy.keySet());
        alldf.addAll(dfarm);
        listallDf.addAll(alldf);

    }

    void infogainunion() {
        alldf.clear();
        informationGain(ecofeature, 1, (float) 1.5);
        dfeco = new ArrayList(informationgaineco.keySet());
        alldf.addAll(dfeco);
        informationGain(edufeature, 2, (float) 1.5);
        dfedu = new ArrayList(informationgainedu.keySet());
        alldf.addAll(dfeco);
        informationGain(spofeature, 3, (float) 1.5);
        dfspo = new ArrayList(informationgainspo.keySet());
        alldf.addAll(dfspo);
        informationGain(culfeature, 4, (float) 1.5);
        dfcul = new ArrayList(informationgaincul.keySet());
        alldf.addAll(dfcul);
        informationGain(accfeature, 5, (float) 1.5);
        dfacc = new ArrayList(informationgainaccid.keySet());
        alldf.addAll(dfacc);
        informationGain(envfeature, 6, (float) 1.5);
        dfenv = new ArrayList(informationgainenv.keySet());
        alldf.addAll(dfenv);
        informationGain(depfeature, 7, (float) 1.5);
        dfdep = new ArrayList(informationgaindep.keySet());
        alldf.addAll(dfdep);
        informationGain(lawfeature, 8, (float) 1.5);
        dflaw = new ArrayList(informationgainlaw.keySet());
        alldf.addAll(dflaw);
        informationGain(agrifeature, 9, (float) 1.5);
        dfagr = new ArrayList(informationgainagri.keySet());
        alldf.addAll(dfagr);
        informationGain(polfeature, 10, (float) 1.5);
        dfpol = new ArrayList(informationgainpol.keySet());
        alldf.addAll(dfpol);
        informationGain(scifeature, 11, (float) 1.5);
        dfsci = new ArrayList(informationgainsci.keySet());
        alldf.addAll(dfsci);
        informationGain(helfeature, 12, (float) 1.5);
        dfhel = new ArrayList(informationgainhel.keySet());
        alldf.addAll(dfhel);
        informationGain(armfeature, 13, (float) 1.5);
        dfarm = new ArrayList(informationgainarmy.keySet());
        alldf.addAll(dfarm);
        listallIG.addAll(alldf);
    }
//unionusing chisquare

    void unionChisquare() {
        alldf.clear();
        chi_Sqare(ecofeature, 1, 35);
        dfeco = new ArrayList(chisqareeco.keySet());
        alldf.addAll(dfeco);
        chi_Sqare(edufeature, 2, 40);
        dfedu = new ArrayList(chisqareedu.keySet());
        alldf.addAll(dfeco);
        chi_Sqare(spofeature, 3, 40);
        dfspo = new ArrayList(chisqarespo.keySet());
        alldf.addAll(dfspo);
        chi_Sqare(culfeature, 4, 45);
        dfcul = new ArrayList(chisqarecul.keySet());
        alldf.addAll(dfcul);
        chi_Sqare(accfeature, 5, 40);
        dfacc = new ArrayList(chisqareaccid.keySet());
        alldf.addAll(dfacc);
        chi_Sqare(envfeature, 6, 48);
        dfenv = new ArrayList(chisqareenv.keySet());
        alldf.addAll(dfenv);
        chi_Sqare(depfeature, 7, 42);
        dfdep = new ArrayList(chisqaredep.keySet());
        alldf.addAll(dfdep);
        chi_Sqare(lawfeature, 8, 40);
        dflaw = new ArrayList(chisqarelaw.keySet());
        alldf.addAll(dflaw);
        chi_Sqare(agrifeature, 9, 42);
        dfagr = new ArrayList(chisqareagri.keySet());
        alldf.addAll(dfagr);
        chi_Sqare(polfeature, 10, 45);
        dfpol = new ArrayList(chisqarepol.keySet());
        alldf.addAll(dfpol);
//        chi_Sqare(socfeature, 11, 35);
//        dfsoc = new ArrayList(chisqaresocial.keySet());
//        alldf.addAll(dfsoc);
        chi_Sqare(scifeature, 11, 41);
        dfsci = new ArrayList(chisqaresci.keySet());
        alldf.addAll(dfsci);
        chi_Sqare(helfeature, 12, 51);
        dfhel = new ArrayList(chisqarehel.keySet());
        alldf.addAll(dfhel);
        chi_Sqare(armfeature, 13, 40);
        dfarm = new ArrayList(chisqarearmy.keySet());
        alldf.addAll(dfarm);
        listallCH.addAll(alldf);
    }

    void intersection() {

    }

    //union and intersection 
    void unionIntersection() {
        listall = new ArrayList();
        setall = new HashSet();
        ecodocallunion = new ArrayList();
        ecodocallintersection = new ArrayList();
        documentFrequncy(ecofeature, 1, 40);
        sortMapdoceco = sortByValues(documntfrequencyeco);
        ecodocfeature = new ArrayList(sortMapdoceco.keySet());
        partd = ecodocfeature.size();
        percent = (int) (partd * 0.75);
        ecodocintersection = ecodocfeature.subList(0, percent);
        ecodocunion = ecodocfeature.subList(percent, partd);
        setall.addAll(ecodocunion);
        //information gain for eco document
        informationGain(ecofeature, 1, (float) 1.5);
        sortMapinfoeco = sortByValues(informationgaineco);
        ecoinffeature = new ArrayList(sortMapinfoeco.keySet());
        parti = ecoinffeature.size();
        percent = (int) (parti * 0.75);
        ecoinfointersection = ecoinffeature.subList(0, percent);
        ecoinfounion = ecoinffeature.subList(percent, parti);
        setall.addAll(ecoinfounion);
        //chi square for eco document
        chi_Sqare(ecofeature, 1, 35);
        sortMapchieco = sortByValues(chisqareeco);
        ecochifeature = new ArrayList(sortMapchieco.keySet());
        partc = ecochifeature.size();
        percent = (int) Math.round(partc * 0.75);
        ecochiintersection = ecochifeature.subList(0, percent);
        ecochiunion = ecochifeature.subList(percent, partc);
        setall.addAll(ecochiunion);
        for (Object str : ecodocintersection) {
            if (ecoinfointersection.contains(str)) {
                if (ecochiintersection.contains(str)) {
                    ecodocallintersection.add(str);
                }
            }
        }

        setall.addAll(ecodocallintersection);
        //     for education class
        edudocallintersection = new ArrayList();
        edudocallunion = new ArrayList();
        documentFrequncy(edufeature, 2, 40);
        sortMapdocedu = sortByValues(documntfrequencyedu);
        edudocfeature = new ArrayList(sortMapdocedu.keySet());
        partd = edudocfeature.size();
        percent = (int) (partd * 0.75);
        edudocintersection = edudocfeature.subList(0, percent);
        edudocunion = edudocfeature.subList(percent, partd);
        setall.addAll(edudocunion);
        informationGain(edufeature, 2, (float) 1.5);
        sortMapinfoedu = sortByValues(informationgainedu);
        eduinffeature = new ArrayList(sortMapinfoedu.keySet());
        parti = eduinffeature.size();
        percent = (int) (parti * 0.75);
        eduinfointersection = eduinffeature.subList(0, percent);
        eduinfounion = eduinffeature.subList(percent, parti);
        setall.addAll(eduinfounion);
        chi_Sqare(edufeature, 2, 40);
        sortMapchiedu = sortByValues(chisqareedu);
        educhifeature = new ArrayList(sortMapchiedu.keySet());
        partc = educhifeature.size();
        percent = (int) (partc * 0.75);
        educhiintersection = educhifeature.subList(0, percent);
        educhiunion = educhifeature.subList(percent, partc);
        setall.addAll(educhiunion);
        //intersection
        for (Object str : edudocintersection) {
            if (eduinfointersection.contains(str)) {
                if (educhiintersection.contains(str)) {
                    edudocallintersection.add(str);
                }
            }
        }
        //union

        setall.addAll(edudocallintersection);
        //for sport class
        spodocallintersection = new ArrayList();
        spodocallunion = new ArrayList();
        documentFrequncy(spofeature, 3, 40);
        sortMapdocspo = sortByValues(documntfrequencyspo);
        spodocfeature = new ArrayList(sortMapdocspo.keySet());
        partd = spodocfeature.size();
        percent = (int) (partd * 0.75);
        spodocintersection = spodocfeature.subList(0, percent);
        spodocunion = spodocfeature.subList(percent, partd);
        setall.addAll(spodocunion);
        informationGain(spofeature, 3, (float) 1.5);
        sortMapinfospo = sortByValues(informationgainspo);
        spoinffeature = new ArrayList(sortMapinfospo.keySet());
        parti = spoinffeature.size();
        percent = (int) (parti * 0.75);
        spoinfointersection = spoinffeature.subList(0, percent);
        spoinfounion = spoinffeature.subList(percent, parti);
        setall.addAll(spoinfounion);
        chi_Sqare(spofeature, 3, 40);
        sortMapchispo = sortByValues(chisqarespo);
        spochifeature = new ArrayList(sortMapchispo.keySet());
        parti = spochifeature.size();
        percent = (int) (parti * 0.75);
        spochiintersection = spochifeature.subList(0, percent);
        spochiunion = spochifeature.subList(percent, parti);
        setall.addAll(spochiunion);
        for (Object str : spodocintersection) {
            if (spoinfointersection.contains(str)) {
                if (spochiintersection.contains(str)) {
                    spodocallintersection.add(str);
                }
            }
        }

        setall.addAll(spodocallintersection);
        //for culture and turisom class
        culdocallintersection = new ArrayList();
        culdocallunion = new ArrayList();
        documentFrequncy(culfeature, 4, 40);
        sortMapdoccul = sortByValues(documntfrequencycul);
        culdocfeature = new ArrayList(sortMapdoccul.keySet());
        partd = culdocfeature.size();
        percent = (int) (partd * 0.75);
        culdocintersection = culdocfeature.subList(0, percent);
        culdocunion = culdocfeature.subList(percent, partd);
        setall.addAll(culdocunion);
        informationGain(culfeature, 4, (float) 1.5);
        sortMapinfocul = sortByValues(informationgaincul);
        culinffeature = new ArrayList(sortMapinfocul.keySet());
        parti = culinffeature.size();
        percent = (int) (parti * 0.75);
        culinfointersection = culinffeature.subList(0, percent);
        culinfounion = culinffeature.subList(percent, parti);
        setall.addAll(culinfounion);
        chi_Sqare(culfeature, 4, 45);
        sortMapchicul = sortByValues(chisqarecul);
        culchifeature = new ArrayList(sortMapchicul.keySet());
        partc = culchifeature.size();
        percent = (int) (partc * 0.75);
        culchiintersection = culchifeature.subList(0, percent);
        culchiunion = culchifeature.subList(percent, partc);
        setall.addAll(culchiunion);
        for (Object str : culdocintersection) {
            if (culinfointersection.contains(str)) {
                if (culchiintersection.contains(str)) {
                    culdocallintersection.add(str);
                }
            }
        }

        setall.addAll(culdocallintersection);
        // for accident new
        accdocallintersection = new ArrayList();
        accdocallunion = new ArrayList();
        documentFrequncy(accfeature, 5, 35);
        sortMapdocaccid = sortByValues(documntfrequencyaccid);
        accdocfeature = new ArrayList(sortMapdocaccid.keySet());
        partd = accdocfeature.size();
        percent = (int) (partd * 0.75);
        accdocintersection = accdocfeature.subList(0, percent);
        accdocunion = accdocfeature.subList(percent, partd);
        setall.addAll(accdocunion);
        informationGain(accfeature, 5, (float) 1.5);
        sortMapinfoaccid = sortByValues(informationgainaccid);
        accinffeature = new ArrayList(sortMapinfoaccid.keySet());
        parti = accinffeature.size();
        percent = (int) (parti * 0.75);
        accinfointersection = accinffeature.subList(0, percent);
        accinfounion = accinffeature.subList(percent, parti);
        setall.addAll(accinfounion);
        chi_Sqare(accfeature, 5, 40);
        sortMapchiaccid = sortByValues(chisqareaccid);
        accchifeature = new ArrayList(sortMapchiaccid.keySet());
        partc = accchifeature.size();
        percent = (int) (partc * 0.75);
        accchiintersection = accchifeature.subList(0, percent);
        accchiunion = accchifeature.subList(percent, partc);
        setall.addAll(accchiunion);
        //intersection
        for (Object str : accdocintersection) {
            if (accinfointersection.contains(str)) {
                if (accchiintersection.contains(str)) {
                    accdocallintersection.add(str);
                }
            }
        }
        //union
        setall.addAll(accdocallintersection);

//        // for environmental protection    
        envdocallintersection = new ArrayList();
        envdocallunion = new ArrayList();
        documentFrequncy(envfeature, 6, 40);
        sortMapdocenv = sortByValues(documntfrequencyenv);
        envdocfeature = new ArrayList(sortMapdocenv.keySet());
        partd = envdocfeature.size();
        percent = (int) (partd * 0.75);
        envdocintersection = envdocfeature.subList(0, percent);
        envdocunion = envdocfeature.subList(percent, partd);
        setall.addAll(envdocunion);
        informationGain(envfeature, 6, (float) 1.5);
        sortMapinfoenv = sortByValues(informationgainenv);
        envinffeature = new ArrayList(sortMapinfoenv.keySet());
        parti = envinffeature.size();
        percent = (int) (parti * 0.75);
        envinfointersection = envinffeature.subList(0, percent);
        envinfounion = envinffeature.subList(percent, parti);
//
        setall.addAll(envinfounion);
        chi_Sqare(envfeature, 6, 48);
        sortMapchienv = sortByValues(chisqareenv);
        envchifeature = new ArrayList(sortMapchienv.keySet());
        partc = envchifeature.size();
        percent = (int) (partc * 0.75);
        envchiintersection = envchifeature.subList(0, percent);
        envchiunion = envchifeature.subList(percent, partc);
        setall.addAll(envchiunion);
        //intersection
        for (Object str : envdocintersection) {
            if (envinfointersection.contains(str)) {
                if (envchiintersection.contains(str)) {
                    envdocallintersection.add(str);
                }
            }
        }
        //union
        setall.addAll(envdocallintersection);
        //  for deplomatic relation

        depdocallintersection = new ArrayList();
        depdocallunion = new ArrayList();
        documentFrequncy(depfeature, 7, 35);
        sortMapdocdep = sortByValues(documntfrequencydep);
        depdocfeature = new ArrayList(sortMapdocdep.keySet());
        partd = depdocfeature.size();
        percent = (int) (partd * 0.75);
        depdocintersection = depdocfeature.subList(0, percent);
        depdocunion = depdocfeature.subList(percent, partd);
        setall.addAll(depdocunion);
        informationGain(depfeature, 7, (float) 1.5);
        sortMapinfodep = sortByValues(informationgaindep);
        depinffeature = new ArrayList(sortMapinfodep.keySet());
        parti = depinffeature.size();
        percent = (int) (parti * 0.75);
        depinfointersection = depinffeature.subList(0, percent);
        depinfounion = depinffeature.subList(percent, parti);
        setall.addAll(depinfounion);
        chi_Sqare(depfeature, 7, 42);
        sortMapchidep = sortByValues(chisqaredep);
        depchifeature = new ArrayList(sortMapchidep.keySet());
        partc = depchifeature.size();
        percent = (int) (partc * 0.75);
        depchiintersection = depchifeature.subList(0, percent);
        depchiunion = depchifeature.subList(percent, partc);
        setall.addAll(depchiunion);
        // intersection
        for (Object str : depdocintersection) {
            if (depinfointersection.contains(str)) {
                if (depchiintersection.contains(str)) {
                    depdocallintersection.add(str);
                }
            }
        }
        //   union

        setall.addAll(depdocallintersection);
        //law and justice

        lawdocallintersection = new ArrayList();
        lawdocallunion = new ArrayList();
        documentFrequncy(lawfeature, 8, 28);
        sortMapdoclaw = sortByValues(documntfrequencylaw);
        lawdocfeature = new ArrayList(sortMapdoclaw.keySet());
        partd = lawdocfeature.size();
        percent = (int) (partd * 0.75);
        lawdocintersection = lawdocfeature.subList(0, percent);
        lawdocunion = lawdocfeature.subList(percent, partd);
        setall.addAll(lawdocunion);
        informationGain(lawfeature, 8, (float) 1.5);
        sortMapinfolaw = sortByValues(informationgainlaw);
        lawinffeature = new ArrayList(sortMapinfolaw.keySet());
        parti = lawinffeature.size();
        percent = (int) (parti * 0.75);
        lawinfointersection = lawinffeature.subList(0, percent);
        lawinfounion = lawinffeature.subList(percent, parti);
        setall.addAll(lawinfounion);
//
        chi_Sqare(lawfeature, 8, 40);
        sortMapchilaw = (chisqarelaw);
        lawchifeature = new ArrayList(sortMapchilaw.keySet());
        partc = lawchifeature.size();
        percent = (int) (partc * 0.75);
        lawchiintersection = lawchifeature.subList(0, percent);
        lawchiunion = lawchifeature.subList(percent, partc);
        setall.addAll(lawchiunion);
        //intersection
        for (Object str : lawdocintersection) {
            if (lawinfointersection.contains(str)) {
                if (lawchiintersection.contains(str)) {
                    lawdocallintersection.add(str);
                }
            }
        }
        //union

        setall.addAll(lawdocallintersection);

        // agriculture
        agridocallintersection = new ArrayList();
        agridocallunion = new ArrayList();
        documentFrequncy(agrifeature, 9, 42);
        sortMapdocagri = sortByValues(documntfrequencyagri);
        agridocfeature = new ArrayList(sortMapdocagri.keySet());
        partd = agridocfeature.size();
        percent = (int) (partd * 0.75);
        agridocintersection = agridocfeature.subList(0, percent);
        agridocunion = agridocfeature.subList(percent, partd);
        setall.addAll(agridocunion);
        informationGain(agrifeature, 9, (float) 1.5);
        sortMapinfoagri = sortByValues(informationgainagri);
        agriinffeature = new ArrayList(sortMapinfoagri.keySet());
        parti = agriinffeature.size();
        percent = (int) (parti * 0.75);
        agriinfointersection = agriinffeature.subList(0, percent);
        agriinfounion = agriinffeature.subList(percent, parti);
        setall.addAll(agriinfounion);
        chi_Sqare(agrifeature, 9, 42);
        sortMapchiagri = sortByValues(chisqareagri);
        agrichifeature = new ArrayList(sortMapchiagri.keySet());
        partc = agrichifeature.size();
        percent = (int) (partc * 0.75);
        agrichiintersection = agrichifeature.subList(0, percent);
        agrichiunion = agrichifeature.subList(percent, partc);
        setall.addAll(agrichiunion);
        //intersection
        for (Object str : agridocintersection) {
            if (agriinfointersection.contains(str)) {
                if (agrichiintersection.contains(str)) {
                    agridocallintersection.add(str);
                }
            }
        }
        //union

        setall.addAll(agridocallintersection);
        //poletics class;
        poldocallintersection = new ArrayList();
        poldocallunion = new ArrayList();
        documentFrequncy(polfeature, 10, 40);
        sortMapdocpol = sortByValues(documntfrequencypoltics);
        poldocfeature = new ArrayList(sortMapdocpol.keySet());
        partd = poldocfeature.size();
        percent = (int) (partd * 0.75);
        poldocintersection = poldocfeature.subList(0, percent);
        poldocunion = poldocfeature.subList(percent, partd);
        setall.addAll(poldocunion);
        informationGain(polfeature, 10, (float) 1.5);
        sortMapinfopol = sortByValues(informationgainpol);

        polinffeature = new ArrayList(sortMapinfopol.keySet());
        parti = polinffeature.size();
        percent = (int) (parti * 0.75);
        polinfointersection = polinffeature.subList(0, percent);
        polinfounion = polinffeature.subList(percent, parti);
        setall.addAll(polinfounion);
        chi_Sqare(polfeature, 10, 45);
        sortMapchipol = sortByValues(chisqarepol);
        polchifeature = new ArrayList(sortMapchipol.keySet());
        partc = polchifeature.size();
        percent = (int) (partc * 0.75);
        polchiintersection = polchifeature.subList(0, percent);
        polchiunion = polchifeature.subList(percent, partc);
        setall.addAll(polchiunion);
        //intersection
        for (Object str : poldocintersection) {
            if (polinfointersection.contains(str)) {
                if (polchiintersection.contains(str)) {
                    poldocallintersection.add(str);
                }

            }
        }
        setall.addAll(poldocallintersection);
        // science
        scidocallintersection = new ArrayList();
        scidocallunion = new ArrayList();
        documentFrequncy(scifeature, 11, 40);
        sortMapdocsci = sortByValues(documntfrequencysci);
        scidocfeature = new ArrayList(sortMapdocsci.keySet());
        partd = scidocfeature.size();
        percent = (int) (partd * 0.75);
        scidocintersection = scidocfeature.subList(0, percent);
        scidocunion = scidocfeature.subList(percent, partd);
        setall.addAll(scidocunion);
        informationGain(scifeature, 11, (float) 1.5);
        sortMapinfosci = sortByValues(informationgainsci);

        sciinffeature = new ArrayList(sortMapinfosci.keySet());
        parti = sciinffeature.size();
        percent = (int) (parti * 0.75);
        sciinfointersection = sciinffeature.subList(0, percent);
        sciinfounion = sciinffeature.subList(percent, parti);
        setall.addAll(sciinfounion);
//
        chi_Sqare(scifeature, 11, 41);
        sortMapchisci = sortByValues(chisqaresci);
        scichifeature = new ArrayList(sortMapchisci.keySet());
        partc = scichifeature.size();
        percent = (int) (partc * 0.75);
        scichiintersection = scichifeature.subList(0, percent);
        scichiunion = scichifeature.subList(percent, partc);
        setall.addAll(scichiunion);
        //intersection
        for (Object str : scidocintersection) {
            if (sciinfointersection.contains(str)) {
                if (scichiintersection.contains(str)) {
                    scidocallintersection.add(str);
                }
            }
        }
        //union

        setall.addAll(scidocallintersection);
        //health

        heldocallintersection = new ArrayList();
        heldocallunion = new ArrayList();
        documentFrequncy(helfeature, 12, 40);
        sortMapdochel = sortByValues(documntfrequencyhel);
        heldocfeature = new ArrayList(sortMapdochel.keySet());
        partd = heldocfeature.size();
        percent = (int) (partd * 0.75);
        heldocintersection = heldocfeature.subList(0, percent);
        heldocunion = heldocfeature.subList(percent, partd);
        setall.addAll(heldocunion);
        informationGain(helfeature, 12, (float) 1.5);
        sortMapinfohel = sortByValues(informationgainhel);
        helinffeature = new ArrayList(sortMapinfohel.keySet());
        parti = helinffeature.size();
        percent = (int) (parti * 0.75);
        helinfointersection = helinffeature.subList(0, percent);
        helinfounion = helinffeature.subList(percent, parti);
        setall.addAll(helinfounion);
        chi_Sqare(helfeature, 12, 51);
        sortMapchihel = sortByValues(chisqarehel);
        helchifeature = new ArrayList(sortMapchihel.keySet());
        partc = helchifeature.size();
        percent = (int) (partc * 0.75);
        helchiintersection = helchifeature.subList(0, percent);
        helchiunion = helchifeature.subList(percent, partc);
        setall.addAll(helchiunion);
        //intersection
        for (Object str : heldocintersection) {
            if (helinfointersection.contains(str)) {
                if (helchiintersection.contains(str)) {
                    heldocallintersection.add(str);
                }
            }
        }
        //union
        setall.addAll(heldocallintersection);

        // army class
        armydocallintersection = new ArrayList();
        armydocallunion = new ArrayList();
        documentFrequncy(armfeature, 13, 37);
        sortMapdocarmy = sortByValues(documntfrequencyarmy);
        armydocfeature = new ArrayList(sortMapdocarmy.keySet());
        partd = armydocfeature.size();
        percent = (int) (partd * 0.75);
        armydocintersection = armydocfeature.subList(0, percent);
        armydocunion = armydocfeature.subList(percent, partd);
        setall.addAll(armydocunion);
        informationGain(armfeature, 13, (float) 1.5);
        sortMapinfoarmy = sortByValues(informationgainarmy);
        armyinffeature = new ArrayList(sortMapinfoarmy.keySet());
        parti = armyinffeature.size();
        percent = (int) (parti * 0.75);
        armyinfointersection = armyinffeature.subList(0, percent);
        armyinfounion = armyinffeature.subList(percent, parti);
        setall.addAll(armyinfounion);
        chi_Sqare(armfeature, 13, 40);
        sortMapchiarmy = sortByValues(chisqarearmy);
        armychifeature = new ArrayList(sortMapchiarmy.keySet());
        partc = armychifeature.size();
        percent = (int) (partc * 0.75);
        armychiintersection = armychifeature.subList(0, percent);
        armychiunion = armychifeature.subList(percent, partc);
        setall.addAll(armychiunion);
        //intersection
        for (Object str : armydocintersection) {
            if (armyinfointersection.contains(str)) {
                if (armychiintersection.contains(str)) {
                    armydocallintersection.add(str);
                }
            }
        }
        //union
        setall.addAll(armydocallintersection);
        listall.addAll(setall);
    }
//reading the contents from a file

    void read() {
        try {
            pre_list = new ArrayList<>();
            suf_list = new ArrayList<>();
            p_name = new ArrayList<>();
            stem_word = new ArrayList<>();

            //reading place and town name
            for (File places : place_name.listFiles()) {
                fin = new FileInputStream(places);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    place.add(temp);
                }

            }

            //reading month name
            for (File mont : month_name.listFiles()) {
                fin = new FileInputStream(mont);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    month.add(temp);
                }
            }

            //reading compound words first
            for (File comp_word : com_word_first.listFiles()) {
                fin = new FileInputStream(comp_word);
                scan = new Scanner(fin);
                while (scan.hasNextLine()) {
                    temp = scan.nextLine();
                    temp = Normalization(temp);
                    comp_first.add(temp);
                }
            }
            //reading next word of the compound
            for (File comp_word_next : com_word_next.listFiles()) {
                fin = new FileInputStream(comp_word_next);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    comp_next.add(temp);
                }
            }
            //reading chi square feature
            for (File entry : chifile.listFiles()) {
                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    chiunion.add(temp);
                }
                newunions.clear();
                newunions.addAll(chiunion);
                chiunion.clear();
                chiunion.addAll(newunions);
                chiunion.removeAll(stop_word_list);
                chiunion.removeAll(p_name);
                chiunion.removeAll(month);
                chiunion.removeAll(place);
            }
            //reading short form from abbrivation 
            for (File short_list : abbrivation_short.listFiles()) {
                fin = new FileInputStream(short_list);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    shortform.add(temp);
                }
            }
            //reading long form from the abrivation 
            for (File long_list : abbrivation_long.listFiles()) {
                fin = new FileInputStream(long_list);
                scan = new Scanner(fin);
                while (scan.hasNextLine()) {
                    temp = scan.nextLine();
                    temp = Normalization(temp);
                    longform.add(temp);
                }
            }
            //reading file from stop word
            for (File stoplist : stop_word.listFiles()) {
                fin = new FileInputStream(stoplist);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    stop_word_list.add(temp);
                }
            }

            //reading person name list
            for (File per_name : person_name.listFiles()) {
                fin = new FileInputStream(per_name);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    p_name.add(temp);
                }
            }

            //reading intersection union
            for (File entry : interfile.listFiles()) {
                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    if (temp.length() < 2 && temp.length() > 9) {

                    } else {
                        interunion.add(temp);
                    }
                }
                newunions.clear();
                newunions.addAll(interunion);
                interunion.clear();
                interunion.addAll(newunions);
                interunion.removeAll(stop_word_list);
                interunion.removeAll(p_name);
                interunion.removeAll(month);
                interunion.removeAll(place);
            }
            // reading  ig union
            for (File entry : igfile.listFiles()) {
                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    if (temp.length() < 2 && temp.length() > 9) {

                    } else {
                        igunion.add(temp);
                    }
                }
                for (String str : igunion) {
                    int index = igunion.indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            igunion.set(index, stem_word.get(i));
                        }
                    }
                }
                newunions.clear();
                newunions.addAll(igunion);
                igunion.clear();
                igunion.addAll(newunions);
                igunion.removeAll(stop_word_list);
                igunion.removeAll(p_name);
                igunion.removeAll(month);
                igunion.removeAll(place);
            }
            //read df uinfion
            for (File entry : dffile.listFiles()) {
                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    if (temp.length() < 2 && temp.length() > 9) {

                    } else {
                        dfunion.add(temp);
                    }
                }
                for (String str : dfunion) {
                    int index = dfunion.indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            dfunion.set(index, stem_word.get(i));
                        }
                    }
                }
                newunions.clear();
                newunions.addAll(dfunion);
                dfunion.clear();
                dfunion.addAll(newunions);
                dfunion.removeAll(stop_word_list);
                dfunion.removeAll(p_name);
                dfunion.removeAll(month);
                dfunion.removeAll(place);
            }
            //reading unified model
            for (File entry : unionall_3.listFiles()) {
                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    if (temp.length() < 2 && temp.length() > 9) {

                    } else {
                        union_3.add(temp);
                    }
                }
                for (String str : union_3) {
                    int index = union_3.indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            union_3.set(index, stem_word.get(i));
                        }
                    }
                }
                newunions.clear();
                newunions.addAll(union_3);
                union_3.clear();
                union_3.addAll(newunions);
                union_3.removeAll(stop_word_list);
                union_3.removeAll(p_name);
                union_3.removeAll(month);
                union_3.removeAll(place);
            }
            //unified feature for the new model
            for (File entry : unified.listFiles()) {

                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    newunion.add(temp);

                }
                for (String str : newunion) {
                    int index = newunion.indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            newunion.set(index, stem_word.get(i));
                        }
                    }
                }
                newunions.clear();
                newunions.addAll(newunion);
                newunion.clear();
                newunion.addAll(newunions);
                newunion.removeAll(stop_word_list);
                newunion.removeAll(p_name);
                newunion.removeAll(month);
                newunion.removeAll(place);

                // newunion.addAll(newunions);
            }
            // reading test file and predict the class
            for (File entry : test_doc.listFiles()) {
                fin = new FileInputStream(entry);
                scan = new Scanner(fin);
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    file_test.add(temp);

                }
                newunions.clear();
                newunions.addAll(file_test);
                file_test.clear();
                file_test.addAll(newunions);
                file_test.removeAll(stop_word_list);
                file_test.removeAll(p_name);
                file_test.removeAll(month);
                file_test.removeAll(place);
            }
            //reading the whole document under economy class
            for (File entry : economy.listFiles()) {
                fill = new File(economy + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                economydocument[count1] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    economydocument[count1].add(temp);
                    if (temp.length() < 2) {
                        economydocument[count1].remove(temp);
                    }
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            economydocument[count1].remove(temp);
                        }
                    }
                    for (String str : economydocument[count1]) {
                        int index = economydocument[count1].indexOf(str);
                        for (int i = 0; i < stem_word.size(); i++) {
                            if (inf_derv[i].contains(str)) {
                                economydocument[count1].set(index, stem_word.get(i));
                            }
                        }
                    }
                }
                economydocument[count1].removeAll(stop_word_list);
                economydocument[count1].removeAll(p_name);
                economydocument[count1].removeAll(month);
                economydocument[count1].removeAll(place);
                allecofeature.addAll(economydocument[count1]);
                ecofeature.addAll(economydocument[count1]);
                allfeature.addAll(ecofeature);
                all.addAll(allecofeature);
                count1++;

            }
            //reading the whole documents under education category 
            for (File entry : education.listFiles()) {
                fill = new File(education + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                educationdocument[count2] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    educationdocument[count2].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            educationdocument[count2].remove(temp);
                        }
                    }
                }

                for (String str : educationdocument[count2]) {
                    int index = educationdocument[count2].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            educationdocument[count2].set(index, stem_word.get(i));
                        }
                    }
                }
                educationdocument[count2].removeAll(stop_word_list);
                educationdocument[count2].removeAll(p_name);
                educationdocument[count2].removeAll(month);
                educationdocument[count2].removeAll(place);
                alledufeature.addAll(educationdocument[count2]);
                edufeature.addAll(educationdocument[count2]);
                allfeature.addAll(edufeature);
                all.addAll(alledufeature);
                count2++;
            }
//            //reading all the documents under sport category
            for (File entry : sport.listFiles()) {
                fill = new File(sport + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                sportdocument[count3] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    sportdocument[count3].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            sportdocument[count3].remove(temp);
                        }
                    }
                }

                for (String str : sportdocument[count3]) {
                    int index = sportdocument[count3].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            sportdocument[count3].set(index, stem_word.get(i));
                        }
                    }
                }
                sportdocument[count3].removeAll(stop_word_list);
                sportdocument[count3].removeAll(p_name);
                sportdocument[count3].removeAll(month);
                sportdocument[count3].removeAll(place);
                allspofeature.addAll(sportdocument[count3]);
                spofeature.addAll(sportdocument[count3]);
                allfeature.addAll(spofeature);
                all.addAll(allspofeature);
                count3++;
            }

//            //reading all the documents under culture category
            for (File entry : culture.listFiles()) {
                fill = new File(culture + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                culturedocument[count4] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }

                    culturedocument[count4].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            culturedocument[count4].remove(temp);
                        }
                    }

                }
                for (String str : culturedocument[count4]) {
                    int index = culturedocument[count4].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            culturedocument[count4].set(index, stem_word.get(i));
                        }
                    }
                }
                culturedocument[count4].removeAll(stop_word_list);
                culturedocument[count4].removeAll(p_name);
                culturedocument[count4].removeAll(month);
                culturedocument[count4].removeAll(place);
                allculfeature.addAll(culturedocument[count4]);
                culfeature.addAll(culturedocument[count4]);
                allfeature.addAll(culfeature);
                all.addAll(allculfeature);
                count4++;

            }

//            //reading all the documents under accident category
            for (File entry : accident.listFiles()) {
                fill = new File(accident + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                accedentdocument[count5] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    accedentdocument[count5].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            accedentdocument[count5].remove(temp);
                        }
                    }

                }

                for (String str : accedentdocument[count5]) {
                    int index = accedentdocument[count5].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            accedentdocument[count5].set(index, stem_word.get(i));
                        }
                    }
                }
                accedentdocument[count5].removeAll(stop_word_list);
                accedentdocument[count5].removeAll(p_name);
                accedentdocument[count5].removeAll(month);
                accedentdocument[count5].removeAll(place);
                allaccfeature.addAll(accedentdocument[count5]);
                accfeature.addAll(accedentdocument[count5]);
                allfeature.addAll(accfeature);
                all.addAll(allaccfeature);
                count5++;
            }

//            //reading all the documents under environmental category
            for (File entry : environmntal.listFiles()) {
                fill = new File(environmntal + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                environmntaldocument[count6] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    environmntaldocument[count6].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            environmntaldocument[count6].remove(temp);
                        }
                    }
                }

                for (String str : environmntaldocument[count6]) {
                    int index = environmntaldocument[count6].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            environmntaldocument[count6].set(index, stem_word.get(i));
                        }
                    }
                }
                environmntaldocument[count6].removeAll(stop_word_list);
                environmntaldocument[count6].removeAll(p_name);
                environmntaldocument[count6].removeAll(month);
                environmntaldocument[count6].removeAll(place);
                allenvfeature.addAll(environmntaldocument[count6]);
                envfeature.addAll(environmntaldocument[count6]);
                allfeature.addAll(envfeature);
                all.addAll(allenvfeature);
                count6++;
            }

//            //reading all the documents under foreign affairs category
            for (File entry : foreign_affair.listFiles()) {
                fill = new File(foreign_affair + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                foreign_affairdocument[count7] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    foreign_affairdocument[count7].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            foreign_affairdocument[count7].remove(temp);
                        }
                    }

                }
                for (String str : foreign_affairdocument[count7]) {
                    int index = foreign_affairdocument[count7].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            foreign_affairdocument[count7].set(index, stem_word.get(i));
                        }
                    }
                }
                foreign_affairdocument[count7].removeAll(stop_word_list);
                foreign_affairdocument[count7].removeAll(p_name);
                foreign_affairdocument[count7].removeAll(month);
                foreign_affairdocument[count7].removeAll(place);
                alldepfeature.addAll(foreign_affairdocument[count7]);
                depfeature.addAll(foreign_affairdocument[count7]);
                allfeature.addAll(depfeature);
                all.addAll(alldepfeature);
                count7++;
            }

//            //reading all the documents under law and justices category
            for (File entry : law_justice.listFiles()) {
                fill = new File(law_justice + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                law_justicedocument[count8] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    law_justicedocument[count8].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            law_justicedocument[count8].remove(temp);
                        }
                    }

                }
                for (String str : law_justicedocument[count8]) {
                    int index = law_justicedocument[count8].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            law_justicedocument[count8].set(index, stem_word.get(i));
                        }
                    }
                }
                law_justicedocument[count8].removeAll(stop_word_list);
                law_justicedocument[count8].removeAll(p_name);
                law_justicedocument[count8].removeAll(month);
                law_justicedocument[count8].removeAll(month);
                alllawfeature.addAll(law_justicedocument[count8]);
                lawfeature.addAll(law_justicedocument[count8]);
                allfeature.addAll(lawfeature);
                all.addAll(alllawfeature);
                count8++;
            }

//            //reading all the documents under other category
            for (File entry : agri.listFiles()) {
                fill = new File(agri + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                agriculture[count9] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    agriculture[count9].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            agriculture[count9].remove(temp);
                        }
                    }

                }
                for (String str : agriculture[count9]) {
                    int index = agriculture[count9].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            agriculture[count9].set(index, stem_word.get(i));
                        }
                    }
                }
                agriculture[count9].removeAll(stop_word_list);
                agriculture[count9].removeAll(p_name);
                agriculture[count9].removeAll(month);
                agriculture[count9].removeAll(place);
                allagrifeature.addAll(agriculture[count9]);
                agrifeature.addAll(agriculture[count9]);
                allfeature.addAll(agrifeature);
                all.addAll(allagrifeature);
                count9++;
            }
            //reading all the documents under politics category
            for (File entry : politics.listFiles()) {
                fill = new File(politics + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                politicsdocument[count10] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    politicsdocument[count10].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            politicsdocument[count10].remove(temp);
                        }
                    }
                }
                for (String str : politicsdocument[count10]) {
                    int index = politicsdocument[count10].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            politicsdocument[count10].set(index, stem_word.get(i));
                        }
                    }
                }
                politicsdocument[count10].removeAll(stop_word_list);
                politicsdocument[count10].removeAll(p_name);
                politicsdocument[count10].removeAll(month);
                politicsdocument[count10].removeAll(place);
                allpolfeature.addAll(politicsdocument[count10]);
                polfeature.addAll(politicsdocument[count10]);
                allfeature.addAll(polfeature);
                all.addAll(allpolfeature);
                count10++;
            }
            //reading all the documents under science and technology category
            for (File entry : science_technology.listFiles()) {
                fill = new File(science_technology + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                science_technologydocument[count12] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    science_technologydocument[count12].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            science_technologydocument[count12].remove(temp);
                        }
                    }

                }
                for (String str : science_technologydocument[count12]) {
                    int index = science_technologydocument[count12].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            science_technologydocument[count12].set(index, stem_word.get(i));
                        }
                    }
                }
                science_technologydocument[count12].removeAll(stop_word_list);
                science_technologydocument[count12].removeAll(p_name);
                science_technologydocument[count12].removeAll(month);
                science_technologydocument[count12].removeAll(place);
                allscifeature.addAll(science_technologydocument[count12]);
                scifeature.addAll(science_technologydocument[count12]);
                allfeature.addAll(scifeature);
                all.addAll(allscifeature);
                count12++;

            }

            //reading all the documents under health category
            for (File entry : health.listFiles()) {
                fill = new File(health + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                healthdocument[count13] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    healthdocument[count13].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            healthdocument[count13].remove(temp);
                        }
                    }
                }
                for (String str : healthdocument[count13]) {
                    int index = healthdocument[count13].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            healthdocument[count13].set(index, stem_word.get(i));
                        }
                    }
                }
                healthdocument[count13].removeAll(stop_word_list);
                healthdocument[count13].removeAll(p_name);
                healthdocument[count13].removeAll(month);
                healthdocument[count13].removeAll(place);
                allhelfeature.addAll(healthdocument[count13]);
                helfeature.addAll(healthdocument[count13]);
                allfeature.addAll(helfeature);
                all.addAll(allhelfeature);
                count13++;
            }

            //reading all the file of relgion categories 
            for (File entry : army_file.listFiles()) {
                fill = new File(army_file + "\\" + entry.getName());
                fin = new FileInputStream(fill);
                scan = new Scanner(fin);
                army[count14] = new ArrayList<>();
                while (scan.hasNext()) {
                    temp = scan.next();
                    temp = Normalization(temp);
                    set.add(temp);
                    if (comp_first.contains(temp)) {
                        int index = comp_first.indexOf(temp);
                        next = comp_next.get(index);
                        if (comp_next.contains(next)) {
                            temp = temp + next;
                        }
                    }
                    if (shortform.contains(temp)) {
                        int i = shortform.indexOf(temp);
                        temp = longform.get(i);
                    }
                    army[count14].add(temp);
                    for (char dig : temp.toCharArray()) {
                        if (Character.isDigit(dig)) {
                            army[count14].remove(temp);
                        }
                    }

                }
                for (String str : army[count14]) {
                    int index = army[count14].indexOf(str);
                    for (int i = 0; i < stem_word.size(); i++) {
                        if (inf_derv[i].contains(str)) {
                            army[count14].set(index, stem_word.get(i));
                        }
                    }
                }
                army[count14].removeAll(stop_word_list);
                army[count14].removeAll(p_name);
                army[count14].removeAll(month);
                army[count14].removeAll(place);
                allarmfeature.addAll(army[count14]);
                armfeature.addAll(army[count14]);
                allfeature.addAll(armfeature);
                all.addAll(allarmfeature);
                count14++;
            }
        } catch (Exception ex) {
            System.out.println("here");
        }
    }
    // sorting maps by value

    public static < K, V extends Comparable<V>>
            Map< K, V>
            sortByValues(final Map< K, V> map) {
        Comparator< K> valueComparator
                = new Comparator< K>() {
            public int compare(K k1, K k2) {
                int compare
                        = map.get(k1).compareTo(map.get(k2));
                if (compare == 0) {
                    return 1;
                } else {
                    return compare;
                }
            }
        };
        Map< K, V> sortedByValues
                = new TreeMap<K, V>(valueComparator);

        sortedByValues.putAll(map);
        return sortedByValues;
    }

// method for calculationg union of three methods of feature selection
// calculating the intersection between the three methods
    String temp,
            next;
    File fill;
    FileInputStream fin;
    Scanner scan;
    ArrayList<String> pre_list,
            suf_list,
            p_name,
            stem_word;

    int e,
            n,
            an,
            mp,
            np,
            nm,
            pm,
            p,
            a,
            m,
            d,
            count,
            occ_tinc1,
            occ_tinc2,
            occ_tinc3,
            occ_tinc4,
            occ_tinc5,
            occ_tinc6,
            occ_tinc7,
            occ_tinc8,
            occ_tinc9,
            occ_tinc10,
            occ_tinc12,
            occ_tinc13,
            occ_tinc14,
            notocc_tinc1,
            notocc_tinc2,
            notocc_tinc3,
            notocc_tinc4,
            notocc_tinc5,
            notocc_tinc6,
            notocc_tinc7,
            notocc_tinc8,
            notocc_tinc9,
            notocc_tinc10,
            notocc_tinc12,
            notocc_tinc13,
            notocc_tinc14,
            termfrequancy;
    int count1, df,
            count2,
            count3,
            count4,
            count5,
            count6,
            count7,
            fre,
            count8,
            count9,
            count10,
            count12,
            count13,
            count14,
            x,
            count0;
    long nomi,
            denom,
            product;

    double pc1, tf, idf, tf_idf,
            pc2,
            pc3,
            pc4,
            pc5,
            pc6,
            pc7,
            pc8,
            pc9,
            pc10,
            pc12,
            pc13,
            pc14,
            pro_ct1,
            pro_ct2,
            pro_ct3,
            pro_ct4,
            pro_ct5,
            pro_ct6,
            pro_ct7,
            pro_ct8,
            pro_ct9,
            pro_ct10,
            pro_ct11,
            pro_ct12,
            pro_ct13,
            pro_ct14,
            pro_coutt1,
            pro_coutt2,
            pro_coutt3,
            pro_coutt4,
            pro_coutt5,
            pro_coutt6,
            pro_coutt7,
            pro_coutt8,
            pro_coutt9,
            pro_coutt10,
            pro_coutt11,
            pro_coutt12,
            pro_coutt13,
            pro_coutt14,
            sumpc,
            sumpct,
            sumpcwt,
            info_gain;
    double pro_t,
            notpro_t,
            pclog1,
            pclog2,
            pclog3,
            pclog4,
            pclog5,
            pclog6,
            pclog7,
            pclog8,
            pclog9,
            pclog10,
            pclog11,
            pclog12,
            pclog13,
            pclog14;
    File economy = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Economy");
    File education = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Education");
    File sport = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Sport");
    File culture = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Culture and turisum");
    File accident = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Accidents");
    File environmntal = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Environmental");
    File foreign_affair = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Foreign Affair");
    File law_justice = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Law and Justice");
    File agri = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Agricluture");
    File politics = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Politics");
    //  File social_affairs = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Social Affairs");
    File science_technology = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Science and Technology");
    File health = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Health");
    File army_file = new File("C:\\Users\\pc\\Documents\\deme data\\corpus\\Stemmed\\ReStemmed\\Army");
    File stop_word = new File("C:\\Users\\pc\\Documents\\deme data\\amharic stopwords");
    File list_abbrivation = new File("C:\\Users\\pc\\Documents\\deme data\\Abbreviations");
    File person_name = new File("C:\\Users\\pc\\Documents\\deme data\\person_name");
    File unionall_3 = new File("C:\\Users\\pc\\Documents\\deme data\\allunion");
    File test_doc = new File("C:\\Users\\pc\\Desktop\\test_news\\environment\\stem\\stemS");
    ArrayList<String> file_test = new ArrayList<>();
    FileOutputStream feco,
            fedu,
            fspo,
            fcul,
            facc,
            fenv,
            flaw,
            fdep,
            fagr,
            fpol,
            fsoc,
            fsci,
            fhel,
            farm;
    Set<String> stop_word_list = new HashSet<>();
    // reading stop word lists
//    File prefix_list = new File("C:\\Users\\pc\\Documents\\deme data\\some common prefixes");
//    File suffix_list = new File("C:\\Users\\pc\\Documents\\deme data\\some common suffix");
    File abbrivation_long = new File("C:\\Users\\pc\\Documents\\deme data\\Abbreviations\\longform");
    File abbrivation_short = new File("C:\\Users\\pc\\Documents\\deme data\\Abbreviations\\shortform");
    File com_word_first = new File("C:\\Users\\pc\\Documents\\deme data\\com_word_first");
    File com_word_next = new File("C:\\Users\\pc\\Documents\\deme data\\com_word_next");
    //File stemed_word = new File("C:\\Users\\pc\\Documents\\deme data\\stemm_word");
    // File inf_derivation = new File("C:\\Users\\pc\\Documents\\deme data\\inflection and dervion of a given word");
    File month_name = new File("C:\\Users\\pc\\Documents\\deme data\\month name");
    File place_name = new File("C:\\Users\\pc\\Documents\\deme data\\place_name");
    File unified = new File("C:\\Users\\pc\\Documents\\deme data\\union");
    File ecolist = new File("C:\\Users\\pc\\Documents\\deme data\\ecolist");
    File dffile = new File("C:\\Users\\pc\\Documents\\deme data\\DF");
    File igfile = new File("C:\\Users\\pc\\Documents\\deme data\\IG");
    File interfile = new File("C:\\Users\\pc\\Documents\\deme data\\intersection");
    File chifile = new File("C:\\Users\\pc\\Documents\\deme data\\chi");
    ArrayList<String> dfunion = new ArrayList<>();
    ArrayList<String> chiunion = new ArrayList<>();
    ArrayList<String> igunion = new ArrayList<>();
    ArrayList<String> interunion = new ArrayList<>();
    ArrayList<String> comp_first = new ArrayList<>();
    ArrayList<String> union_3 = new ArrayList<>();
    ArrayList<String> eco = new ArrayList<>();
    ArrayList<String> place = new ArrayList<>();
    ArrayList<String> comp_next = new ArrayList<>();
    ArrayList<String> month = new ArrayList<>();
    ArrayList<String> newunion = new ArrayList<>();
    ArrayList<String> inf_derve = new ArrayList<>();
    ArrayList<String> shortform = new ArrayList<>();
    ArrayList<String> longform = new ArrayList<>();
    ArrayList<String> allecofeature = new ArrayList<>();
    ArrayList<String> alledufeature = new ArrayList<>();
    ArrayList<String> allspofeature = new ArrayList<>();
    ArrayList<String> allculfeature = new ArrayList<>();
    ArrayList<String> allaccfeature = new ArrayList<>();
    ArrayList<String> allenvfeature = new ArrayList<>();
    ArrayList<String> alldepfeature = new ArrayList<>();
    ArrayList<String> alllawfeature = new ArrayList<>();
    ArrayList<String> allagrifeature = new ArrayList<>();
    ArrayList<String> allpolfeature = new ArrayList<>();
    // ArrayList<String> allsocfeature = new ArrayList<>();
    ArrayList<String> allscifeature = new ArrayList<>();
    ArrayList<String> allhelfeature = new ArrayList<>();
    ArrayList<String> allarmfeature = new ArrayList<>();
    ArrayList<String> dfeco = new ArrayList<>();
    ArrayList<String> dfedu = new ArrayList<>();
    ArrayList<String> dfspo = new ArrayList<>();
    ArrayList<String> dfcul = new ArrayList<>();
    ArrayList<String> dfacc = new ArrayList<>();
    ArrayList<String> dfenv = new ArrayList<>();
    ArrayList<String> dfdep = new ArrayList<>();
    ArrayList<String> dflaw = new ArrayList<>();
    ArrayList<String> dfagr = new ArrayList<>();
    ArrayList<String> dfpol = new ArrayList<>();
    ArrayList<String> dfsoc = new ArrayList<>();
    ArrayList<String> dfsci = new ArrayList<>();
    ArrayList<String> dfhel = new ArrayList<>();
    ArrayList<String> dfarm = new ArrayList<>();
    Set<String> alldf = new HashSet<>();
    Set<String> newunions = new HashSet<>();
    ArrayList<String> listallDf = new ArrayList<>();
    ArrayList<String> listallIG = new ArrayList<>();
    ArrayList<String> listallCH = new ArrayList<>();
    Set unionpure = new HashSet();
    ArrayList<String> intererunion = new ArrayList<>();
    HashMap<String, ArrayList[]> stem = new HashMap();
    Set<String> ecofeature = new HashSet<>();
    Set<String> edufeature = new HashSet<>();
    Set<String> spofeature = new HashSet<>();
    Set<String> culfeature = new HashSet<>();
    Set<String> accfeature = new HashSet<>();
    Set<String> envfeature = new HashSet<>();
    Set<String> depfeature = new HashSet<>();
    Set<String> lawfeature = new HashSet<>();
    Set<String> agrifeature = new HashSet<>();
    Set<String> polfeature = new HashSet<>();
//    Set<String> socfeature = new HashSet<>();
    ArrayList<String> total = new ArrayList<>();
    Set<String> scifeature = new HashSet<>();
    Set<String> helfeature = new HashSet<>();
    Set<String> armfeature = new HashSet<>();
    ArrayList<String>[] economydocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] educationdocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] sportdocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] culturedocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] accedentdocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] environmntaldocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] foreign_affairdocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] law_justicedocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] agriculture = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] politicsdocument = (ArrayList<String>[]) new ArrayList[250];
    //ArrayList<String>[] social_affairsdocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] science_technologydocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] army = (ArrayList<String>[]) new ArrayList[205];
    ArrayList<String>[] healthdocument = (ArrayList<String>[]) new ArrayList[250];
    ArrayList<String>[] inf_derv = new ArrayList[3000];

    TreeMap<String, Integer> documntfrequencyeco = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyedu = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyspo = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencycul = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyaccid = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyenv = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencydep = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencylaw = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyagri = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencypoltics = new TreeMap<>();
    // TreeMap<String, Integer> documntfrequencysocial = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencysci = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyhel = new TreeMap<>();
    TreeMap<String, Integer> documntfrequencyarmy = new TreeMap<>();

    TreeMap<String, Double> informationgaineco = new TreeMap<>();
    TreeMap<String, Double> informationgainedu = new TreeMap<>();
    TreeMap<String, Double> informationgainspo = new TreeMap<>();
    TreeMap<String, Double> informationgaincul = new TreeMap<>();
    TreeMap<String, Double> informationgainaccid = new TreeMap<>();
    TreeMap<String, Double> informationgainenv = new TreeMap<>();
    TreeMap<String, Double> informationgaindep = new TreeMap<>();
    TreeMap<String, Double> informationgainlaw = new TreeMap<>();
    TreeMap<String, Double> informationgainagri = new TreeMap<>();
    TreeMap<String, Double> informationgainpol = new TreeMap<>();
    //TreeMap<String, Double> informationgainsocial = new TreeMap<>();
    TreeMap<String, Double> informationgainsci = new TreeMap<>();
    TreeMap<String, Double> informationgainhel = new TreeMap<>();
    TreeMap<String, Double> informationgainarmy = new TreeMap<>();
    HashSet<String> deme = new HashSet<>();
    ArrayList<String> deme1 = new ArrayList<>();

    TreeMap<String, Long> chisqareeco = new TreeMap<>();
    TreeMap<String, Long> chisqareedu = new TreeMap<>();
    TreeMap<String, Long> chisqarespo = new TreeMap<>();
    TreeMap<String, Long> chisqarecul = new TreeMap<>();
    TreeMap<String, Long> chisqareaccid = new TreeMap<>();
    TreeMap<String, Long> chisqareenv = new TreeMap<>();
    TreeMap<String, Long> chisqaredep = new TreeMap<>();
    TreeMap<String, Long> chisqarelaw = new TreeMap<>();
    TreeMap<String, Long> chisqareagri = new TreeMap<>();
    TreeMap<String, Long> chisqarepol = new TreeMap<>();
    //TreeMap<String, Long> chisqaresocial = new TreeMap<>();
    TreeMap<String, Long> chisqaresci = new TreeMap<>();
    TreeMap<String, Long> chisqarehel = new TreeMap<>();
    TreeMap<String, Long> chisqarearmy = new TreeMap<>();
    ArrayList<String> unionall = new ArrayList<>();
    Set<String> all = new HashSet<>();
    ArrayList<String> allfeature = new ArrayList<>();

    List ecodocintersection,
            ecodocunion,
            ecodocfeature,
            ecoinffeature,
            ecochifeature,
            ecoinfointersection,
            ecoinfounion,
            ecochiintersection,
            ecochiunion,
            ecodocallunion,
            ecodocallintersection;
    List edudocintersection,
            edudocunion,
            edudocfeature,
            eduinffeature,
            educhifeature,
            eduinfointersection,
            eduinfounion,
            educhiintersection,
            educhiunion,
            edudocallunion,
            edudocallintersection;
    List spodocintersection,
            spodocunion,
            spodocfeature,
            spoinffeature,
            spochifeature,
            spoinfointersection,
            spoinfounion,
            spochiintersection,
            spochiunion,
            spodocallunion,
            spodocallintersection;
    List culdocintersection,
            culdocunion,
            culdocfeature,
            culinffeature,
            culchifeature,
            culinfointersection,
            culinfounion,
            culchiintersection,
            culchiunion,
            culdocallunion,
            culdocallintersection;
    List accdocintersection,
            accdocunion,
            accdocfeature,
            accinffeature,
            accchifeature,
            accinfointersection,
            accinfounion,
            accchiintersection,
            accchiunion,
            accdocallunion,
            accdocallintersection;
    List envdocintersection,
            envdocunion,
            envdocfeature,
            envinffeature,
            envchifeature,
            envinfointersection,
            envinfounion,
            envchiintersection,
            envchiunion,
            envdocallunion,
            envdocallintersection;
    List depdocintersection,
            depdocunion,
            depdocfeature,
            depinffeature,
            depchifeature,
            depinfointersection,
            depinfounion,
            depchiintersection,
            depchiunion,
            depdocallunion,
            depdocallintersection;
    List lawdocintersection,
            lawdocunion,
            lawdocfeature,
            lawinffeature,
            lawchifeature,
            lawinfointersection,
            lawinfounion,
            lawchiintersection,
            lawchiunion,
            lawdocallunion,
            lawdocallintersection;
    List agridocintersection,
            agridocunion,
            agridocfeature,
            agriinffeature,
            agrichifeature,
            agriinfointersection,
            agriinfounion,
            agrichiintersection,
            agrichiunion,
            agridocallunion,
            agridocallintersection;
    List poldocintersection,
            poldocunion,
            poldocfeature,
            polinffeature,
            polchifeature,
            polinfointersection,
            polinfounion,
            polchiintersection,
            polchiunion,
            poldocallunion,
            poldocallintersection;
    List scidocintersection,
            scidocunion,
            scidocfeature,
            sciinffeature,
            scichifeature,
            sciinfointersection,
            sciinfounion,
            scichiintersection,
            scichiunion,
            scidocallunion,
            scidocallintersection;
    List heldocintersection,
            heldocunion,
            heldocfeature,
            helinffeature,
            helchifeature,
            helinfointersection,
            helinfounion,
            helchiintersection,
            helchiunion,
            heldocallunion,
            heldocallintersection;
    List armydocintersection,
            armydocunion,
            armydocfeature,
            armyinffeature,
            armychifeature,
            armyinfointersection,
            armyinfounion,
            armychiintersection,
            armychiunion,
            armydocallunion,
            armydocallintersection;
    List unioneco,
            unionedu,
            unionspo,
            unioncul,
            unionaccid,
            unionenv,
            unionagri,
            unionpol,
            unionsoc,
            unionsci,
            unionlaw,
            unionhel,
            unionarmy,
            uniondep;
    Set setall;
    List listall;

    Iterator it;

    int partd, parti, partc,
            percent;
    Map sortMapdoceco,
            sortMapdocedu,
            sortMapdocspo,
            sortMapdoccul,
            sortMapdocaccid,
            sortMapdocenv,
            sortMapdocdep,
            sortMapdoclaw,
            sortMapdocagri,
            sortMapdocpol,
            sortMapdocsocial,
            sortMapdocsci,
            sortMapdochel,
            sortMapdocarmy;
    Map sortMapinfoeco,
            sortMapinfoedu,
            sortMapinfospo,
            sortMapinfocul,
            sortMapinfoaccid,
            sortMapinfoenv,
            sortMapinfodep,
            sortMapinfolaw,
            sortMapinfoagri,
            sortMapinfopol,
            sortMapinfosocial,
            sortMapinfosci,
            sortMapinfohel,
            sortMapinfoarmy;
    Map sortMapchieco,
            sortMapchiedu,
            sortMapchispo,
            sortMapchicul,
            sortMapchiaccid,
            sortMapchienv,
            sortMapchidep,
            sortMapchilaw,
            sortMapchiagri,
            sortMapchipol,
            sortMapchisocial,
            sortMapchisci,
            sortMapchihel,
            sortMapchiarmy;

    Set<String> set = new HashSet<>();

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demopage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                () -> {
                    new Demopage().setVisible(true);
                }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Df;
    private javax.swing.JTextArea area;
    private javax.swing.JButton chi;
    private javax.swing.JButton gain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
