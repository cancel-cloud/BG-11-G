// Aufgabe 3: Verkehrsampel-Simulation
const int redLED = 8;
const int yellowLED = 9;
const int greenLED = 10;

void setup() {
  pinMode(redLED, OUTPUT);
  pinMode(yellowLED, OUTPUT);
  pinMode(greenLED, OUTPUT);
}

void loop() {
  // Rote Phase
  digitalWrite(redLED, HIGH);
  delay(1000); // Rote Phase für 1 Sekunde
  digitalWrite(redLED, LOW);
  
  // Rot-Gelbe Phase
  digitalWrite(redLED, HIGH);
  digitalWrite(yellowLED, HIGH);
  delay(1000); // Rot-Gelb für 1 Sekunde
  digitalWrite(redLED, LOW);
  digitalWrite(yellowLED, LOW);
  
  // Grüne Phase
  digitalWrite(greenLED, HIGH);
  delay(1000); // Grüne Phase für 1 Sekunde
  digitalWrite(greenLED, LOW);
  
  // Gelbe Phase
  digitalWrite(yellowLED, HIGH);
  delay(1000); // Gelbe Phase für 1 Sekunde
  digitalWrite(yellowLED, LOW);
  
  // Die Schleife beginnt von vorne und wechselt zurück zur roten Phase
}