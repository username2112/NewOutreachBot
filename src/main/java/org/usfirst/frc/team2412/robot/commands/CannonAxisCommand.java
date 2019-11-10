package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class CannonAxisCommand extends CommandBase {

	public CannonAxisCommand() {
		requires(cannonUpDownSubsystem);
	}

	public void execute() {
		if (!(RobotMap.oi.codriver.getRawButton(RobotMap.oi.cannonDownButtonID)
				|| RobotMap.oi.codriver.getRawButton(RobotMap.oi.cannonUpButtonID))) {
			cannonUpDownSubsystem.cannonAxis(RobotMap.oi.codriver);
		}
	}

}