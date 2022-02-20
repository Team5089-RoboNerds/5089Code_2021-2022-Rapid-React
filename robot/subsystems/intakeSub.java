// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class intakeSub extends SubsystemBase {
  /** Creates a new intakeSub. */
  CANSparkMax intake;
  public intakeSub() {
intake = new CANSparkMax(Constants.intakeMotor,MotorType.kBrushless);

  }

  public void intakeIn(){
  intake.set(1.0);  
  }
  public void intakeOut(){
  intake.set(-1.0);
  }
  public void intakeStop(){
  intake.set(0.0);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
