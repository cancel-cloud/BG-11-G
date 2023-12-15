// Aufgabe 1: Einfaches Blinkprogramm
void setup() {
  pinMode(LED_BUILTIN, OUTPUT); // Setzt den eingebauten LED-Pin als Ausgang
}

// Aufgabe 2: Modifizierung für schnelleres Blinken
int blinkDelay = 100; // Startverzögerung von 50ms

void loop() {
  digitalWrite(LED_BUILTIN, HIGH); // Schaltet die LED ein
  delay(blinkDelay); // Verwendet die aktuelle Verzögerung
  digitalWrite(LED_BUILTIN, LOW);  // Schaltet die LED aus
  delay(blinkDelay); // Verwendet die aktuelle Verzögerung
  
  // Verringern der Verzögerung bis auf ein Minimum von 1ms
  blinkDelay = max(blinkDelay - 1, 1); 
}