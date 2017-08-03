package no.uib.pathwaymatcher.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Francisco Hernández Sánchez
 */
public class EWAS {

    public String stId;
    //    String name;
    public String displayName;
    public List<Modification> PTMs;              //An EWAS contains only ONE PTMConfiguration; a ModifiedProtein can be matched to MANY PTMConfigurations
    public List<ReactionResultEntry> reactionsList;
    public boolean matched;

    public EWAS() {
        matched = false;
        PTMs = new ArrayList<Modification>(16);
        reactionsList = new ArrayList<ReactionResultEntry>(16);
    }

    public String printEwasPTMs() {
        String result = "[";
        int cont = 0;
        for (Modification ptm : PTMs) {
            if (cont > 0) {
                result += ";";
            }
            result += ptm.toString();
            cont++;
        }
        return result + "]";
    }
}
