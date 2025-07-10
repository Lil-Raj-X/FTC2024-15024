package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name = "Mechanum Drive Test", group = "TeleOp")
public class MechanumDriveTest extends OpMode {
    DcMotor leftBack;
    @Override
    public void init() {
        leftBack = hardwareMap.get(DcMotor.class, "LeftBack");

    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            leftBack.setPower(1);

        }



    }
}