package frc.robot.commands;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.Robot;


public class CommandDriveAuto extends Command {
	double leftSpeed;
	double rightSpeed;
	double time;

	public CommandDriveAuto(double sL, double sR, double tm) {
		super(Robot.driver);
		this.leftSpeed = sL;
		this.rightSpeed = sR;
		this.time = tm;
	}

	@Override
	protected void initialize(){
		setTimeout(this.time);
	}

	@Override
	protected void execute() {
		Robot.driver.tankDrive(this.leftSpeed, this.rightSpeed);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {
		Robot.driver.tankDrive(0.0, 0.0);
	}

	@Override
	protected void interrupted() {
		Robot.driver.tankDrive(0.0, 0.0);
	}
}