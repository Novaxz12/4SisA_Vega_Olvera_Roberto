package Herencia;

public class Principal extends Animal{
    
    public static void main(String[] args){
        Michi gato = new Michi("tom","de la calle","atun", 1, 7);
        gato.mostrarMichi();

        Perro perro = new Perro("pulgas","de la calle","croquetas ", 1, 1);
        perro.mostrarPerro();

        Conejo conejo = new Conejo("bigotes","belier","zanahorias", 2, 7);
        conejo.mostrarConejo();

        Hamster cuyo = new Hamster("alvin","chino","Cemillas", 2, 1);
        cuyo.mostrarHamster();

        Huron ruedor = new Huron("adan","americano","heno", 2, 2);
        ruedor.mostrarHuron();

        Peces acuatico = new Peces("betta","corona","Trozos de alga", 2, 1);
        acuatico.mostrarPeces();

        new Tortuga("rocky","sulcata","vegetales", 2, 1);
        acuatico.mostrarTortuga();
    }
}