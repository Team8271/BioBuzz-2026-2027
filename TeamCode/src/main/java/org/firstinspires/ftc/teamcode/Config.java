package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import com.qualcomm.robotcore.hardware.Servo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;


//

public class Config {
    DcMotor frontLeft;
    DcMotor frontRight;
    //DcMotor backLeft;
    //DcMotor backRight;
    DcMotorEx outTake;
    DcMotorEx inTake;
    CRServo inTakeServo;
    CRServo pollenPusher;
    HardwareMap hwMap;

    private final OpMode opMode;

    public Config(OpMode opMode) {
        this.opMode = opMode;
    }

    public void init() {
        hwMap = opMode.hardwareMap;
        frontRight = hwMap.get(DcMotor.class, "frontRight"); //port 0
        frontLeft = hwMap.get(DcMotor.class, "frontLeft"); //port1
        inTakeServo = hwMap.get(CRServo.class, "inTakeServo");//0

        //backRight = hwMap.get(DcMotor.class, "backRight"); //port 2
        //backLeft = hwMap.get(DcMotor.class, "backLeft");port3
        outTake = hwMap.get(DcMotorEx.class,"outTake");//actually intake,
        inTake = hwMap.get(DcMotorEx.class,"inTake");//actually outtake,2

        PIDFCoefficients pidf = new PIDFCoefficients(0, 0, 0 , 11.87);
        inTake.setPIDFCoefficients(DcMotorEx.RunMode.RUN_USING_ENCODER, pidf);

        pollenPusher = hwMap.get(CRServo.class,"pollenPusher"); // port 0. i dont really know how to code servo
        frontRight.setDirection(DcMotorSimple.Direction.FORWARD);
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
       // backLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        //backRight.setDirection(DcMotorSimple.Direction.REVERSE);
       outTake.setDirection(DcMotorSimple.Direction.FORWARD);
        inTake.setDirection(DcMotorSimple.Direction.REVERSE);


//how to make servos reverse


    }
}


