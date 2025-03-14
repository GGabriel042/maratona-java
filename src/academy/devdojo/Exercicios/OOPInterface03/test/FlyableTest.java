package Exercicios.OOPInterface03.test;

import Exercicios.OOPInterface03.dominio.Airplane;
import Exercicios.OOPInterface03.dominio.Helicopter;
import Exercicios.OOPInterface03.dominio.Spacecraft;

public class FlyableTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Spacecraft spacecraft = new Spacecraft();
        Helicopter helicopter = new Helicopter();

        airplane.fly_obj();
        spacecraft.fly_obj();
        helicopter.fly_obj();
    }
}
