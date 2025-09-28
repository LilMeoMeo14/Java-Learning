package quangtrung.uth;

abstract class NhanVien {
    protected String maSo;
    protected String hoTen;
    protected double luongCb;
    protected ITienThuong phuongthucTinhThuong;

    // constructor 
    public NhanVien(String ms, String ht, double luongcb){
        this.maSo = ms;
        this.hoTen = ht;
        this.luongCb = luongcb;
    }

    public NhanVien(){

    }

    // override to string 
    @Override
    public String toString() {
        return "NhanVien [maSo=" + maSo + ", hoTen=" + hoTen + ", luongCb=" + luongCb + ", phuongthucTinhThuong="
                + phuongthucTinhThuong + "]";
    }

    // setter & getter
    public double getTienThuong(){
        return luongCb;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCb() {
        return luongCb;
    }

    public void setLuongCb(double luongCb) {
        this.luongCb = luongCb;
    }    


}
