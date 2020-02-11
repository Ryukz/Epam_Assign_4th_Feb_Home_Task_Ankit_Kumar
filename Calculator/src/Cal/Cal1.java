package Cal;
import Functions.Calculations;
public class Cal1 {
    Calculations calculations=new Calculations();
    public float operate(char operator,int a,int b){

            if(operator=='+')
                return this.calculations.add(a,b);
            else
            if(operator=='-')
                return this.calculations.sub(a,b);
            else
            if(operator=='*')
                return this.calculations.mul(a,b);
            else
            if(operator=='/')
                return this.calculations.divide(a,b);
           else
           System.out.println("Operator not found");
            return -1;
    }
    public int sq(int x)
    {
        return this.calculations.square(x);
    }

}
