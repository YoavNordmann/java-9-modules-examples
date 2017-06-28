package org.nordmann.neighbour.common.utils;

import org.nordmann.neighbour.common.api.AbstractNeighbour;

/**
 * Created by yoavn on 5/18/17.
 */
public interface CompatibilityRater {

    public boolean compatible(AbstractNeighbour neighbour1, AbstractNeighbour neighbour2);
}
