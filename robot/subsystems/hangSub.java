// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class hangSub extends SubsystemBase {
  /** Creates a new hangSub. */
  VictorSPX hang1,hang2;
  public hangSub() {

  hang1 = new VictorSPX(Constants.hangMotor1);
  hang2 = new VictorSPX(Constants.hangMotor2);

  }

  public void hangUp(){
  hang1.set(ControlMode.PercentOutput, 1.0);
  hang2.set(ControlMode.PercentOutput, 1.0);

  }
  public void hangDown(){
    hang1.set(ControlMode.PercentOutput, -1.0);
    hang2.set(ControlMode.PercentOutput, -1.0);

  }
  public void hangStop(){
    hang1.set(ControlMode.PercentOutput, 0.0);
    hang2.set(ControlMode.PercentOutput, 0.0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
