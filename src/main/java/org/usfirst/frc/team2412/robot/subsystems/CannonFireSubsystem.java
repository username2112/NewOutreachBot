package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CannonFireSubsystem extends Subsystem {

	Relay cannonRelay = RobotMap.cannonRelay;

	@Override
	protected void initDefaultCommand() {

	}

	public void fire() {
		Thread fireThread = new Thread(() -> {
			cannonRelay.set(Value.kOn);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			cannonRelay.set(Value.kOff);
		});
		fireThread.run();
	}

}
