/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Thosan Girisona S
 */
@Entity
@Table(name = "option_b3r14")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OptionB3r14.findAll", query = "SELECT o FROM OptionB3r14 o"),
    @NamedQuery(name = "OptionB3r14.findByKode", query = "SELECT o FROM OptionB3r14 o WHERE o.kode = :kode"),
    @NamedQuery(name = "OptionB3r14.findByKeterangan", query = "SELECT o FROM OptionB3r14 o WHERE o.keterangan = :keterangan")})
public class OptionB3r14 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Kode")
    private String kode;
    @Basic(optional = false)
    @Column(name = "Keterangan")
    private String keterangan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "b3r14")
    private List<B3> b3List;

    public OptionB3r14() {
    }

    public OptionB3r14(String kode) {
        this.kode = kode;
    }

    public OptionB3r14(String kode, String keterangan) {
        this.kode = kode;
        this.keterangan = keterangan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @XmlTransient
    public List<B3> getB3List() {
        return b3List;
    }

    public void setB3List(List<B3> b3List) {
        this.b3List = b3List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kode != null ? kode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionB3r14)) {
            return false;
        }
        OptionB3r14 other = (OptionB3r14) object;
        if ((this.kode == null && other.kode != null) || (this.kode != null && !this.kode.equals(other.kode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sp.model.OptionB3r14[ kode=" + kode + " ]";
    }
    
}
