package quangtrung.uth;

class NhanVienFactory implements INhanVienFactory{

    @Override
    public NhanVien createNhanVien(String loaiNV, String ms, String ht, double luongcb) {
        NhanVien nv;
        switch (loaiNV) {
            case "LTV":
                nv = new LapTrinhVien(ms,ht,luongcb);              
                break;
            case "KTV":
                nv = new KeToanVien(ms,ht,luongcb);
                break;
            case "NVKT":
                nv = new NhanvienKiemthu(ms,ht,luongcb);
            default:
                nv = new ChuyenVienPhanTich(ms,ht,luongcb);
                break;
        }
        return nv;
    }

    @Override
    public NhanVien createNhanVien(String loaiNV) {
        NhanVien nv;
        switch (loaiNV) {
            case "LTV":
                nv = new LapTrinhVien();              
                break;
            case "KTV":
                nv = new KeToanVien();
                break;
            case "NVKT":
                nv = new NhanvienKiemthu();
            default:
                nv = new ChuyenVienPhanTich();
                break;
        }
        return nv;
    }
    
}
