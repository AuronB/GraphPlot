import javax.swing.*;
import java.awt.*;
public class GraphPlotterTemperature extends JPanel{
   /** GraphPlotter vizaton boshtet koordinative me informatat qe merr nga klasa GraphPlotTest */
   private int xPos,yPos; //koordinatat e qendres se sistemit
   private int y1,y2,y3,y4,y5,y6,xInt,yInt; //koordinatat y te pikave qe vendosen ne sistem dhe vlerat e temp
   private int axisLength; //gjatesia e boshteve
   private int diameter=5; // diametri i pikave (sepse vizatohen si elipsa te vogla)
   private String xLabel,yLabel; // vlerat qe vendosen ne sistem
   
   
   public void paintComponent(Graphics g){
      int coefficient = 33;
      g.setColor(Color.black);
      g.drawLine(xPos,yPos-axisLength,xPos,yPos+axisLength);
      //vizaton boshtin y
      g.drawLine(xPos,yPos,xPos+axisLength,yPos);
      //vizaton boshtin x
      g.drawString(yLabel,xPos-60,yPos-axisLength-30);
      g.drawString("+"+yInt+"C", xPos-30, yPos-axisLength);
      g.drawString("-"+yInt+"C", xPos-30, yPos+axisLength);
      //vizaton stringjet ne largesti te caktuara prej boshtit y
      g.drawString(xLabel,xPos+axisLength,yPos+35);
      g.drawString(""+xInt, xPos+axisLength,yPos+20);
      //vizaton stringjet ne largesi te caktuara prej boshtit x
      g.drawString("0",xPos-20,yPos);
      //vizaton stringun 0, 20 px larg qendres nga ana e y-it
      g.fillOval(xPos-2,yPos-y1,diameter,diameter);
      //vizaton piken e pare ne xPos-2 per shkak te shfaqjes se gabimit gjate vizatimit te elipses
      //koordinata y eshte yPos-y1 ne menyre qe te duket se koordinata y e boshtit eshte y1
      g.drawLine(xPos,yPos-y1,xPos+coefficient+2,yPos-y2+2);
      //kur e vizatojme vijen, koordinatave ua shtojme nga 2 per shkak te gabimit gjate vizatimit
      g.fillOval(xPos+coefficient,yPos-y2,diameter,diameter);
      //koordinata x eshte xPos+coefficient sepse secili x i sistemit duhet te dalloj per nga 33px
      g.drawLine(xPos+coefficient+2,yPos-y2+2,xPos+2*coefficient,yPos-y3+2);
      g.fillOval(xPos+2*coefficient,yPos-y3,diameter,diameter);
      g.drawLine(xPos+2*coefficient+2,yPos-y3+2,xPos+3*coefficient+2,yPos-y4+2);
      g.fillOval(xPos+3*coefficient,yPos-y4,diameter,diameter);
      g.drawLine(xPos+3*coefficient+2,yPos-y4+2,xPos+4*coefficient+2,yPos-y5+2);
      g.fillOval(xPos+4*coefficient,yPos-y5,diameter,diameter);
      g.drawLine(xPos+4*coefficient+2,yPos-y5+2,xPos+5*coefficient+2,yPos-y6+2);
      g.fillOval(xPos+5*coefficient,yPos-y6,diameter,diameter);
      }
    public void setAxes(int xPos, int yPos, int axisLength, String xLabel, String yLabel,int xInt, int yInt){
      this.xPos=xPos;
      this.yPos=yPos;
      this.axisLength=axisLength;
      this.xLabel=xLabel;
      this.yLabel=yLabel;
      this.xInt=xInt;
      this.yInt=yInt;
  }
  
  public void setPoint1(int y1){
   this.y1=y1;
   
  
  
  }
    public void setPoint2(int y2){
      this.y2=y2;
  
  
  }
    public void setPoint3(int y3){
      this.y3=y3;
   
  
  
  }
     public void setPoint4(int y4){
      this.y4=y4;
   
  
  
  }
     public void setPoint5(int y5){
       this.y5=y5;
  
  
  }
     public void setPoint6(int y6){
       this.y6=y6;
  
  
  }
 
    
    
    
    }