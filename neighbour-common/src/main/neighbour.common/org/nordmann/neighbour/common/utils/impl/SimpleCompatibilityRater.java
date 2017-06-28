package org.nordmann.neighbour.common.utils.impl;

import org.nordmann.neighbour.common.api.AbstractNeighbour;
import org.nordmann.neighbour.common.utils.CompatibilityRater;

/**
 * Created by yoavn on 5/18/17.
 */
public class SimpleCompatibilityRater implements CompatibilityRater {

    public boolean compatible(AbstractNeighbour neighbour1, AbstractNeighbour neighbour2){
        int diff = neighbour1.getFriendlinessRating() - neighbour2.getFriendlinessRating();
        return (diff <= 5)  && (diff >= 5) ;
    }
}
