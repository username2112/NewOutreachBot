package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.RobotMap;

public class CannonAxisCommand extends CommandBase {

	public CannonAxisCommand() {
		requires(cannonUpDownSubsystem);
	}

	@Override
	public void execute() {
		if (!(RobotMap.m_oi.codriver.getRawButton(RobotMap.m_oi.cannonDownButtonID)
				|| RobotMap.m_oi.codriver.getRawButton(RobotMap.m_oi.cannonUpButtonID))) {
			cannonUpDownSubsystem.cannonAxis(RobotMap.m_oi.codriver);
		}
	}

}