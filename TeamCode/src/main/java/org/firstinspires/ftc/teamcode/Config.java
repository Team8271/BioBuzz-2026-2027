package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;


//

public class Config {
    DcMotor frontLeft;
    DcMotor frontRight;
    //DcMotor backLeft;
    //DcMotor backRight;
  //  DcMotor outTake;
    DcMotor inTake;
   // Servo inTakeServo;
    Servo pollenPusher;
    HardwareMap hwMap;

    private final OpMode opMode;

    public Config(OpMode opMode) {
        this.opMode = opMode;
    }

    public void init() {
        hwMap = opMode.hardwareMap;
        frontRight = hwMap.get(DcMotor.class, "frontRight"); //port 0
        frontLeft = hwMap.get(DcMotor.class, "frontLeft"); //port1
       // inTakeServo = hwMap.get(Servo.class, "inTakeServo");
        //backRight = hwMap.get(DcMotor.class, "backRight"); //port 2
        //backLeft = hwMap.get(DcMotor.class, "backLeft");port3
       // outTake = hwMap.get(DcMotor.class,"outTake");
        inTake = hwMap.get(DcMotor.class,"inTake");
      //  pollenPusher = hwMap.get(Servo.class,"pollenPusher"); // port 0. i dont really know how to code servo
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
       // backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        //backRight.setDirection(DcMotorSimple.Direction.REVERSE);
       //outTake.setDirection(DcMotorSimple.Direction.FORWARD);
        inTake.setDirection(DcMotorSimple.Direction.REVERSE);
//how to make servos reverse


    }
}
//

