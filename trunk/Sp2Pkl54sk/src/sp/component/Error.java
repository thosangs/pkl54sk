/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.component;

/**
 *
 * @author Tiara Ratna Dewi [12.7403]
 */
public class Error {
    private String kode;
    private String deserror;
    private String halaman;

    
    public Error(String kode, String deserror, String halaman){
        this.kode=kode;
        this.deserror=deserror;
        this.halaman=halaman;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the deserror
     */
    public String getDeserror() {
        return deserror;
    }

    /**
     * @param deserror the deserror to set
     */
    public void setDeserror(String deserror) {
        this.deserror = deserror;
    }

    /**
     * @return the halaman
     */
    public String getHalaman() {
        return halaman;
    }

    /**
     * @param halaman the halaman to set
     */
    public void setHalaman(String halaman) {
        this.halaman = halaman;
    }
    
    /**
     * @return the error
     */
}