public class Main {
    public static void main(String[] args) {

        int x = 2;
        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");*/

        for (int i = 5; i >0 ; i--){
            System.out.println(i);
        }

        while (x<5){
            System.out.println("Your are the best!");
            x= x+2;
        }

        int result = 0;
        for (int k = 1; k <= 10 ; k++){
            result = result+k;
        }

        System.out.println("Sum from 1 till 10 = " + result);

        int result_2 = 0;
        for (int k = 1; k <= 10 ; k++){
            if (k%2==0) {
                result_2 = result_2 + k;
            }
            else {
                System.out.println("Нечетное число" + k);
            }
        }
        System.out.println("Sum from 1 till 10 = " + result_2);


        int y = 15;
        do {
            System.out.println(y);
            y--;
        }while (y>12);

        while (y>12)
        {
            System.out.println(y);
            y--;
        }

        String [] names = new String[]{"Olena","Victor","Anastasia","Anton"};

        String name1 = "Olena";
        String name2 = "Victor";
        String name3 = "Anastasia";
        String name4 = "Anton";

        System.out.println("Hello " + name4);

        System.out.println("Hello " + names[2]);

        for (int f = 0; f < names.length; f=f+2)
        {
            System.out.println(names[f] + ", Your are the best!");
        }
    }
}