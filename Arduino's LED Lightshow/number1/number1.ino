// Aufgabe 1: Einfaches Blinkprogramm
void setup() {
  pinMode(LED_BUILTIN, OUTPUT);  // Setzt den eingebauten LED-Pin als Ausgang
}

void loop() {
  digitalWrite(LED_BUILTIN, HIGH);  // Schaltet die LED ein
  delay(50);                        // Wartet 50ms - bei 10 Hertz muss die LED 100ms für einen Zyklus verwenden, also 50ms an und 50ms aus
  digitalWrite(LED_BUILTIN, LOW);   // Schaltet die LED aus
  delay(50);                        // Wartet weitere 50ms
}