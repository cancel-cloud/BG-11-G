const int buttonPin = 8; // Der Pin, an den der Taster angeschlossen ist
const int ledPin = 2;    // Der Pin, an den die LED angeschlossen ist

void setup() {
  pinMode(ledPin, OUTPUT);       // Setzt den LED-Pin als Ausgang
  pinMode(buttonPin, INPUT);     // Setzt den Taster-Pin als Eingang
}

void loop() {
  // Überprüft, ob der Taster gedrückt ist
  if (digitalRead(buttonPin) == HIGH) { // Wenn der Taster gedrückt ist (HIGH, weil er an GND angeschlossen ist)
    digitalWrite(ledPin, HIGH); // Schaltet die LED ein
  } else {
    digitalWrite(ledPin, LOW);  // Schaltet die LED aus, wenn der Taster losgelassen wird
  }
}
