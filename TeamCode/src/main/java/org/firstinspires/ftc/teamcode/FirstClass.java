package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "FirstClass")
//
public class FirstClass extends OpMode {

    private final double
        servoActivePosition = 0.8;
    Config robot;

    Servo servo;
    HardwareMap hwMap;

   //public int a;

    //double b;
    //boolean t;
    //public double add(double a, double b){
        //double result= a+b;
        //return result;

  //  }


    @Override
    public void init() {
        robot = new Config(this);
        robot.init();



    }
    @Override
    public void loop() {
        double yaw = gamepad1.left_stick_y;
        double axial = -gamepad1.right_stick_x;
       // double lateral = -gamepad1.right_stick_x;
        double outTakeSpeed = gamepad2.left_trigger;
        double inTakeSpeed = gamepad2.right_trigger;
      //  double frontLeftPower = axial - lateral - yaw;
        double frontLeftPower = axial-yaw;
        double frontRightPower = axial+yaw;




        if (gamepad2.right_trigger > 0.2) {
            robot.inTake.setPower(0.1);
        }


        // double frontRightPower = axial + lateral + yaw;
     //   double backLeftPower = axial - lateral + yaw;
     //   double backRightPower= axial + lateral - yaw;
        //idk what we need to do here for our outtake and intake. figure it out please
        // add code for intake servo
        robot.frontLeft.setPower(frontLeftPower);
        robot.frontRight.setPower(frontRightPower);
          //+  robot.inTake.setPower(inTakeSpeed);
       // robot.outTake.setPower(outTakePower);
     //   robot.backLeft.setPower(backLeftPower);
       // robot.backRight.setPower(backRightPower);
        robot.outTake.setPower(gamepad2.left_trigger);
        robot.inTake.setPower(gamepad2.right_trigger);
        telemetry.addData("frontLeftPower", frontLeftPower);
        telemetry.addData("frontRightPower", frontRightPower);


    //    telemetry.addData("backRightPower", backRightPower);
    //    telemetry.addData("backLeftPower", backLeftPower);
      telemetry.addData("outTakeSpeed", outTakeSpeed );
         telemetry.addData("inTakeSpeed", inTakeSpeed);
        telemetry.update();
    }


    }




