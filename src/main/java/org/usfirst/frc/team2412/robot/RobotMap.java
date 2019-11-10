package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class RobotMap {

	public static int intakeMotorID1 = 5;
	public static int intakeMotorID2 = 6;

	public static WPI_TalonSRX intakeMotor1 = new WPI_TalonSRX(intakeMotorID1);
	public static WPI_TalonSRX intakeMotor2 = new WPI_TalonSRX(intakeMotorID2);

	//
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

	public static OI oi = new OI();
}
