package org.firstinspires.ftc.teamcode;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;

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




      if (gamepad2.aWasPressed()) {
          robot.inTake.setVelocity(1350);//the cross is a, launching inconsistent. 1330 works well on 12 battery
      }

        if (gamepad2.bWasPressed()) {
            robot.inTake.setVelocity(0);// the o is b
        }
        if (gamepad2.xWasPressed()) {
            robot.inTakeServo.setPower(-1);//square is x
        }
        if (gamepad2.yWasPressed()){
            robot.inTakeServo.setPower(0);// triangle is y
        }
        if (gamepad2.left_bumper){
            robot.inTake.setPower(-.6);
        }
        if (gamepad2.right_trigger_pressed){
            robot.pollenPusher.setPower(0.5);
        }
        if(gamepad2.rightTriggerWasReleased()){
            robot.pollenPusher.setPower(0);
        }
        if(gamepad2.right_bumper){
            robot.outTake.setPower(-0.5);

        }
        if(gamepad2.left_bumper){
            robot.outTake.setPower(0.5);
        }


        // double frontRightPower = axial + lateral + yaw;
     //   double backLeftPower = axial - lateral + yaw;
     //   double backRightPower= axial + lateral - yaw;
        //idk what we need to do here for our outtake and intake. figure it out please
        // add code for intake servo
        robot.frontLeft.setPower(frontLeftPower);
        robot.frontRight.setPower(frontRightPower);
        robot.inTakeServo.setDirection(REVERSE);
       // robot.inTake.setDirection(REVERSE);


          //+  robot.inTake.setPower(inTakeSpeed);
       // robot.outTake.setPower(outTakePower);
     //   robot.backLeft.setPower(backLeftPower);g
       // robot.backRight.setPower(backRightPower);
        robot.outTake.setPower(gamepad2.left_trigger);
       // robot.inTake.setPower(0.5);
        telemetry.addData("frontLeftPower", frontLeftPower);
        telemetry.addData("frontRightPower", frontRightPower);



    //    telemetry.addData("backRightPower", backRightPower);
    //    telemetry.addData("backLeftPower", backLeftPower);
      telemetry.addData("outTakeSpeed", outTakeSpeed );
         telemetry.addData("inTakeSpeed", inTakeSpeed);


        telemetry.update();
    }


    }




