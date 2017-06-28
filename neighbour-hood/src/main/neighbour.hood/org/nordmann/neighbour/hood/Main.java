package org.nordmann.neighbour.hood;

import org.nordmann.neighbour.hood.people.*;


/**
 * Created by yoavn on 5/18/17.
 */

public class Main {

  public static void main(String [] args){
    System.out.println("***********Neighbourhood Main***********");

    System.out.println(new BadNeighbour().sayHi());
    System.out.println(new GetAlongNeighbour().sayHi());
    System.out.println(new GoodNeighbour().sayHi());

  }

}
