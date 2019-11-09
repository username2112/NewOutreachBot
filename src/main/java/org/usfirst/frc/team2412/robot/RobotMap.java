package org.usfirst.frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Relay;

public class RobotMap {
	public static int bob_ID = 7;//cannon motor
	public static int bill_ID = 8;//cannon spike
	
	public static TalonSRX bob = new TalonSRX(bob_ID);
	public static Relay bill = new Relay(bill_ID);
	
}
