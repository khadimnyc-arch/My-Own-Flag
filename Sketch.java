import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 400);
        
    }

    public void setup() {
        background(1, 28, 58);
        noLoop();
        
    }

    public void draw() {
        Moon();
        draw50Stars();       
    }

    // some methods you may want to include:

    public void draw50Stars() {
        diamond();
        topNbottom();
        leftNright();
    }

    public void topNbottom(){
        for(int i = 0; i<=8;i++){
            fill(random(255), random(255), random(255));
            drawStar(50+(i*71),20,12);
            drawStar(50+(i*71),380,12);
        }

    }

    public void leftNright(){
        for(int i = 0; i<8;i++){
            fill(random(255), random(255), random(255));
            drawStar(50,50+(i*42),12);
            drawStar(585,50+(i*42),12);
        }
    }

    public void pyramid(){
        for(int row = 0; row<4;row++){
            for(int col=0;col<row;col++){
                fill(random(255), random(255), random(255));
                drawStar(470 - (row * 20)+ (col*35), 55+(row*40),12); 
            }
        }
    }//end of pyramid method

    public void upSidepyramid(){
        for(int row = 5; row>0;row--){
            for(int col=5;col>row;col--){
                fill(random(255), random(255), random(255));
                drawStar(345 - (row * 20)+ (col*35), 175 +(row*40),10);
            }
        }
    }//end of upSidepyramid method

    public void diamond() {
        pyramid();
        upSidepyramid();
    }//end of diamond method

    public void Moon() {
        noStroke();
        fill(255, 255, 150);
        ellipse(275,200,220,220);
        fill(1, 28, 58);
        ellipse(320,180,180,180);

    }//end of moon method

    public void drawStar(int x, int y, int size) {
        pushMatrix();
        translate(x, y);
                
        for (int i = 0; i < 5; i++) {
            rotate(radians(72));
            triangle(0, -size, (float)(-size * 0.25), (float)(-size * 0.25), (float)(size * 0.25), (float)(-size * 0.25));
        }

        ellipse(0, 0, (float)(size * 0.6), (float)(size * 0.6));
        popMatrix();
    }//end of drawing stars

}
