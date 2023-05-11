package surprise;

import surprise.Candies;
import surprise.FortuneCookie;
import surprise.ISurprise;
import surprise.MinionToy;

import java.util.Random;
public final class GatherSurprises {
    private static int typeOfSurprises = 3;

    private GatherSurprises() {
    }

    public static ISurprise[] gather(int n) {
        ISurprise[] arrayOfSurprises = new ISurprise[n];

        Random random = new Random();
        for(int i = 0; i < n; i++){
            int number = random.nextInt(typeOfSurprises) + 1;

            if(number == 1){
                FortuneCookie fortuneCookie = FortuneCookie.generate();
                arrayOfSurprises[i] = fortuneCookie;
            }else if(number == 2){
                Candies candy = Candies.generate();
                arrayOfSurprises[i] = candy;
            }else{
                MinionToy minionToy = MinionToy.generate();
                arrayOfSurprises[i] = minionToy;
            }
        }
        return arrayOfSurprises;
    }

    public static ISurprise gather() {
        Random random = new Random();
        int n = random.nextInt(typeOfSurprises) + 1;

        if(n == 1){
            FortuneCookie fortuneCookie = FortuneCookie.generate();
            return fortuneCookie;
        }else if(n == 2){
            Candies candy = Candies.generate();
            return candy;
        }else{
            MinionToy minionToy = MinionToy.generate();
            return minionToy;
        }
    }

    public static void displaySurprises(ISurprise[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){
        System.out.println(GatherSurprises.gather());
        System.out.println("---------");
        GatherSurprises.displaySurprises(GatherSurprises.gather(5));
    }

}
