package interfaces;

import interfaces.abstratas.*;

public class Principal {
    //Interface é um tipo de classe que contém especificações para outras classes
    //É uma classe que é um "tipo de manual" para outras classes.
    //A classe que herda uma interface deve implementar seus métodos

    //Classe abstrata - mesmas definições de uma classe comum, a diferença é que a abstrata
    // não pode ser instanciada, serve somente para ser herdada.
    public static void main(String[] args) {

        Sapo animal1 = new Sapo(10, 10, 10);
        Aranha animal2 = new Aranha(5,5,5,3);
        Formiga animal3 = new Formiga(2,2,2);
        Vegetal vegetal1 =  new Vegetal(1);
        Vegetal vegetal2 =  new Vegetal(5);
        Vegetal vegetal3 =  new Vegetal(10);

        animal2.info();
        animal2.atacar(animal3);
        animal2.comer(animal3.getMassa());
        animal2.info();

//        animal1.info();
//        animal2.info();
//        animal3.info();
//        vegetal1.info();
//        vegetal2.info();
//        vegetal3.info();

    }
}
