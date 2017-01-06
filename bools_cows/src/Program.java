import java.io.IOException;
import java.util.Arrays;
import Exceptions.*;

/**
 * Created by User on 24.09.2015.
 */
public class Program {
    static int wrongPlaces;
    static int rightPlaces;
    static int supposedNum = 54823;
    static int guess = 46823;
    static int[] supposedNumArray;
    static int[] guessArray;
    public static void main(String[] args) {

        System.out.println("Number: "+supposedNum);
        System.out.println("Guess: "+guess);
        try {
            boolsAndCows();
        } catch (WrongLengthException e) {
            System.err.println("Numbers must be of the same length");
            System.exit(0);
        } catch (SameDigitsException e){
            System.err.println("The digits in the number must differ");
            System.exit(0);
        } catch (BoolsAndCowsException e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println("Right places: "+rightPlaces);
        System.out.println("Wrong places: "+wrongPlaces);
    }

    private static void boolsAndCows() throws BoolsAndCowsException {
        supposedNumArray = Arr.intToArrayInt(supposedNum);
        guessArray = Arr.intToArrayInt(guess);
        if (supposedNumArray.length != guessArray.length) {
            throw new WrongLengthException();
        }
        rightPlaces = 0;
        wrongPlaces = 0;

        for (int i = 0; i < supposedNumArray.length; i++) {
            checkingTheMatchesOfDigits(i,supposedNumArray);
            for (int j = 0; j < guessArray.length; j++) {
                checkingTheMatchesOfDigits(j,guessArray);
                if (supposedNumArray[i] == guessArray[j]) {
                    if (i == j) {
                        rightPlaces++;
                    } else {
                        wrongPlaces++;
                    }
                }
            }
        }
    }
    public static void checkingTheMatchesOfDigits(int i, int[] arr) throws SameDigitsException {
        int a = arr[i];
        for (int k = 0; k < arr.length; k++) {
            if (a == arr[k]) { //checking the matches of digits
                if (i == k) {
                    continue;
                } else {
                    throw new SameDigitsException();
                }
            }

        }
    }
}

