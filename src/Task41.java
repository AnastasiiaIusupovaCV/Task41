


import additionalfigures.IScalable;
import figures.Dot;
import figures.Figure;
import java.awt.Color;
import java.awt.Point;
import java.util.AbstractList;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author a.yusupova
 */
public class Task41 extends javax.swing.JFrame {

    /**
     * Creates new form Task20
     */
    public Task41() {
        initComponents();
        
        figs = new java.util.ArrayList<figures.Figure>();
        
        jList1.setModel(new ListModel<String>(){
            
            private java.util.LinkedList<ListDataListener> listeners =  new java.util.LinkedList<ListDataListener>();

            @Override
            public int getSize() {
                return figs.size();
                
            }

            @Override
            public String getElementAt(int i) {
                if(figs.get(i) instanceof additionalfigures.IInforming)
                    return ((additionalfigures.IInforming)figs.get(i)).name(); // just to show the ability
                else
                    return figs.get(i).name(); // and for normal guys
            }

            @Override
            public void addListDataListener(ListDataListener ll) {
                listeners.add(ll);
            }

            @Override
            public void removeListDataListener(ListDataListener ll) {
                listeners.remove(ll);
            }
            
        });
        
        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (lse.getValueIsAdjusting() == false) {

                if (jList1.getSelectedIndex() == -1) {
                //No selection, disable fire button.
                    currentFig = null;

                } else {
                    if(figs.isEmpty())
                        currentFig = null;          //Selection, enable the fire button.
                    else
                    {
                        currentFig = figs.get(jList1.getSelectedIndex());
                        if(currentFig instanceof additionalfigures.IInforming)
                        {
                            if(((additionalfigures.IInforming)currentFig).canCalcArea())
                            {
                                Double area = ((additionalfigures.ICalcArea)currentFig).getArea();
                                jtfArea.setText(area.toString());
                            }
                            else
                                jtfArea.setText("Nan");

                        }
                        else
                            jtfArea.setText("Nan");
                    }
                    
                
                }
            }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jPanel2 = new javax.swing.JPanel();
        jrbCircle = new javax.swing.JRadioButton();
        jrbDot = new javax.swing.JRadioButton();
        jrbRectangle = new javax.swing.JRadioButton();
        jrbSquare = new javax.swing.JRadioButton();
        jbCreate = new javax.swing.JButton();
        jtfMoveToX = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfMoveToY = new javax.swing.JTextField();
        jbMoveFigure = new javax.swing.JButton();
        jbHide = new javax.swing.JButton();
        jbShow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfSize = new javax.swing.JTextField();
        jbResize = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfAspectRatio = new javax.swing.JTextField();
        jbStretch = new javax.swing.JButton();
        jrbSquareFilled = new javax.swing.JRadioButton();
        jrbRectangleFilled = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jtfArea = new javax.swing.JTextField();
        jrbInformingRectangle = new javax.swing.JRadioButton();
        jrbInformingCircle = new javax.swing.JRadioButton();
        jrbInformingSquare = new javax.swing.JRadioButton();
        jrbInformingEllipse = new javax.swing.JRadioButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 0), new java.awt.Dimension(4, 32767));
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 400));

        canvas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canvas1.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        buttonGroup1.add(jrbCircle);
        jrbCircle.setText("Circle");
        jrbCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCircleActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbDot);
        jrbDot.setText("Dot");
        jrbDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDotActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbRectangle);
        jrbRectangle.setText("Rectangle");

        buttonGroup1.add(jrbSquare);
        jrbSquare.setText("Square");
        jrbSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSquareActionPerformed(evt);
            }
        });

        jbCreate.setText("Create");
        jbCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateActionPerformed(evt);
            }
        });

        jtfMoveToX.setText("0");

        jLabel1.setText("x:");

        jLabel2.setText("y:");

        jtfMoveToY.setText("0");
        jtfMoveToY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMoveToYActionPerformed(evt);
            }
        });

        jbMoveFigure.setText("Move");
        jbMoveFigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMoveFigureActionPerformed(evt);
            }
        });

        jbHide.setText("Hide");
        jbHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHideActionPerformed(evt);
            }
        });

        jbShow.setText("Show");
        jbShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbShowActionPerformed(evt);
            }
        });

        jLabel3.setText("Size:");

        jtfSize.setText("0");

        jbResize.setText("Resize");
        jbResize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResizeActionPerformed(evt);
            }
        });

        jLabel4.setText("Aspect ratio:");

        jtfAspectRatio.setText("0");

        jbStretch.setText("Stretch");
        jbStretch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStretchActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbSquareFilled);
        jrbSquareFilled.setText("Filled Square");
        jrbSquareFilled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSquareFilledActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbRectangleFilled);
        jrbRectangleFilled.setText("Filled Rectangle");

        jLabel5.setText("Area:");

        jtfArea.setText("0");

        buttonGroup1.add(jrbInformingRectangle);
        jrbInformingRectangle.setText("Informing Rectangle");

        buttonGroup1.add(jrbInformingCircle);
        jrbInformingCircle.setText("Informing Circle");

        buttonGroup1.add(jrbInformingSquare);
        jrbInformingSquare.setText("Informing Square");

        buttonGroup1.add(jrbInformingEllipse);
        jrbInformingEllipse.setText("Informing Ellipse");
        jrbInformingEllipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInformingEllipseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbDot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbCircle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbRectangle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbSquare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbSquareFilled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbRectangleFilled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbInformingRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbInformingCircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbInformingSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jbResize, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfSize))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbInformingEllipse, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jbShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbHide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbMoveFigure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfMoveToX, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfMoveToY, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfArea)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbStretch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jtfAspectRatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbDot, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbRectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSquare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbSquareFilled)
                .addGap(1, 1, 1)
                .addComponent(jrbRectangleFilled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbInformingRectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbInformingCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbInformingSquare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbInformingEllipse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCreate)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfMoveToX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMoveToY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMoveFigure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbHide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbShow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbResize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAspectRatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbStretch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbDotActionPerformed

    private void jbCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateActionPerformed
        // TODO add your handling code here:
        graphics = this.canvas1.getGraphics();
        graphics.setColor(Color.white);
//        graphics.fillRect(0, 0, 
//                this.canvas1.getWidth(), this.canvas1.getHeight());
        
        
        if(currentFig != null)
            currentFig.hide();
        
        if(jrbCircle.isSelected())
        {
            currentFig = new figures.Circle(15, this.graphics);
        }
        
        if(jrbRectangle.isSelected())
            currentFig = new additionalfigures.Rectangle(15,45, this.graphics);
        if(jrbSquare.isSelected())
            currentFig = new additionalfigures.Square(15, this.graphics);
        if(jrbDot.isSelected())
            currentFig = new figures.Dot(this.graphics);
        if(jrbRectangleFilled.isSelected())
            currentFig = new additionalfigures.FilledRectangle(45,20,Color.CYAN, this.graphics);
        if(jrbSquareFilled.isSelected())
            currentFig = new additionalfigures.FilledSquare(15,Color.MAGENTA, this.graphics);
        if(jrbInformingCircle.isSelected())
            currentFig = new figures.InformingCircle(15, this.graphics);
        if(jrbInformingSquare.isSelected())
            currentFig = new figures.InformingSquare(25, this.graphics);
        if(jrbInformingRectangle.isSelected())
            currentFig = new figures.InformingRectangle(55,30, this.graphics);
        if(jrbInformingEllipse.isSelected())
            currentFig = new figures.InformingEllipse(31, 56, this.graphics);
        
        
        Integer highestIndexOfFigureType = getHighestIndexWithTypeName(currentFig.typeName());
        highestIndexOfFigureType++;
        currentFig.setName(currentFig.typeName()+highestIndexOfFigureType.toString());

        if(currentFig != null)
        {
            currentFig.setBackgroundColor(graphics.getColor());
            currentFig.setColor(Color.BLACK);
            currentFig.moveTo(this.canvas1.getWidth()/2, this.canvas1.getHeight()/2);
            currentFig.show();
            
            figs.add(currentFig);
        }
        
        jList1.updateUI();
         updateGraphics();
    }//GEN-LAST:event_jbCreateActionPerformed

    private void jrbCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCircleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbCircleActionPerformed

    private void jrbSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSquareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSquareActionPerformed

    private void jtfMoveToYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoveToYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoveToYActionPerformed

    private void jbMoveFigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMoveFigureActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(jtfMoveToX.getText());
        int y = Integer.parseInt(jtfMoveToY.getText());
        
        if(currentFig != null)
        {
            currentFig.moveTo(x, y);
        }
    }//GEN-LAST:event_jbMoveFigureActionPerformed

    private void jbHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHideActionPerformed
        // TODO add your handling code here:
        if(currentFig != null)
        {
            currentFig.hide();
        }
    }//GEN-LAST:event_jbHideActionPerformed

    private void jbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbShowActionPerformed
        // TODO add your handling code here:
        if(currentFig != null)
        {
            currentFig.show();
        }
    }//GEN-LAST:event_jbShowActionPerformed

    private void jbResizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResizeActionPerformed
        // TODO add your handling code here:
        if(currentFig != null)
        {
            int sz = Integer.parseInt(jtfSize.getText());
            if(currentFig instanceof additionalfigures.IInforming) // just for demostration
            {
                if(((additionalfigures.IInforming)currentFig).isResizable())
                {
                    ((additionalfigures.IScalable)currentFig).setSize(sz);
                }
            }
            else if(currentFig instanceof additionalfigures.IScalable)
                ((additionalfigures.IScalable)currentFig).setSize(sz);
        }
        
    }//GEN-LAST:event_jbResizeActionPerformed

    private void jbStretchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStretchActionPerformed
        // TODO add your handling code here:
        if(currentFig != null)
        {
            float ar = Float.parseFloat(jtfAspectRatio.getText());
            
            if(currentFig instanceof additionalfigures.IInforming) // just for demostration
            {
                if(((additionalfigures.IInforming)currentFig).isStretchable())
                {
                    ((additionalfigures.IStretchable)currentFig).setAspectRatio(ar);
                }
            }
            else if(currentFig instanceof additionalfigures.IStretchable)
                ((additionalfigures.IStretchable)currentFig).setAspectRatio(ar);
        }
    }//GEN-LAST:event_jbStretchActionPerformed

    private void jrbSquareFilledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSquareFilledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSquareFilledActionPerformed

    private void jrbInformingEllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInformingEllipseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbInformingEllipseActionPerformed

    void updateGraphics(){
        graphics = this.canvas1.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 
                this.canvas1.getWidth(), this.canvas1.getHeight());
        
        for(Figure fig : figs)
        {
            fig.show();
        }
    }
    
    int getHighestIndexWithTypeName(String typeName)
    {
        if(figs == null)
            throw new NullPointerException("figs is null");
        
        
        int highestIndex = 0;
        
        for (Figure fig : figs) {
            if(fig.typeName() == typeName)
            {
                String s = fig.name();
                String num = s.substring(typeName.length());
                int i = Integer.parseInt(num);
                if(i>highestIndex)
                    highestIndex = i;
            }
        }
        
        
        return highestIndex;
        
        
        
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
            java.util.logging.Logger.getLogger(Task41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task41().setVisible(true);
            }
        });
    }
    
    private figures.Figure currentFig;
    private java.awt.Graphics graphics;
    private java.util.List<figures.Figure> figs;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCreate;
    private javax.swing.JButton jbHide;
    private javax.swing.JButton jbMoveFigure;
    private javax.swing.JButton jbResize;
    private javax.swing.JButton jbShow;
    private javax.swing.JButton jbStretch;
    private javax.swing.JRadioButton jrbCircle;
    private javax.swing.JRadioButton jrbDot;
    private javax.swing.JRadioButton jrbInformingCircle;
    private javax.swing.JRadioButton jrbInformingEllipse;
    private javax.swing.JRadioButton jrbInformingRectangle;
    private javax.swing.JRadioButton jrbInformingSquare;
    private javax.swing.JRadioButton jrbRectangle;
    private javax.swing.JRadioButton jrbRectangleFilled;
    private javax.swing.JRadioButton jrbSquare;
    private javax.swing.JRadioButton jrbSquareFilled;
    private javax.swing.JTextField jtfArea;
    private javax.swing.JTextField jtfAspectRatio;
    private javax.swing.JTextField jtfMoveToX;
    private javax.swing.JTextField jtfMoveToY;
    private javax.swing.JTextField jtfSize;
    // End of variables declaration//GEN-END:variables


}
