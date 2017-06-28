package org.nordmann.neighbour.common.api;

/**
 * Created by yoavn on 5/18/17.
 */
public abstract class AbstractNeighbour {

    public abstract String getFullName();

    public abstract int getFriendlinessRating();

    public String sayHi(){
      return (getFullName() + " says \'Hi\'");
    }

}
