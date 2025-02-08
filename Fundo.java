package br.com.bradesco.acfi.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Fundo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dCompt;
    private String cFundo;
    private String cCnpj;
    private String iRzScial;
    private String rTpoProcm;
    private String rComprCota;
    private BigDecimal vPatrmLiqTot;
    private BigDecimal vCota;
    private BigDecimal qCota;
    private Integer qCtsta;
    private BigDecimal vAplic;
    private BigDecimal vResgt;
    private BigDecimal vRcolhPerioImpstRenda;
    private String rCotaLibrdAbert;
    private Date dCotaLibrdAbert;
    private String rCotaLibrdFchto;
    private Date dCotaLibrdFchto;
    private Date dCotaLibrd;
    private Date dIncl;
    private Integer nDecCota;
    private Integer nDecQtd;
    private String rTruncCota;
    private Float pDiaCota;
    private BigDecimal vCotaBruta;
    private String rSttusLibrcCota;
    private String rSttusAnlseCli;
    private String rSttusDvulg;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getdCompt() {
        return dCompt;
    }

    public void setdCompt(Date dCompt) {
        this.dCompt = dCompt;
    }

    public String getcFundo() {
        return cFundo;
    }

    public void setcFundo(String cFundo) {
        this.cFundo = cFundo;
    }

    public String getcCnpj() {
        return cCnpj;
    }

    public void setcCnpj(String cCnpj) {
        this.cCnpj = cCnpj;
    }

    public String getiRzScial() {
        return iRzScial;
    }

    public void setiRzScial(String iRzScial) {
        this.iRzScial = iRzScial;
    }

    public String getrTpoProcm() {
        return rTpoProcm;
    }

    public void setrTpoProcm(String rTpoProcm) {
        this.rTpoProcm = rTpoProcm;
    }

    public String getrComprCota() {
        return rComprCota;
    }

    public void setrComprCota(String rComprCota) {
        this.rComprCota = rComprCota;
    }

    public BigDecimal getvPatrmLiqTot() {
        return vPatrmLiqTot;
    }

    public void setvPatrmLiqTot(BigDecimal vPatrmLiqTot) {
        this.vPatrmLiqTot = vPatrmLiqTot;
    }

    public BigDecimal getvCota() {
        return vCota;
    }

    public void setvCota(BigDecimal vCota) {
        this.vCota = vCota;
    }

    public BigDecimal getqCota() {
        return qCota;
    }

    public void setqCota(BigDecimal qCota) {
        this.qCota = qCota;
    }

    public Integer getqCtsta() {
        return qCtsta;
    }

    public void setqCtsta(Integer qCtsta) {
        this.qCtsta = qCtsta;
    }

    public BigDecimal getvAplic() {
        return vAplic;
    }

    public void setvAplic(BigDecimal vAplic) {
        this.vAplic = vAplic;
    }

    public BigDecimal getvResgt() {
        return vResgt;
    }

    public void setvResgt(BigDecimal vResgt) {
        this.vResgt = vResgt;
    }

    public BigDecimal getvRcolhPerioImpstRenda() {
        return vRcolhPerioImpstRenda;
    }

    public void setvRcolhPerioImpstRenda(BigDecimal vRcolhPerioImpstRenda) {
        this.vRcolhPerioImpstRenda = vRcolhPerioImpstRenda;
    }

    public String getrCotaLibrdAbert() {
        return rCotaLibrdAbert;
    }

    public void setrCotaLibrdAbert(String rCotaLibrdAbert) {
        this.rCotaLibrdAbert = rCotaLibrdAbert;
    }

    public Date getdCotaLibrdAbert() {
        return dCotaLibrdAbert;
    }

    public void setdCotaLibrdAbert(Date dCotaLibrdAbert) {
        this.dCotaLibrdAbert = dCotaLibrdAbert;
    }

    public String getrCotaLibrdFchto() {
        return rCotaLibrdFchto;
    }

    public void setrCotaLibrdFchto(String rCotaLibrdFchto) {
        this.rCotaLibrdFchto = rCotaLibrdFchto;
    }

    public Date getdCotaLibrdFchto() {
        return dCotaLibrdFchto;
    }

    public void setdCotaLibrdFchto(Date dCotaLibrdFchto) {
        this.dCotaLibrdFchto = dCotaLibrdFchto;
    }

    public Date getdCotaLibrd() {
        return dCotaLibrd;
    }

    public void setdCotaLibrd(Date dCotaLibrd) {
        this.dCotaLibrd = dCotaLibrd;
    }

    public Date getdIncl() {
        return dIncl;
    }

    public void setdIncl(Date dIncl) {
        this.dIncl = dIncl;
    }

    public Integer getnDecCota() {
        return nDecCota;
    }

    public void setnDecCota(Integer nDecCota) {
        this.nDecCota = nDecCota;
    }

    public Integer getnDecQtd() {
        return nDecQtd;
    }

    public void setnDecQtd(Integer nDecQtd) {
        this.nDecQtd = nDecQtd;
    }

    public String getrTruncCota() {
        return rTruncCota;
    }

    public void setrTruncCota(String rTruncCota) {
        this.rTruncCota = rTruncCota;
    }

    public Float getpDiaCota() {
        return pDiaCota;
    }

    public void setpDiaCota(Float pDiaCota) {
        this.pDiaCota = pDiaCota;
    }

    public BigDecimal getvCotaBruta() {
        return vCotaBruta;
    }

    public void setvCotaBruta(BigDecimal vCotaBruta) {
        this.vCotaBruta = vCotaBruta;
    }

    public String getrSttusLibrcCota() {
        return rSttusLibrcCota;
    }

    public void setrSttusLibrcCota(String rSttusLibrcCota) {
        this.rSttusLibrcCota = rSttusLibrcCota;
    }

    public String getrSttusAnlseCli() {
        return rSttusAnlseCli;
    }

    public void setrSttusAnlseCli(String rSttusAnlseCli) {
        this.rSttusAnlseCli = rSttusAnlseCli;
    }

    public String getrSttusDvulg() {
        return rSttusDvulg;
    }

    public void setrSttusDvulg(String rSttusDvulg) {
        this.rSttusDvulg = rSttusDvulg;
    }
}

