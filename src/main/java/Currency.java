import java.util.Scanner;

public class Currency {
    public static void main(String[] args){
        Input input = new Input();
        input.main();
        Conversion conv = new Conversion();
        conv.main(input.euros, input.rate);

        System.out.printf("%.2f euros at an exchange rate of %.2f is\n%.2f U.S. dollars.", input.euros, input.rate, conv.dollars);
    }
}

class Input{
    double euros;
    double rate;

    public void main(){
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        this.euros = input.nextDouble();

        System.out.print("What is the exchange rate? ");
        Scanner input2 = new Scanner(System.in);
        this.rate = input2.nextDouble();
    }
}

class Conversion{

    double dollars ;

    public void main(double euros, double rate) {
        this.dollars = euros * (rate * 0.01);
    }
}
