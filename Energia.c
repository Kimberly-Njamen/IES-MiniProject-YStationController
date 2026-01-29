/* 
   Written: 23/04/2024 
   By: Kimberly Njamen 
   Description: IES Mini project: Energia code 
*/ 
  
void setup() { // Function runs once to set up environment + curly brackets opens function 
  Serial.begin(9600); // Matches the PC's BAUD rate to the MSP's 
  pinMode(P1_5, OUTPUT); // Sets pin 1.5 as an output 
  pinMode(P1_4, OUTPUT); // Sets pin 1.4 as an output 
  pinMode(P1_0, OUTPUT); // Sets pin 1.0 as an output 
  pinMode(P2_5, INPUT_PULLUP); // Sets pin 2.5 as a pullup input 
  pinMode(P2_4, INPUT_PULLUP); // Sets pin 2.4 as a pullup input 
  pinMode(P2_3, INPUT_PULLUP); // Sets pin 2.3 as a pullup input 
  pinMode(P2_2, INPUT_PULLUP); // Sets pin 2.2 as a pullup input 
  
} // Closes function 
  
void loop() { // Function runs continuosly and loops to refresh + curly brackets opens function 
  int xvalue = analogRead(A5) >> 2; // Sets the value of the integer variable 'xvalue' to the analog value of pin A5, shifts the bit by 2 
  int yvalue = analogRead(A4) >> 2; // Sets the value of the integer variable 'yvalue' to the analog value of pin A4, shifts the bit by 2 
  if (xvalue > 240) { // If statement: If the value of the variable xvalue is greater than 180, the following lines of code will be carried out 
    Serial.write('1'); // '1' will be written to the serial monitor 
    digitalWrite(P1_0, HIGH); // A digital high will be written to P1_0, turning the green LED on 
  } // Closes function 
  
  if (xvalue < 30) { // If the value of the variable xvalue is less than 100, the following lines of code will be carried out 
    Serial.write('2'); // '2' will be written to the serial monitor 
    digitalWrite(P1_0, LOW); // A digital low will be written to P1_0, turning the green LED on 
  
  }// Closes function 
  
  if (yvalue > 240) { // If the value of the variable yvalue is less than 180, the following lines of code will be carried out 
    Serial.write('3'); // '3' will be written to the serial monitor 
    digitalWrite(P1_0, HIGH);// A digital high will be written to P1_0, turning the green LED on 
  
  }// Closes function 
  
  if (yvalue < 30) { // If the value of the variable yvalue is less than 100, the following lines of code will be carried out 
    Serial.write('4'); // '4' will be written to the serial monitor 
    digitalWrite(P1_0, LOW);// A digital low will be written to P1_0, turning the green LED on 
  }// Closes function 
  
  if (digitalRead(P2_5) == LOW) { // If pin 2.5's value of a digital low, the following code is carried out 
    Serial.write('5');   // '5' will be written to the serial monitor 
  } // Closes function 
  if (digitalRead(P2_4) == LOW) { // If pin 2.4's value of a digital low, the following code is carried out 
    Serial.write('6');  // '6' will be written to the serial monitor 
  } // Closes function 
  
  if (digitalRead(P2_3) == LOW) { // If pin 2.3's value of a digital low, the following code is carried out 
    Serial.write('7'); // '7' will be written to the serial monitor 
  } // Closes function 
  
  if (digitalRead(P2_2) == LOW) { // If pin 2.2's value of a digital low, the following code is carried out 
    Serial.write('8');  // '8' will be written to the serial monitor 
  } // Closes function 
  
 
} // Closes function 
  

  
