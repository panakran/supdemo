package com.mycompany.myapp.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Supplier.
 */
@Entity
@Table(name = "supplier")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Supplier implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "vat_number")
    private Integer vatNumber;

    @Column(name = "irs_office")
    private String irsOffice;

    @Column(name = "address")
    private String address;

    @Column(name = "zip_code")
    private Integer zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Supplier companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Supplier firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Supplier lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getVatNumber() {
        return vatNumber;
    }

    public Supplier vatNumber(Integer vatNumber) {
        this.vatNumber = vatNumber;
        return this;
    }

    public void setVatNumber(Integer vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getIrsOffice() {
        return irsOffice;
    }

    public Supplier irsOffice(String irsOffice) {
        this.irsOffice = irsOffice;
        return this;
    }

    public void setIrsOffice(String irsOffice) {
        this.irsOffice = irsOffice;
    }

    public String getAddress() {
        return address;
    }

    public Supplier address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public Supplier zipCode(Integer zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public Supplier city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public Supplier country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Supplier supplier = (Supplier) o;
        if (supplier.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), supplier.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Supplier{" +
            "id=" + getId() +
            ", companyName='" + getCompanyName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", vatNumber=" + getVatNumber() +
            ", irsOffice='" + getIrsOffice() + "'" +
            ", address='" + getAddress() + "'" +
            ", zipCode=" + getZipCode() +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }
}
