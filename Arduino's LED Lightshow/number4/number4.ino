// Aufgabe 4: Einfache Ein-/Ausgabe mit einem Taster
const int buttonPin = 8; // Der Pin, an den der Taster angeschlossen ist
const int ledPin = 2;    // Der Pin, an den die LED angeschlossen ist

void setup() {
  pinMode(ledPin, OUTPUT);       // Setzt den LED-Pin als Ausgang
  pinMode(buttonPin, INPUT_PULLUP); // Setzt den Taster-Pin als Eingang mit internem Pull-up-Widerstand
}

void loop() {
  // Überprüft, ob der Taster gedrückt ist
  if (digitalRead(buttonPin) == LOW) { // Wenn der Taster gedrückt ist (LOW wegen Pull-up)
    digitalWrite(ledPin, HIGH); // Schaltet die LED ein
  } else {
    digitalWrite(ledPin, LOW);  // Schaltet die LED aus, wenn der Taster losgelassen wird
  }
}
