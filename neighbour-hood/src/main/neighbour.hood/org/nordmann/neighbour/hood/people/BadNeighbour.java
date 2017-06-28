package org.nordmann.neighbour.hood.people;

import org.nordmann.neighbour.common.api.AbstractNeighbour;


/**
 * Created by yoavn on 5/18/17.
 */

public class BadNeighbour extends AbstractNeighbour {

    public int getFriendlinessRating(){
        return 0;
    }

    public String getFullName(){
        return "Sal Crapman";
    }
}
