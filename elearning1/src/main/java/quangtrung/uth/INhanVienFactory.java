package quangtrung.uth;

public interface INhanVienFactory {
    public NhanVien createNhanVien(String loaiNV,String ms, String ht,double luongcb);
    public NhanVien createNhanVien(String loaiNV);
}
