/**
 *
 */
package shef.mt.features.impl.gb;

import shef.mt.features.util.Translation;
import shef.mt.features.impl.Feature;
import shef.mt.features.util.Sentence;
import java.util.*;

/**
 * MOSES word penalty feature
 *
 * @author cat
 *
 */
public class Feature2026 extends Feature {

    public Feature2026() {
        setIndex("2026");
        setDescription("MOSES word penalty");
        HashSet<String> res = new HashSet<String>();
        res.add("word_penalty_feature");
        setResources(res);
    }

    /* (non-Javadoc)
     * @see wlv.mt.features.impl.Feature#run(wlv.mt.features.util.Sentence, wlv.mt.features.util.Sentence)
     */
    @Override
    public void run(Sentence source, Sentence target) {
        // TODO Auto-generated method stub
        Translation best = source.getBest();
        float value = Float.parseFloat(best.getAttribute("word_penalty_feature"));
        setValue(value);
    }
}
