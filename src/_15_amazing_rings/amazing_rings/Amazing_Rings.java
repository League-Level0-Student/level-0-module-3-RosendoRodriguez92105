  
   int x=160;
   int y=240;
   int a=760;
   int b=240;
   void setup(){
  size(900,500);
 
   }

void draw(){
  background (500,500,500);
 for ( int i =25; i>0; i--) {
      
   if(i % 1 == 0){
     
   } else{
   fill(0,0,0);

   }
  ellipse( x, y, i*10, i*10);
  ellipse( a, b, i*10, i*10);
 }
 if (mousePressed){
   for (int move=15; move >0; move --){
   x+=1;
   a-=1;
}
}
}
