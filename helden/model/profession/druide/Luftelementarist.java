/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.druide;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.druide.Konzilsdruide;
import java.util.ArrayList;

public class Luftelementarist
extends Konzilsdruide {
    public Luftelementarist() {
        super("Konzilsdruide (Luftelementarist)", 22);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Konzilsdruide (Luftelementarist)";
        }
        return "Konzilsdruidin (Luftelementaristin)";
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8O\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4o\u00d5000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d80\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f6\u00d4000), 2);
        return k_02;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.\u00d8O\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f4o\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d80\u00d4000));
    }
}

