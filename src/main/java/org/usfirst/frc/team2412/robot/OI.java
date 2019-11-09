package org.usfirst.frc.team2412.robot;

import org.usfirst.frc.team2412.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public Joystick codriver = new Joystick(1);

	public int intakeInButtonID = 0;
	Button intakeInButton = new JoystickButton(codriver, intakeInButtonID);

	public int intakeOutButtonID = 1;
	Button intakeOutButton = new JoystickButton(codriver, intakeOutButtonID);

	public OI() {
		intakeInButton.whileHeld(new IntakeInCommand());
		intakeOutButton.whileHeld(new IntakeOutCommand());
	}
}
