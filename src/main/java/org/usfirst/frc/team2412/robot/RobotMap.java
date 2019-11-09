package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class RobotMap {
	
	public static int intakeMotorID1 = 5;
	public static int intakeMotorID2 = 6;
	
	public static TalonSRX intakeMotor1 = new TalonSRX(intakeMotorID1);
	public static TalonSRX intakeMotor2 = new TalonSRX(intakeMotorID2);
	

}
