/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.varianten;

import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public class RekkerRiddari
extends N {
    public RekkerRiddari() {
        super("RekkerRiddari", 10, false);
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.nullifString.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.o\u00d6\u00d8000, 4);
        k_02.o00000(E.O\u00d6\u00d8000, 2);
        k_02.o00000(E.\u00d5\u00d4\u00d8000);
        k_02.o00000(E.\u00d3\u00d5\u00d8000, 4);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.nullvoidObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.remove(new for(while.Stringforsuper));
        arrayList.add(new for(while.\u00f8\u00f5\u00d5000));
        return arrayList;
    }

    @Override
    public String toString() {
        return "Rekker der Hjalskari (Riddari) (UdW)";
    }
}

