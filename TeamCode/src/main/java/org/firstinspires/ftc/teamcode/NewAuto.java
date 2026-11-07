 package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class NewAuto extends OpMode {
    DcMotor frontLeft;
    DcMotor frontRight;


  

    public void driveForward() {
        frontLeft.setPower(-.5);
        frontRight.setPower(-.5);


    }
    public void driveStop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);


    }


    private int step = 0;
    private ElapsedTime timer = new ElapsedTime();



    // Drive Mo[tors
    private DcMotorEx frontLeftMotor;
    private DcMotorEx frontRightMotor;
   // private DcMotorEx backLeftMotor;
    //private DcMotorEx backRightMotor;






    @Override
    public void init() {








        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);






        telemetry.addLine("BioBuzz Initialized");
        telemetry.update();

    }


    @Override
    public void start() {
        step = 0;

    }


    @Override
    public void loop() {

        switch (step) {

            case 0:
                if (timer.seconds() < 5) {

                    driveForward();
                    timer.reset();
                    step++;
                }
                break;
            case 1:
                if (timer.seconds() > .5) {
                    driveStop();
                    timer.reset();
                }
                break;
        }

        telemetry.addData("Step", step);
        telemetry.update();

    }




}

