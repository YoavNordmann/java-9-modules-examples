package org.nordmann.neighbour.common.api;

import org.nordmann.neighbour.common.utils.CompatibilityRater;
import org.nordmann.neighbour.common.utils.impl.SimpleCompatibilityRater;



/**
 * Created by yoavn on 5/18/17.
 */
public class UtilsFactory {

    public static CompatibilityRater getCompatibilityRater(){
      return new SimpleCompatibilityRater();
    }


}
