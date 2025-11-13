package org.firstinspires.ftc.teamcode.teleop.comp;

import com.acmerobotics.roadrunner.PoseVelocity2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.arcrobotics.ftclib.command.InstantCommand;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.Trigger;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.util.SampleCommandTeleop;

@TeleOp(name = "ExampleTeleop" , group = "AA - COMP")
public class ExampleTeleop extends SampleCommandTeleop {


    double driveSpeed = 1;






    @Override
    public void onInit() {



        robot.drive.setDefaultCommand(new RunCommand(()-> robot.drive.drive.setDrivePowers(new PoseVelocity2d(new Vector2d(g1.getLeftY() * driveSpeed, -g1.getLeftX() * driveSpeed), -g1.getRightX() * driveSpeed)), robot.drive));




    }

    @Override
    public void onStart() {




        /*
        BUTTON EXAMPLE
        g1.getGamepadButton(GamepadKeys.Button.DPAD_UP).whenPressed(() -> {
            driveSpeed = 1;
        });

         */

        /*
        TRIGGER EXAMPLE *doesnt work for some reason*
        new Trigger(() -> gamepad1.right_trigger > .1).whenActive(new InstantCommand(() -> robot.intake.intake())).whenInactive(new InstantCommand(() -> robot.intake.stop()));
        new Trigger(() -> gamepad1.left_trigger > .1).whenActive(new InstantCommand(() -> robot.intake.intakeReverse())).whenInactive(new InstantCommand(() -> robot.intake.stop()));

         */







    }

    @Override
    public void onLoop() {


        // Print intake telemetry every loopq
        pen.addLine("hi :)");

        //pen.addLine("shooter RPM set:", shooterRPM);
    }

    @Override
    public void onStop() {
        robot.stopAll();
    }
}
