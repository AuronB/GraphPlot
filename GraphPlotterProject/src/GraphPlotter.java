import javax.swing.*;
import java.awt.*;

public class GraphPlotter extends JPanel{
   /** GraphPlotter vizaton boshtet koordinative me informatat qe merr nga klasa GraphPlotTest */
   private int xPos,yPos; //koordinatat e qendres se sistemit
   private int y1,y2,y3,y4,y5,y6; //koordinatat y te pikave qe vendosen ne sistem
   private int axisLength; //gjatesia e boshteve
   private int diameter=5; // diametri i pikave (sepse vizatohen si elipsa te vogla)
   private String xLabel,yLabel; // vlerat qe vendosen ne sistem
   
   
   
   public void paintComponent(Graphics g){
      g.setColor(Color.black);
      g.drawLine(xPos,yPos,xPos,yPos-axisLength);
      //vizaton boshtin y
      g.drawLine(xPos,yPos,xPos+axisLength,yPos);
      //vizaton boshtin x
      g.drawString(yLabel,xPos-20,yPos-axisLength);
      //vizaton stringun 20 px larg boshtit y
      g.drawString(xLabel,xPos+axisLength,yPos+20);
      //vizaton stringun 20px larg boshtit x
      g.drawString("0",xPos-20,yPos);
      //vizaton stringun 0, 20 px larg qendres nga ana e x-it
      g.drawString("0",xPos,yPos+20);
      //vizaton stringun tjeter 0, 20px larg qendres nga ana e y-it
      g.fillOval(xPos-2,yPos-y1,diameter,diameter);
      //vizaton piken e pare ne xPos-2 per shkak te shfaqjes se gabimit gjate vizatimit te elipses
      //koordinata y eshte yPos-y1 ne menyre qe te duket se koordinata y e boshtit eshte y1
      g.drawLine(xPos,yPos-y1,xPos+axisLength/5+2,yPos-y2+2);
      //kur e vizatojme vijen, koordinatave ua shtojme nga 2 per shkak te gabimit gjate vizatimit
      g.fillOval(xPos+axisLength/5,yPos-y2,diameter,diameter);
      //koordinata x eshte xPos+axisLength/5 sepse x i sistemit duhet te jete ne 1/5 e boshtit x
      g.drawLine(xPos+axisLength/5+2,yPos-y2+2,xPos+axisLength/5+22,yPos-y3+2);
      g.fillOval(xPos+axisLength/5+20,yPos-y3,diameter,diameter);
      //largesia e pikave te tjera duhet te jete e njejte, e kemi marre 20px
      g.drawLine(xPos+axisLength/5+22,yPos-y3+2,xPos+axisLength/5+42,yPos-y4+2);
      g.fillOval(xPos+axisLength/5+40,yPos-y4,diameter,diameter);
      g.drawLine(xPos+axisLength/5+42,yPos-y4+2,xPos+axisLength/5+62,yPos-y5+2);
      g.fillOval(xPos+axisLength/5+60,yPos-y5,diameter,diameter);
      g.drawLine(xPos+axisLength/5+62,yPos-y5+2,xPos+axisLength/5+82,yPos-y6+2);
      g.fillOval(xPos+axisLength/5+80,yPos-y6,diameter,diameter);
  }
   
   public void setAxes(int xPos, int yPos, int axisLength, String xLabel, String yLabel){
      this.xPos=xPos;
      this.yPos=yPos;
      this.axisLength=axisLength;
      this.xLabel=xLabel;
      this.yLabel=yLabel;
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