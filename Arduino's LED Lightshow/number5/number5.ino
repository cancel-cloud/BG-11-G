const int BUTTON_PIN = 7;  // the number of the pushbutton pin
const int LED_PIN =  3;    // the number of the LED pin

// variables will change:
int buttonState = 0;       // variable for reading the pushbutton status

void setup() {
  pinMode(LED_PIN, OUTPUT);
  pinMode(BUTTON_PIN, INPUT_PULLUP);
}

void loop() {
  // read the state of the pushbutton value:
  buttonState = digitalRead(BUTTON_PIN);

  // control LED according to the state of button
  if (buttonState == LOW) { // If button is pressed
    for (int i = 0; i < 5; i++) { // Blink 5 times
      digitalWrite(LED_PIN, HIGH); // Turn on LED
      delay(250); // Wait for half period (1/(2*2Hz)) = 250ms
      digitalWrite(LED_PIN, LOW);  // Turn off LED
      delay(250); // Wait for half period
    }

    // Simple wait for button release without debouncing
    while(digitalRead(BUTTON_PIN) == LOW) {
      // Do nothing - just wait until the button is released
    }
  }
}
