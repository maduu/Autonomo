package frc.robot.commands;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.Robot;
import frc.robot.commands.CommandDriveAuto;
import frc.robot.commands.CommandDrive;


public class Autonomous extends CommandGroup {
  public  Autonomous(int setNumber) {
    //addSequential(new CommandDriveAuto(leftSpeed, rightSpeed, time));
    
    if (setNumber == 1) {
      /* ROTINA 01:
      sai do centro da arena azul, vai até a cargo ship (slot central) */
      addSequential(new CommandDriveAuto(0.8, 0.8, 5.0));     // anda para frente
    }else if (setNumber == 2) {
      /* ROTINA O2:
      sai do ponto de inicio central da arena azul, vai até o primeiro slot
      da lateral direita da cargo ship */
      addSequential(new CommandDriveAuto(0.8, 0.8, 5.0));     //anda para frente
      addSequential(new CommandDriveAuto(0.4, -0.4, 2.0));    //vira à direita
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(-0.4, 0.4, 2.0));    //vira à esquerda
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(-0.4, 0.4, 2.0));    //vira à esquerda
      addSequential(new CommandDriveAuto(0.4, 0.4, 2.0));     //anda para frente
    }else if (setNumber == 3) {
      /* ROTINA 03:
      sai do ponto de incio central da arena azul, vai até o primeiro slot
      da lateral esquerda da cargo ship */
      addSequential(new CommandDriveAuto(0.8, 0.8, 5.0));     //anda para frente
      addSequential(new CommandDriveAuto(-0.4, 0.4, 2.0));    //vira à esquerda
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(0.4, -0.4, 2.0));    //vira à direita
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(0.4, -0.4, 2.0));    //vira à direita
      addSequential(new CommandDriveAuto(0.4, 0.4, 2.0));     //anda para frente
    }else if (setNumber == 4) {
      /* ROTINA 04:
      sai do centro da arena vermelha, vai até a cargo ship (slot central) */
      addSequential(new CommandDriveAuto(0.8, 0.8, 5.0));     // anda para frente
    }else if (setNumber == 5) {
      /* ROTINA O5:
      sai do ponto de incio central da arena vermelha, vai até o primeiro slot
      da lateral direita da cargo ship */
      addSequential(new CommandDriveAuto(0.8, 0.8, 5.0));     //anda para frente
      addSequential(new CommandDriveAuto(0.4, -0.4, 2.0));    //vira à direita
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(-0.4, 0.4, 2.0));    //vira à esquerda
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(-0.4, 0.4, 2.0));    //vira à esquerda
      addSequential(new CommandDriveAuto(0.4, 0.4, 2.0));     //anda para frente
    }else if (setNumber == 6) {
      /* ROTINA 06:
      sai do ponto de incio central da arena vermelha, vai até o primeiro slot
      da lateral esquerda da cargo ship */
      addSequential(new CommandDriveAuto(0.8, 0.8, 5.0));     //anda para frente
      addSequential(new CommandDriveAuto(-0.4, 0.4, 2.0));    //vira à esquerda
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(0.4, -0.4, 2.0));    //vira à direita
      addSequential(new CommandDriveAuto(0.8, 0.8, 4.0));     //anda para frente
      addSequential(new CommandDriveAuto(0.4, -0.4, 2.0));    //vira à direita
      addSequential(new CommandDriveAuto(0.4, 0.4, 2.0));     //anda para frente
    }
 
  }

}