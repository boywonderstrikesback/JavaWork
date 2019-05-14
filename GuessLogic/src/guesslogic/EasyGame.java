/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesslogic;
 import java.util.Random;
/**
 *
 * @author mikeross
 */
public class EasyGame {
   

public class easyRandomNumberGenerator {

private int limit;

public easyRandomNumberGenerator(){

}
public easyRandomNumberGenerator(int limit){
    this.limit=limit;
}

public int generate() {

    return generateRandomNumber();
}

private int generateRandomNumber(){
    Random random=new Random();
    return random.nextInt(limit+1);
}
}
}
