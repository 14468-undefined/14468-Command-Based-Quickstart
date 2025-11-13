package org.firstinspires.ftc.teamcode.command;

import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;
import com.arcrobotics.ftclib.command.WaitUntilCommand;

import org.firstinspires.ftc.teamcode.subsystem.BaseRobot;
import org.firstinspires.ftc.teamcode.subsystem.DriveSubsystem;
import org.firstinspires.ftc.teamcode.util.Constants;

public class SampleCommand extends SequentialCommandGroup {

    public SampleCommand(BaseRobot robot, int sampleParam) {
        DriveSubsystem drive = robot.drive;



        //CommandBase spinUpShooter = new RunCommand(() -> robot.shooter.spin());

        //addRequirements(robot.shooter, robot.transfer, robot.intake);

            addCommands(
                    //new RunCommand(() -> robot.shooter.spinUp(), robot.shooter).alongWith(

                            new SequentialCommandGroup(
                                   //intake
                                    //spinupshooter

                                    new ParallelCommandGroup(

                                    )
                            )
                    //)
            );


    }

    }

