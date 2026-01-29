import processing.serial.*; // Importing the serial library to establish connection
Serial commPort; // Setting up the comms communication
int rec = 0; // Intialising the integer variable rec to a value of 0

/*  
 Written: 24/04/2024  
 By: Kimberly Njamen  
 Student Number: X00214281  
 Description: IES Mini Project Processing Code: Y-Station Controller GUI  
 */

void setup() { // Function runs once to set up environment + curly brackets opens function  
  println(Serial.list()); // Prints out the avaiilable comm ports  
  commPort = new Serial(this, Serial.list()[2], 9600); // Sets the comm port to the port of bit number 2 
  size(800, 800); // Sets the size of the display window to 800*800 pixels  
  background(255); // Colours the background in white  
  fill(0); // Fills in shapes and text black  
  textSize(30); // Sets the text size to 30 pixels  
  text("Kimberly's IES Mini Project: Y Station Controller GUI", 10, 90); // Display the text "Kimberly's IES Mini Project: Y Station Controller GUI" at co-ordinates (10,90) on the display window  
  textSize(15); // Sets the text size to 15 pixels  
  text("Press a button or move joystick of controller and corresponding button or direction should turn green", 5, 150); // Display the text "Press a button or move joystick of controller and corresponding button or direction should turn green" at co-ordinates (5,150) on the display window  
  textSize(11); // Sets the text size to 11 pixels  
  text(" Text displaying what button you're pressing or what direction the joystick is being moved should also be displayed on the console window", 5, 170); // Displays the text " Text displaying what button you're pressing or what direction the joystick is being moved should also be displayed on the console window" at co-ordinates (5, 170)
} // Closes function  
void draw() { // Function runs continuously and loops to refresh + curly brackets opens function    
    
  //  println("Joystick is being moved to the left");   
  //  textSize(30);
 // } // Closes function
//} // Closes function  

  fill(#2ABF44); // Fills in the PCB a shade of green  
  rect(100, 250, 600, 350, 360); // Draws a rectangle at co-ordinates (100,250) with a width and height of 350,360 pixels  
  noFill(); // Shapes are filled in with no colour  
  strokeWeight(1); // Sets the thickness of lines drawn to 1 pixel  
  fill(255); // Fills in colour of shapes white  
  rect(570, 350, 40, 40); // Draws a rectangle at co-ordinates (570,350) with a width and height of 40,40 pixels  
  fill(0); // Fills in shapes black  
  ellipse(575, 355, 5, 5); // Draws a circle at co-ordinates (575,355) with a widt and height of 5,5 pixels  
  ellipse(575, 385, 5, 5); // Draws a circle at co-ordinates (575,385) with a widt and height of 5,5 pixels  
  ellipse(605, 355, 5, 5); // Draws a circle at co-ordinates (605,355) with a widt and height of 5,5 pixels  
  ellipse(605, 385, 5, 5); // Draws a circle at co-ordinates (575,385) with a widt and height of 5,5 pixels  
  textSize(7); // Sets the size of text to 7 pixels  
  text("S1", 550, 354); // Displays the text "S1" at co-ordinates (550,354) on the display window  
  fill(0); // Fills in shapes black  
  ellipse(590, 370, 20, 20); // Draws a circle at co-ordinates (590,370) with  width and height of 20,20 pixels  
  noFill(); // Shapes are filled in with no colour  
  fill(255); // Fills in shapes white 
  rect(630, 400, 40, 40);  // Draws a rectangle at co-ordinates (630,400) with  width and height of 40,40 pixels  
  fill(0);  // Fills in shapes black 
  ellipse(635, 405, 5, 5); // Draws a circle at co-ordinates (635,405) with a width and height of 5,5 pixels  
  ellipse(635, 435, 5, 5); // Draws a circle at co-ordinates (635,435) with a width and height of 5,5 pixels  
  ellipse(665, 405, 5, 5); // Draws a circle at co-ordinates (665,405) with a width and height of 5,5 pixels  
  ellipse(665, 435, 5, 5); // Draws a circle at co-ordinates (665,435) with a width and height of 5,5 pixels  
  textSize(7); // Sets the size of the text to 7 pixels 
  text("S2", 675, 400); // Displays the text "S2" at co-ordinates (675,400) on the display window 
  ellipse(650, 420, 20, 20);  // Draws a circle at co-ordinates (650,420) with a width and height of 20,20 pixels  
  noFill(); // Shapes are filled in with no colour  
  fill(255); // Fills in shapes white 
  rect(570, 450, 40, 40);   // Draws a rectangle at co-ordinates (570,450) with  width and height of 40,40 pixels  
  fill(0); // Fills in shapes black 
  ellipse(590, 470, 20, 20);  // Draws a circle at co-ordinates (590,470) with a width and height of 20,20 pixels   
  ellipse(575, 455, 5, 5);  // Draws a circle at co-ordinates (575,455) with a width and height of 5,5 pixels  
  ellipse(575, 485, 5, 5);  // Draws a circle at co-ordinates (575,485) with a width and height of 5,5 pixels  
  ellipse(605, 485, 5, 5);  // Draws a circle at co-ordinates (605,485) with a width and height of 5,5 pixels  
  ellipse(605, 455, 5, 5);  // Draws a circle at co-ordinates (605,455) with a width and height of 5,5 pixels  
  text("S3", 550, 455); // Displays the text "S3" at co-ordinates (550,455) on the display window 
  noFill(); // Shapes are filled in with no colour  
  fill(255); // Fills in shapes white 
  rect(520, 400, 40, 40); // Draws a rectangle at co-ordinates (520,400) with  width and height of 40,40 pixels  
  fill(0); // Fills in shapes black 
  ellipse(540, 420, 20, 20); // Draws a circle at co-ordinates (540,420) with a width and height of 20,20 pixels 
  ellipse(525, 405, 5, 5); // Draws a circle at co-ordinates (525,405) with a width and height of 5,5 pixels 
  ellipse(555, 405, 5, 5); // Draws a circle at co-ordinates (555,405) with a width and height of 5,5 pixels 
  ellipse(525, 435, 5, 5); // Draws a circle at co-ordinates (525,435) with a width and height of 5,5 pixels 
  ellipse(555, 435, 5, 5); // Draws a circle at co-ordinates (555,435) with a width and height of 5,5 pixels 
  textSize(7); // Sets the size of the text to 7 pixels 
  text("S4", 500, 400); // Displays the text "S4" at co-ordinates (500,400) on the display window 
  noFill(); // Shapes are filled in with no colour  
  fill(255); // Fills in shapes white 
  textSize(15); // Sets the text size to 15 pixels 
  text("TU Dublin", 490, 300); // Displays the text "TU Dublin" at co-ordinates (490,300) on the display window 
  text("Prototype Area", 330, 280); // Displays the text "Prototype Area" at co-ordinates (330,280) on the display window  
  text("Tallaght Campus", 490, 315); // Displays the text "Tallaght Campus" at co-ordinates (490,315) on the display window 
  text("Engineering Dept", 490, 330); // Displays the text "Engineering Dept" at co-ordinates (490,330) on the display window 
  text("Interactive", 190, 300); // Displays the text "Interactive" at co-ordinates (190,300) on the display window 
  text("Embedded Systems", 165, 315); // Displays the text "Embedded Systems" at co-ordinates (165,315) on the display window 
  text("& Smart Sensors", 170, 330); // Displays the text "& Smart Sensors" at co-ordinates (170,330) on the display window 
  noFill(); // Shapes are filled in with no colour  
  fill(0); // Fills in shapes black 
  rect(480, 350, 10, 170); // Draws a rectangle at co-ordinates (480,350) with  width and height of 10,170 pixels  
  rect(280, 350, 10, 170); // Draws a rectangle at co-ordinates (280,350) with  width and height of 10, 170 pixels  
  fill(#D3F519); // Fills in the shape gold 
  ellipse(485, 355, 7, 7);  // Draws a circle at co-ordinates (485,355) with a width and height of 7,7 pixels 
  ellipse(485, 375, 7, 7);  // Draws a circle at co-ordinates (485,375) with a width and height of 7,7 pixels 
  ellipse(485, 395, 7, 7);   // Draws a circle at co-ordinates (485,395) with a width and height of 7,7 pixels 
  ellipse(485, 415, 7, 7);  // Draws a circle at co-ordinates (485,415) with a width and height of 7,7 pixels 
  ellipse(485, 435, 7, 7);  // Draws a circle at co-ordinates (485,435) with a width and height of 7,7 pixels 
  ellipse(485, 455, 7, 7);  // Draws a circle at co-ordinates (485,455) with a width and height of 7,7 pixels 
  ellipse(485, 475, 7, 7);  // Draws a circle at co-ordinates (485, 475) with a width and height of 7,7 pixels 
  ellipse(485, 495, 7, 7);  // Draws a circle at co-ordinates (485,495) with a width and height of 7,7 pixels 
  ellipse(485, 515, 7, 7);  // Draws a circle at co-ordinates (485, 515) with a width and height of 7,7 pixels 
  ellipse(285, 355, 7, 7); // Draws a circle at co-ordinates (285,355) with a width and height of 7,7 pixels 
  ellipse(285, 375, 7, 7); // Draws a circle at co-ordinates (285,375) with a width and height of 7,7 pixels 
  ellipse(285, 395, 7, 7); // Draws a circle at co-ordinates (285,395) with a width and height of 7,7 pixels 
  ellipse(285, 415, 7, 7); // Draws a circle at co-ordinates (285,415) with a width and height of 7,7 pixels 
  ellipse(285, 435, 7, 7); // Draws a circle at co-ordinates (285,435) with a width and height of 7,7 pixels 
  ellipse(285, 455, 7, 7); // Draws a circle at co-ordinates (285,455) with a width and height of 7,7 pixels 
  ellipse(285, 475, 7, 7); // Draws a circle at co-ordinates (285,475) with a width and height of 7,7 pixels 
  ellipse(285, 495, 7, 7); // Draws a circle at co-ordinates (285,495) with a width and height of 7,7 pixels 
  ellipse(285, 515, 7, 7); // Draws a circle at co-ordinates (285,515) with a width and height of 7,7 pixels 
  noFill(); // Shapes are filled in with no colour  
  stroke(255); // Fills in shapes white  
  rect(450, 270, 10, 300); // Draws a rectangle at co-ordinates (450,270) with  width and height of 10,300 pixels 
  rect(310, 270, 10, 300); // Draws a rectangle at co-ordinates (310,270) with  width and height of 10,300 pixels 
  noFill(); // Shapes are filled in with no colour   
  for (int i = 0; i < 16; i++) { // For loop to draw small circles 
    for (int j = 0; j < 8; j++) {  
      ellipse(330 + j * 15, 310 + i * 15, 5, 5);  
      fill(#D3F519);// Fills in the circles gold
    } // Closes function
  } // Closes function  
  fill(0); // Fills in shapes black 
  stroke(0); // Sets the colour of lines to black 
  rect(170, 380, 50, 30); // Draws a rectangle at co-ordinates (170,380) with  width and height of 50,30 pixels 
  noFill(); // Shapes are filled in with no colour  
  stroke(#7B7C75); // Colours the borders and lines around shapes 
  fill(#7B7C75); // Fills in shapes 
  rect(160, 410, 70, 50); // Draws a rectangle at co-ordinates (160,410) with  width and height of 70,50 pixels 
  fill(#FFD603); // Fills in shapes 
  rect(155, 460, 80, 20); // Draws a rectangle at co-ordinates (155,460) with  width and height of 80,20 pixels 
  rect(140, 420, 20, 30); // Draws a rectangle at co-ordinates (140,420) with  width and height of 20,30 pixels 
  fill(0); // Fills in shapes black 
  ellipse(195, 440, 30, 30); // Draws a circle at co-ordinates (195,440) with a width and height of 30,30 pixels 
  noFill(); // Shapes are filled in with no colour  
  fill(255); // Fills in shapes white 
  rect(180, 340, 30, 30); // Draws a rectangle at co-ordinates (180,340) with  width and height of 30,30 pixels 
  rect(240, 420, 30, 30); // Draws a rectangle at co-ordinates (240,420) with  width and height of 30,30 pixels 
  rect(105, 420, 30, 30); // Draws a rectangle at co-ordinates (105,420) with  width and height of 30,30 pixels 
  rect(180, 490, 30, 30); // Draws a rectangle at co-ordinates (180,490) with  width and height of 30,30 pixels 
  fill(0); // Fills in shapes black 
  triangle(195, 340, 180, 365, 210, 365); // Draws triangle at these co-ordinates 
  triangle(270, 435, 245, 420, 245, 450); // Draws triangle at these co-ordinates 
  triangle(195, 520, 210, 495, 180, 495); // Draws triangle at these co-ordinates 
  triangle(105, 435, 130, 420, 130, 450); // Draws triangle at these co-ordinates
  if (rec == '8') {   // If '8' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0);   // Fills in shapes green
    rect(570, 350, 40, 40);   
  //  noFill(); // Shapes are filled in with no colour  
    println("Switch 1 is being pushed");   
//    textSize(30);
  } // Closes function  
  if (rec == '5') {   // If '5' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0);  // Fills in shapes green 
    rect(630, 400, 40, 40);   
 //   noFill(); // Shapes are filled in with no colour  
    println("Switch 2 is being pushed");   
 //   textSize(30);
  } // Closes function  
  if (rec == '7') {   // If '7' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0); // Fills in shapes green  
    rect(570, 450, 40, 40);   
//    noFill(); // Shapes are filled in with no colour  
    println("Switch 3 is being pushed");   
 //   textSize(30);
  } // Closes function   
  if (rec == '6') {   // If '6' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0); // Fills in shapes green  
    rect(520, 400, 40, 40);   
//    noFill(); // Shapes are filled in with no colour  
    println("Switch 4 is being pushed");   
  } // Closes function  
  if (rec == '3') {   // If '3' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0);  // Fills in shapes green 
    rect(180, 340, 30, 30);   
    println("Joystick is being moved up");   
  } // Closes function  
  if (rec == '2') {   // If '2' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0);  // Fills in shapes green 
    rect(240, 420, 30, 30);   
    println("Joystick is being moved to the right");   
  } // Closes function  
  if (rec == '4') {   // If '4' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0);  // Fills in shapes green 
    rect(180, 490, 30, 30);   
    println("Joystick is being moved down");   

  } // Closes function  
  if (rec == '1') {   // If '1' is received on the commPort, the followingblines of code will be carried out
    fill(0, 255, 0);  // Fills in shapes green 
    rect(105, 420, 30, 30);  
    println("Joystick is being moved to the left");   
    noFill(); // Shapes are filled in with no colour 

}// Closes function  
} // Closes function  

void serialEvent(Serial commPort) { // Function detailing the events with the serial port  
 rec =  commPort.read(); // Sets the value of the variable rec to data available on the comm port  
} // Closes function  
  