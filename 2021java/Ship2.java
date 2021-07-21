package pkg32A;

public class Ship2 {
    public int[][] field=new int[7][7]; 
   private int hp;
   private int pointx;
   private int pointy;
   
   
   public int getHp() {
      return hp;
   }


   public void setHp(int hp) {
      this.hp = hp;
   }


   public int getPointx() {
      return pointx;
   }


   public void setPointx(int pointx) {
      this.pointx = pointx;
   }


   public int getPointy() {
      return pointy;
   }


   public void setPointy(int pointy) {
      this.pointy = pointy;
   }


   public Ship2(int hp,int pointx,int pointy){
      this.hp=hp;
      this.pointx=pointx;
      this.pointy=pointy;
   }

   //戦艦の位置決め
public void pointdecide(int pointx,int pointy){
   for(int i=1;i<field[i].length-1;i++){
      for(int y=1;y<field[i].length-1;y++){
         if(field[i][y]==field[pointx][pointy]){
            field[i][y]=-1;
         }
      }
   }
}

   public int attack(int kougeki1,int kougeki2){
      if(field[kougeki1-1][kougeki2]==-1 || field[kougeki1][kougeki2+1]==-1 ||
       field[kougeki1+1][kougeki2]==-1 || field[kougeki1][kougeki2-1]==-1){
         if(field[kougeki1-1][kougeki2]==field[pointx][pointy]){
            hp=hp-1;
            if(hp==0){
            System.out.println("撃沈");
            return hp;
            }else if(hp==1 || hp==2){
               System.out.println("命中だがまだ沈まない　移動します");
               return hp;
            }else{
               return hp;
            }
         }else if(field[kougeki1][kougeki2+1]==field[pointx][pointy]){
            hp=hp-1;
            if(hp==0){
               System.out.println("撃沈");
               return hp;
               }else if(hp==1 || hp==2){
                  System.out.println("命中だがまだ沈まない　移動します");
                  return hp;
               }else{
                  return hp;
               }
            
         }else if(field[kougeki1+1][kougeki2]==field[pointx][pointy]){
            hp=hp-1;
            if(hp==0){
               System.out.println("撃沈");
               return hp;
               }else if(hp==1 || hp==2){
                  System.out.println("命中だがまだ沈まない　移動します");
                  return hp;
               }else{
                  return hp;
               }  
               
            
             
         }else if(field[kougeki1][kougeki2-1]==field[pointx][pointy]){
            hp=hp-1;
            if(hp==0){
               System.out.println("撃沈");
               return hp;
               }else if(hp==1 || hp==2){
                  System.out.println("命中だがまだ沈まない　移動します");
                  return hp;
               }else{
                  return hp;
               }
            

         }
        }else{
         System.out.println("はずれ");
         System.out.println("波高し");
         return hp;
      }
      return hp;
   }
   

}
