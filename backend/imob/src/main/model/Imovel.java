public class Imovel {
    private String codigo;
    private Double areaTotal;
    private Double areaPrivativa;
    private int dormitorios;
    private int banheiros;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Double getAreaPrivativa() {
        return areaPrivativa;
    }

    public void setAreaPrivativa(Double areaPrivativa) {
        this.areaPrivativa = areaPrivativa;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    int vagas;
        }