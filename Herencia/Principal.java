package Herencia;

public class Principal extends Animal {
    Perro  perro =  nuevo  Perro ( "Pulgas" , "de la calle" , "Croquetas" , "gua gua" );
    Gato  gato =  nuevo  Gato ( "Michi" , "de la calle" , "Atun" );
    Conejo conejo = nuevo  Conejo ( "Bigotes" , "Belier" , "Heno" );
    Huron  huron =  nuevo  Huron ( "Adan" , "albino" , "Trocitps de carne"  );
    Cuyos  cuyos = nuevo Cuyos ( "Galleta" , "americana" , "Afalfa en heno" );
    Hamster  hamster =  nuevo  Hamster ( "Alvin" , "chino" , "uvas" );
    Tortuga  tortuga =  nuevo  Tortuga ( "Rocky" , "sulcata" , "raices vegetales" );
    Pez  pez =  nuevo  Pez ( "betta" , "Corona" , "Trozo de vegetales" );

        /*Quiero que se cree un menú mediante el cual el usuario pueda ingresar los datos de los animales:
         *
         * 1.- Perro
         * 2.- Gato         
         * * 3.- Hámster
         * 4.- Conejo~
         * 5.- Cuyo
         * 6.- Urón
         * 7.- Otro
        */

        //muestro
        perro . mostrarPerro ();
        gato . mostrarGato ();
        conejo . mostrarConejo ();
        huron . mostrarHuron ();
        Cuyos . mostrarCuyo ();
        hamster . mostrarHamster ();
        tortuga . mostrarTortuga ();
        pez . mostrarPez ();

}

