/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schreiber;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class VarianteSchreiber
extends N {
    public VarianteSchreiber() {
        super("Schreiber", 0);
    }

    public VarianteSchreiber(String string, int n) {
        super(string, 0 + n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("tragbare Schreibstube");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schreiber";
        }
        return "Schreiberin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.\u00d3\u00d4O000);
        arrayList.add(I.\u00d4oo000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00d30\u00d2000, "Stadtteil/Kleinstadt"));
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(this.getProfession().getMuttersprachenSchrift());
                int[] nArray = new int[]{8, 6};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(helden.framework.OoOO.N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(voidsuper.OO\u00d6000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 1);
        k_02.o00000(voidsuper.O0\u00d6000, 2);
        k_02.o00000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.thisinterfaceObject, 2);
        k_02.o00000(voidsuper.forpublicObject, 6);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00f5\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d6\u00d6000, 1);
        k_02.o00000(voidsuper2, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d4\u00f4o000);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d8\u00f60000);
        j2.oO0000(20);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

