void setup(){
 size(600,600);



}
void draw() {
background(500,500,500);
if (mousePressed){ println(mouseX, mouseY);
}
fill(0,200,10,100);
ellipse(270,210,200,200);
fill(550,100,0,100);
ellipse(350,300,200,200);
fill(100,100,250,100);
ellipse(200,300,200,200);
fill(0,0,0);
text("ME",mouseX,mouseY);

}