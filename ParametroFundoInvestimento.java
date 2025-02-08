package br.com.bradesco.acfi.entidades;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "TPARMZFUNDOINVES")
public class ParametroFundoInvestimento {

    @Id
    //@GeneratedValue
    @Column(name="cFundoInves" ,nullable=false,unique=true)
    @JsonProperty("cFundoInves")
    private String cFundoInves;

    @Column(name="cCanalDvulgFundoInves")
    @JsonProperty("cCanalDvulgFundoInves")
    private int cCanalDvulgFundoInves;
    @Column(name="cParmzFundoInves")
    @JsonProperty("cParmzFundoInves")
    private int cParmzFundoInves;
    @Column(name="dInicTrnsmAnbma")
    @JsonProperty("dInicTrnsmAnbma")
    private Date dInicTrnsmAnbma;
    @Column(name="hCorteAnlseCli")
    @JsonProperty("hCorteAnlseCli")
    private Time hCorteAnlseCli;
    @Column(name="hCorteAnlseDac")
    @JsonProperty("hCorteAnlseDac")
    private Time hCorteAnlseDac;


    public String getcFundoInves() {
        return cFundoInves;
    }

    public void setcFundoInves(String cFundoInves) {
        this.cFundoInves = cFundoInves;
    }

    public int getcCanalDvulgFundoInves() {
        return cCanalDvulgFundoInves;
    }

    public void setcCanalDvulgFundoInves(int cCanalDvulgFundoInves) {
        this.cCanalDvulgFundoInves = cCanalDvulgFundoInves;
    }

    public int getcParmzFundoInves() {
        return cParmzFundoInves;
    }

    public void setcParmzFundoInves(int cParmzFundoInves) {
        this.cParmzFundoInves = cParmzFundoInves;
    }

    public Date getdInicTrnsmAnbma() {
        return dInicTrnsmAnbma;
    }

    public void setdInicTrnsmAnbma(Date dInicTrnsmAnbma) {
        this.dInicTrnsmAnbma = dInicTrnsmAnbma;
    }

    public Time gethCorteAnlseCli() {
        return hCorteAnlseCli;
    }

    public void sethCorteAnlseCli(Time hCorteAnlseCli) {
        this.hCorteAnlseCli = hCorteAnlseCli;
    }

    public Time gethCorteAnlseDac() {
        return hCorteAnlseDac;
    }

    public void sethCorteAnlseDac(Time hCorteAnlseDac) {
        this.hCorteAnlseDac = hCorteAnlseDac;
    }


}
