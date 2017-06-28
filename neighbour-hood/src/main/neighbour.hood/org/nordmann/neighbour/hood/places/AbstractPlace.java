package org.nordmann.neighbour.hood.places;

import java.util.List;
import org.nordmann.neighbour.common.api.AbstractNeighbour;
import org.nordmann.neighbour.hood.places.*;


/**
 * Created by yoavn on 5/18/17.
 */
public abstract class AbstractPlace {

    public abstract String getName();

    public abstract List<AbstractNeighbour> getNeighbours();

}
