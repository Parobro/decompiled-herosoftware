/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geweihter;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.I;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import java.util.ArrayList;
import java.util.Vector;

public class Praios
extends I
implements private_0 {
    private int thisclassfloat = 0;
    private Vector<voidsuper> \u00d8\u00d4\u00f5O00;

    public Praios() {
        this("Praios", 10);
    }

    public Praios(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Praios-Amulett aus Gold");
        arrayList.add("Brevier der Zw\u00f6lfg\u00f6ttlichen Unterweisung");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<helden.framework.C.I> getEmpfohleneVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00d5\u00d6O000);
        arrayList.add(helden.framework.C.I.\u00d5o\u00d2000);
        arrayList.add(helden.framework.C.I.\u00f4\u00d20000);
        arrayList.add(helden.framework.C.I.\u00f4O0000);
        arrayList.add(helden.framework.C.I.whilenull);
        arrayList.add(helden.framework.C.I.O\u00d30000);
        arrayList.add(helden.framework.C.I.Stringsuper);
        arrayList.add(helden.framework.C.I.\u00d8\u00f60000);
        arrayList.add(helden.framework.C.I.\u00f4\u00f80000);
        arrayList.add(helden.framework.C.I.O\u00f6o000);
        arrayList.add(helden.framework.C.I.thisdo);
        arrayList.add(helden.framework.C.I.O\u00f4O000);
        arrayList.add(helden.framework.C.I.privateclass);
        arrayList.add(helden.framework.C.I.o\u00f5O000);
        arrayList.add(helden.framework.C.I.fordo);
        arrayList.add(helden.framework.C.I.O\u00d5o000);
        return arrayList;
    }

    public Vector<b_0> getLeiteigenschaften() {
        Vector<b_0> vector = new Vector<b_0>();
        vector.add(b_0.whilewhilesuper);
        vector.add(b_0.\u00f8\u00f4\u00d2000);
        vector.add(b_0.\u00d5\u00f4\u00d2000);
        vector.add(b_0.\u00d8\u00f5\u00d2000);
        return vector;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public Vector<voidsuper> getMirakelminustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00f4\u00f4\u00d6000);
        vector.add(voidsuper.OO\u00d6000);
        vector.add(voidsuper.returnforObject);
        vector.add(voidsuper.thisvoidObject);
        vector.add(voidsuper.returnwhileObject);
        vector.add(voidsuper.whilenewObject);
        vector.add(voidsuper.\u00d30\u00d8000);
        vector.add(voidsuper.forclassObject);
        vector.add(voidsuper.O\u00d3\u00d6000);
        vector.add(voidsuper.O\u00d8\u00d5000);
        return vector;
    }

    @Override
    public Vector<voidsuper> getMirakelplustalente() {
        Vector<voidsuper> vector = new Vector<voidsuper>();
        vector.add(voidsuper.\u00d4\u00f8\u00d5000);
        vector.add(voidsuper.O0\u00d6000);
        vector.add(voidsuper.\u00d8\u00d5\u00d6000);
        vector.add(voidsuper.thisinterfaceObject);
        vector.add(voidsuper.StringclassObject);
        vector.add(voidsuper.oo\u00d6000);
        vector.add(voidsuper.\u00f4\u00d2\u00d6000);
        vector.add(voidsuper.\u00f5\u00d6\u00d6000);
        return vector;
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        ++this.thisclassfloat;
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
        arrayList.add(voidsuper.whileStringObject);
        arrayList.add(voidsuper.\u00f4o\u00d6000);
        arrayList.add(voidsuper.privatedoObject);
        arrayList.add(voidsuper.StringObjectObject);
        arrayList.add(voidsuper.o\u00f4\u00d6000);
        arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
        return new s_1(this, arrayList, 4);
    }

    @Override
    public ArrayList<P> getSegnungen() {
        return oooo_0.\u00d200000();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>(22);
        arrayList.add(oooo_0.o00000(while.nullfor.toString()));
        arrayList.add(oooo_0.o00000(while.returnObjectsuper.toString()));
        arrayList.addAll(this.getSegnungen());
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f5\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d3\u00d3000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d5000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f5O000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnullclass.toString()));
        arrayList.add(oooo_0.o00000(while.o\u00f5\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3\u00f50000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00f5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(G.\u00d3\u00f8\u00f5000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                arrayList.remove(G.\u00d8\u00d8\u00f5000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.o00000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 5);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.O0\u00d6000, 5);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 5);
        k_02.o00000(voidsuper.StringclassObject, 6);
        k_02.o00000(voidsuper.StringvoidObject, 1);
        k_02.o00000(voidsuper.nullObjectObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.o00000(voidsuper.oo\u00d6000, 6);
        k_02.o00000(voidsuper.o\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 7);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00f5\u00d6\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 8);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 9);
        k_02.o00000(voidsuper.StringObjectObject, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 2);
        k_02.o00000(voidsuper.privateObjectObject, 2);
        k_02.o00000(voidsuper.o0\u00d8000, 3);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.C.I> getUngeeigneteVorteile() {
        ArrayList<helden.framework.C.I> arrayList = new ArrayList<helden.framework.C.I>();
        arrayList.add(helden.framework.C.I.\u00d3O0000);
        arrayList.add(helden.framework.C.I.\u00d4OO000);
        arrayList.add(helden.framework.C.I.\u00f40\u00d2000);
        arrayList.add(helden.framework.C.I.\u00f5\u00d6O000);
        arrayList.add(helden.framework.C.I.\u00d8OO000);
        arrayList.add(helden.framework.C.I.\u00d5oo000);
        arrayList.add(helden.framework.C.I.newreturnsuper);
        arrayList.add(helden.framework.C.I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d5\u00d3O000));
        arrayList.add(new for(while.\u00f5\u00f4\u00d8000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00f5O000));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00f8\u00d3o000.toString(), new Object[]{"Praios"}));
        oo0O.\u00d300000(K.o00000(helden.framework.C.I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return this.thisclassfloat < 1;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    public void setzeMirakelminustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelminustalente());
    }

    public void setzeMirakelplustalente(Vector<voidsuper> vector) {
        vector.addAll(this.getMirakelplustalente());
        vector.addAll(this.\u00d8\u00d4\u00f5O00);
    }

    @Override
    public String toString() {
        return "Praios";
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
        this.\u00d8\u00d4\u00f5O00.add(voidsuper2);
    }
}

