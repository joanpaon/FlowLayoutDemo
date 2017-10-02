/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.japo.java.libraries.UtilesSwing;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends JFrame {

    // Propiedades App
    public static final String PRP_LOOK_AND_FEEL = "look_and_feel";
    public static final String PRP_FAVICON = "favicon";

    // Valores por Defecto
    public static final String DEF_LOOK_AND_FEEL = UtilesSwing.LNF_NIMBUS;
    public static final String DEF_FAVICON = "img/favicon.png";

    // Referencias
    private Properties prp;
    private JLabel lblLun;
    private JLabel lblMar;
    private JLabel lblMie;
    private JLabel lblJue;
    private JLabel lblVie;

    // Constructor
    public GUI(Properties prp) {
        // Inicialización Anterior
        initBefore(prp);

        // Creación Interfaz
        initComponents();

        // Inicializacion Posterior
        initAfter();
    }

    // Construcción - GUI
    private void initComponents() {
        // Etiqueta Norte
        lblLun = new JLabel("Lunes");
        lblLun.setHorizontalAlignment(JLabel.CENTER);
        lblLun.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblLun.setOpaque(true);
        lblLun.setForeground(Color.WHITE);
        lblLun.setBackground(Color.BLUE);
        
        // Etiqueta Sur
        lblMar = new JLabel("Martes");
        lblMar.setHorizontalAlignment(JLabel.CENTER);
        lblMar.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblMar.setOpaque(true);
        lblMar.setForeground(Color.WHITE);
        lblMar.setBackground(Color.RED);
        
        // Etiqueta Este
        lblMie = new JLabel("Miércoles");
        lblMie.setHorizontalAlignment(JLabel.CENTER);
        lblMie.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblMie.setOpaque(true);
        lblMie.setForeground(Color.WHITE);
        lblMie.setBackground(Color.MAGENTA);
        
        // Etiqueta Oeste
        lblJue = new JLabel("Jueves");
        lblJue.setHorizontalAlignment(JLabel.CENTER);
        lblJue.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblJue.setOpaque(true);
        lblJue.setForeground(Color.WHITE);
        lblJue.setBackground(Color.ORANGE);
        
        // Etiqueta Centro
        lblVie = new JLabel("Viernes");
        lblVie.setHorizontalAlignment(JLabel.CENTER);
        lblVie.setFont(new Font("Beatnik SF", Font.PLAIN, 60));
        lblVie.setOpaque(true);
        lblVie.setForeground(Color.WHITE);
        lblVie.setBackground(Color.PINK);
        
        // Panel Principal
        JPanel pnlPpal = new JPanel();
        pnlPpal.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        pnlPpal.add(lblLun);
        pnlPpal.add(lblMar);
        pnlPpal.add(lblMie);
        pnlPpal.add(lblJue);
        pnlPpal.add(lblVie);
        
        // Ventana Principal
        setContentPane(pnlPpal);
        setTitle("FlowLayout Demo");
//        setResizable(false);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Inicialización Anterior    
    private void initBefore(Properties prp) {
        // Memorizar Referencia
        this.prp = prp;

        // Establecer LnF
        UtilesSwing.establecerLnF(prp.getProperty(PRP_LOOK_AND_FEEL, DEF_LOOK_AND_FEEL));
    }

    // Inicialización Anterior
    private void initAfter() {
        // Establecer Favicon
        UtilesSwing.establecerFavicon(this, prp.getProperty(PRP_FAVICON, DEF_FAVICON));
    }
}
