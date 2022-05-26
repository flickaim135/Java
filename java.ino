#include <Servo.h>

/* Base Movement code (Push button control input) */
int baseMovement1 = 2;
int baseMovement2 = 6;
/* Claw Movement code (Push button control input) */
int clawUd1 = 3;
int clasUd2 = 4;
/* Claw code (Push button control input) */
int claw1 = 1;
int clas2 = 5;

int basePIN = 9;
int clasUdPIN = 11;
int clawPIN = 13;

Servo base, clawUD, claw;

int basePosition = 30;
int clawUdPosition = 45;
int clawPosition = 170;

void setup()
{
    // put your setup code here, to run once:
    base.attach(basePIN);
    base.write(basePosition);
    clawUD.attach(clasUdPIN);
    clawUD.write(clawUdPosition);
    claw.attach(clawPIN);
    claw.write(clawPosition);
}

void loop()
{
    // put your main code here, to run repeatedly:
    int buttonState1 = digitalRead(baseMovement1);
    int buttonState2 = digitalRead(baseMovement2);
    int buttonState3 = digitalRead(clawUd1);
    int buttonState4 = digitalRead(clasUd2);
    int buttonState5 = digitalRead(claw1);
    int buttonState6 = digitalRead(clas2);


    // Button control for base movement
    if (buttonState1 == HIGH && basePosition <= 180)
    {
        base.write(basePosition);
        basePosition = basePosition + 10;
        delay(150);
    }
    else if (buttonState2 == HIGH && basePosition >= 0)
    {
        base.write(basePosition);
        basePosition = basePosition - 10;
        delay(150);
    }

    // Button control for arm movement
    if (buttonState3 == HIGH && clawUdPosition <= 90)
    {
        clawUD.write(clawUdPosition);
        clawUdPosition = clawUdPosition + 15;
        delay(150);
    } 
    else if (buttonState4 == HIGH && clawUdPosition >= 0)
    {
        clawUD.write(clawUdPosition);
        clawUdPosition = clawUdPosition - 15;
        delay(150);
    }
    
    // Button control for claw movement
    if (buttonState5 == HIGH && clawPosition <= 70)
    {
        claw.write(clawPosition);
        clawPosition = clawPosition + 10;
        delay(150);
    }
    else if (buttonState6 == HIGH && clawPosition >= 0)
    {
        claw.write(clawPosition);
        clawPosition = clawPosition - 10;
        delay(150);
    }
}