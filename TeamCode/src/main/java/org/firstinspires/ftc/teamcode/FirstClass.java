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
    String hi="bye";
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
        double axiel = gamepad1.left_stick_y;
        double lateral = gamepad1.left_stick_x;
        double yaw = gamepad1. right_stick_x;
        double frontLeftPower = axiel + lateral + yaw;
        double frontRightPower = axiel - lateral - yaw;
        double backLeftPower = axiel - lateral + yaw;
        double backRightPower= axiel + lateral - yaw;
        robot.frontLeft.setPower(frontLeftPower);
        robot.frontRight.setPower(frontRightPower);
        robot.backLeft.setPower(backLeftPower);
        robot.backRight.setPower(backRightPower);
        telemetry.addData("frontLeftPower", frontLeftPower);
        telemetry.addData("frontRightPower", frontRightPower);
        telemetry.addData("backRightPower", backRightPower);
        telemetry.addData("backLeftPower", backLeftPower);
        telemetry.update();
    }
}




