package edu.tekwill.academy.computer;

import edu.tekwill.academy.computer.components.HardDrive;
import edu.tekwill.academy.computer.components.Motherboard;
import edu.tekwill.academy.computer.components.Processor;
import edu.tekwill.academy.computer.peripherals.Keyboard;
import edu.tekwill.academy.computer.peripherals.Monitor;
import edu.tekwill.academy.computer.peripherals.Mouse;

public class Computer {
    Processor procesor = new Processor();
    Motherboard motherboard = new Motherboard();
    HardDrive hardDrive = new HardDrive();

    Keyboard keyboard = new Keyboard();
    Monitor monitor = new Monitor();
    Mouse mouse = new Mouse();
}
