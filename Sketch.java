import processing.core.PApplet;

public class Sketch extends PApplet {
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // Set size of application
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Set background colour to sky blue
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(4);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect(-20, 375, 440, 400);

    // Stroke settings for house
    strokeWeight(0);
    fill(171, 50, 70);
    stroke(255);

    //house
    rect(100, 178, 200, 200);

    //Chimney
    rect(240, 100, 40, 70);
    
    //colour settings for roof
    fill(82, 30, 7);

    //Roof
    triangle(50, 208, 350, 208, 200, 100);

    

    // Stroke setting for window
    fill(145, 234, 330);

    //window
    ellipse( 200, 170, 30, 30);


  }
}