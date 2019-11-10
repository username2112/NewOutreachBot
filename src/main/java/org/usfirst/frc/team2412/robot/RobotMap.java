package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class RobotMap {

	// Intake Stuff
	public static int intakeMotorID1 = 5;
	public static int intakeMotorID2 = 6;

	public static WPI_TalonSRX intakeMotor1 = new WPI_TalonSRX(intakeMotorID1);
	public static WPI_TalonSRX intakeMotor2 = new WPI_TalonSRX(intakeMotorID2);

	// Drive Stuff
	public static int[] driveBaseMotorIDs = {
			// left --- right
			0, 1, // front
			3, 2 // back
	};

	public static WPI_TalonSRX[] driveBaseMotors = { new WPI_TalonSRX(driveBaseMotorIDs[0]),
			new WPI_TalonSRX(driveBaseMotorIDs[1]), new WPI_TalonSRX(driveBaseMotorIDs[2]),
			new WPI_TalonSRX(driveBaseMotorIDs[3]), };

	public static MecanumDrive drive = new MecanumDrive(driveBaseMotors[0], driveBaseMotors[2], driveBaseMotors[1],
			driveBaseMotors[3]);

	// Cannon stuff

	public static int cannonMotorID = 7;
	public static int cannonRelayID = 0;

	public static WPI_TalonSRX cannonMotor = new WPI_TalonSRX(cannonMotorID);
	public static Relay cannonRelay = new Relay(cannonRelayID);

	public static OI oi = new OI();
}
