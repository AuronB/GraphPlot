import javax.swing.*;
public class GraphPlotTest{
      /** GraphPlotTest instancon klasen GraphPlotter, ja vendos vlerat e pikave dhe gjatesine e boshteve,
      * pastaj krijon kornizen */
      public static void main(String[]args){
      int axisLength = Integer.parseInt(JOptionPane.showInputDialog("Enter axes maximum value: "));
      //axisLength (gjatesia e boshteve) vendoset nga perdoruesi 
      GraphPlotter gp = new GraphPlotter();
      String labelX = JOptionPane.showInputDialog("X axis label: ");
      String labelY = JOptionPane.showInputDialog("Y axis label :");
      gp.setAxes(axisLength-axisLength/2,axisLength+axisLength/2,axisLength,labelX,labelY);
      //dergon qendren e sistemit,gjatesine dhe vlerat qe do shenohen ne sistem te klasa GraphPlotter 
      // vendosim qendren e sistemit ne keto koordinata qe te mos dalin boshtet jashte nga korniza
      
      gp.setPoint1(Integer.parseInt(JOptionPane.showInputDialog("Value of first point: ")));
      gp.setPoint2(Integer.parseInt(JOptionPane.showInputDialog("Value of second point: ")));
      gp.setPoint3(Integer.parseInt(JOptionPane.showInputDialog("Value of third point: ")));
      gp.setPoint4(Integer.parseInt(JOptionPane.showInputDialog("Value of fourth point: ")));
      gp.setPoint5(Integer.parseInt(JOptionPane.showInputDialog("Value of fifth point: ")));
      gp.setPoint6(Integer.parseInt(JOptionPane.showInputDialog("Value of sixth point: ")));
      //6 metodat e siperme marrin koordinaten y te pikave nga perdoruesi
      JFrame jf = new JFrame();
      jf.setSize(2*axisLength,2*axisLength);
      //vendosim madhesine e kornizes sa dyfishi i gjatesise se boshteve per siguri
      jf.setTitle("Graph results");
      jf.getContentPane().add(gp);
      jf.setVisible(true);
  
  
  
  
  }
}