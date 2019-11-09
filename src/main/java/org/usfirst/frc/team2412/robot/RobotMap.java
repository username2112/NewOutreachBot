package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class RobotMap {

	public static int intakeMotorID1 = 5;
	public static int intakeMotorID2 = 6;

	public static WPI_TalonSRX intakeMotor1 = new WPI_TalonSRX(intakeMotorID1);
	public static WPI_TalonSRX intakeMotor2 = new WPI_TalonSRX(intakeMotorID2);

}
