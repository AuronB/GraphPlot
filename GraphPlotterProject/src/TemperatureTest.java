import javax.swing.*;
public class TemperatureTest{
      /** TemperatureTest instancon klasen GraphPlotterTemperature, ja vendos vlerat e pikave dhe gjatesine e boshteve,
      * pastaj krijon kornizen */
      public static void main(String[]args){
      int axisLength = 200;
      int coefficient = 33;
      String labelX = "ditet"; 
      String labelY = "temperatura";
           
      GraphPlotterTemperature gpt = new GraphPlotterTemperature();
   
      gpt.setAxes(axisLength-axisLength/2,axisLength+axisLength/2,axisLength,labelX,labelY,6,6);
      //dergon qendren e sistemit,gjatesine dhe vlerat qe do shenohen ne sistem te klasa GraphPlotter 
      // vendosim qendren e sistemit ne keto koordinata qe te mos dalin boshtet jashte nga korniza
      
      gpt.setPoint1(2*coefficient);
      gpt.setPoint2(-2*coefficient);
      gpt.setPoint3(-4*coefficient);
      gpt.setPoint4(-4*coefficient);
      gpt.setPoint5(3*coefficient);
      gpt.setPoint6(-1*coefficient);
      //6 metodat e siperme marrin koordinaten y te pikave 
      JFrame jf = new JFrame();
      jf.setSize(2*axisLength,4*axisLength);
      //vendosim madhesine e kornizes sa dyfishi(w) dhe katerfishi(h) i gjatesise se boshteve per siguri
      jf.setTitle("Graph results");
      jf.getContentPane().add(gpt);
      jf.setVisible(true);
  
  
  
  
  }
}