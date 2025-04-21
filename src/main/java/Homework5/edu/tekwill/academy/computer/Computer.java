package Homework5.edu.tekwill.academy.computer;

import Homework6.edu.tekwill.academy.computer.components.HardDrive;
import Homework6.edu.tekwill.academy.computer.components.Motherboard;
import Homework6.edu.tekwill.academy.computer.components.Proccesor;

import homework7.edu.tekwill.academy.computer.peripherals.Monitor;
import homework7.edu.tekwill.academy.computer.peripherals.Mouse;
import homework7.edu.tekwill.academy.computer.peripherals.Keyboard;

public class Computer {
    HardDrive myDrive = new HardDrive();
    Motherboard myBoard = new Motherboard();
    Proccesor myCPU = new Proccesor();

    Monitor myMonitor = new Monitor();
    Mouse myMouse = new Mouse();
    Keyboard myKeyboard = new Keyboard();
}
