package HerenciaCalculo;

class Rombo extends Figuras {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        AreaRo();
        PerimetroRo();
    }

    private void AreaRo() {
        this.area = (diagonalMayor * diagonalMenor) / 2;
    }
    private void PerimetroRo(){
        
        this.perimetro = (2 * diagonalMayor) + (diagonalMenor * 2);
    }
}