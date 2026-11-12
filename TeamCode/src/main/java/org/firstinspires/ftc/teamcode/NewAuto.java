



        package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.PIDFCoefficients;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class NewAuto extends OpMode {


    public void driveForward() {
        frontLeft.setPower(.5);
        frontRight.setPower(.5);

    }




    public void driveStop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);


    }




    private int step = 0;
    private ElapsedTime timer = new ElapsedTime();



    // Drive Mo[tors
    private DcMotorEx frontLeft;
    private DcMotorEx frontRight;






    @Override
    public void init() {

        // Hardware Mapping
        frontLeft  = hardwareMap.get(DcMotorEx.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotorEx.class, "frontRight");





        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRight.setDirection(DcMotorSimple.Direction.REVERSE);





        // Brake Mode
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);










        telemetry.addLine("BioBuzz Autonomous Initialized");
        telemetry.update();

    }


    @Override
    public void start() {
        step = 0;

        timer.reset();
    }


    @Override
    public void loop() {


        switch (step) {

            case 0:
                driveForward();
                if (timer.seconds() >= .5) {
                    driveStop();
                    timer.reset();
                    step++;
                }
                break;
            case 1:
                driveStop();
                break;

            default:
                driveStop();
                break;
        }

          /*
          switch (step) {
               case 0:

               case 1:

               case 2:

               case 3:































































+-
               case 4:

               case 5:

               case 6:

               case 7:

               case 8:

               case 9:

               case 10:

               case 11:

          }
 */


        telemetry.addData("Current Step", step);
        telemetry.addData("Timer Seconds", timer.seconds());
        telemetry.addData("Step", step);
        telemetry.update();

    }




}
