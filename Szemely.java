package main;

import java.util.Objects;

public class Szemely {

    private String nev;
    private int szulEv;

    public Szemely(String nev, int szulEv) {
        this.nev = nev;
        this.szulEv = szulEv;
    }

    public String getNev() {
        return nev;
    }

    public int getSzulEv() {
        return szulEv;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return "Szemely{" + "nev=" + nev + ", szulEv=" + szulEv + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nev);
        hash = 37 * hash + this.szulEv;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Szemely other = (Szemely) obj;
        if (this.szulEv != other.szulEv) {
            return false;
        }
        return Objects.equals(this.nev, other.nev);
    }

}
