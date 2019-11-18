package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.Constants;

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
			openCannon();
			try {
				Thread.sleep(Constants.CANNON_OPEN_TIME);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
			closeCannon();
		});
		fireThread.run();
	}

	public void openCannon() {
		cannonRelay.set(Value.kOn);
	}

	public void closeCannon() {
		cannonRelay.set(Value.kOff);
	}

}
