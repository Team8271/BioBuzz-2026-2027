package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Config {
    Servo servo;
    HardwareMap hwMap;
    private final OpMode opMode;
    public Config(OpMode opMode){
        this.opMode = opMode;
    }

    public void init (){
        hwMap= opMode.hardwareMap;
        servo=hwMap.get(Servo.class,"Servo"); 
    }
}
