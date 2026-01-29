# Y-Station Controller GUI (IES Mini Project)

## Overview
This project is an Interactive Embedded Systems mini project developed in 2nd Year.  
It integrates a **joystick and push-button hardware setup** with a **Processing-based GUI**, enabling real-time visual feedback of controller inputs.  
The MSP430 microcontroller reads joystick and button inputs and communicates with the GUI via a **serial interface**.

This is part of the Interactive Embedded Systems module at **TU Dublin, Tallaght Campus**.

---

## Technologies Used
- **Processing (Java-based)** – GUI development and serial communication
- **Energia (MSP430)** – Reading analog joystick and digital buttons
- **Serial Communication (UART)** – Connecting MSP430 to Processing GUI
- Analog Joystick input (X/Y axes)
- Digital push buttons
- LEDs (optional, for hardware feedback)

---

## How It Works
1. The **MSP430 firmware** reads:
   - Joystick positions on analog pins A4 (Y-axis) and A5 (X-axis)
   - Push buttons on digital pins P2.2–P2.5
2. Each input is encoded as a single character (`'1'`–`'8'`) and sent over the serial connection.
3. The **Processing GUI**:
   - Listens for serial input
   - Highlights the corresponding button or joystick direction in green
   - Prints the input event to the console for debugging

This allows real-time monitoring and visualization of the hardware inputs.

---

## Features
- Real-time feedback of joystick and buttons
- Simple, clear GUI design for interactive hardware control
- Serial event-driven communication
- Full MSP430 + Processing integration
- Easy to extend with additional inputs or visual effects

---

## Getting Started / Deployment

### 1. Hardware Requirements
- MSP430 microcontroller
- Joystick module (connected to A4 and A5)
- 4 push buttons (connected to P2.2–P2.5)
- LEDs (optional, for testing)
- USB cable to connect MSP430 to PC

### 2. Software Requirements
- [Energia IDE](http://energia.nu/) (for MSP430 firmware)
- [Processing IDE](https://processing.org/download/) (for GUI)
- USB drivers for MSP430 (if not already installed)

### 3. Upload MSP430 Firmware
1. Open `energia.c` in Energia IDE.
2. Connect your MSP430 to your PC via USB.
3. Select the correct board under **Tools → Board**.
4. Select the correct serial port under **Tools → Port**.
5. Click **Upload** to flash the firmware to the MSP430.

### 4. Run the Processing GUI
1. Open `processing.java` in Processing IDE.
2. Ensure the serial port in the code matches your system:

```java
commPort = new Serial(this, Serial.list()[2], 9600);
