package org.firstinspires.ftc.teamcode.auto;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.TranslationalVelConstraint;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.auto.util.AutoUtil;
import org.firstinspires.ftc.teamcode.subsystem.BaseRobot;

@Autonomous(name="SampleAuto")
public class SampleAuto extends org.firstinspires.ftc.teamcode.util.SampleAuto {
    private BaseRobot robot;




    TelemetryPacket packet = new TelemetryPacket();

    @Override
    public void onInit() {
        robot = new BaseRobot(hardwareMap, new Pose2d(-61, -40, Math.toRadians(180)));


    }

    @Override
    public void onStart() {


        while (opModeIsActive()) {
            /*Actions.runBlocking((t) -> {
                robot.shooter.spin();
                return false;
            });
            Actions.runBlocking(robot.drive.actionBuilder(robot.drive.getPose())
                    .strafeToSplineHeading(new Vector2d(-27, -24), Math.toRadians(227))//go to shooting pose
                    .build());

             */
        }

    }

    @Override
    public void onStop() {

    }
}