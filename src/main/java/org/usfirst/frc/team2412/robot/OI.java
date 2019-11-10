package org.usfirst.frc.team2412.robot;

import org.usfirst.frc.team2412.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	// Joysticks
	public Joystick driver = new Joystick(0); //Main Driver Stick 
	public Joystick codriver = new Joystick(1); //Codriver, axis can control cannon

	// Intake Subsystem Buttons
	public int intakeInButtonID = 0;
	public Button intakeInButton = new JoystickButton(codriver, intakeInButtonID);

	public int intakeOutButtonID = 1;
	public Button intakeOutButton = new JoystickButton(codriver, intakeOutButtonID);

	// Cannon Subsystem Buttons
	public int cannonUpButtonID = 2;
	public int cannonDownButtonID = 3;

	public Button cannonUpButton = new JoystickButton(codriver, cannonUpButtonID);
	public Button cannonDownButton = new JoystickButton(codriver, cannonDownButtonID);

	public int cannonFireButtonID = 4;
	public Button cannonFireButton = new JoystickButton(codriver, cannonFireButtonID);
	
	public int cannonFireTriggerID = 0;
	public Button cannonFireTrigger = new JoystickButton(driver, cannonFireTriggerID);

	// Button Activations
	public OI() {
		intakeInButton.whileHeld(new IntakeInCommand());
		intakeOutButton.whileHeld(new IntakeOutCommand());

		cannonUpButton.whileHeld(new CannonUpCommand());
		cannonDownButton.whileHeld(new CannonDownCommand());

		cannonFireButton.whenReleased(new CannonFireCommand());
		cannonFireTrigger.whenReleased(new CannonFireCommand());
	}
}
