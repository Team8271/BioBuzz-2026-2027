package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class FirstClass extends OpMode {

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
        hwMap=this.hardwareMap;
       telemetry.addData("Hi","Hi");
       telemetry.update();
       servo =hwMap.get(Servo.class,"Servo");
       servo.setPosition(50);
       double result=(add(12.9, 123));
       telemetry.addData("hi",result);
       telemetry.update();
    }
// rthrhge
    @Override
    public void loop() {
        servo.setPosition(0);

    }
}
