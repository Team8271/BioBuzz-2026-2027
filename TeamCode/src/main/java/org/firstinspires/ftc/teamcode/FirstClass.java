package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class FirstClass extends OpMode {

    private final double
        servoActivePosition = 0.8;
    Config robot;

    Servo servo;
    HardwareMap hwMap;

   public int a;

    double b;
    boolean t;
    String hi="I like cheddah cheese, but I lack toes :(";
    public double add(double a, double b){
        double result= a+b;
        return result;

    }


    @Override
    public void init() {
        robot = new Config(this);
        robot.init();

    }
//
    @Override
    public void loop() {
        double axial = gamepad1.left_stick_y;
        double lateral = gamepad1.left_stick_x;
        double yaw = gamepad1. right_stick_x;
        double outTakeSpeed = gamepad2.left_trigger;
        double frontLeftPower = axial + lateral + yaw;
        double frontRightPower = axial - lateral - yaw;
        double backLeftPower = axial - lateral + yaw;
        double backRightPower= axial + lateral - yaw;
        robot.frontLeft.setPower(frontLeftPower);
        robot.frontRight.setPower(frontRightPower);
        robot.backLeft.setPower(backLeftPower);
        robot.backRight.setPower(backRightPower);
        robot.outTake.setPower(gamepad2.left_trigger);
        telemetry.addData("frontLeftPower", frontLeftPower);
        telemetry.addData("frontRightPower", frontRightPower);
        telemetry.addData("backRightPower", backRightPower);
        telemetry.addData("backLeftPower", backLeftPower);
        telemetry.addData("outTakeSpeed", outTakeSpeed );
        telemetry.update();
    }
}




