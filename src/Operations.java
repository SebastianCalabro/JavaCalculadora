public class Operations {
    float numberOne;
    float numberTwo;
    
    public Operations(){
        numberOne = 0;
        numberTwo = 0;
    }

    public Operations (float n1, float n2) {
        numberOne = n1;
        numberTwo = n2;
    }

    public float sum(){
        return numberOne + numberTwo;
    }
    public float subtract(){
        return numberOne - numberTwo;
    }
    public float multiply(){
        return numberOne * numberTwo;
    }
    public float divide(){
        return numberOne / numberTwo;
    }
}
